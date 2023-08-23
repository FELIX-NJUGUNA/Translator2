package com.example.translator2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Numbers extends AppCompatActivity {
    private WordModel wordModel;
    ArrayList<WordModel> familyMembers;
    ImageView play;
    private Music music;
    MediaPlayer mp;
    CustomAdapter customAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        wordModel = new WordModel();
        familyMembers = new ArrayList();
        mp = MediaPlayer.create(this,R.raw.music1);
        family();
        customAdapter = new CustomAdapter(this,familyMembers);
        ListView familyListView = findViewById(R.id.familyListView);
        familyListView.setAdapter(customAdapter);
        familyListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                mp.reset();
                mp = MediaPlayer.create(Numbers.this,familyMembers.get(i).getMusic());
                mp.start();
                Toast.makeText(adapterView.getContext(), "hello", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void family(){
        familyMembers.add(new WordModel("Father","Abo",R.drawable.image1,R.raw.music1));
        familyMembers.add(new WordModel("Mother","Hoyo",R.drawable.image1,R.raw.music2));
        familyMembers.add(new WordModel("Brother","walalo",R.drawable.image1,R.raw.music3));
        familyMembers.add(new WordModel("Aunt","Edho",R.drawable.image1,R.raw.music4));
        familyMembers.add(new WordModel("Sister","Naya",R.drawable.image1,R.raw.music4));
        familyMembers.add(new WordModel("Child","Nunu",R.drawable.image1,R.raw.music5));
        familyMembers.add(new WordModel("Uncle","Adeer",R.drawable.image1,R.raw.music6));
        familyMembers.add(new WordModel("Grandmother","Ayeyo",R.drawable.image1,R.raw.music5));
        familyMembers.add(new WordModel("Grandfather","Awowo",R.drawable.image1,R.raw.music3));
    }
}