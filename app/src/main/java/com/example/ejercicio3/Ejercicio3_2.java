package com.example.ejercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Ejercicio3_2 extends AppCompatActivity {
    private ListView lv1;
    private ArrayList<Student> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3_2);

        Bundle bundleObject = getIntent().getExtras();
        assert bundleObject != null;
        list = (ArrayList<Student>) bundleObject.getSerializable("list");
        lv1 = findViewById(R.id.lv1);

        assert list != null;
        String[] names = new String[list.size()];
        Integer[] Gender = new Integer[list.size()];
        for (int i = 0; i < list.size() ; i++) {
            names[i] = list.get(i).getNombre() + " " + list.get(i).getLNP()+ " " +list.get(i).getLNM();
            Gender[i] = list.get(i).getGenero();
        }

        MyAdapter myAdapter = new MyAdapter(this,names,Gender);
        lv1.setAdapter(myAdapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),getApplicationContext().getResources().getString(R.string.Todo_fine21)+list.get(position).getNo_cuenta(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void getback(View view){
        Intent Getback = new Intent(this,MainActivity.class);
        startActivity(Getback);
    }

}
