package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //creation d'une variable du type fragment
        FragmentManager fragmentManage = getSupportFragmentManager();


        Button frag = findViewById(R.id.frag1);
        frag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentManage.beginTransaction()
                        .replace(R.id.fragmentContainerView, Fragment2.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });

    }
}