package com.example.dicoding_made_submission;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.dicoding_made_submission.adapter.ListIdolAdapter;
import com.example.dicoding_made_submission.model.IdolModel;
import com.example.dicoding_made_submission.utility.IdolData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvIdol;
    private ArrayList<IdolModel> idolModelArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvIdol = findViewById(R.id.rv_idol);
        rvIdol.setHasFixedSize(true);

        idolModelArrayList.addAll(IdolData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvIdol.setLayoutManager(new LinearLayoutManager(this));
        ListIdolAdapter listHeroAdapter = new ListIdolAdapter(idolModelArrayList);
        rvIdol.setAdapter(listHeroAdapter);
    }
}