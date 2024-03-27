package com.example.a62043258_login_1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class HideOutPage extends AppCompatActivity {

    private Button m_ft_btn1;
    private Button m_ft_btn2;
    private Button m_ft_btn3;
    private Button m_ft_btn4;
    private Button m_ft_btn5;
    private ListView m_listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hide_out_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        m_ft_btn1 = (Button) findViewById((R.id.ft_btn1));
        m_ft_btn2 = (Button) findViewById((R.id.ft_btn2));
        m_ft_btn3 = (Button) findViewById((R.id.ft_btn3));
        m_ft_btn4 = (Button) findViewById((R.id.ft_btn4));
        m_ft_btn5 = (Button) findViewById((R.id.ft_btn5));
        m_listView = (ListView) findViewById(R.id.listHideOut);
        m_listView.setAdapter(new HideOutCraftListView(getApplicationContext()));
        m_ft_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fun_Page1();
            }
        });
        m_ft_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fun_Page2();
            }
        });
        m_ft_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fun_Page3();
            }
        });
        m_ft_btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fun_Page4();
            }
        });
        m_ft_btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fun_Page5();
            }
        });
    }
    private  void Fun_Page1()
    {
        Intent intent = new Intent(this,MapPage.class);
        startActivity(intent);
    }
    private  void Fun_Page2()
    {
        Intent intent = new Intent(this,HideOutPage.class);
        startActivity(intent);
    }
    private  void Fun_Page3()
    {
        Intent intent = new Intent(this,CommunityPage.class);
        startActivity(intent);
    }
    private  void Fun_Page4()
    {
        Intent intent = new Intent(this, ProfilePage.class);
        startActivity(intent);
    }
    private  void Fun_Page5()
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public  class HideOutCraftListView extends BaseAdapter
    {
        public Context m_context;
        public LayoutInflater m_layoutInflater;

        public  HideOutCraftListView(Context context)
        {
            m_context = context;
            m_layoutInflater = LayoutInflater.from(m_context);
        }
        @Override
        public int getCount() {
            return 20;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup parent) {

            ViewHolder holder = null;
            if(holder == null)
            {
                view = m_layoutInflater.inflate(R.layout.hideout_item,null);
                holder = new ViewHolder();
                holder.m_txtTime = view.findViewById(R.id.txtTime);
                view.setTag(holder);
            }
            else
            {
                holder = (ViewHolder) view.getTag();
            }

            int m = new Random().nextInt(49) + 10;
            int s = new Random().nextInt(39) + 20;


           holder.m_txtTime.setText(String.valueOf(m) + " min \n"+ String.valueOf(s) +" sec" );
            return  view;
        }
    }
    public  class ViewHolder
    {
        TextView m_txtTime;
    }
}