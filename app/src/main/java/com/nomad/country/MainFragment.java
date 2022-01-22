package com.nomad.country;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;


public class MainFragment extends Fragment implements OnClick {
    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<Continents> list;
    public final static String key = "dfgdgf";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        loadData();
        recyclerView = view.findViewById(R.id.recycle);
        adapter = new Adapter(list, this);
        recyclerView.setAdapter(adapter);


    }

    private void loadData() {
        list = new ArrayList<>();
        list.add(new Continents("Asia", R.drawable.ic_cas, 11));
        list.add(new Continents("Africa", R.drawable.ic_caf, 12));
        list.add(new Continents("North America", R.drawable.ic_cna, 13));
        list.add(new Continents("South America", R.drawable.ic_csa, 14));
        list.add(new Continents("Antarctica", R.drawable.ic_ww, 15));
        list.add(new Continents("Europe", R.drawable.ic_ceu, 16));
        list.add(new Continents("Oceania", R.drawable.ic_coc, 17));
    }

    @Override
    public void onClick(Continents continents) {
//        Toast.makeText(requireActivity(), "Click " + continents.getName(), Toast.LENGTH_SHORT).show();
//        MainActivity activity = (MainActivity) requireActivity();

        Bundle bundle = new Bundle();
        Fragment fragment = new SecondFragment();

        bundle.putInt(key, continents.getId());

        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
//        if (continents.getImage() == R.drawable.ic_cas){
//
//        }

    }
}