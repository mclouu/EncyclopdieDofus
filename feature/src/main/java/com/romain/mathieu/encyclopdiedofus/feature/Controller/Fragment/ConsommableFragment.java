package com.romain.mathieu.encyclopdiedofus.feature.Controller.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.romain.mathieu.encyclopdiedofus.feature.R;

public class ConsommableFragment extends Fragment {
    public static ConsommableFragment newInstance() {
        return (new ConsommableFragment());
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_consommable, container, false);
    }
}
