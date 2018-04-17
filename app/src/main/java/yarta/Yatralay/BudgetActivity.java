package yarta.Yatralay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class BudgetActivity extends AppCompatActivity {

    public static int finalValue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget);
    }

    public void submit(View view){

        EditText et1 = (EditText) findViewById(R.id.et1);
        String value= et1.getText().toString();
        try {
            finalValue = Integer.parseInt(value);
        }catch (Exception e){

        }
        if(finalValue>=500 && finalValue<=20000){
            startActivity(new Intent(this, UnderbudgetActivity.class));
        }else{
            if(finalValue>=20000){
                Toast.makeText(this, "Max Budget 20,000!!",
                        Toast.LENGTH_LONG).show();
            }
            else{
            Toast.makeText(this, "Plaese enter a valid amount!!",
                    Toast.LENGTH_LONG).show();
        }
        }

    }

}
