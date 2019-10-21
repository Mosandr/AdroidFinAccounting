package com.example.finaccounting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AddSpendActivity extends AppCompatActivity {

    String result="";
    int countComa = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_spend);

        Intent recivedCategoryIntent = getIntent();
        String category =recivedCategoryIntent.getStringExtra("category");
        String colour =recivedCategoryIntent.getStringExtra("colour");
        setTitle(category);
            }

    public void onClickCancel(View view) {
        Intent addSpendIntent = new Intent(AddSpendActivity.this,MainActivity.class);
        startActivity(addSpendIntent);
    }

    public void onClickOk(View view) {
        Intent addSpendIntent = new Intent(AddSpendActivity.this,MainActivity.class);
        addSpendIntent.putExtra("result", result);
        startActivity(addSpendIntent);
    }

    public void onNumberClick(View view) {
        Button b = (Button) view;
        TextView resTextView = findViewById(R.id.addSumTextView);
        if (!(b.getText().equals("0")&& result.equals(""))) {
            if (result.length() < 13 && countComa<3) {
                result = result + b.getText();
                resTextView.setText(result);
                if (countComa>0) { countComa++;}

            }
        }
    }

    public void onFloatClick(View view) {
        Button b = (Button) view;
        TextView resTextView = findViewById(R.id.addSumTextView);
        if (!(b.getText().equals(".")&& result.equals(""))) {
            if (result.length() < 13 && countComa==0) {
                result = result + b.getText();
                resTextView.setText(result);
                countComa++;
            }
        }

    }
}
