package com.example.calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnNext,btnOne,btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven,btnEight,btnNine,btnZero,btnEq,btnDot,btnSqrt,btnExp,btnPow,btnCbrt;
    EditText etNum,etResult;
    String s="";
    double d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNum = (EditText) findViewById(R.id.etNum);
        etResult = (EditText) findViewById(R.id.etResult);
        btnNext = (Button) findViewById(R.id.btnNext);
        btnNext.setOnClickListener(this);
        btnOne = (Button) findViewById(R.id.btnOne);
        btnOne.setOnClickListener(this);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnTwo.setOnClickListener(this);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnThree.setOnClickListener(this);
        btnFour = (Button) findViewById(R.id.btnFour);
        btnFour.setOnClickListener(this);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnFive.setOnClickListener(this);
        btnSix = (Button) findViewById(R.id.btnSix);
        btnSix.setOnClickListener(this);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnSeven.setOnClickListener(this);
        btnEight = (Button) findViewById(R.id.btnEight);
        btnEight.setOnClickListener(this);
        btnNine = (Button) findViewById(R.id.btnNine);
        btnNine.setOnClickListener(this);
        btnZero = (Button) findViewById(R.id.btnZero);
        btnZero.setOnClickListener(this);
        btnEq = (Button) findViewById(R.id.btnEq);
        btnEq.setOnClickListener(this);
        btnDot = (Button) findViewById(R.id.btnDot);
        btnDot.setOnClickListener(this);
        btnSqrt = (Button) findViewById(R.id.btnSqrt);
        btnSqrt.setOnClickListener(this);
        btnExp = (Button) findViewById(R.id.btnExp);
        btnExp.setOnClickListener(this);
        btnPow = (Button) findViewById(R.id.btnPow);
        btnPow.setOnClickListener(this);

        btnCbrt = (Button) findViewById(R.id.btnCbrt);
        btnCbrt.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.btnOne:
                s+="1";
                etNum.setText(s);
                break;
            case R.id.btnTwo:
                s+="2";
                etNum.setText(s);
                break;
            case R.id.btnThree:
                s+="3";
                etNum.setText(s);
                break;
            case R.id.btnFour:
                s+="4";
                etNum.setText(s);
                break;
            case R.id.btnFive:
                s+="5";
                etNum.setText(s);
                break;

            case R.id.btnSix:
                s+="6";
                etNum.setText(s);
                break;
            case R.id.btnSeven:
                s+="7";
                etNum.setText(s);
                break;
            case R.id.btnEight:
                s+="8";
                etNum.setText(s);
                break;
            case R.id.btnNine:
                s+="9";
                etNum.setText(s);
                break;
            case R.id.btnZero:
                s+="0";
                etNum.setText(s);
                break;
            case R.id.btnDot:
                s+=".";
                etNum.setText(s);
                break;
            case R.id.btnSqrt:
                d = Double.parseDouble(s);
                d = Math.sqrt(d);
                s = Double.toString(d);
                break;
            case R.id.btnCbrt:
                d= Double.parseDouble(s);
                d = Math.cbrt(d);
                s = Double.toString(d);
                break;
            case R.id.btnExp:
                d= Double.parseDouble(s);
                d = Math.exp(d);
                s = Double.toString(d);
                break;
            case R.id.btnPow:
                d= Double.parseDouble(s);
                d *=d;
                s = Double.toString(d);
                break;
            case R.id.btnEq:
                etResult.setText(s);
                etNum.setText("");
                s="";
                break;
            case R.id.btnNext:
                Intent intent = new Intent(this,MainActivity2.class);
                startActivity(intent);
                break;
        }
    }
}
