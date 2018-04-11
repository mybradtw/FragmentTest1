package tw.brad.fragmenttest1;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class F2Fragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("brad", "F2:onCreate()");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.v("brad", "F2:onCreateView()");
        return inflater.inflate(R.layout.fragment_f2, container, false);
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.v("brad", "F2:onPause()");
    }
}
