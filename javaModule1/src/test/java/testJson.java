import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class testJson {

    @Test
    public void testMethod1(){
        String jsonStr = "{\"name\":\"liumq\",\"sex\":\"man\"}";
        Gson gson = new Gson();
        Map<String, String> map = gson.fromJson(jsonStr, Map.class);
    }
}
