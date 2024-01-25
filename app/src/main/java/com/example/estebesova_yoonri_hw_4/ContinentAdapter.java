package com.example.estebesova_yoonri_hw_4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentAdapter.ContinentViewHolder> {

    private ArrayList<Continent> continents;
    private onClick onClick;

    public ContinentAdapter (ArrayList<Continent>continents,onClick onClick){
        this.continents =continents;
        this.onClick=onClick;

    }
    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_continents,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, int position) {
        holder.bind(continents.get(position));
    }

    @Override
    public int getItemCount() {
        return continents.size();
    }

    public  class ContinentViewHolder extends RecyclerView.ViewHolder {
        private TextView text;
        private ImageView image;
        public ContinentViewHolder(@NonNull View itemView) {
            super(itemView);
            text =itemView.findViewById(R.id.text);
            image =itemView.findViewById(R.id.image);
        }

        public void bind(Continent continent) {
            text.setText(continent.getName());
            image.setImageResource(continent.getImage());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onClick.onClick(continents.get(getLayoutPosition()) );
                }
            });

        }
    }
}
