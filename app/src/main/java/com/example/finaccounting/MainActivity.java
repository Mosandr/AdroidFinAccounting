package com.example.finaccounting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent recivedIntent = getIntent();
        TextView resTv = findViewById(R.id.textView2);
        resTv.setText(recivedIntent.getStringExtra("result"));

    }

    public void clickOnCategory(View view) {
        Button b = (Button)view;
        String buttonText = b.getText().toString();
        Intent categoryIntent = new Intent(MainActivity.this,
                AddSpendActivity.class);
        categoryIntent.putExtra("category",buttonText);
        startActivity(categoryIntent);
    }
}
