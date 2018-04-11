package tw.brad.fragmenttest1;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    private F1Fragment f1;
    private F2Fragment f2;
    private FragmentManager fmgr;
    private FragmentTransaction transaction;
    private boolean isF1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        f1 = new F1Fragment(); f2 = new F2Fragment();

    }

    @Override
    protected void onStart() {
        super.onStart();

        fmgr = getSupportFragmentManager();
        transaction = fmgr.beginTransaction();
        transaction.add(R.id.main_container, f1);
        transaction.commit();
        isF1 = true;

    }

    @Override
    protected void onPause(){
        super.onPause();

        transaction = fmgr.beginTransaction();
        transaction.remove(isF1?f1:f2);
        transaction.commit();
    }

    public void change(View view) {
        isF1 = !isF1;

        transaction = fmgr.beginTransaction();
        transaction.replace(R.id.main_container, isF1?f1:f2);
        transaction.commit();
    }

}
