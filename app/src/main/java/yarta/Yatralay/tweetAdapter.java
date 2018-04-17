package yarta.Yatralay;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.HashMap;

public class tweetAdapter extends RecyclerView.Adapter<tweetlist.tweetdataholder> {

    private static final String TAG = "Tweet_Adapter";
    Context context;
    ArrayList<HashMap<String, String>> mDataArray = new ArrayList<HashMap<String, String>>();


    public tweetAdapter(Context applicationContext) {
        context = applicationContext;
        Log.e(TAG, "tweetAdapter: " + mDataArray.size());
    }


    @Override
    public tweetlist.tweetdataholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View row_itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.tweetlayout, parent, false);

        tweetlist.tweetdataholder vh = new tweetlist.tweetdataholder(row_itemView);
        return vh;
    }

    @Override
    public void onBindViewHolder(tweetlist.tweetdataholder holder, int position) {
        try {
            HashMap<String, String> searchModel = (HashMap<String, String>) mDataArray.get(position);

            holder.setinfo(searchModel.get("tweet"), position);


        } catch (Exception e) {
            Log.e(TAG, "onBindViewHolder: " + e.getMessage());
        }
    }


    @Override
    public int getItemCount() {
        if (mDataArray.size() == 0) {
            return 1;
        } else {
            return mDataArray.size();
        }
    }
}
