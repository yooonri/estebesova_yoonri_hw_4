package com.example.estebesova_yoonri_hw_4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class SecondFragment extends Fragment implements onClick{
    private ArrayList<Continent> continents;
    private ContinentAdapter adapter;
    private RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onClick();
        recyclerView= view.findViewById(R.id.recycler2);
        adapter =new ContinentAdapter(continents,this::onClick);
        recyclerView.setAdapter(adapter);
    }



    private void onClick() {
        continents=new ArrayList<>();
        Bundle bundle = getArguments();
        Integer value = bundle.getInt("key");
        switch (value){
            case 1:
                continents.add(new Continent("Argentina",R.drawable.ic_argentina));
                continents.add(new Continent("Gayana",R.drawable.ic_gayana));
                continents.add(new Continent("Columbia",R.drawable.ic_columbia));
                continents.add(new Continent("Chile",R.drawable.ic_chili));
                continents.add(new Continent("Dominikana",R.drawable.ic_dominikana));
                break;
            case 2:
                continents.add(new Continent("USA",R.drawable.ic_usa));
                continents.add(new Continent("Cuba",R.drawable.ic_cuba));
                continents.add(new Continent("Jamaika",R.drawable.ic_jamaika));
                continents.add(new Continent("Puerto-Rico",R.drawable.ic_puerto_riko));
                break;
            case 5:
                continents.add(new Continent("Australia",R.drawable.ic_australia));
                continents.add(new Continent("New Zealand",R.drawable.ic_new_zealand));
                continents.add(new Continent("Fiji",R.drawable.ic_fiji));
                continents.add(new Continent("Samoa",R.drawable.ic_samoa));
                continents.add(new Continent("Palawu",R.drawable.ic_palawu));
                break;
            case 4:
                continents.add(new Continent("Brazil",R.drawable.ic_kazakhstan));
                continents.add(new Continent("Argentina",R.drawable.ic_kyrgyzstan));
                continents.add(new Continent("Gayana",R.drawable.ic_south_korea));
                continents.add(new Continent("Columbia",R.drawable.ic_laos));
                continents.add(new Continent("Chile",R.drawable.ic_japan));
                break;
            case 3:
                continents.add(new Continent("Czechia",R.drawable.ic_czechia));
                continents.add(new Continent("France",R.drawable.ic_france));
                continents.add(new Continent("Germany",R.drawable.ic_germany));
                continents.add(new Continent("Spain",R.drawable.ic_spain));
                continents.add(new Continent("Switzerland",R.drawable.ic_switzerland));
                continents.add(new Continent("UK",R.drawable.ic_great_britain));
                break;
            case 6:
                continents.add(new Continent("Ghana",R.drawable.ic_ghana));
                continents.add(new Continent("Kenya",R.drawable.ic_kenya));
                continents.add(new Continent("Marocco",R.drawable.ic_marocco));
                continents.add(new Continent("Nigeria",R.drawable.ic_nigeria));
                continents.add(new Continent("Senegal",R.drawable.ic_senegal));
                continents.add(new Continent("Somali",R.drawable.ic_somali));
                break;


        }
    }

    @Override
    public void onClick(Continent continent) {

    }
}
