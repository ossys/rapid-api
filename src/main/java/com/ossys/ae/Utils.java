/**
 * 
 */
package com.ossys.ae;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author Administrator
 *
 */
public class Utils {
	public static String toDelimitedPath(String path) {
		return path.replaceAll("\\\\", "\\\\\\\\");
	}
	
	public static String makeDirectory(String path) {
		if(new File(path).exists()) {
			return " Directory Already Exists!!";
		} else {
			if((new File(path)).mkdir()) {
				return " Directory Created Successfully";
			} else {
				return " Directory Not Created!!";
			}
		}
	}
	
	public static boolean saveStringToFile(String str, String path, String name, boolean overwrite) {
		boolean success = false;
		
		File f = new File(path + System.getProperty("file.separator") + name);
		boolean exists = f.exists();
		if(!f.exists() || (f.exists() && overwrite)) {
			FileWriter out = null;
			try {
				out = new FileWriter(path + System.getProperty("file.separator") + name);
				out.write(str);
				success = true;
			} catch (IOException e) {
				e.printStackTrace();
			} catch(Exception e) {
				e.printStackTrace();
			}  finally {
				if(out != null) {
					try {
						out.flush();
						out.close();
					} catch (IOException e) {
						e.printStackTrace();
					} catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		return success;
	}
	
	public static boolean saveResourceToFile(InputStream is, String path, String name, boolean overwrite) {
		boolean success = false;
		
		File f = new File(path + System.getProperty("file.separator") + name);
		if(!f.exists() || (f.exists() && overwrite)) {
			OutputStream os = null;
			try {
				os = new FileOutputStream(path + System.getProperty("file.separator") + name);
				byte[] buf = new byte[4096];
			    while (true) {
			        int length = is.read(buf);
			        if (length < 0)
			          break;
			        os.write(buf, 0, length);
			      }
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(os != null) { os.flush(); }
					if(is != null) { is.close(); }
					if(os != null) { os.close(); }
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return success;
	}
}
