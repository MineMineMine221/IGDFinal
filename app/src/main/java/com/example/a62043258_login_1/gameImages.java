package com.example.a62043258_login_1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class gameImages extends AppCompatActivity {

    private ImageSlider m_SliderAssaultRifles;
    private ImageSlider m_SliderAssaultCarbines;
    private ImageSlider m_SliderSubmachineguns;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_game_images);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        SetAssaultrifles();
        SetAssaultcarbines();
        SetSubmachineguns();


    }
    private  void SetAssaultrifles()
    {
        m_SliderAssaultRifles = (ImageSlider) findViewById(R.id.slider_Assaultrifles);

        List<SlideModel> slideModelList = new ArrayList<>();

        for (WebResource res : imageUrlColletion.AssaultRiflesList)
        {
            slideModelList.add(new SlideModel(res.URL,res.Title, ScaleTypes.CENTER_INSIDE));
        }

        m_SliderAssaultRifles.setImageList(slideModelList,ScaleTypes.CENTER_INSIDE);
    }
    private  void SetAssaultcarbines()
    {
        m_SliderAssaultCarbines = (ImageSlider) findViewById(R.id.slider_Assaultcarbines);

        List<SlideModel> slideModelList = new ArrayList<>();

        for (WebResource res : imageUrlColletion.AssaultCarbines)
        {
            slideModelList.add(new SlideModel(res.URL,res.Title, ScaleTypes.CENTER_INSIDE));
        }

        m_SliderAssaultCarbines.setImageList(slideModelList,ScaleTypes.CENTER_INSIDE);
    }
    private  void SetSubmachineguns()
    {
        m_SliderSubmachineguns = (ImageSlider) findViewById(R.id.slider_Submachineguns);

        List<SlideModel> slideModelList = new ArrayList<>();

        for (WebResource res : imageUrlColletion.SubmachineGuns)
        {
            slideModelList.add(new SlideModel(res.URL,res.Title, ScaleTypes.CENTER_INSIDE));
        }

        m_SliderSubmachineguns.setImageList(slideModelList,ScaleTypes.CENTER_INSIDE);
    }
}