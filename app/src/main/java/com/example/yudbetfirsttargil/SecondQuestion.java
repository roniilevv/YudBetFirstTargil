package com.example.yudbetfirsttargil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondQuestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secont_question);
    }
    public void lastPage (View view) {
        Intent intent = new Intent(this, LastPage.class);
        startActivity(intent);
    }
}