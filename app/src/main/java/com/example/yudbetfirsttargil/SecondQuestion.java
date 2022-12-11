package com.example.yudbetfirsttargil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SecondQuestion extends AppCompatActivity {

    int grade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secont_question);
        Bundle extras = getIntent().getExtras();
        grade = extras.getInt("grade");
        Toast.makeText(this, grade + "", Toast.LENGTH_LONG).show();
    }

    public void lastPage(View view) {
        RadioGroup r2 = findViewById(R.id.secondradiogroup);
        if (r2.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "נא ללחוץ על תשובה!", Toast.LENGTH_LONG).show();

        }
        else {
            if (r2.getCheckedRadioButtonId() == R.id.third_option_2) {
                Toast.makeText(this, "תשובה נכונה", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this, LastPage.class);
                grade +=50;
                intent.putExtra("grade", grade);

                startActivity(intent);
            } else {
                Toast.makeText(this, "תשובה לא נכונה", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this, LastPage.class);
                intent.putExtra("grade", grade);

                startActivity(intent);
            }


        }
    }
}
