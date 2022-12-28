package com.anyitrecruitment.falsephone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvPhone = findViewById(R.id.tvPhone);

        if(getIntent().getData() != null)
        {
            tvPhone.setText(getIntent().getData().toString());
        }
        else
        {
            tvPhone.setText("No Data received");
            Toast.makeText(this, "No Data received", Toast.LENGTH_SHORT).show();
        }
    }
}