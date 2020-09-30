import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;

public class YamlTest {

    public static void main(String[] args) {
        Url url = new Url();
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        try {
            url = objectMapper.readValue(new File("src/test/java/test.yaml"), Url.class);
        }catch (Exception ex){
            ex.printStackTrace();
        }

        System.out.println("Url buscada: "+url.getBaseUrl());
    }
}
