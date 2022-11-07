package com.example.yudbetfirsttargil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LastPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_page);
    }
    public void tryAgain (View view) {
        Intent intent = new Intent(this, FirstQuestion.class);
        startActivity(intent);
    }

    public void keepLearning (View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}