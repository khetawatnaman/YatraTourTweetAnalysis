package yarta.Yatralay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import yarta.Yatralay.city.AgraActivity;
import yarta.Yatralay.city.AmritsarActivity;
import yarta.Yatralay.city.BengaluruActivity;
import yarta.Yatralay.city.ChandigarhActivity;
import yarta.Yatralay.city.ChennaiActivity;
import yarta.Yatralay.city.DelhiActivity;
import yarta.Yatralay.city.GoaActivity;
import yarta.Yatralay.city.HanumangarhActivity;
import yarta.Yatralay.city.HyderabadActivity;
import yarta.Yatralay.city.JaipurActivity;
import yarta.Yatralay.city.KalibanganActivity;
import yarta.Yatralay.city.KasolActivity;
import yarta.Yatralay.city.KolkataActivity;
import yarta.Yatralay.city.KotaActivity;
import yarta.Yatralay.city.KurukshetraActivity;
import yarta.Yatralay.city.MahabalipuramActivity;
import yarta.Yatralay.city.ManaliActivity;
import yarta.Yatralay.city.MathuraActivity;
import yarta.Yatralay.city.MumbaiActivity;
import yarta.Yatralay.city.PondicherryActivity;
import yarta.Yatralay.city.PuneActivity;
import yarta.Yatralay.city.RohtakActivity;
import yarta.Yatralay.city.TiruchirapalliActivity;

public class PlaceActivity extends AppCompatActivity {

    private ListView lv;
    // Listview Adapter
    ArrayAdapter<String> adapter;
    // Search EditText
    EditText inputSearch;
    String city[] = {"Kalibangan","Hanumangarh","Mathura","Rohtak","Mahabalipuram","Pondicherry","Tiruchirapalli","Kurukshetra","Agra","Chennai","Kota","Kolkata", "Pune","New Delhi","Hyderabad","Chandigarh","Amritsar","Jaipur",
            "Mumbai", "Manali","Kasol","Bengaluru", "Goa" };
    String filtered_city_activities[] = new String[23];
    // ArrayList for Listview
    ArrayList<HashMap<String, String>> productList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);

        // Listview Data

        lv = (ListView) findViewById(R.id.list_view);
        inputSearch = (EditText) findViewById(R.id.inputSearch);

        // Adding items to listview
        adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.city_name, city);
        adapter.notifyDataSetChanged();
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                int i=0;
                int j=0;
                String activity_to_open="";
                for (int k=0; k<23;k++){
                    if(position==k){
                        activity_to_open=city[k];
                    }
                }
                Intent intent = new Intent();
                if (activity_to_open.equals("Chennai")){
                    intent = new Intent(view.getContext(), ChennaiActivity.class);
                }
                else if (activity_to_open.equals("Kota")){
                    intent = new Intent(view.getContext(), KotaActivity.class);
                }
                else if (activity_to_open.equals("Agra")){
                    intent = new Intent(view.getContext(), AgraActivity.class);
                }
                else if (activity_to_open.equals("Kolkata")){
                    intent = new Intent(view.getContext(), KolkataActivity.class);
                }
                else if (activity_to_open.equals("Pune")){
                    intent = new Intent(view.getContext(), PuneActivity.class);
                }
                else if (activity_to_open.equals("Delhi")){
                    intent = new Intent(view.getContext(), DelhiActivity.class);
                }
                else if (activity_to_open.equals("Hyderabad")){
                    intent = new Intent(view.getContext(), HyderabadActivity.class);
                }
                else if (activity_to_open.equals("Chandigarh")){
                    intent = new Intent(view.getContext(), ChandigarhActivity.class);
                }
                else if (activity_to_open.equals("Amritsar")){
                    intent = new Intent(view.getContext(), AmritsarActivity.class);
                }
                else if (activity_to_open.equals("Jaipur")){
                    intent = new Intent(view.getContext(), JaipurActivity.class);
                }
                else if (activity_to_open.equals("Mumbai")){
                    intent = new Intent(view.getContext(), MumbaiActivity.class);
                }
                else if (activity_to_open.equals("Manali")){
                    intent = new Intent(view.getContext(), ManaliActivity.class);
                }
                else if (activity_to_open.equals("Kasol")){
                    intent = new Intent(view.getContext(), KasolActivity.class);
                }
                else if (activity_to_open.equals("Bengaluru")){
                    intent = new Intent(view.getContext(), BengaluruActivity.class);
                }
                else if (activity_to_open.equals("Goa")){
                    intent = new Intent(view.getContext(), GoaActivity.class);
                }
                else if (activity_to_open.equals("Kalibangan")){
                    intent = new Intent(view.getContext(), KalibanganActivity.class);
                }
                else if (activity_to_open.equals("Hanumangarh")){
                    intent = new Intent(view.getContext(), HanumangarhActivity.class);
                }
                else if (activity_to_open.equals("Mathura")){
                    intent = new Intent(view.getContext(), MathuraActivity.class);
                }
                else if (activity_to_open.equals("Rohtak")){
                    intent = new Intent(view.getContext(), RohtakActivity.class);
                }
                else if (activity_to_open.equals("Mahabalipuram")){
                    intent = new Intent(view.getContext(), MahabalipuramActivity.class);
                }
                else if (activity_to_open.equals("Pondicherry")){
                    intent = new Intent(view.getContext(), PondicherryActivity.class);
                }
                else if (activity_to_open.equals("Tiruchirapalli")){
                    intent = new Intent(view.getContext(), TiruchirapalliActivity.class);
                }
                else if (activity_to_open.equals("Kurukshetra")){
                    intent = new Intent(view.getContext(), KurukshetraActivity.class);
                }
                startActivity(intent);
            }
        });
        /**
         * Enabling Search Filter
         * */
        inputSearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                final String a = cs.toString().toLowerCase();
                PlaceActivity.this.adapter.getFilter().filter(cs);
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                        int i=0;
                        int j=0;
                        for(i=0;i<23;i++){
                            if(city[i].toLowerCase().startsWith(a)){
                                filtered_city_activities[j]=city[i];
                                j+=1;
                            }
                        }
                        String activity_to_open="";
                        for (int k=0; k<j;k++){
                            if(position==k){
                                activity_to_open=filtered_city_activities[k];
                            }
                        }
                        Intent intent = new Intent();
                        if (activity_to_open.equals("Chennai")){
                            intent = new Intent(view.getContext(), ChennaiActivity.class);
                        }
                        else if (activity_to_open.equals("Kota")){
                            intent = new Intent(view.getContext(), KotaActivity.class);
                        }
                        else if (activity_to_open.equals("Agra")){
                            intent = new Intent(view.getContext(), AgraActivity.class);
                        }
                        else if (activity_to_open.equals("Kolkata")){
                            intent = new Intent(view.getContext(), KolkataActivity.class);
                        }
                        else if (activity_to_open.equals("Pune")){
                            intent = new Intent(view.getContext(), PuneActivity.class);
                        }
                        else if (activity_to_open.equals("Delhi")){
                            intent = new Intent(view.getContext(), DelhiActivity.class);
                        }
                        else if (activity_to_open.equals("Hyderabad")){
                            intent = new Intent(view.getContext(), HyderabadActivity.class);
                        }
                        else if (activity_to_open.equals("Chandigarh")){
                            intent = new Intent(view.getContext(), ChandigarhActivity.class);
                        }
                        else if (activity_to_open.equals("Amritsar")){
                            intent = new Intent(view.getContext(), AmritsarActivity.class);
                        }
                        else if (activity_to_open.equals("Jaipur")){
                            intent = new Intent(view.getContext(), JaipurActivity.class);
                        }
                        else if (activity_to_open.equals("Mumbai")){
                            intent = new Intent(view.getContext(), MumbaiActivity.class);
                        }
                        else if (activity_to_open.equals("Manali")){
                            intent = new Intent(view.getContext(), ManaliActivity.class);
                        }
                        else if (activity_to_open.equals("Kasol")){
                            intent = new Intent(view.getContext(), KasolActivity.class);
                        }
                        else if (activity_to_open.equals("Bengaluru")){
                            intent = new Intent(view.getContext(), BengaluruActivity.class);
                        }
                        else if (activity_to_open.equals("Goa")){
                            intent = new Intent(view.getContext(), GoaActivity.class);
                        }
                        else if (activity_to_open.equals("Kalibangan")){
                            intent = new Intent(view.getContext(), KalibanganActivity.class);
                        }
                        else if (activity_to_open.equals("Hanumangarh")){
                            intent = new Intent(view.getContext(), HanumangarhActivity.class);
                        }
                        else if (activity_to_open.equals("Mathura")){
                            intent = new Intent(view.getContext(), MathuraActivity.class);
                        }
                        else if (activity_to_open.equals("Rohtak")){
                            intent = new Intent(view.getContext(), RohtakActivity.class);
                        }
                        else if (activity_to_open.equals("Mahabalipuram")){
                            intent = new Intent(view.getContext(), MahabalipuramActivity.class);
                        }
                        else if (activity_to_open.equals("Pondicherry")){
                            intent = new Intent(view.getContext(), PondicherryActivity.class);
                        }
                        else if (activity_to_open.equals("Tiruchirapalli")){
                            intent = new Intent(view.getContext(), TiruchirapalliActivity.class);
                        }
                        else if (activity_to_open.equals("Kurukshetra")){
                            intent = new Intent(view.getContext(), KurukshetraActivity.class);
                        }
                        startActivity(intent);
                    }
                });
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }
        });
    }
}
