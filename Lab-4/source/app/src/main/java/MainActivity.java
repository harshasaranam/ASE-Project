package com.sourcey.harsha;
package com.google.harsha;


import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


        import com.google.api.client.http.HttpRequest;
        import com.google.api.client.http.HttpRequestFactory;
        import com.google.api.client.http.HttpResponse;
        import com.google.api.client.http.HttpTransport;
        import com.google.api.client.http.javanet.NetHttpTransport;
        import com.jayway.jsonpath.JsonPath;

        import org.json.simple.JSONArray;
        import org.json.simple.JSONObject;
        import org.json.simple.parser.JSONParser;


import com.google.api.*;
import java.io.FileInputStream;
import java.util.Properties;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
public class MainActivity {
    public static Properties properties = new Properties();
    public static void main(String[] args) {
        try {
            properties.load(new FileInputStream("kgsearch.properties"));

            HttpTransport httpTransport = new NetHttpTransport();
            HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
            JSONParser parser = new JSONParser();
            GenericUrl url = new GenericUrl("https://kgsearch.googleapis.com/v1/entities:search");
            url.put("query", "Taylor Swift");
            url.put("limit", "10");
            url.put("indent", "true");
            url.put("key", properties.get("AIzaSyArexDGv7J7WF8EqbwJAkf22ibn6KOvPn8"));
            HttpRequest request = requestFactory.buildGetRequest(url);
            HttpResponse httpResponse = request.execute();
            JSONObject response = (JSONObject) parser.parse(httpResponse.parseAsString());
            JSONArray elements = (JSONArray) response.get("itemListElement");
            for (Object element : elements) {
                System.out.println(JsonPath.read(element, "$.result.name").toString());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
