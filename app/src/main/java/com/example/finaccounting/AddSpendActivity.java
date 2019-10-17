package com.example.finaccounting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class AddSpendActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_spend);

        Intent recivedCategoryIntent = getIntent();
        int category =recivedCategoryIntent.getIntExtra("category",0);
        TextView categoryNameTV = findViewById(R.id.categoryNameTextView);
        Button btn = findViewById(category);
        String text = btn.getText().toString();
        categoryNameTV.setText(""+category);

    }
}
