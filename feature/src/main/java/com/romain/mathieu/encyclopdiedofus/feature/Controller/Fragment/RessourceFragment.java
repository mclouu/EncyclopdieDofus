package com.romain.mathieu.encyclopdiedofus.feature.Controller.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.romain.mathieu.encyclopdiedofus.feature.R;

public class RessourceFragment extends Fragment {
    public static RessourceFragment newInstance() {
        return (new RessourceFragment());
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ressource, container, false);
    }
}
