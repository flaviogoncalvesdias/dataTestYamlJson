package testeYaml;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;

public class YamlTest {

    public static void main(String[] args) {
        DadosTesteYaml url = new DadosTesteYaml();
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        try {
            url = objectMapper.readValue(new File("./resources/test.yaml"), DadosTesteYaml.class);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        System.out.println("Url buscada: "+url.getUrl());
    }
}
