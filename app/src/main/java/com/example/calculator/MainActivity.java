package com.example.calculator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class  MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btn00,btnC,btnMod,btnDiv,btnBack,btnMul,btnSub,btnSum,btnEqul,btnDot;
    TextView txt;
    String temp,s1="";
    int n1,n2;
    int cnt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt=findViewById(R.id.txt);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn0=findViewById(R.id.btn0);
        btn00=findViewById(R.id.btn00);
        btnC=findViewById(R.id.btnC);
        btnMod=findViewById(R.id.btnMod);
        btnDiv=findViewById(R.id.btnDiv);
        btnBack=findViewById(R.id.btnBack);
        btnMul=findViewById(R.id.btnMul);
        btnSub=findViewById(R.id.btnSub);
        btnSum=findViewById(R.id.btnSum);
        btnEqul=findViewById(R.id.btnEqul);
        btnDot=findViewById(R.id.btndot);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              temp= String.valueOf(txt.getText());
              s1=temp+"1";
              txt.setText(""+s1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp= String.valueOf(txt.getText());
                s1=temp+"2";
                txt.setText(""+s1);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp= String.valueOf(txt.getText());
                s1=temp+"3";
                txt.setText(""+s1);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp= String.valueOf(txt.getText());
                s1=temp+"4";
                txt.setText(""+s1);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp= String.valueOf(txt.getText());
                s1=temp+"5";
                txt.setText(""+s1);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp= String.valueOf(txt.getText());
                s1=temp+"6";
                txt.setText(""+s1);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp= String.valueOf(txt.getText());
                s1=temp+"7";
                txt.setText(""+s1);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp= String.valueOf(txt.getText());
                s1=temp+"8";
                txt.setText(""+s1);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp= String.valueOf(txt.getText());
                s1=temp+"9";
                txt.setText(""+s1);
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp= String.valueOf(txt.getText());
                s1=temp+"0";
                txt.setText(s1);
            }
        });

        btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp= String.valueOf(txt.getText());
                s1=temp+"00";
                txt.setText(""+s1);
            }
        });

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp= String.valueOf(txt.getText());
                n1 = Integer.parseInt(temp);
                txt.setText("");
                cnt = 1;
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp= String.valueOf(txt.getText());
                n1 = Integer.parseInt(temp);
                txt.setText("");
                cnt = 2;
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp= String.valueOf(txt.getText());
                n1 = Integer.parseInt(temp);
                txt.setText("");
                cnt = 3;
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp= String.valueOf(txt.getText());
                n1 = Integer.parseInt(temp);
                txt.setText("");
                cnt = 4;
            }
        });

        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp= String.valueOf(txt.getText());
                n1 = Integer.parseInt(temp);
                txt.setText("");
                cnt = 5;
            }
        });

        btnEqul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = String.valueOf(txt.getText());
                n2 = Integer.parseInt(temp);

                if(cnt==1)
                {
                    int sum = n1 + n2;
                    txt.setText(""+sum);
                }

                if(cnt==2)
                {
                    int sub = n1 - n2;
                    txt.setText(""+sub);
                }

                if(cnt==3)
                {
                    int mul = n1 * n2;
                    txt.setText(""+mul);
                }

                if(cnt==4)
                {
                    int div = n1 / n2;
                    txt.setText(""+div);
                }

                if(cnt==5)
                {
                    int mod = n1 % n2;
                    txt.setText(""+mod);
                }
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText("");
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt.length()>0)
                {
                   String s2 = s1.substring(0,txt.length()-1);
                    txt.setText(""+s2);
                }
                else
                {
                    txt.setText("");
                }
            }
        });

    }
}