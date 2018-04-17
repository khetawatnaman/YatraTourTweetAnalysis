package yarta.Yatralay;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;

import yarta.Yatralay.model.tweetmodel;

import static yarta.Yatralay.LoginActivity.mGoogleSignInClient;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private static final String TAG = "Main_Activity";
    public static ArrayList<HashMap<String, String>> positivedelhi;
    public static ArrayList<HashMap<String, String>> neutraldelhi;
    public static ArrayList<HashMap<String, String>> negativedelhi;
    public static ArrayList<HashMap<String, String>> positiveagra;
    public static ArrayList<HashMap<String, String>> neutralagra;
    public static ArrayList<HashMap<String, String>> negativeagra;
    public static ArrayList<HashMap<String, String>> positivedarjeeling;
    public static ArrayList<HashMap<String, String>> neutraldarjeeling;
    public static ArrayList<HashMap<String, String>> negativedarjeeling;
    public static ArrayList<HashMap<String, String>> positivemanali;
    public static ArrayList<HashMap<String, String>> neutralmanali;
    public static ArrayList<HashMap<String, String>> negativemanali;
    public static ArrayList<HashMap<String, String>> positiveshimla;
    public static ArrayList<HashMap<String, String>> neutralshimla;
    public static ArrayList<HashMap<String, String>> negativeshimla;
    public static ArrayList<HashMap<String, String>> positiveudaipur;
    public static ArrayList<HashMap<String, String>> neutraludaipur;
    public static ArrayList<HashMap<String, String>> negativeudaipur;
    public static ArrayList<HashMap<String, String>> positiveamritsar;
    public static ArrayList<HashMap<String, String>> neutralamritsar;
    public static ArrayList<HashMap<String, String>> negativeamritsar;
    public static ArrayList<HashMap<String, String>> positivekashmir;
    public static ArrayList<HashMap<String, String>> neutralkashmir;
    public static ArrayList<HashMap<String, String>> negativekashmir;
    public static ArrayList<HashMap<String, String>> positivepune;
    public static ArrayList<HashMap<String, String>> neutralpune;
    public static ArrayList<HashMap<String, String>> negativepune;
    public static ArrayList<HashMap<String, String>> positiveleh;
    public static ArrayList<HashMap<String, String>> neutralleh;
    public static ArrayList<HashMap<String, String>> negativeleh;
    public static ArrayList<HashMap<String, String>> positivegoa;
    public static ArrayList<HashMap<String, String>> neutralgoa;
    public static ArrayList<HashMap<String, String>> negativegoa;
    public static ArrayList<HashMap<String, String>> positivejaipur;
    public static ArrayList<HashMap<String, String>> neutraljaipur;
    public static ArrayList<HashMap<String, String>> negativejaipur;
    public static ArrayList<HashMap<String, String>> positivekerala;
    public static ArrayList<HashMap<String, String>> neutralkerala;
    public static ArrayList<HashMap<String, String>> negativekerala;
    public static ArrayList<HashMap<String, String>> positivejammu;
    public static ArrayList<HashMap<String, String>> neutraljammu;
    public static ArrayList<HashMap<String, String>> negativejammu;
    public static ArrayList<HashMap<String, String>> positivemumbai;
    public static ArrayList<HashMap<String, String>> neutralmumbai;
    public static ArrayList<HashMap<String, String>> negativemumbai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        positivedelhi = new ArrayList<>();
        positiveagra = new ArrayList<>();
        positivekerala = new ArrayList<>();
        positivemanali = new ArrayList<>();
        positivemumbai = new ArrayList<>();
        positivedarjeeling = new ArrayList<>();
        positiveshimla = new ArrayList<>();
        positiveudaipur = new ArrayList<>();
        positivejaipur = new ArrayList<>();
        positivejammu = new ArrayList<>();
        positiveamritsar = new ArrayList<>();
        positivekashmir = new ArrayList<>();
        positivepune = new ArrayList<>();
        positiveleh = new ArrayList<>();
        positivegoa = new ArrayList<>();
        //neutral
        neutraldelhi = new ArrayList<>();
        neutralagra = new ArrayList<>();
        neutralkerala = new ArrayList<>();
        neutralmanali = new ArrayList<>();
        neutralmumbai = new ArrayList<>();
        neutraldarjeeling = new ArrayList<>();
        neutralshimla = new ArrayList<>();
        neutraludaipur = new ArrayList<>();
        neutraljaipur = new ArrayList<>();
        neutraljammu = new ArrayList<>();
        neutralamritsar = new ArrayList<>();
        neutralkashmir = new ArrayList<>();
        neutralpune = new ArrayList<>();
        neutralleh = new ArrayList<>();
        neutralgoa = new ArrayList<>();
        //negative
        negativedelhi = new ArrayList<>();
        negativeagra = new ArrayList<>();
        negativekerala = new ArrayList<>();
        negativemanali = new ArrayList<>();
        negativemumbai = new ArrayList<>();
        negativedarjeeling = new ArrayList<>();
        negativeshimla = new ArrayList<>();
        negativeudaipur = new ArrayList<>();
        negativejaipur = new ArrayList<>();
        negativejammu = new ArrayList<>();
        negativeamritsar = new ArrayList<>();
        negativekashmir = new ArrayList<>();
        negativepune = new ArrayList<>();
        negativeleh = new ArrayList<>();
        negativegoa = new ArrayList<>();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_blog) {
            // Handle the camera action
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://yatralay.wordpress.com/blog/"));
            startActivity(intent);
        } else if (id == R.id.nav_send) {
            FirebaseAuth.getInstance().signOut();
            mGoogleSignInClient.signOut().addOnCompleteListener(this,
                    new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            Toast.makeText(MainActivity.this, "Sign Out", Toast.LENGTH_SHORT).show();
                            Log.e(TAG, "onComplete: " + "Sign Out");
                            startActivity(new Intent(MainActivity.this, LoginActivity.class));
                        }
                    });
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void card1(View view) {
        Intent intent = new Intent(this, AnalysisActivity.class);
        startActivity(intent);
    }

    public void card2(View view) {
        Intent intent = new Intent(this, BudgetActivity.class);
        startActivity(intent);
    }

    public void card3(View view) {
        Intent intent = new Intent(this, PlaceActivity.class);
        startActivity(intent);
    }

    public void card4(View view) {
        Intent intent = new Intent(this, VideoActivity.class);
        startActivity(intent);
    }

    public void card5(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://yatralay.wordpress.com/blog/"));
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();

        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();

        Log.e(TAG, "onResume: " + FirebaseDatabase.getInstance().getReference().toString());


        databaseReference.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                Log.e(TAG, "onDataChange: " + dataSnapshot);
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    Log.e(TAG, "onDataChange: " + snapshot.getKey());
                    tweetmodel data = snapshot.getValue(tweetmodel.class);
                    try {
                        assert data != null;
                        //delhi
                        if (data.getCity().equals("Delhi")) {
                            if (data.getSentiment().equals("positive")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());


                                positivedelhi.add(map);

                            }
                            if (data.getSentiment().equals("neutral")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());

                                neutraldelhi.add(map);

                            }
                            if (data.getSentiment().equals("negative")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());


                                negativedelhi.add(map);

                            }
                            Log.e(TAG, "onDataChange: positivedelhi" + positivedelhi.size());
                            Log.e(TAG, "onDataChange: negativedelhi" + negativedelhi.size());
                            Log.e(TAG, "onDataChange: neutraldelhi" + neutraldelhi.size());


                        }
                        //agra
                        if (data.getCity().equals("Agra")) {
                            if (data.getSentiment().equals("positive")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());
                                positiveagra.add(map);

                            }
                            if (data.getSentiment().equals("neutral")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());

                                neutralagra.add(map);

                            }
                            if (data.getSentiment().equals("negative")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());
                                negativeagra.add(map);

                            }
                            Log.e(TAG, "onDataChange: negativeagra" + negativeagra.size());
                            Log.e(TAG, "onDataChange: neutralagra" + neutralagra.size());
                            Log.e(TAG, "onDataChange: positiveagra" + positiveagra.size());


                        }
                        //manali

                        if (data.getCity().equals("manali")) {
                            if (data.getSentiment().equals("positive")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());
                                positivemanali.add(map);

                            }
                            if (data.getSentiment().equals("neutral")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());

                                neutralmanali.add(map);

                            }
                            if (data.getSentiment().equals("negative")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());


                                negativemanali.add(map);

                            }
                            Log.e(TAG, "onDataChange: negativemanali" + negativemanali.size());
                            Log.e(TAG, "onDataChange: neutralmanali" + neutralmanali.size());
                            Log.e(TAG, "onDataChange: positivemanali" + positivemanali.size());


                        }
                        //Kerala
                        if (data.getCity().equals("Kerala")) {
                            if (data.getSentiment().equals("positive")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());


                                positivekerala.add(map);

                            }
                            if (data.getSentiment().equals("neutral")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());

                                neutralkerala.add(map);

                            }
                            if (data.getSentiment().equals("negative")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());


                                negativekerala.add(map);

                            }
                            Log.e(TAG, "onDataChange: neutralkerala" + neutralkerala.size());
                            Log.e(TAG, "onDataChange: positivekerala" + positivekerala.size());
                            Log.e(TAG, "onDataChange: negativekerala" + negativekerala.size());


                        }

                        //Kashmir
                        if (data.getCity().equals("Kashmir")) {
                            if (data.getSentiment().equals("positive")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());


                                positivekashmir.add(map);

                            }
                            if (data.getSentiment().equals("neutral")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());

                                neutralkashmir.add(map);

                            }
                            if (data.getSentiment().equals("negative")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());


                                negativekashmir.add(map);

                            }
                            Log.e(TAG, "onDataChange: negativekashmir" + negativekashmir.size());
                            Log.e(TAG, "onDataChange: neutralkashmir" + neutralkashmir.size());
                            Log.e(TAG, "onDataChange: positivekashmir" + positivekashmir.size());


                        }

                        //Leh
                        if (data.getCity().equals("Leh")) {
                            if (data.getSentiment().equals("positive")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());


                                positiveleh.add(map);

                            }
                            if (data.getSentiment().equals("neutral")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());

                                neutralleh.add(map);

                            }
                            if (data.getSentiment().equals("negative")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());


                                negativeleh.add(map);

                            }
                            Log.e(TAG, "onDataChange: negativeleh" + negativeleh.size());
                            Log.e(TAG, "onDataChange: neutralleh" + neutralleh.size());
                            Log.e(TAG, "onDataChange: positiveleh" + positiveleh.size());


                        }

                        //Udaipur
                        if (data.getCity().equals("Udaipur")) {
                            if (data.getSentiment().equals("positive")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());


                                positiveudaipur.add(map);

                            }
                            if (data.getSentiment().equals("neutral")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());

                                neutraludaipur.add(map);

                            }
                            if (data.getSentiment().equals("negative")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());


                                negativeudaipur.add(map);

                            }
                            Log.e(TAG, "onDataChange: negativeudaipur" + negativeudaipur.size());
                            Log.e(TAG, "onDataChange: neutraludaipur" + neutraludaipur.size());
                            Log.e(TAG, "onDataChange: positiveudaipur" + positiveudaipur.size());


                        }
                        //Shimla

                        if (data.getCity().equals("Shimla")) {
                            if (data.getSentiment().equals("positive")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());


                                positiveshimla.add(map);

                            }
                            if (data.getSentiment().equals("neutral")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());

                                neutralshimla.add(map);

                            }
                            if (data.getSentiment().equals("negative")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());


                                negativeshimla.add(map);
                            }
                            Log.e(TAG, "onDataChange: negativeshimla" + negativeshimla.size());
                            Log.e(TAG, "onDataChange: neutralshimla" + neutralshimla.size());
                            Log.e(TAG, "onDataChange: positiveshimla" + positiveshimla.size());


                        }
                        //Amritsar
                        if (data.getCity().equals("Amritsar")) {
                            if (data.getSentiment().equals("positive")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());


                                positiveamritsar.add(map);

                            }
                            if (data.getSentiment().equals("neutral")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());

                                neutralamritsar.add(map);

                            }
                            if (data.getSentiment().equals("negative")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());


                                negativeamritsar.add(map);

                            }
                            Log.e(TAG, "onDataChange: negativeamritsar" + negativeamritsar.size());
                            Log.e(TAG, "onDataChange: neutralamritsar" + neutralamritsar.size());
                            Log.e(TAG, "onDataChange: positiveamritsar" + positiveamritsar.size());


                        }
//Jaipur
                        if (data.getCity().equals("Jaipur")) {
                            if (data.getSentiment().equals("positive")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());


                                positivejaipur.add(map);

                            }
                            if (data.getSentiment().equals("neutral")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());

                                neutraljaipur.add(map);

                            }
                            if (data.getSentiment().equals("negative")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());


                                negativejaipur.add(map);

                            }
                            Log.e(TAG, "onDataChange: negativejaipur" + negativejaipur.size());
                            Log.e(TAG, "onDataChange: neutraljaipur" + neutraljaipur.size());
                            Log.e(TAG, "onDataChange: positivejaipur" + positivejaipur.size());


                        }
                        //Goa
                        if (data.getCity().equals("Goa")) {
                            if (data.getSentiment().equals("positive")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());


                                positivegoa.add(map);

                            }
                            if (data.getSentiment().equals("neutral")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());

                                neutralgoa.add(map);

                            }
                            if (data.getSentiment().equals("negative")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());


                                negativegoa.add(map);

                            }
                            Log.e(TAG, "onDataChange: negativegoa" + negativegoa.size());
                            Log.e(TAG, "onDataChange: neutralgoa" + neutralgoa.size());
                            Log.e(TAG, "onDataChange: positivegoa" + positivegoa.size());


                        }
                        //Pune
                        if (data.getCity().equals("Pune")) {
                            if (data.getSentiment().equals("positive")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());


                                positivepune.add(map);

                            }
                            if (data.getSentiment().equals("neutral")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());

                                neutralpune.add(map);

                            }
                            if (data.getSentiment().equals("negative")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());


                                negativepune.add(map);

                            }
                            Log.e(TAG, "onDataChange: neutralpune" + neutralpune.size());
                            Log.e(TAG, "onDataChange: positivepune" + positivepune.size());
                            Log.e(TAG, "onDataChange: negativepune" + negativepune.size());


                        }

//Darjeeling
                        if (data.getCity().equals("Darjeeling")) {
                            if (data.getSentiment().equals("positive")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());


                                positivedarjeeling.add(map);

                            }
                            if (data.getSentiment().equals("neutral")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());

                                neutraldarjeeling.add(map);

                            }
                            if (data.getSentiment().equals("negative")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());


                                negativedarjeeling.add(map);

                            }
                            Log.e(TAG, "onDataChange: positivedarjeeling" + positivedarjeeling.size());
                            Log.e(TAG, "onDataChange: negativedarjeeling" + negativedarjeeling.size());
                            Log.e(TAG, "onDataChange: neutraldarjeeling" + neutraldarjeeling.size());


                        }
                        //Jammu
                        if (data.getCity().equals("Jammu")) {
                            if (data.getSentiment().equals("positive")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());


                                positivejammu.add(map);

                            }
                            if (data.getSentiment().equals("neutral")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());

                                neutraljammu.add(map);

                            }
                            if (data.getSentiment().equals("negative")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());


                                negativejammu.add(map);

                            }
                            Log.e(TAG, "onDataChange: negativejammu" + negativejammu.size());
                            Log.e(TAG, "onDataChange: neutraljammu" + neutraljammu.size());

                            Log.e(TAG, "onDataChange: positivejammu" + positivejammu.size());

                        }
                        //Mumbai
                        if (data.getCity().equals("Mumbai")) {
                            if (data.getSentiment().equals("positive")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());


                                positivemumbai.add(map);

                            }
                            if (data.getSentiment().equals("neutral")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());

                                neutralmumbai.add(map);

                            }
                            if (data.getSentiment().equals("negative")) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put("sentiment", data.getSentiment());
                                map.put("tweet", data.getTweet());


                                negativemumbai.add(map);

                            }
                            Log.e(TAG, "onDataChange: positivemumbai" + positivemumbai.size());

                            Log.e(TAG, "onDataChange: neutralmumbai" + neutralmumbai.size());

                            Log.e(TAG, "onDataChange: negativemumbai" + negativemumbai.size());

                        }


                    } catch (Exception e) {
                        Log.e(TAG, "onDataChange: " + e.getMessage());
                    }


                }


            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }
}
