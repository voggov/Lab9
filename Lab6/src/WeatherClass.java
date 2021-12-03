import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class WeatherClass {
    //private String urlAdress = "1677386401e9c6ee40d319dfa9b9686a";
    public String getURL(String urlAdress){
        StringBuffer content = new StringBuffer();
        try{
            URL url = new URL(urlAdress);
            URLConnection connection = url.openConnection();

            BufferedReader bufRead = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream()));
            String str;

            while ((str = bufRead.readLine()) != null){
                content.append(str + "\n");
            }
            bufRead.close();

        }catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

}
