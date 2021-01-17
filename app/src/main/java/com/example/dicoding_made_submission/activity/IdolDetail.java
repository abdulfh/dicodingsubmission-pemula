package com.example.dicoding_made_submission.activity;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.bumptech.glide.Glide;
import com.example.dicoding_made_submission.R;

public class IdolDetail extends AppCompatActivity {
    public static final String IDOL_NAME = "idol_name";
    public static final String IDOL_DOB = "idol_dob";
    public static final String IDOL_DETAIL = "idol_detail";
    public static final String IDOL_PHOTO = "idol_photo";

    TextView tvIdolName,tvIdolDOB,tvIdolDetail;
    ImageView tvIdolPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_row_idol);

        tvIdolPhoto = findViewById(R.id.img_item_photo);
        tvIdolName = findViewById(R.id.tv_item_name);
        tvIdolDOB = findViewById(R.id.tv_birthday);
        tvIdolDetail = findViewById(R.id.tv_item_detail);

        String name = getIntent().getStringExtra(IDOL_NAME);
        String birthday = getIntent().getStringExtra(IDOL_DOB);
        String detail = getIntent().getStringExtra(IDOL_DETAIL);
        int Url = getIntent().getIntExtra(IDOL_PHOTO,0);

        getSupportActionBar().setTitle(name);

        Glide.with(tvIdolPhoto.getContext())
                .load(Url)
                .into(tvIdolPhoto);
        tvIdolName.setText(name);
        tvIdolDOB.setText(birthday);
        tvIdolDetail.setText(detail);

    }
}