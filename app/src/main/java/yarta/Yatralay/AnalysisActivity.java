package yarta.Yatralay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class AnalysisActivity extends AppCompatActivity {

    ImageButton delhigreen, delhiblue, delhired;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis);
        delhigreen = (ImageButton) findViewById(R.id.greendelhi);
        delhiblue = (ImageButton) findViewById(R.id.bluedelhi);
        delhired = (ImageButton) findViewById(R.id.reddelhi);

        delhired.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delhinegative(v);
            }
        });
        delhiblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delhineutral(v);
            }
        });
        delhigreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delhipostive(v);
            }
        });
    }


    //delhi
    public void delhinegative(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "negativedelhi");
        startActivity(intent);
    }

    public void delhineutral(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "neutraldelhi");
        startActivity(intent);
    }

    public void delhipostive(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "positivedelhi");
        startActivity(intent);
    }

    //agra
    public void agranegative(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "negativeagra");
        startActivity(intent);
    }

    public void agraneutral(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "neutralagra");
        startActivity(intent);
    }

    public void agrapostive(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "positiveagra");
        startActivity(intent);
    }

    //mumbai
    public void mumbainegative(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "negativemumbai");
        startActivity(intent);
    }

    public void mumbaineutral(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "neutralmumbai");
        startActivity(intent);
    }

    public void mumbaipostive(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "positivemumbai");
        startActivity(intent);
    }

    //pune
    public void punenegative(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "negativepune");
        startActivity(intent);
    }

    public void puneneutral(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "neutralpune");
        startActivity(intent);
    }

    public void punepostive(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "positivepune");
        startActivity(intent);
    }

    //kerala
    public void keralanegative(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "negativekerala");
        startActivity(intent);
    }

    public void keralaneutral(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "neutralkerala");
        startActivity(intent);
    }

    public void keralapostive(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "positivekerala");
        startActivity(intent);
    }

    //jammu
    public void jammunegative(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "negativejammu");
        startActivity(intent);
    }

    public void jammuneutral(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "neutraljammu");
        startActivity(intent);
    }

    public void jammupostive(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "positivejammu");
        startActivity(intent);
    }

    //goa
    public void goanegative(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "negativegoa");
        startActivity(intent);
    }

    public void goaneutral(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "neutralgoa");
        startActivity(intent);
    }

    public void goapostive(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "positivegoa");
        startActivity(intent);
    }

    //leh
    public void lehnegative(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "negativeleh");
        startActivity(intent);
    }

    public void lehneutral(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "neutralleh");
        startActivity(intent);
    }

    public void lehpostive(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "positiveleh");
        startActivity(intent);
    }

    //kashmir
    public void kashmirnegative(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "negativekashmir");
        startActivity(intent);
    }

    public void kashmirneutral(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "neutralkashmir");
        startActivity(intent);
    }

    public void kashmirpostive(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "positivekashmir");
        startActivity(intent);
    }

    //amitsar
    public void amritsarnegative(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "negativeamritsar");
        startActivity(intent);
    }

    public void amritsarneutral(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "neutralamritsar");
        startActivity(intent);
    }

    public void amritsarpostive(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "positiveamritsar");
        startActivity(intent);
    }

    //udaipur
    public void udaipurnegative(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "negativeudaipur");
        startActivity(intent);
    }

    public void udaipurneutral(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "neutraludaipur");
        startActivity(intent);
    }

    public void udaipurpostive(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "positiveudaipur");
        startActivity(intent);
    }
//shimla

    public void shimlanegative(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "negativeshimla");
        startActivity(intent);
    }

    public void shimlaneutral(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "neutralshimla");
        startActivity(intent);
    }

    public void shimlapostive(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "positiveshimla");
        startActivity(intent);
    }

    //manali
    public void manalinegative(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "negativemanali");
        startActivity(intent);
    }

    public void manalineutral(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "neutralmanali");
        startActivity(intent);
    }

    public void manalipostive(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "positivemanali");
        startActivity(intent);
    }

    //darjeeling
    public void darjeelingnegative(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "negativedarjeeling");
        startActivity(intent);
    }

    public void darjeelingneutral(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "neutraldarjeeling");
        startActivity(intent);
    }

    public void darjeelingpostive(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "positivedarjeeling");
        startActivity(intent);
    }

    //jaipur
    public void jaipurnegative(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "negativejaipur");
        startActivity(intent);
    }

    public void jaipurneutral(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "neutraljaipur");
        startActivity(intent);
    }

    public void jaipurpostive(View view) {
        Intent intent = new Intent(this, tweetlist.class);
        intent.putExtra("data", "positivejaipur");
        startActivity(intent);
    }

}
