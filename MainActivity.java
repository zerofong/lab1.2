package com.example.taruc.lab12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextWeight,editTextHeight;
    private TextView textViewResult;
    private ImageView imageViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Linking UI to program
        editTextWeight = (EditText)findViewById(R.id.editTextWeight);
        editTextHeight = (EditText)findViewById(R.id.editTextHeight);
        imageViewResult = (ImageView)findViewById(R.id.imageView);
        textViewResult = (TextView)findViewById(R.id.textView);

    }

    public void calculateBMI(View view){
        //ToDo : calculate BMI and display result
        double weight,height,bmi;
        weight = Double.parseDouble(editTextWeight.getText().toString());
        height = Double.parseDouble(editTextHeight.getText().toString())/100;

        bmi = weight/(height*height);

        //set image during runtime
        if(bmi <= 18.5){
            textViewResult.setText("You are under weight! Your BMI is "+bmi);
            imageViewResult.setImageResource(R.drawable.under);
        }
        if(bmi >= 21){
            textViewResult.setText("You are over weight! Your BMI is "+bmi);
            imageViewResult.setImageResource(R.drawable.over);
        }
        else{
            textViewResult.setText("You are normal. Your BMI is "+bmi);
            imageViewResult.setImageResource(R.drawable.normal);
        }
    }

    public void resetAll(View view){
        //ToDo : reset all entered values
        editTextWeight.setText("");
        editTextHeight.setText("");
        imageViewResult.setImageResource(R.drawable.empty);
        textViewResult.setText("BMI");
    }
}
