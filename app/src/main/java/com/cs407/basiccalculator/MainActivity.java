package com.cs407.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void goToActivity(String s){
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("message",s);
        startActivity(intent);
    }
    public void addFunction(View view){
        int finalresult;
        int one;
        int two;
        EditText myText1 = (EditText) findViewById(R.id.myText1);
        EditText myText2 = (EditText) findViewById(R.id.myText2);

        try {
            one = Integer.parseInt(myText1.getText().toString());
        }
        catch (NumberFormatException ex){
            System.out.println("Error: Please enter only integers");
            ex.printStackTrace();
            throw ex;
        }

        try {
            two = Integer.parseInt(myText2.getText().toString());
        }
        catch (NumberFormatException ex){
            System.out.println("Error: Please enter only integers");
            ex.printStackTrace();
            throw ex;
        }
        finalresult = (one+two);
        goToActivity(Integer.toString(finalresult));
    }

    public void minusFunction(View view){
        int finalresult;
        int one;
        int two;
        EditText myText1 = (EditText) findViewById(R.id.myText1); //switch because buttons wrong
        EditText myText2 = (EditText) findViewById(R.id.myText2);

        try {
            one = Integer.parseInt(myText1.getText().toString());
        }
        catch (NumberFormatException ex){
            System.out.println("Error: Please enter only integers");
            ex.printStackTrace();
            throw ex;
        }

        try {
            two = Integer.parseInt(myText2.getText().toString());
        }
        catch (NumberFormatException ex){
            System.out.println("Error: Please enter only integers");
            ex.printStackTrace();
            throw ex;
        }

        finalresult = (one-two);
        goToActivity(Integer.toString(finalresult));
    }
    public void divideFunction(View view){
        double finalresult;
        int one;
        int two;
        EditText myText1 = (EditText) findViewById(R.id.myText1);
        EditText myText2 = (EditText) findViewById(R.id.myText2);
        try {
            one = Integer.parseInt(myText1.getText().toString());
        }
        catch (NumberFormatException ex){
            System.out.println("Error: Please enter only integers");
            ex.printStackTrace();
            throw ex;
        }

        try {
            two = Integer.parseInt(myText2.getText().toString());
        }
        catch (NumberFormatException ex){
            System.out.println("Error: Please enter only integers");
            ex.printStackTrace();
            throw ex;
        }
        if(two == 0){
            goToActivity("Error: Cannot Divide by Zero.");
        } else {
            finalresult = ((double)one/two);
            goToActivity(Double.toString(finalresult));
        }
    }
    public void multiplyFunction(View view){
        int finalresult;
        int one;
        int two;
        EditText myText1 = (EditText) findViewById(R.id.myText1);
        EditText myText2 = (EditText) findViewById(R.id.myText2);
        try {
            one = Integer.parseInt(myText1.getText().toString());
        }
        catch (NumberFormatException ex){
            System.out.println("Error: Please enter only integers");
            ex.printStackTrace();
            throw ex;
        }

        try {
            two = Integer.parseInt(myText2.getText().toString());
        }
        catch (NumberFormatException ex){
            System.out.println("Error: Please enter only integers");
            ex.printStackTrace();
            throw ex;
        }
        finalresult = (one*two);
        goToActivity(Integer.toString(finalresult));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}