package com.example.sahil.internshipprogram;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {
    List<Pogo> list;
    Context context;

    public ListAdapter(List<Pogo> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.custom, null);

        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {
        Pogo pogo = list.get(position);
        holder.ad.setText(pogo.getAd());
        holder.image.setImageDrawable(context.getResources().getDrawable(pogo.getImage()));



    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        Button button;
        ImageView image;
        TextView ad, training, about, offer, web, full, paid;

        public ListViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            image = itemView.findViewById(R.id.image);
            ad = itemView.findViewById(R.id.ad);
          /*  training = itemView.findViewById(R.id.training);
            about = itemView.findViewById(R.id.about);
            offer = itemView.findViewById(R.id.offer);
            web = itemView.findViewById(R.id.web);
            full = itemView.findViewById(R.id.full);
            paid = itemView.findViewById(R.id.paid);
*/
            button=(Button) itemView.findViewById(R.id.view);

        }

        @Override
        public void onClick(View v) {
            int position =getAdapterPosition();
           Intent intent=new Intent(v.getContext(),SecondActivity.class);
v.getContext().startActivity(intent);
        }
    }
}