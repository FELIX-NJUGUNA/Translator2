package com.example.translator2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<WordModel> familyMembers;

    public CustomAdapter(Context context, ArrayList<WordModel> familyMembers) {
        this.context = context;
        this.familyMembers = familyMembers;
    }



    @Override
    public int getCount() {
        return familyMembers.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.list_layout,viewGroup,false);
        TextView english=view.findViewById(R.id.english);
        ImageView image=view.findViewById(R.id.image);
        ImageView imageView = view.findViewById(R.id.imageView);
        TextView somali = view.findViewById(R.id.somali);
        english.setText(familyMembers.get(i).getEnglishWord());
        somali.setText(familyMembers.get(i).getSomaliWord());
        return view;
    }
}
