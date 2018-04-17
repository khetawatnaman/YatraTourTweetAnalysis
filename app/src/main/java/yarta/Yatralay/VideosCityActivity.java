package yarta.Yatralay;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.WebView;

public class VideosCityActivity extends AppCompatActivity {

    private static final String TAG = "VIDEO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos_city);

        try {
            int value = getIntent().getExtras().getInt("video");
            if (value == 1) {
                WebView webView = (WebView) findViewById(R.id.webView);
                webView.loadUrl("https://www.youtube.com/playlist?list=PLGQSem6ygOP4a0xnwCaaYMgPt22wA0jr7");
            }
            if (value == 2) {
                WebView webView = (WebView) findViewById(R.id.webView);
                webView.loadUrl("https://www.youtube.com/playlist?list=PLGQSem6ygOP4qnGLqBkKWT7eCkq8IP8_l");
            }
            if (value == 3) {
                WebView webView = (WebView) findViewById(R.id.webView);
                webView.loadUrl("https://www.youtube.com/playlist?list=PLGQSem6ygOP79EXTkV3tPBp3m_spN-NhK");
            }
            if (value == 4) {
                WebView webView = (WebView) findViewById(R.id.webView);
                webView.loadUrl("https://www.youtube.com/playlist?list=PLGQSem6ygOP5oBqFvZi_NY4hf0izA6IwB");
            }
            if (value == 5) {
                WebView webView = (WebView) findViewById(R.id.webView);
                webView.loadUrl("https://www.youtube.com/playlist?list=PLGQSem6ygOP7Lq7onpC0RwLl3K6hIh802");
            }
            if (value == 6) {
                WebView webView = (WebView) findViewById(R.id.webView);
                webView.loadUrl("https://www.youtube.com/playlist?list=PLGQSem6ygOP4PyhlyJ8jmtI99yhaJS5rj");
            }
            if (value == 7) {
                WebView webView = (WebView) findViewById(R.id.webView);
                webView.loadUrl("https://www.youtube.com/playlist?list=PLGQSem6ygOP6xO9ffxsAzNa-t6f8CUOWB");
            }

            if (value == 8) {
                WebView webView = (WebView) findViewById(R.id.webView);
                webView.loadUrl("https://www.youtube.com/playlist?list=PLGQSem6ygOP4-CchwcTq7pQovU6vdrlKR");
            }

        } catch (Exception e) {
            Log.e(TAG, "onCreate: " + e.getMessage());
        }


    }

}
