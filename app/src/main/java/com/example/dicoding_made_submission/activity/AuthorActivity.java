package com.example.dicoding_made_submission.activity;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.bumptech.glide.Glide;
import com.example.dicoding_made_submission.R;

public class AuthorActivity extends AppCompatActivity {
    TextView tvTitle, tvEmail, tvDetail;
    ImageView tvPhoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_row_idol);
        getSupportActionBar().setTitle("Author");

        tvPhoto = findViewById(R.id.img_item_photo);
        tvTitle = findViewById(R.id.tv_item_name);
        tvEmail = findViewById(R.id.tv_birthday);
        tvDetail = findViewById(R.id.tv_item_detail);

        Glide.with(tvPhoto.getContext())
                .load(R.drawable.chaewon)
                .into(tvPhoto);
        tvTitle.setText("Abdul FH");
        tvEmail.setText("http://github.com/abdulfh");
        tvDetail.setText("Android Dev");
    }
}