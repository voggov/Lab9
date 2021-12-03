import netscape.javascript.JSObject;
import org.json.JSONObject;

import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) {
        WeatherClass weatherClass = new WeatherClass();
        String str = weatherClass.getURL("http://api.openweathermap.org/data/2.5/weather?q="+ "Пенза" + "&appid=1677386401e9c6ee40d319dfa9b9686a");
        System.out.println(str);
        if (!str.isEmpty()){
            JSONObject obj = new JSONObject(str);
            System.out.println("Температура: " + obj.getJSONObject("main").getDouble("temp"));
            System.out.println("Температура: " + obj.getJSONObject("main").getDouble("feels_like"));
            System.out.println("Температура: " + obj.getJSONObject("main").getDouble("temp"));
        }
    }
}
