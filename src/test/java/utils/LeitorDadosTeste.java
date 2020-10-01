package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LeitorDadosTeste {
	public static JSONParser parser = new JSONParser();
	public static JSONObject jsonObject;
	public static JSONArray jsonArray;

	public void getJsonUnico() {
		try {
			jsonObject = lerJson();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void getJsonMultiplos() {
		try {
			jsonArray = lerJsonMultiplos();
			jsonObject = (JSONObject) jsonArray.get(2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Metodo para LerJson
	 * 
	 * @return
	 * @throws IOException
	 * @throws org.json.simple.parser.ParseException
	 * @throws FileNotFoundException
	 */
	public static JSONObject lerJson() throws Exception {
		return (JSONObject) parser.parse(new FileReader("./resources/dadosTestes.json"));
	}

	/**
	 * Metodo para LerJson Multiplos
	 * 
	 * @return
	 * @throws IOException
	 * @throws org.json.simple.parser.ParseException
	 * @throws FileNotFoundException
	 */
	public static JSONArray lerJsonMultiplos() throws Exception {
		return (JSONArray) parser.parse(new FileReader("./resources/dadosTestesArray.json"));
	}

	/**
	 * Metodo para retornar um valor. A partir de uma chave. Ex: getData(usuario)=
	 * Retorno "teste@teste.com.br"
	 * 
	 * @param chave
	 * @return
	 */
	public String getData(String chave) {
		return (String) jsonObject.get(chave);
	}

	public void setData() {
		jsonObject.replace("DescricaoProduto2", "TesteJson");
	}
}
