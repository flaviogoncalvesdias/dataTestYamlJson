package utils;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LeitorVariosJsonWithGson2_6 {
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
	    reader = new FileReader("./resources/dadosTestes_multiplos.json");

	    //Objeto Tipo de Lista com varios Maps
	    List listJson = new ArrayList<Map<String,String>>();

	    // convert JSON file to map
        listJson = gson.fromJson(reader, List.class);
        map=(Map) listJson.get(0);

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
