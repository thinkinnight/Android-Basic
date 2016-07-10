package example.com.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import example.com.activitytest.R;

/**
 * Created by yaoqu on 7/9/2016.
 */
public class SecondActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Intent intent = getIntent();
        String data=intent.getStringExtra("extra_data");
        Log.d("SecondActivity", data);
    }
}
