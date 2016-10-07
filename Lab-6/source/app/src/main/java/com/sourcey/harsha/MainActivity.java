package  com.sourcey.harsha;
import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.Toolbar;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageView;



public class MainActivity extends AppCompatActivity {
    Button button_map, button_photo;
    public static boolean cam_flag = false;
    public static String picturePath;//refer to browse file
    public static ImageView BrowseView;//refer to browse file
    public static boolean browse_flag = false;//refer to photo activity.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //getActionBar().setTitle("Home page");
        button_map = (Button) findViewById(R.id.map);//created maps button
        button_photo = (Button) findViewById(R.id.btnSelectPhoto);

    }

    public void btnSelectPhoto(View v) {
        //This code redirects from main page to the maps page.
        Intent redirect = new Intent(MainActivity.this, activity_maps.class);
        startActivity(redirect);
    }

    public void activity_maps(View v) {
        //This code redirects to the photo activity.
        Intent redirect = new Intent(MainActivity.this, SignupActivity.class);
        startActivity(redirect);
    }



}