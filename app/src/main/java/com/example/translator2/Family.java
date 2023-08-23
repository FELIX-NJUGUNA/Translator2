package com.example.translator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Family extends AppCompatActivity {
    private WordModel wordModel;
    private Music music;
    ArrayList familyMembers;
    CustomAdapter customAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        wordModel = new WordModel();
        familyMembers = new ArrayList<WordModel>();
        family();
        customAdapter = new CustomAdapter(this,familyMembers);
        ListView familyListView = findViewById(R.id.familyListView);
        familyListView.setAdapter(customAdapter);
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