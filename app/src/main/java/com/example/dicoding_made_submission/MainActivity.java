package com.example.dicoding_made_submission;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
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
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.about:
                break;
        }
    }

    private void showRecyclerList(){
        rvIdol.setLayoutManager(new LinearLayoutManager(this));
        ListIdolAdapter listIdolAdapter = new ListIdolAdapter(idolModelArrayList);
        rvIdol.setAdapter(listIdolAdapter);

        listIdolAdapter.setOnItemClickCallback(new ListIdolAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(IdolModel idolModel) {
                showSelectedHero(idolModel);
            }
        });
    }
    private void showSelectedHero(IdolModel idolModel) {
        Toast.makeText(this, idolModel.getName(), Toast.LENGTH_SHORT).show();
    }

}