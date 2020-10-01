package testeJson;

import com.google.gson.Gson;

import utils.LeitorDadosTeste;

public class TesteJsonGson {

	public static void main(String[] args) {
		
		LeitorDadosTeste leitorDados = new LeitorDadosTeste();
		
		leitorDados.getJsonUnico();
		
		Gson gson = new Gson();
		DataTestJson dataTestJson =  gson.fromJson(leitorDados.jsonObject.toString(), DataTestJson.class);
		
		System.out.println(dataTestJson.getEmail());

	}

}
