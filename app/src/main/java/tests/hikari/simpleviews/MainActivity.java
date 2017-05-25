package tests.hikari.simpleviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String ATAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(ATAG + " " + GeneralLib.getMethodName(1) + " - ", "Starting ...");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(ATAG + " " + GeneralLib.getMethodName(1) + " - ", "Complete!");
    }

    @Override
    protected void onStart(){
        super.onStart();
    }
}
