package com.example.a2502006341_claudyasalim_asgmcs;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeFragment extends Fragment {

    private User user;
    ImageView aboutIm;
    View homeView;
    RecyclerView medicRv;
    MedicAdapter medicAdapter;
    MedicDatabase dbMedic;

    public HomeFragment() {

    }

    public static HomeFragment newInstance(User currUser) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putSerializable("Logged User", currUser);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            user = (User) getArguments().getSerializable("Logged User");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        homeView = inflater.inflate(R.layout.fragment_home, container, false);

        TextView cekName = homeView.findViewById(R.id.cek_name);
        cekName.setText("Tap on logo to see about us");

        aboutIm = homeView.findViewById(R.id.about_im);
        aboutIm.setOnClickListener(e->{
            Intent toAbout = new Intent(this.getContext(), AboutActivity.class);
            toAbout.putExtra("Logged User", user);
            startActivity(toAbout);
        });

        dbMedic = new MedicDatabase();
        dbMedic.addMedic();

        medicRv = homeView.findViewById(R.id.medic_rv);
        medicAdapter = new MedicAdapter(this.getContext(), dbMedic, user);
        medicRv.setAdapter(medicAdapter);
        medicRv.setLayoutManager(new GridLayoutManager(this.getContext(), 2));

        return homeView;
    }
}