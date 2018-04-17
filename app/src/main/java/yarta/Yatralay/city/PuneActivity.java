package yarta.Yatralay.city;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import yarta.Yatralay.R;

public class PuneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agra);
    }
    public void restaurant(View view){
        Uri gmmIntentUri = Uri.parse("geo:18.5204,73.8567?q=restaurants");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

    }
    public void mall(View view){
        Uri gmmIntentUri = Uri.parse("geo:18.5204,73.8567?q=mall");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);


    }
    public void atm(View view){
        Uri gmmIntentUri = Uri.parse("geo:18.5204,73.8567?q=atm&z=16");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

    }
    public void cinema(View view){
        Uri gmmIntentUri = Uri.parse("geo:18.5204,73.8567?q=cinema");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

    }
    public void hotel(View view){
        Uri gmmIntentUri = Uri.parse("geo:18.5204,73.8567?q=hotel");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

    }
    public void hospital(View view){
        Uri gmmIntentUri = Uri.parse("geo:18.5204,73.8567?q=hospitals");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

    }

}