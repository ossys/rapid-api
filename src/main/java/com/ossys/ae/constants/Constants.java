package com.ossys.ae.constants;

public final class Constants {
	public static final String NAME = "ActiveEngine.io";
	public static final String VERSION = "0.2.1";
	public static final String SYSTEM_MODEL = "ae/system.xml";
	public static final String SYSTEM_MODEL_XSD = "http://ae.ossys.com/systemmodel.xsd";
//	public static final String SYSTEM_MODEL_XSD = "file:///Users/ccravens/Business/ossys/Projects/AE/src/ae/ae-impl/src/main/resources/models/systemmodel.xsd";
	public static final String DOMAIN_MODEL_XSD = "http://ae.ossys.com/domainmodel.xsd";
//	public static final String DOMAIN_MODEL_XSD = "file:///Users/ccravens/Business/ossys/Projects/AE/src/ae/ae-impl/src/main/resources/models/domainmodel.xsd";
	public static final String INTERFACE_MODEL_XSD = "http://ae.ossys.com/interfacemodel.xsd";
//	public static final String INTERFACE_MODEL_XSD = "file://Users/ccravens/Business/ossys/Projects/AE/src/ae/ae-impl/src/main/resources/models/interfacemodel.xsd";

	public static final String USER_DIR = System.getProperty("user.dir");
	public static final String NEW_LINE = System.getProperty("line.separator");
	public static final String FILE_SEPARATOR = System.getProperty("file.separator");
	public static final String PATH_SEPARATOR = System.getProperty("path.separator");
	
	// private prevents other classes instantiating, throwing AssertionError prevents itself from instantiating
	private Constants() { throw new AssertionError(); }
}
