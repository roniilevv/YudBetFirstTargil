package com.example.yudbetfirsttargil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.yudbetfirsttargil.SQLite.DBManager;
import com.example.yudbetfirsttargil.SQLite.DatabaseHelper;

public class FirstQuestion extends AppCompatActivity {

    private DBManager mDBManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_question);



    }

    public void nextQuestion (View view) {
        RadioGroup r1 = findViewById(R.id.secondradiogroup);
        if(r1.getCheckedRadioButtonId() == -1){
            Toast.makeText(this, "נא ללחוץ על תשובה!", Toast.LENGTH_LONG).show();

        }
        else {
            if (r1.getCheckedRadioButtonId() == R.id.second_option_2) {
                Toast.makeText(this, "תשובה נכונה", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this, SecondQuestion.class);
                int grade = 50;
                intent.putExtra("grade", grade);

                startActivity(intent);
            }
            else {
                Toast.makeText(this, "תשובה לא נכונה", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this, SecondQuestion.class);
                int grade = 0;
                intent.putExtra("grade", grade);

                startActivity(intent);
            }
        }






    }



    private void showAnswer()
    {
        Cursor cursorQ1 = mDBManager.fetch();
        cursorQ1.moveToLast();
        int id = cursorQ1.getColumnIndexOrThrow(DatabaseHelper.Q1_ANSWER);
        int insertedAnswer = cursorQ1.getInt(id);
        Toast.makeText(this,"Answer is = " + insertedAnswer,Toast.LENGTH_LONG).show();
    }
}