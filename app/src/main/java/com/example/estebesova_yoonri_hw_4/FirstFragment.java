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

public class FirstFragment extends Fragment implements onClick{
    private ArrayList<Continent>continents;
    private ContinentAdapter adapter;
    private RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        continent();
        recyclerView= view.findViewById(R.id.recycler);
        adapter =new ContinentAdapter(continents,this::onClick);
        recyclerView.setAdapter(adapter);
    }

    private void continent() {
        continents=new ArrayList<>();
        continents.add(new Continent("South America",R.drawable.ic_south_america,1));
        continents.add(new Continent("North America",R.drawable.ic_north_america,2));
        continents.add(new Continent("Europa",R.drawable.ic_europe,3));
        continents.add(new Continent("Asia",R.drawable.ic_asia,4));
        continents.add(new Continent("Oceania",R.drawable.ic_oceania,5));
        continents.add(new Continent("Africa",R.drawable.ic_africa,6));
    }

    @Override
    public void onClick(Continent continent) {
        Bundle bundle = new Bundle();
        bundle.putInt("key",continent.getKeyId());
        Fragment fragment = new SecondFragment();
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().
                beginTransaction().replace(R.id.conteiner,fragment).
                addToBackStack(null).commit();
    }

}