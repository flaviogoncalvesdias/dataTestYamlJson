package testeJson;

import utils.LeitorDadosTeste;

public class TesteJson {
	
	public static void main(String[] args) throws Exception {
		LeitorDadosTeste leitorDados = new LeitorDadosTeste();	
		leitorDados.getJsonUnico();
		System.out.println(leitorDados.jsonObject.get("email"));
		
		leitorDados.getJsonMultiplos();
		System.out.println(leitorDados.jsonObject.get("email"));
		
		
		
	}
	
	

}
