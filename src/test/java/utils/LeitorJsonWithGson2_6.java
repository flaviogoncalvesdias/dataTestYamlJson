package utils;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonWriter;

public class LeitorJsonWithGson2_6 {

	public static void main(String[] args) throws IOException {
		
		Map<String, Object> map1 = new HashMap<>();
		
		// create Gson instance
	    Gson gson = new Gson();

	    // create a reader
	    Reader reader = new FileReader("./resources/dadosTestes.json");

	    // convert JSON file to map
	    Map<String, String> map = gson.fromJson(reader, Map.class);

	    // print map entries
	    for (Map.Entry<String, String> entry : map.entrySet()) {
	        System.out.println(entry.getKey() + "=" + entry.getValue());
	    }
	    System.out.println(map.get("url"));

	    // close reader
	    reader.close();
	    
	    FileWriter writer = new FileWriter("./resources/dadosTestes_copy.json");
	    
	    
	    gson.toJson(map,writer);
	    
	    writer.flush();
	    writer.close();
	    

	}

	

}
