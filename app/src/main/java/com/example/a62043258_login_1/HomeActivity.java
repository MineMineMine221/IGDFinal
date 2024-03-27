package com.example.a62043258_login_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private  Button btn1;
    private  Button btn2;
    private  Button btn3;
    private  Button back2Login;
    private  TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        FindID();
        switch (MainActivity.stat)
        {
            case 1:
                SetUserName();
                break;
            case 2:
                SetUserName();
                btn2.setVisibility(View.GONE);
                break;
            case 3:
                SetUserName();
                btn1.setVisibility(View.GONE);
                btn3.setVisibility(View.GONE);
                break;
        }


        back2Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BackToLogin();
            }
        });


    }
    private  void SetUserName()
    {
        textView.setText(MainActivity.userName);
    }
    private  void FindID()
    {
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        back2Login = (Button)findViewById(R.id.btn2Login);
        textView = (TextView)findViewById(R.id.txtusername);
    }
    private  void BackToLogin()
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }


}