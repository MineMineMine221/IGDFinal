package com.example.a62043258_login_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button m_btnlogni;
    private EditText m_inputUsername;
    private  EditText m_inputpassword;
    public   static  String name;
    private TextView m_txtnoti;
    private  int m_loginCount =5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        m_btnlogni = (Button) findViewById(R.id.btnLogni);
        m_inputUsername = (EditText) findViewById(R.id.inputUsername);
        m_inputpassword = (EditText) findViewById(R.id.inputPassworld);
        m_txtnoti = (TextView) findViewById(R.id.txtnoti);

        m_txtnoti.setVisibility(View.GONE);
        m_btnlogni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vailidata(m_inputUsername.getText().toString(),m_inputpassword.getText().toString());
            }
        });
    }
    private  void vailidata(String userName,String passWorld)
    {
        if(userName.equals("admin1") && passWorld.equals("1234"))
        {
            name = "admin1";
            Intent intent = new Intent(this, ProfilePage.class);
            startActivity((intent));
        }
        else if(userName.equals("admin2") && passWorld.equals("1234"))
        {
            name = "admin2";
            Intent intent = new Intent(this,ProfilePage.class);
            startActivity((intent));
        }
        else if(userName.equals("mod1") && passWorld.equals("1234"))
        {
            name = "mod1";
            Intent intent = new Intent(this,ProfilePage.class);
            startActivity((intent));
        }
        else if(userName.equals("mod2") && passWorld.equals("1234"))
        {
            name = "mod2";
            Intent intent = new Intent(this,ProfilePage.class);
            startActivity((intent));
        }
        else if(userName.equals("web1") && passWorld.equals("1234"))
        {
            name = "web1";
            Intent intent = new Intent(this,ballisticsLayout.class);
            startActivity((intent));
        }
        else if(userName.equals("slide1") && passWorld.equals("1234"))
        {
            name = "slide1";
            Intent intent = new Intent(this,gameImages.class);
            startActivity((intent));
        }
        else if(userName.equals("view1") && passWorld.equals("1234"))
        {
            name = "view1";
            Intent intent = new Intent(this,videoView.class);
            startActivity((intent));
        }
        else {
            m_loginCount--;
            m_txtnoti.setVisibility(View.VISIBLE);
            m_txtnoti.setText("เหลืออีก: " + String.valueOf(m_loginCount));

            if(m_loginCount == 0)
            {
                m_btnlogni.setEnabled(false);
                m_txtnoti.setVisibility(View.GONE);
            }
        }


    }
}