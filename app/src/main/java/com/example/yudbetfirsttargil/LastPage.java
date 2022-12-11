package com.example.yudbetfirsttargil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LastPage extends AppCompatActivity {

    int grade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_page);
        Bundle extras = getIntent().getExtras();
        grade = extras.getInt("grade");
        TextView showGrade = findViewById(R.id.textView_grade);
        showGrade.setText("הציון שלך הוא:" +grade);
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