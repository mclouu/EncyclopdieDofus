package com.romain.mathieu.encyclopdiedofus.feature.View;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.romain.mathieu.encyclopdiedofus.feature.Model.CardData;
import com.romain.mathieu.encyclopdiedofus.feature.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.equipementViewHolder> {

    private Context context;
    private ArrayList<CardData> mdatas;

    public MyAdapter(Context context) {
        this.context = context;
    }

    public MyAdapter(ArrayList<CardData> mlist) {
        this.mdatas = mlist;

    }

    @NonNull
    public equipementViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new equipementViewHolder(view);
    }

    public void onBindViewHolder(@NonNull equipementViewHolder holder, int position) {
        final CardData object = mdatas.get(position);

        holder.mName.setText(Html.fromHtml(object.getName()));
        holder.mLvl.setText(Html.fromHtml((object.getLvl())));

        String url = object.getImageURL();
        Picasso.get()
                .load(url)
                .centerCrop()
                .resize(50, 50)
//                .placeholder(R.drawable.imagedownloading)
//                .error(R.drawable.imageempty)
                .into(holder.mImageView);

    }

    public int getItemCount() {
        if (mdatas != null) {
            return mdatas.size();
        }
        return 0;
    }

    class equipementViewHolder extends RecyclerView.ViewHolder {

        TextView mName;
        TextView mLvl;
        ImageView mImageView;
        TextView mDescription;

        equipementViewHolder(View itemView) {
            super(itemView);
            mName = itemView.findViewById(R.id.name);
            mLvl = itemView.findViewById(R.id.lvl);
            mImageView = itemView.findViewById(R.id.thumbnail);
            mDescription = itemView.findViewById(R.id.description);
            context = itemView.getContext();
        }
    }
}
