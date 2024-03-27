package com.example.a62043258_login_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   public  static  int stat = 0;
   public  static  String userName;
    private EditText inputUser;
    private EditText inputPss;
    private TextView txtNoti;
    private Button btnG2Home;
    private  int counter = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputUser = (EditText)findViewById(R.id.inputUser);
        inputPss = (EditText)findViewById(R.id.inputPss);
        txtNoti =(TextView)findViewById(R.id.txtNoti);
        btnG2Home =(Button)findViewById(R.id.btnLogin);

        txtNoti.setVisibility(View.GONE);
        txtNoti.setText("คุณสามารถ Login ได้อีก : 5");

        btnG2Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validata(inputUser.getText().toString(),inputPss.getText().toString());
            }
        });
    }

    private  void validata(String username,String password)
    {
        if((username.equals("admin")) &&(password.equals("1234")) )
        {
//            Intent intent = new Intent(this,HomeActivity.class);
//            startActivity(intent);
            HomeActivity homeActivity = new HomeActivity();
            userName = "Admin";
            Intent intent = new Intent(this, homeActivity.getClass());
            startActivity(intent);
            stat =1;
        }
        else if((username.equals("mod")) && (password.equals("1234")))
        {
            HomeActivity homeActivity = new HomeActivity();
            userName = "Moderator";
            Intent intent = new Intent(this, homeActivity.getClass());
//            homeActivity.StartEIEI();


            startActivity(intent);
            stat =2;
        }
        else if((username.equals("member01")) && (password.equals("1234")))
        {
            HomeActivity homeActivity = new HomeActivity();
            userName = "Member01";
          Intent intent = new Intent(this,homeActivity.getClass());
          startActivity(intent);
          stat =3;
        }
        else {
            counter--;

            txtNoti.setVisibility((View.VISIBLE));
            txtNoti.setText("คุณสามารถ login wfhvud :" + String.valueOf(counter));

            if(counter == 0)
            {
                btnG2Home.setEnabled(false);
                txtNoti.setVisibility((View.GONE));
            }

        }



    }













}