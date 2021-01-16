package com.example.dicoding_made_submission.activity;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.dicoding_made_submission.R;

public class IdolDetail extends AppCompatActivity {
    public static final String IDOL_NAME = "idol_name";
    public static final String IDOL_DOB = "idol_dob";
    public static final String IDOL_DETAIL = "idol_detail";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idol_detail);

        TextView tvDataReceived = findViewById(R.id.tv_data_received);

        String name = getIntent().getStringExtra(IDOL_NAME);
        String birthday = getIntent().getStringExtra(IDOL_DOB);
        String detail = getIntent().getStringExtra(IDOL_DETAIL);

        String text = "Name : " + name + ",\nDOB : " + birthday + ",\nDetail : " + detail;
        tvDataReceived.setText(text);
    }
}