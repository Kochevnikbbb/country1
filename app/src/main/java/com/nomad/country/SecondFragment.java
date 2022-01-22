package com.nomad.country;

import android.os.Bundle;

import static com.nomad.country.MainFragment.key;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class SecondFragment extends Fragment implements OnClick {


    private RecyclerView recyclerView;
    private Adapter adapter2;
    private ArrayList<Continents> list2;

    //public final static String key = "dfgdgf";


    public ArrayList<Continents> getList2() {
        return list2;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        loadData();
        recyclerView = view.findViewById(R.id.recycle_second);
        adapter2 = new Adapter(list2,  this);
        recyclerView.setAdapter(adapter2);

    }

    private void loadData() {
        Bundle bundle = getArguments();
        list2 = new ArrayList<>();
        int continent = bundle.getInt(key);

        switch (continent){
            case 11:
                list2.add(new Continents("Kyrgyzstan",R.drawable.ic_kg));
                list2.add(new Continents("Kazakhstan",R.drawable.ic_kz_3x));
                list2.add(new Continents("Korea",R.drawable.ic_kr));
                list2.add(new Continents("Japan",R.drawable.ic_jp));
                list2.add(new Continents("China",R.drawable.ic_cn));
                break;

            case 12:
                list2.add(new Continents("Гана",R.drawable.ic_gh_3x));
                list2.add(new Continents("Марокко",R.drawable.ic_ma_3x));
                list2.add(new Continents("Мадагаскар",R.drawable.ic_mg_3x));
                list2.add(new Continents("Нигерия",R.drawable.ic_ng_3x));
                list2.add(new Continents("Мали",R.drawable.ic_ml));
                break;


            case 13:
                list2.add(new Continents("Канада",R.drawable.ic_ca_3x));
                list2.add(new Continents("Коста-Рика",R.drawable.ic_cr_3x));
                list2.add(new Continents("Куба",R.drawable.ic_cu_3x));
                list2.add(new Continents("Мексика",R.drawable.ic_mx_3x));
                list2.add(new Continents("Панама",R.drawable.ic_pa_3x));
                break;

            case 14:
                list2.add(new Continents("США",R.drawable.ic_us_3x));
                list2.add(new Continents("Бразилия",R.drawable.ic_br_3x));
                list2.add(new Continents("Аргентина",R.drawable.ic_ar_3x));
                list2.add(new Continents("Уругвай",R.drawable.ic_uy_3x));
                list2.add(new Continents("Венесуэла",R.drawable.ic_ve_3x));
                break;

            case 15:
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,new ThirthFragment()).commit();
                break;

            case 16:
                list2.add(new Continents("Германия",R.drawable.ic_de_3x));
                list2.add(new Continents("Франция",R.drawable.ic_fr_3x));
                list2.add(new Continents("Испания",R.drawable.ic_es_3x));
                list2.add(new Continents("Норвегия",R.drawable.ic_no_3x));
                list2.add(new Continents("Эстония",R.drawable.ic_ee_3x));
                break;

            case 17:
                list2.add(new Continents("Австралия",R.drawable.ic_au_3x));
                list2.add(new Continents("Фиджи",R.drawable.ic_fj_3x));
                list2.add(new Continents("Тонга",R.drawable.ic_to_3x));
                list2.add(new Continents("Острава Кука",R.drawable.ic_ky_3x));
                list2.add(new Continents("Палау",R.drawable.ic_pw_3x));
                break;
        }
    }


    @Override
    public void onClick(Continents continents) {

    }
}