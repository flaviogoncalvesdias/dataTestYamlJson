package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	
	public static void main(String[] args) throws IOException {
		PropertiesReader propertiesReader = new PropertiesReader();
		
		propertiesReader.getProp();
	}
	
	public Properties getProp() throws IOException {
        Properties props = new Properties();
        FileInputStream file = new FileInputStream(
                "resources/config.properties");
        props.load(file);
        
        System.out.println(props.get("prop.dados"));
        return props;
        
        
 
    }

}
