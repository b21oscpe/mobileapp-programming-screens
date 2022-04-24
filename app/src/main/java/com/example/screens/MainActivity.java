package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button signIn;
    private EditText username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.signin_name);

        signIn = findViewById(R.id.signin_button);
        signIn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.d("==>", "Signed in!");
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("username", username.getText(). toString());
                startActivity(intent);
            }
        });
    }
}
