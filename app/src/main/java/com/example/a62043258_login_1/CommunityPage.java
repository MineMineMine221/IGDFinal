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
import androidx.recyclerview.widget.RecyclerView;

public class CommunityPage extends AppCompatActivity {

    private Button m_ft_btn1;
    private Button m_ft_btn2;
    private Button m_ft_btn3;
    private Button m_ft_btn4;
    private Button m_ft_btn5;
  //  private TextView m_txtUsername;
    private ListView m_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_community_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        m_ft_btn1 = (Button) findViewById(R.id.ft_btn1);
        m_ft_btn2 = (Button) findViewById(R.id.ft_btn2);
        m_ft_btn3 = (Button) findViewById(R.id.ft_btn3);
        m_ft_btn4 = (Button) findViewById(R.id.ft_btn4);
        m_ft_btn5 = (Button) findViewById(R.id.ft_btn5);
       // m_txtUsername = (TextView) findViewById(R.id.txtUsernameCOM);
        m_list = (ListView) findViewById(R.id.listCommu);
        m_list.setAdapter(new PostListView(getApplicationContext()));
     //   m_txtUsername.setText(MainActivity.name);

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

public  class PostListView extends BaseAdapter
{
    public Context m_context;
    public LayoutInflater m_layoutInflater;

        public  PostListView(Context context)
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
            view = m_layoutInflater.inflate(R.layout.post_layout,null);
            holder = new ViewHolder();
            holder.m_name = view.findViewById(R.id.txtUsernameCOM);
            view.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) view.getTag();
        }



        holder.m_name.setText("LalyTheRat" + (i + 1) );
        return  view;
    }
}
    public  class ViewHolder
    {
        TextView m_name;
    }

}