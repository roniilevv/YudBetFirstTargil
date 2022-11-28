package com.example.yudbetfirsttargil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class FirstQuestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_question);
    }
    public void nextQuestion (View view) {
        Intent intent = new Intent(this, SecondQuestion.class);
        startActivity(intent);
    }
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.first_option:
                if (checked)
                    break;
            case R.id.second_option:
                if (checked)
                    break;
            case R.id.third_option:
                if (checked)
                    break;
            case R.id.forth_option:
                if (checked)
                    break;
        }
    }
}