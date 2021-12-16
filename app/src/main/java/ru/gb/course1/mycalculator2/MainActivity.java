package ru.gb.course1.mycalculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText firstNumber;
    private EditText secondNumber;
    private Button resultButton;
    private TextView finishResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addition();
        resultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishResult.setText(sumView());
            }
        });

    }

    private String sumView() {
        String firstNumberstr = firstNumber.getText().toString();
        String secondNumberstr = secondNumber.getText().toString();
        String fResult;

        try {
            int firstN = Integer.parseInt(firstNumberstr);
            int secondN = Integer.parseInt(secondNumberstr);
            int sum = firstN + secondN;
            fResult = String.valueOf(sum);
        } catch (Exception e) {
            e.printStackTrace();
            fResult = "Я ТОЛЬКО С ЦЕЛЫМИ ЧИСЛАМИ УМЕЮ!";
        }

        return fResult;
    }

    private void addition() {
        firstNumber = findViewById(R.id.first_number);
        secondNumber = findViewById(R.id.second_number);
        resultButton = findViewById(R.id.result_button);
        finishResult = findViewById(R.id.finish_result);
    }
}