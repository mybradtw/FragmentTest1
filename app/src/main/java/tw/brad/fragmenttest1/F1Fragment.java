package tw.brad.fragmenttest1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class F1Fragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("brad", "F1:onCreate()");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.v("brad", "F1:onCreateView()");
        return inflater.inflate(R.layout.fragment_f1, container, false);
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.v("brad", "F1:onPause()");
    }
}
