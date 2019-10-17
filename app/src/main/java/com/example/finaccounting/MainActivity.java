package com.example.finaccounting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickOnCategory(View view) {
        int id = view.getId();
        Log.d("identify",""+id);
        Button btn1 = findViewById(id);
        btn1.setId(id);
        Intent categoryIntent = new Intent(MainActivity.this,
                AddSpendActivity.class);
        categoryIntent.putExtra("category",id);
        startActivity(categoryIntent);


    }
}
