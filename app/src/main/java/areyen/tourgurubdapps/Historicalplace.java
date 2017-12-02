package areyen.tourgurubdapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Historicalplace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historicalplace);
    }

    public void Coxsbazar(View view) {
        Intent i=new Intent(Historicalplace.this,Coxsbazar.class);
        startActivity(i);
    }

    public void Sentmartin(View view) {
        Intent i=new Intent(Historicalplace.this,Sentmartin.class);
        startActivity(i);

    }

    public void Sundorbon(View view) {
        Intent i=new Intent(Historicalplace.this,Sundorbon.class);
        startActivity(i);
    }

    public void Jaflong(View view) {
        Intent i=new Intent(Historicalplace.this,Jaflong.class);
        startActivity(i);
    }
}
