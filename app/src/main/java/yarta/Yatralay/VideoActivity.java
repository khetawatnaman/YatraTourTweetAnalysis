package yarta.Yatralay;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class VideoActivity extends AppCompatActivity {

    private ListView lv;

    // Listview Adapter
    ArrayAdapter<String> adapter;

    // Search EditText
    EditText inputSearch;

    String city[] = {"Best of Yatralay","Goa", "Delhi","Uttrakhand", "Tamilnadu","Uttar Pradesh","Rajasthan","Haryana" };
    String filtered_city_activities[] = new String[8];
    // ArrayList for Listview
    ArrayList<HashMap<String, String>> productList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        // Listview Data

        lv = (ListView) findViewById(R.id.list_view);

        // Adding items to listview
        adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.city_name, city);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                int i=0;
                int j=0;
                String activity_to_open="";
                for (int k=0; k<8;k++){
                    if(position==k){
                        activity_to_open=city[k];
                    }
                }
                Intent intent = new Intent(view.getContext(), VideosCityActivity.class);
                if (activity_to_open.equals("Best of Yatralay")){
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLGQSem6ygOP4a0xnwCaaYMgPt22wA0jr7"));
                    startActivity(intent);                }
                else if (activity_to_open.equals("Goa")){
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLGQSem6ygOP4qnGLqBkKWT7eCkq8IP8_l"));
                    startActivity(intent);                }
                else if (activity_to_open.equals("Delhi")){
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLGQSem6ygOP79EXTkV3tPBp3m_spN-NhK"));
                    startActivity(intent);                }
                else if (activity_to_open.equals("Uttrakhand")){
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLGQSem6ygOP5oBqFvZi_NY4hf0izA6IwB"));
                    startActivity(intent);                }
                else if (activity_to_open.equals("Tamilnadu")){
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLGQSem6ygOP7Lq7onpC0RwLl3K6hIh802"));
                    startActivity(intent);                }
                else if (activity_to_open.equals("Uttar Pradesh")){
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLGQSem6ygOP4PyhlyJ8jmtI99yhaJS5rj"));
                    startActivity(intent);                }
                else if (activity_to_open.equals("Rajasthan")){
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLGQSem6ygOP6xO9ffxsAzNa-t6f8CUOWB"));
                    startActivity(intent);                }
                else if (activity_to_open.equals("Haryana")){
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLGQSem6ygOP4-CchwcTq7pQovU6vdrlKR"));
                    startActivity(intent);                }
                startActivity(intent);
            }
        });
    }
}
