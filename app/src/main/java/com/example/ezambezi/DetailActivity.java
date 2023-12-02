package com.example.ezambezi;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String productName = getIntent().getStringExtra("productName");
        String productDescription = getIntent().getStringExtra("productDescription");

        TextView textViewName = findViewById(R.id.textViewDetailName);
        TextView textViewDescription = findViewById(R.id.textViewDetailDescription);

        textViewName.setText(productName);
        textViewDescription.setText(productDescription);
    }
}
