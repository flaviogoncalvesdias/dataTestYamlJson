package testeJson;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;

public class TestPojoJson {

    public static void main(String[] args) {
        DataTestJson dataTestJson = new DataTestJson();
        ObjectMapper objectMapper = new ObjectMapper(new JsonFactory());
        try {
            dataTestJson = objectMapper.readValue(new File("./resources/dadosTestes.Json"), DataTestJson.class);
        }catch (Exception ex){
            ex.printStackTrace();
        }

        System.out.println("Dados Carregados:  "+dataTestJson.getUrl()+""+dataTestJson.getDescricaoProduto1()+" "+dataTestJson.getEmail());
    }
}
