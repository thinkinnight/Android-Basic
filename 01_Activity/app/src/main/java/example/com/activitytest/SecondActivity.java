package example.com.activitytest;

import android.app.Activity;
import android.os.Bundle;

import example.com.activitytest.R;

/**
 * Created by yaoqu on 7/9/2016.
 */
public class SecondActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
    }
}
