package com.tiinak.laskin;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText number1;
    private EditText number2;
    private TextView result;
    private int resultInt;
    private int number1Int;
    private int number2Int;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = findViewById(R.id.numberFirst);
        number2 = findViewById(R.id.numberSecond);

        result = findViewById(R.id.textView);
     }

    public void addNumbers(View view){

        number1Int =  Integer.parseInt(number1.getText().toString());
        number2Int =  Integer.parseInt(number2.getText().toString());
        resultInt = number1Int + number2Int;
        result.setText("" + resultInt);
    }

    public void minusNumbers(View view){

        number1Int =  Integer.parseInt(number1.getText().toString());
        number2Int =  Integer.parseInt(number2.getText().toString());
        resultInt = number1Int - number2Int;
        result.setText("" +resultInt);
    }

    public void multiplyNumbers(View view){

        number1Int =  Integer.parseInt(number1.getText().toString());
        number2Int =  Integer.parseInt(number2.getText().toString());
        resultInt = number1Int * number2Int;
        result.setText("" + resultInt);
    }
    public void fractionNumbers(View view){

        double number1D =  Double.parseDouble(number1.getText().toString());
        double number2D =  Double.parseDouble(number2.getText().toString());
        double resultDouble = number1D / number2D;

        DecimalFormat df = new DecimalFormat("#.##");
        result.setText("" + df.format(resultDouble));
    }
}