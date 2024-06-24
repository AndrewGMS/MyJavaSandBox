import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonTest {
    public static void main(String[] args) throws JsonProcessingException {
        // Определение класса, соответствующего JSON
        class User {
            @JsonProperty("name")
            private String name;

            @JsonProperty("age")
            private int age;

            // Геттеры и сеттеры для доступа к полям
            // ...
        }

        // Создание объекта User
        User user = new User();
        user.setName("John Doe");
        user.setAge(30);

        // Создание экземпляра ObjectMapper
        ObjectMapper mapper = new ObjectMapper();

        // Сериализация объекта User в JSON
        String json = mapper.writeValueAsString(user);

        // Вывод результата
        System.out.println(json);
    }
}

