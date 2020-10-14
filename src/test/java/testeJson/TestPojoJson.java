package testeJson;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import testeYaml.DadosTesteYaml;

import java.io.File;

public class TestPojoJson {

    public static void main(String[] args) {
        lerJson();
      
        
    }

	private static void lerJson() {
		DataTestJson dataTestJson = new DataTestJson();
        ObjectMapper objectMapper = new ObjectMapper(new JsonFactory());
        try {
            dataTestJson = objectMapper.readValue(new File("./resources/dadosTestes.Json"), DataTestJson.class);
        }catch (Exception ex){
            ex.printStackTrace();
        }

        System.out.println("Dados Carregados:  "+dataTestJson.toString());
	}
	

	
}
