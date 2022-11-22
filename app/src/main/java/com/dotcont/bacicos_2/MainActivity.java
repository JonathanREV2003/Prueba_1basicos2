package com.dotcont.bacicos_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button tv1;
    EditText editEmail, editTextPassWord;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.button_login);
        editEmail = findViewById(R.id.edditTexEmail);
        editTextPassWord = findViewById(R.id.edditContraseña);



        tv1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        Log.i("APP","Click en login");

        String email = editEmail.getText().toString();
        String pass = editTextPassWord.getText().toString();

        if( !email.isEmpty() && ! pass.isEmpty()) {

        Intent intentLogin = new Intent(this, HomeActivityJava.class);
        intentLogin.putExtra("ValorEmail", email);
        startActivity(intentLogin);

        }else {
            editEmail.setError("Complete el e-mail y la contraseña");
        }



    }

}