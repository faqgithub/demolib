package faqinterative.com.demolib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import faqinterative.com.utilitylib.Utility;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Utility.getUser();
    }
}
