package yarta.Yatralay;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

import static yarta.Yatralay.MainActivity.negativeagra;
import static yarta.Yatralay.MainActivity.negativeamritsar;
import static yarta.Yatralay.MainActivity.negativedarjeeling;
import static yarta.Yatralay.MainActivity.negativedelhi;
import static yarta.Yatralay.MainActivity.negativegoa;
import static yarta.Yatralay.MainActivity.negativejaipur;
import static yarta.Yatralay.MainActivity.negativejammu;
import static yarta.Yatralay.MainActivity.negativekashmir;
import static yarta.Yatralay.MainActivity.negativekerala;
import static yarta.Yatralay.MainActivity.negativeleh;
import static yarta.Yatralay.MainActivity.negativemanali;
import static yarta.Yatralay.MainActivity.negativemumbai;
import static yarta.Yatralay.MainActivity.negativepune;
import static yarta.Yatralay.MainActivity.negativeshimla;
import static yarta.Yatralay.MainActivity.negativeudaipur;
import static yarta.Yatralay.MainActivity.neutralagra;
import static yarta.Yatralay.MainActivity.neutralamritsar;
import static yarta.Yatralay.MainActivity.neutraldarjeeling;
import static yarta.Yatralay.MainActivity.neutraldelhi;
import static yarta.Yatralay.MainActivity.neutralgoa;
import static yarta.Yatralay.MainActivity.neutraljaipur;
import static yarta.Yatralay.MainActivity.neutraljammu;
import static yarta.Yatralay.MainActivity.neutralkashmir;
import static yarta.Yatralay.MainActivity.neutralkerala;
import static yarta.Yatralay.MainActivity.neutralleh;
import static yarta.Yatralay.MainActivity.neutralmanali;
import static yarta.Yatralay.MainActivity.neutralmumbai;
import static yarta.Yatralay.MainActivity.neutralpune;
import static yarta.Yatralay.MainActivity.neutralshimla;
import static yarta.Yatralay.MainActivity.neutraludaipur;
import static yarta.Yatralay.MainActivity.positiveagra;
import static yarta.Yatralay.MainActivity.positiveamritsar;
import static yarta.Yatralay.MainActivity.positivedarjeeling;
import static yarta.Yatralay.MainActivity.positivedelhi;
import static yarta.Yatralay.MainActivity.positivegoa;
import static yarta.Yatralay.MainActivity.positivejaipur;
import static yarta.Yatralay.MainActivity.positivejammu;
import static yarta.Yatralay.MainActivity.positivekashmir;
import static yarta.Yatralay.MainActivity.positivekerala;
import static yarta.Yatralay.MainActivity.positiveleh;
import static yarta.Yatralay.MainActivity.positivemanali;
import static yarta.Yatralay.MainActivity.positivemumbai;
import static yarta.Yatralay.MainActivity.positivepune;
import static yarta.Yatralay.MainActivity.positiveshimla;
import static yarta.Yatralay.MainActivity.positiveudaipur;

public class tweetlist extends AppCompatActivity {
    private static final String TAG = "Tweet_list";
    RecyclerView recyclerView;
    tweetAdapter tweetAdapter;
    String s;
    String[] arr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tweetlist);
        recyclerView = (RecyclerView) findViewById(R.id.tweetrec);
        recyclerView.setHasFixedSize(true);
        recyclerView.getRecycledViewPool().clear();
        LinearLayoutManager lm_recycle = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(lm_recycle);


        try {
            s = getIntent().getStringExtra("data");

            Log.e(TAG, "onStart: " + s);

            tweetAdapter = new tweetAdapter(getApplicationContext());
            switch (s) {
                case "negativedelhi": {
                    tweetAdapter.mDataArray.clear();
                    Log.e(TAG, "onCreate: negativedelhi");
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) negativedelhi.clone();
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "neutraldelhi": {
                    tweetAdapter.mDataArray.clear();
                    Log.e(TAG, "onCreate: neutraldelhi");
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) neutraldelhi.clone();
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "positivedelhi": {
                    tweetAdapter.mDataArray.clear();
                    Log.e(TAG, "onCreate: positivedelhi");
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) positivedelhi.clone();
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "negativemumbai": {
                    tweetAdapter.mDataArray.clear();
                    Log.e(TAG, "onCreate: negativemumbai");
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) negativemumbai.clone();
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "neutralmumbai": {
                    tweetAdapter.mDataArray.clear();
                    Log.e(TAG, "onCreate: neutralmumbai");
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) neutralmumbai.clone();
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "positivemumbai": {
                    tweetAdapter.mDataArray.clear();
                    Log.e(TAG, "onCreate: positivemumbai");
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) positivemumbai.clone();
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "negativeagra": {
                    tweetAdapter.mDataArray.clear();
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) negativeagra.clone();
                    Log.e(TAG, "onCreate: negativeagra");
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "neutralagra": {
                    tweetAdapter.mDataArray.clear();
                    Log.e(TAG, "onCreate: neutralagra");
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) neutralagra.clone();
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "positiveagra": {
                    tweetAdapter.mDataArray.clear();
                    Log.e(TAG, "onCreate: positiveagra");
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) positiveagra.clone();
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }

                case "negativedarjeeling": {
                    tweetAdapter.mDataArray.clear();
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) negativedarjeeling.clone();
                    Log.e(TAG, "onCreate: negativedarjeeling");
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "neutraldarjeeling": {
                    tweetAdapter.mDataArray.clear();
                    Log.e(TAG, "onCreate: neutraldarjeeling");
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) neutraldarjeeling.clone();
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "positivedarjeeling": {
                    tweetAdapter.mDataArray.clear();
                    Log.e(TAG, "onCreate: positivedarjeeling");
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) positivedarjeeling.clone();
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }

                case "positivemanali": {
                    tweetAdapter.mDataArray.clear();
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) positivemanali.clone();
                    Log.e(TAG, "onCreate: positivemanali");
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "neutralmanali": {
                    tweetAdapter.mDataArray.clear();
                    Log.e(TAG, "onCreate: neutralmanali");
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) neutralmanali.clone();
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "negativemanali": {
                    tweetAdapter.mDataArray.clear();
                    Log.e(TAG, "onCreate: negativemanali");
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) negativemanali.clone();
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "positiveshimla": {
                    tweetAdapter.mDataArray.clear();
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) positiveshimla.clone();
                    Log.e(TAG, "onCreate: positiveshimla");
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "neutralshimla": {
                    tweetAdapter.mDataArray.clear();
                    Log.e(TAG, "onCreate: neutralshimla");
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) neutralshimla.clone();
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "negativeshimla": {
                    tweetAdapter.mDataArray.clear();
                    Log.e(TAG, "onCreate: negativeshimla");
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) negativeshimla.clone();
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "positiveudaipur": {
                    tweetAdapter.mDataArray.clear();
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) positiveudaipur.clone();
                    Log.e(TAG, "onCreate: positiveudaipur");
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "neutraludaipur": {
                    tweetAdapter.mDataArray.clear();
                    Log.e(TAG, "onCreate: neutraludaipur");
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) neutraludaipur.clone();
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "negativeudaipur": {
                    tweetAdapter.mDataArray.clear();
                    Log.e(TAG, "onCreate: negativeudaipur");
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) negativeudaipur.clone();
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "positiveamritsar": {
                    tweetAdapter.mDataArray.clear();
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) positiveamritsar.clone();
                    Log.e(TAG, "onCreate: positiveamritsar");
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "neutralamritsar": {
                    tweetAdapter.mDataArray.clear();
                    Log.e(TAG, "onCreate: neutralamritsar");
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) neutralamritsar.clone();
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "negativeamritsar": {
                    tweetAdapter.mDataArray.clear();
                    Log.e(TAG, "onCreate: negativeamritsar");
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) negativeamritsar.clone();
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "positivekashmir": {
                    tweetAdapter.mDataArray.clear();
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) positivekashmir.clone();
                    Log.e(TAG, "onCreate: positivekashmir");
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "neutralkashmir": {
                    tweetAdapter.mDataArray.clear();
                    Log.e(TAG, "onCreate: neutralamritsar");
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) neutralkashmir.clone();
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "negativekashmir": {
                    tweetAdapter.mDataArray.clear();
                    Log.e(TAG, "onCreate: negativekashmir");
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) negativekashmir.clone();
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "positivepune": {
                    tweetAdapter.mDataArray.clear();
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) positivepune.clone();
                    Log.e(TAG, "onCreate: positivepune");
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "neutralpune": {
                    tweetAdapter.mDataArray.clear();
                    Log.e(TAG, "onCreate: neutralpune");
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) neutralpune.clone();
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "negativepune": {
                    tweetAdapter.mDataArray.clear();
                    Log.e(TAG, "onCreate: negativepune");
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) negativepune.clone();
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }


                case "positiveleh": {
                    tweetAdapter.mDataArray.clear();
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) positiveleh.clone();
                    Log.e(TAG, "onCreate: positiveleh");
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "neutralleh": {
                    tweetAdapter.mDataArray.clear();
                    Log.e(TAG, "onCreate: neutralleh");
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) neutralleh.clone();
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "negativeleh": {
                    tweetAdapter.mDataArray.clear();
                    Log.e(TAG, "onCreate: negativeleh");
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) negativeleh.clone();
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "positivegoa": {
                    tweetAdapter.mDataArray.clear();
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) positivegoa.clone();
                    Log.e(TAG, "onCreate: positivegoa");
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "neutralgoa": {
                    tweetAdapter.mDataArray.clear();
                    Log.e(TAG, "onCreate: neutralgoa");
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) neutralgoa.clone();
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "negativegoa": {
                    tweetAdapter.mDataArray.clear();
                    Log.e(TAG, "onCreate: negativegoa");
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) negativegoa.clone();
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "positivejaipur": {
                    tweetAdapter.mDataArray.clear();
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) positivejaipur.clone();
                    Log.e(TAG, "onCreate: positivejaipur");
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "neutraljaipur": {
                    tweetAdapter.mDataArray.clear();
                    Log.e(TAG, "onCreate: neutraljaipur");
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) neutraljaipur.clone();
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "negativejaipur": {
                    tweetAdapter.mDataArray.clear();
                    Log.e(TAG, "onCreate: negativejaipur");
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) negativejaipur.clone();
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }

                case "positivekerala": {
                    tweetAdapter.mDataArray.clear();
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) positivekerala.clone();
                    Log.e(TAG, "onCreate: positivekerala");
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "neutralkerala": {
                    tweetAdapter.mDataArray.clear();
                    Log.e(TAG, "onCreate: neutralkerala");
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) neutralkerala.clone();
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "negativekerala": {
                    tweetAdapter.mDataArray.clear();
                    Log.e(TAG, "onCreate: negativekerala");
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) negativekerala.clone();
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }

                case "positivejammu": {
                    tweetAdapter.mDataArray.clear();
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) positivejammu.clone();
                    Log.e(TAG, "onCreate: positivejammu");
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "neutraljammu": {
                    tweetAdapter.mDataArray.clear();
                    Log.e(TAG, "onCreate: neutralkerala");
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) neutraljammu.clone();
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
                case "negativejammu": {
                    tweetAdapter.mDataArray.clear();
                    Log.e(TAG, "onCreate: negativejammu");
                    tweetAdapter.mDataArray = (ArrayList<HashMap<String, String>>) negativejammu.clone();
                    tweetAdapter.notifyDataSetChanged();
                    break;
                }
            }
            recyclerView.setAdapter(tweetAdapter);


        } catch (Exception e) {
            Log.e(TAG, "onStart: " + e.getMessage());
        }


    }

    @Override
    protected void onResume() {
        super.onResume();

        try {

            tweetAdapter.notifyDataSetChanged();
            recyclerView.setAdapter(tweetAdapter);
        } catch (Exception e) {
            Log.e(TAG, "onResume: " + e.getMessage());
        }

    }


    @Override
    protected void onPostResume() {
        super.onPostResume();
        try {
            tweetAdapter.notifyDataSetChanged();
            recyclerView.setAdapter(tweetAdapter);
        } catch (Exception e) {
            Log.e(TAG, "onResume: " + e.getMessage());
        }
    }

    public static class tweetdataholder extends RecyclerView.ViewHolder {
        View view;
        TextView tweet;

        public tweetdataholder(View itemView) {
            super(itemView);

            view = itemView;
            tweet = (TextView) view.findViewById(R.id.showtweet);
        }

        public void setinfo(String arraylist, int position) {

            tweet.setText(arraylist);


        }
    }
}
