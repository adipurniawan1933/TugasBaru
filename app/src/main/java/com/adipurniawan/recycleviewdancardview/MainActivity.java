package com.adipurniawan.recycleviewdancardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ClubAdapter clubAdapter;
    private ArrayList<ClubModel> clubModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView = findViewById(R.id.recycleview);
        clubAdapter = new ClubAdapter(clubModel);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(clubAdapter);
    }

    private void getData() {
        clubModel = new ArrayList<>();
        clubModel.add(new ClubModel("Juventus", R.drawable.juventus));
        clubModel.add(new ClubModel("Real Madrid", R.drawable.real_madrid));
        clubModel.add(new ClubModel("Barcelona", R.drawable.barcelona));
        clubModel.add(new ClubModel("Dortmund", R.drawable.dortmund));
        clubModel.add(new ClubModel("Mancester United", R.drawable.mancester_united));
        clubModel.add(new ClubModel("Bayern Munchen", R.drawable.bayern_munchen));
        clubModel.add(new ClubModel("Liverpool", R.drawable.liverpool));
        clubModel.add(new ClubModel("Chelsea", R.drawable.chelsea));
        clubModel.add(new ClubModel("PSG", R.drawable.psg));
    }
}