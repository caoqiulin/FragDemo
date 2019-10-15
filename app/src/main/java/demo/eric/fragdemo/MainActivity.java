package demo.eric.fragdemo;

import android.app.ActivityManager;
import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

public class MainActivity extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragmentMain, FirstFragment.Companion.getInstance(), "f1")
                    .addToBackStack("f1")
                    .commit();
        }


    }



}
