package example.com.activitytest;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by yaoqu on 7/9/2016.
 */
public class FirstActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
    }
}
