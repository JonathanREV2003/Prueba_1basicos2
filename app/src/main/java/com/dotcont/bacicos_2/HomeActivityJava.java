package com.dotcont.bacicos_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class HomeActivityJava extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_java);

        Bundle extras = getIntent().getExtras();
        String emailusuario = extras.getString("ValorEmail");
        setTitle(emailusuario);

    }
}