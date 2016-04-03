package com.ossys.rapd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.ossys.classmaker.modelgenerator.xml.XMLAttributeGenerator;
import com.ossys.classmaker.modelgenerator.xml.XMLElementGenerator;
import com.ossys.classmaker.modelgenerator.xml.XMLModelGenerator;
import com.ossys.rapd.RandomGenerator.AttributeType;
import com.ossys.rapd.RandomGenerator.DistributionType;

public class ModelTest {
	
	public static void main(String[] args) {
		System.out.println("This software generates random data models for Rapd.io");
		System.out.println("Your model's location will be: " + args[1] + System.getProperty("file.separator") + args[0] + ".xml");
		
		XMLModelGenerator xmg = new XMLModelGenerator(args[0], args[1]);
		
		String name = "";
	    int num_bo = 0;
	    int num_attrs = 0;
	    DistributionType prob_dist = null;
	    try {
	    	System.out.print("Enter a name for your random model: ");
	    	name = new BufferedReader(new InputStreamReader(System.in)).readLine();
	    	
	    	System.out.print("How Many Business Objects: ");
	    	num_bo = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
			
	    	System.out.print("Median Number of Attributes: ");
	    	num_attrs = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
			
	    	System.out.println("(1) - Uniform");
	    	System.out.println("(2) - Normal");
	    	System.out.println("(3) - Poisson");
	    	System.out.print("Choose Attribute Generation Probability Distribution Function: ");
	    	switch(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine())) {
	    	case 1:
	    		prob_dist = DistributionType.UNIFORM;
	    		break;
	    	case 2:
	    		prob_dist = DistributionType.NORMAL;
	    		break;
	    	case 3:
	    		prob_dist = DistributionType.POISSON;
	    		break;
	    	}
	        
	    	XMLElementGenerator root_element = new XMLElementGenerator("DomainModel",null);
	    	XMLAttributeGenerator attr = new XMLAttributeGenerator("name", name);
	    	root_element.addAttribute(attr);
	    	attr = null;
	    	
	    	attr = new XMLAttributeGenerator("revision", "1");
	    	root_element.addAttribute(attr);
	    	attr = null;
	    	
	    	for(int i=0; i<num_bo; i++) {
	    		XMLElementGenerator business_object = new XMLElementGenerator("BusinessObject",root_element);
	    		
	    		//name
	    		XMLAttributeGenerator bo_attr = new XMLAttributeGenerator("name", RandomGenerator.generateRandomString(prob_dist, 3, 25));
	    		business_object.addAttribute(bo_attr);
	    		bo_attr = null;
	    		
	    		//concurrent
	    		bo_attr = new XMLAttributeGenerator("concurrent", new Boolean(RandomGenerator.generateRandomBoolean(0.5)).toString());
	    		business_object.addAttribute(bo_attr);
	    		bo_attr = null;
	    		
	    		//atomic
	    		bo_attr = new XMLAttributeGenerator("atomic", new Boolean(RandomGenerator.generateRandomBoolean(0.5)).toString());
	    		business_object.addAttribute(bo_attr);
	    		bo_attr = null;
	    		
	    		//auditable
	    		bo_attr = new XMLAttributeGenerator("auditable", new Boolean(RandomGenerator.generateRandomBoolean(0.5)).toString());
	    		business_object.addAttribute(bo_attr);
	    		bo_attr = null;
	    		
	    		//comment
	    		bo_attr = new XMLAttributeGenerator("comment", RandomGenerator.generateRandomString(prob_dist, 0, 256));
	    		business_object.addAttribute(bo_attr);
	    		bo_attr = null;
	    		
	    		
	    		// Attributes
	    		for(int j=0; j<RandomGenerator.generateRandomInt(prob_dist, 1, num_attrs); j++) {
	    			XMLElementGenerator attribute = new XMLElementGenerator("Attribute",business_object);
	    			
	    			//name
	    			XMLAttributeGenerator attr_attr = new XMLAttributeGenerator("name", RandomGenerator.generateRandomString(prob_dist, 3, 25));
	    			attribute.addAttribute(attr_attr);
	    			attr_attr = null;
	    			
	    			//prevname
	    			attr_attr = new XMLAttributeGenerator("prevname", "");
	    			attribute.addAttribute(attr_attr);
	    			attr_attr = null;
	    			
	    			//persistent
	    			attr_attr = new XMLAttributeGenerator("persistent", Boolean.toString(RandomGenerator.generateRandomBoolean(.98)));
	    			attribute.addAttribute(attr_attr);
	    			attr_attr = null;
	    			
	    			//type
	    			ArrayList<String> enums = null;
	    			
	    			AttributeType type = RandomGenerator.generateRandomAttributeType();
	    			switch(type) {
		    			case BINARY:
			    			attr_attr = new XMLAttributeGenerator("type", "BINARY");
			    			attribute.addAttribute(attr_attr);
			    			attr_attr = null;
		    				break;
		    			case BOOLEAN:
			    			attr_attr = new XMLAttributeGenerator("type", "BOOLEAN");
			    			attribute.addAttribute(attr_attr);
			    			attr_attr = null;
		    				break;
		    			case DATE:
			    			attr_attr = new XMLAttributeGenerator("type", "DATE");
			    			attribute.addAttribute(attr_attr);
			    			attr_attr = null;
		    				break;
		    			case ENUM:
			    			attr_attr = new XMLAttributeGenerator("type", "ENUM");
			    			attribute.addAttribute(attr_attr);
			    			attr_attr = null;
			    			
			    			enums = new ArrayList<String>();
		    				for(int k=0; k<RandomGenerator.generateRandomInt(prob_dist, 1, 50); k++) {
		    					XMLElementGenerator en = new XMLElementGenerator("Enum",attribute);
		    					
		    					String n = RandomGenerator.generateRandomString(prob_dist, 3, 25);
		    					enums.add(n);
		    					XMLAttributeGenerator en_attr = new XMLAttributeGenerator("name", n);
		    					en.addAttribute(en_attr);
		    					en_attr = null;
		    					
		    					en_attr = new XMLAttributeGenerator("prevname", "");
		    					en.addAttribute(en_attr);
		    					en_attr = null;
		    				}
		    				break;
		    			case NUM:
			    			attr_attr = new XMLAttributeGenerator("type", "NUM");
			    			attribute.addAttribute(attr_attr);
			    			attr_attr = null;
		    				break;
		    			case TEXT:
			    			attr_attr = new XMLAttributeGenerator("type", "TEXT");
			    			attribute.addAttribute(attr_attr);
			    			attr_attr = null;
		    				break;
	    			}
	    			
    				if(type == AttributeType.NUM) {
    					int min = RandomGenerator.generateRandomInt(prob_dist, 0, 1000);
    					long max = RandomGenerator.generateRandomLong(prob_dist, (min+1), 4000000000L);
		    			//minsize
		    			attr_attr = new XMLAttributeGenerator("minsize", new Integer(min).toString());
		    			attribute.addAttribute(attr_attr);
		    			attr_attr = null;
		    			
		    			//maxsize
		    			attr_attr = new XMLAttributeGenerator("maxsize", new Long(max).toString());
		    			attribute.addAttribute(attr_attr);
		    			attr_attr = null;
    				} else if(type == AttributeType.TEXT) {
    					int min = RandomGenerator.generateRandomInt(prob_dist, 1, 10);
    					int max = 0;
    					if(min == 1) {
    						max = min;
    					} else {
    						max = RandomGenerator.generateRandomInt(prob_dist, min+1, 10000);
    					}
		    			//minsize
		    			attr_attr = new XMLAttributeGenerator("minsize", new Integer(min).toString());
		    			attribute.addAttribute(attr_attr);
		    			attr_attr = null;
		    			
		    			//maxsize
		    			attr_attr = new XMLAttributeGenerator("maxsize", new Integer(max).toString());
		    			attribute.addAttribute(attr_attr);
		    			attr_attr = null;
    				} else if(type == AttributeType.BINARY) {
		    			//minsize
		    			attr_attr = new XMLAttributeGenerator("minsize", "0B");
		    			attribute.addAttribute(attr_attr);
		    			attr_attr = null;
		    			//maxsize
		    			attr_attr = new XMLAttributeGenerator("maxsize", "128B");
		    			attribute.addAttribute(attr_attr);
		    			attr_attr = null;
    				}
	    			
    				if(type == AttributeType.TEXT) {
		    			//characterset
		    			attr_attr = new XMLAttributeGenerator("characterset", "latin1");
		    			attribute.addAttribute(attr_attr);
		    			attr_attr = null;
    				}
	    			
	    			//nullable
	    			attr_attr = new XMLAttributeGenerator("required", Boolean.toString(RandomGenerator.generateRandomBoolean(.6)));
	    			attribute.addAttribute(attr_attr);
	    			attr_attr = null;
	    			
	    			//signed
	    			if(type == AttributeType.NUM) {
	    				if(RandomGenerator.generateRandomBoolean(.35)) {
			    			attr_attr = new XMLAttributeGenerator("signed", "true");
			    			attribute.addAttribute(attr_attr);
			    			attr_attr = null;
	    				} else {
			    			attr_attr = new XMLAttributeGenerator("signed", "false");
			    			attribute.addAttribute(attr_attr);
			    			attr_attr = null;
	    				}
	    			}
	    			
	    			//default
	    			if(RandomGenerator.generateRandomBoolean(.8)) {
	    				if(type == AttributeType.TEXT) {
	    	    			attr_attr = new XMLAttributeGenerator("default", RandomGenerator.generateRandomString(prob_dist, 3, 20));
	    	    			attribute.addAttribute(attr_attr);
	    	    			attr_attr = null;
	    				} else if(type == AttributeType.NUM) {
	    	    			attr_attr = new XMLAttributeGenerator("default", new Integer(RandomGenerator.generateRandomInt(prob_dist, 0, 5000)).toString());
	    	    			attribute.addAttribute(attr_attr);
	    	    			attr_attr = null;
	    				} else if(type == AttributeType.BOOLEAN) {
	    					if(RandomGenerator.generateRandomBoolean(.5)) {
		    	    			attr_attr = new XMLAttributeGenerator("default", "true");
		    	    			attribute.addAttribute(attr_attr);
		    	    			attr_attr = null;
	    					} else {
		    	    			attr_attr = new XMLAttributeGenerator("default", "false");
		    	    			attribute.addAttribute(attr_attr);
		    	    			attr_attr = null;
	    					}
	    				} else if(type == AttributeType.DATE) {
	    					if(RandomGenerator.generateRandomBoolean(.2)) {
		    	    			attr_attr = new XMLAttributeGenerator("default", "NOW");
		    	    			attribute.addAttribute(attr_attr);
		    	    			attr_attr = null;
	    					} else {
		    	    			attr_attr = new XMLAttributeGenerator("default", "");
		    	    			attribute.addAttribute(attr_attr);
		    	    			attr_attr = null;
	    					}
	    				} else if(type == AttributeType.BINARY) {
	    	    			attr_attr = new XMLAttributeGenerator("default", "");
	    	    			attribute.addAttribute(attr_attr);
	    	    			attr_attr = null;
	    				} else if(type == AttributeType.ENUM) {
	    	    			attr_attr = new XMLAttributeGenerator("default", enums.get(RandomGenerator.generateRandomInt(prob_dist, 0, enums.size()-1)));
	    	    			attribute.addAttribute(attr_attr);
	    	    			attr_attr = null;
	    				}
	    			} else {
    	    			attr_attr = new XMLAttributeGenerator("default", "");
    	    			attribute.addAttribute(attr_attr);
    	    			attr_attr = null;
	    			}
	    			
	    			//precision
	    			if(type == AttributeType.NUM) {
	    				if(RandomGenerator.generateRandomBoolean(.45)) {
			    			attr_attr = new XMLAttributeGenerator("precision", new Integer(RandomGenerator.generateRandomInt(prob_dist, 1, 7)).toString());
			    			attribute.addAttribute(attr_attr);
			    			attr_attr = null;
	    				} else {
			    			attr_attr = new XMLAttributeGenerator("precision", "0");
			    			attribute.addAttribute(attr_attr);
			    			attr_attr = null;
	    				}
	    			}
	    			
	    			//encryption
	    			if(type == AttributeType.TEXT) {
	    				if(RandomGenerator.generateRandomBoolean(.005)) {
			    			attr_attr = new XMLAttributeGenerator("encryption", "md5");
			    			attribute.addAttribute(attr_attr);
			    			attr_attr = null;
	    				}
	    			}
	    			
	    			//regex
	    			if(type == AttributeType.TEXT) {
		    			attr_attr = new XMLAttributeGenerator("regex", "");
		    			attribute.addAttribute(attr_attr);
		    			attr_attr = null;
	    			}
	    			
	    			//comment
	    			attr_attr = new XMLAttributeGenerator("comment", RandomGenerator.generateRandomString(prob_dist, 0, 256));
	    			attribute.addAttribute(attr_attr);
	    			attr_attr = null;
	    			
	    			attribute = null;
	    		}
	    		
	    		while(RandomGenerator.generateRandomBoolean(.35)) {
//	    			XMLAttributeGenerator rel = new XMLAttributeGenerator(name, value);
	    		}
	    		
	    		business_object = null;
	    	}
	    	xmg.setRootElement(root_element);
	    	
		} catch (IOException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}

		System.out.println("Now Generating your Model...");
		
		System.out.println(xmg.toString(true));
		xmg.save(true);

		System.out.println("Done");
	}

}
