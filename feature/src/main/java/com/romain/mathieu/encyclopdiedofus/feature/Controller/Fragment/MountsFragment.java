package com.romain.mathieu.encyclopdiedofus.feature.Controller.Fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.romain.mathieu.encyclopdiedofus.feature.Model.API.MountsDofus.MountsDofus;
import com.romain.mathieu.encyclopdiedofus.feature.Model.CardData;
import com.romain.mathieu.encyclopdiedofus.feature.Model.DofusStream;
import com.romain.mathieu.encyclopdiedofus.feature.R;
import com.romain.mathieu.encyclopdiedofus.feature.View.MyAdapter;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;

public class MountsFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener {

    public static ArrayList<CardData> list = new ArrayList<>();
    Context context;
    RecyclerView recyclerView;
    ProgressBar mProgressBar;
    SwipeRefreshLayout mSwipeRefreshLayout;
    private LinearLayoutManager llm;
    private MyAdapter adapter;
    private Disposable disposable;

    public MountsFragment() {
        // Required empty public constructor
    }

    public static MountsFragment newInstance() {
        return (new MountsFragment());

    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mounts, container, false);

        context = container.getContext();
        recyclerView = view.findViewById(R.id.mounts_recyclerview);
        mProgressBar = view.findViewById(R.id.mounts_progressBar);
        mSwipeRefreshLayout = view.findViewById(R.id.mounts_swipeRefreshLayout);
        mSwipeRefreshLayout.setOnRefreshListener(this);

        llm = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(llm);
        adapter = new MyAdapter(list);
        recyclerView.setAdapter(adapter);


        // 2 - Call the stream
        this.executeHttpRequestWithRetrofit();


        return view;
    }

    //-----------------------
    // PULL TO REFRESH
    //-----------------------


    public void onRefresh() {
        mProgressBar.setVisibility(View.VISIBLE);
        this.executeHttpRequestWithRetrofit();
        adapter.notifyDataSetChanged();
        mSwipeRefreshLayout.setRefreshing(false);

    }

    //-----------------------
    //  HTTP (RxJAVA)
    //-----------------------

    // 1 - Execute le stream
    private void executeHttpRequestWithRetrofit() {
//        // 1.1 - Update UI
        this.updateUIWhenStartingHTTPRequest();
//    }

        // 1.2 - Nous appelons depuis la classe DofusStream notre Observable qui va émettre
        //       les données JSON récupérées depuis l'API Dofus grâce à Retrofit
        this.disposable = DofusStream.streamFetchMounts().subscribeWith(
                new DisposableObserver<List<MountsDofus>>() {

                    public void onNext(List<MountsDofus> mountsDofuses) {
                        Toast.makeText(context, "onNext", Toast.LENGTH_SHORT).show();
                        Log.e("TAG", "onNext");
                        updateUIWithListOfArticle(mountsDofuses);
                    }

                    public void onError(Throwable e) {
                        Toast.makeText(context, "Error", Toast.LENGTH_SHORT).show();
                        Log.e("tdb", "On Error \n" + Log.getStackTraceString(e));
                    }

                    public void onComplete() {
                        Toast.makeText(context, "On Complete !!", Toast.LENGTH_SHORT).show();
                        Log.e("TAG", "On Complete !!");
                    }
                });
    }

    private void disposeWhenDestroy() {
        if (this.disposable != null && !this.disposable.isDisposed()) this.disposable.dispose();
    }
    // -------------------
    // UPDATE UI
    // -------------------

    private void updateUIWhenStartingHTTPRequest() {
        //this.textView.setText("Downloading...");
    }

    private void updateUIWithListOfArticle(List<MountsDofus> response) {


        if (list != null) {
            list.clear();
        }

        for (int i = 0; i < response.size(); i++) {
            String name = response.get(i).getName();
            String imageURL = response.get(i).getImgUrl();
            int lvl = response.get(i).getLvl();


            list.add(new CardData(
                    name + "",
                    lvl + "",
                    imageURL + " ",
                    ""));

        }
    }
}
