package tw.marlborocrew.com.ratetaxitw;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;


public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN);
        System.out.println("here is different here is different");
    }

}
