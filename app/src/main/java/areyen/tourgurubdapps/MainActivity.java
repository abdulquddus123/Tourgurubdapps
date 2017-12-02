package areyen.tourgurubdapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ShowHistoricalPlace(View view) {
        Intent i=new Intent(MainActivity.this,MapsActivity.class);
        int number=1;
        i.putExtra("number",number);
        startActivity(i);
    }

    public void About_us(View view) {
        Intent i=new Intent(MainActivity.this,AboutUs.class);
        startActivity(i);
    }
    MapsActivity map=new MapsActivity();

    public void NearHistoricalPlace(View view) {
        Intent i=new Intent(MainActivity.this,Historicalplace.class);
        startActivity(i);
    }
}
