package com.example.calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{
    EditText edFirstNum, edSecondNum, edRezult;
    Button btnNext, btnPred, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero, btnEq, btnDot, btnSum, btnRaz, btnYmn, btnDel;
    TextView znak;
    boolean fnum = true, firstcl = true;
    int iii = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnPred = (Button) findViewById(R.id.btnPred);
        edFirstNum = (EditText) findViewById(R.id.etFrstNum);
        edSecondNum = (EditText) findViewById(R.id.etScndtNum);
        edRezult = (EditText) findViewById(R.id.etResult);
        znak = (TextView) findViewById(R.id.txtSign);

        btnNext = (Button) findViewById(R.id.btnNext);
        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnFour = (Button) findViewById(R.id.btnFour);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSix = (Button) findViewById(R.id.btnSix);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnEight = (Button) findViewById(R.id.btnEight);
        btnNine = (Button) findViewById(R.id.btnNine);
        btnZero = (Button) findViewById(R.id.btnZero);
        btnEq = (Button) findViewById(R.id.btnEq);
        btnDot = (Button) findViewById(R.id.btnDot);
        btnSum = (Button) findViewById(R.id.btnSum);
        btnRaz = (Button) findViewById(R.id.btnRazn);
        btnYmn = (Button) findViewById(R.id.btnYmn);
        btnDel = (Button) findViewById(R.id.btnDel);
        znak = (TextView) findViewById(R.id.txtSign);

        btnDel.setOnClickListener(this);
        btnNext.setOnClickListener(this);
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btnZero.setOnClickListener(this);
        btnEq.setOnClickListener(this);
        btnDot.setOnClickListener(this);
        btnSum.setOnClickListener(this);
        btnRaz.setOnClickListener(this);
        btnYmn.setOnClickListener(this);
        btnDel.setOnClickListener(this);
        btnPred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnOne:
                if (fnum) {
                    edFirstNum.append("1");
                } else {
                    edSecondNum.append("1");
                }
                break;
            case R.id.btnTwo:
                if (fnum) {
                    edFirstNum.append("2");
                } else {
                    edSecondNum.append("2");
                }
                break;
            case R.id.btnThree:
                if (fnum) {
                    edFirstNum.append("3");
                } else {
                    edSecondNum.append("3");
                }
                break;
            case R.id.btnFour:
                if (fnum) {
                    edFirstNum.append("4");
                } else {
                    edSecondNum.append("4");
                }
                break;
            case R.id.btnFive:
                if (fnum) {
                    edFirstNum.append("5");
                } else {
                    edSecondNum.append("5");
                }
                break;

            case R.id.btnSix:
                if (fnum) {
                    edFirstNum.append("6");
                } else {
                    edSecondNum.append("6");
                }
                break;
            case R.id.btnSeven:
                if (fnum) {
                    edFirstNum.append("7");
                } else {
                    edSecondNum.append("7");
                }
                break;
            case R.id.btnEight:
                if (fnum) {
                    edFirstNum.append("8");
                } else {
                    edSecondNum.append("8");
                }
                break;
            case R.id.btnNine:
                if (fnum) {
                    edFirstNum.append("9");
                } else {
                    edSecondNum.append("9");
                }
                break;
            case R.id.btnZero:
                if (fnum) {
                    edFirstNum.append("0");
                } else {
                    edSecondNum.append("0");
                }
                break;
            case R.id.btnDot:
                if (fnum) {
                    edFirstNum.append(".");
                } else {
                    edSecondNum.append(".");
                }
                break;

            case R.id.btnDel:
                znak.setText("/");
                if (fnum)
                    fnum = !fnum;
                iii = 3;
                break;
            case R.id.btnSum:
                znak.setText("+");
                if (fnum)
                    fnum = !fnum;
                iii = 0;
                break;
            case R.id.btnRazn:
                znak.setText("-");
                if (fnum)
                    fnum = !fnum;
                iii = 1;
                break;
            case R.id.btnYmn:
                znak.setText("*");
                if (fnum)
                    fnum = !fnum;
                iii = 2;
                break;
            case R.id.btnEq:
                Float ff = 11.3F;
                if (iii == 0)
                    ff = Float.valueOf(edFirstNum.getText().toString()) + Float.valueOf(edSecondNum.getText().toString());

                if (iii == 1)
                    ff = Float.valueOf(edFirstNum.getText().toString()) - Float.valueOf(edSecondNum.getText().toString());
                if (iii == 2)
                    ff = Float.valueOf(edFirstNum.getText().toString()) * Float.valueOf(edSecondNum.getText().toString());
                if (iii == 3)
                    ff = Float.valueOf(edFirstNum.getText().toString()) / Float.valueOf(edSecondNum.getText().toString());
                edRezult.setText(ff.toString());

                if (!firstcl) {
                    firstcl = !firstcl;
                    fnum = !fnum;
                    edFirstNum.setText("");
                    edSecondNum.setText("");
                    edRezult.setText("");
                    znak.setText("");
                } else
                    firstcl = !firstcl;
                break;
        }
    }
}
