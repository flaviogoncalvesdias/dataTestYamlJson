package utils;

import java.io.FileNotFoundException;
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
	// create Gson instance
    static Gson gson = new Gson();
    static Reader reader;
    static Map<String, String> map;
    

	public static void main(String[] args) throws IOException {

		leitorJson();
	    gravaArquivoJson();
	    
	}

	private static void gravaArquivoJson() throws IOException {
		FileWriter writer = new FileWriter("./resources/dadosTestes_copy.json");
	    gson.toJson(map,writer);
	    writer.flush();
	    writer.close();
	}
	
	public static void leitorJson() throws IOException {

	    // Leitor do Java
	    reader = new FileReader("./resources/dadosTestes.json");
	    // convert JSON file to map
	    map = gson.fromJson(reader, Map.class);
	    exibirmapJson(map);
	    System.out.println(map.get("url"));

	    // close reader
	    reader.close();

	}

	private static void exibirmapJson(Map<String, String> map) {
		// print map entries
	    for (Map.Entry<String, String> entry : map.entrySet()) {
	        System.out.println(entry.getKey() + "=" + entry.getValue());
	    }
	}

	

}
