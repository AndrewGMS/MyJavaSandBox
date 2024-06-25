import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonTest {
    public static void main(String[] args) throws JsonProcessingException {
        // Определение класса, соответствующего JSON
        class User {

            private String name;

           @JsonRawValue
            private String json;


            public void setName(String n) {name = n;}
            public void setJson(String n) {json = n;}

        }

        // Создание объекта User
        User user = new User();
        user.setName("John Doe");
        user.setJson("{\"name\": \"John Doe\"}");

        // Создание экземпляра ObjectMapper
        ObjectMapper mapper = new ObjectMapper();

        // Сериализация объекта User в JSON
        String json = mapper.writeValueAsString(user);

        // Вывод результата
        System.out.println(json);
    }
}

