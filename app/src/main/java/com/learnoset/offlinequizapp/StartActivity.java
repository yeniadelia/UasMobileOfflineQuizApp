package com.learnoset.offlinequizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {


    private String selectedTopicName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_activity);


        final Button startBtn = findViewById(R.id.startQuizBtn);
        final LinearLayout javaLayout = findViewById(R.id.javaLayout);
        final LinearLayout phpLayout = findViewById(R.id.phpLayout);
        final LinearLayout htmlLayout = findViewById(R.id.htmlLayout);
        final LinearLayout androidLayout = findViewById(R.id.androidLayout);

        javaLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                selectedTopicName = "java";


                javaLayout.setBackgroundResource(R.drawable.round_back_white_stroke10);


                phpLayout.setBackgroundResource(R.drawable.round_back_white10);
                htmlLayout.setBackgroundResource(R.drawable.round_back_white10);
                androidLayout.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        phpLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                selectedTopicName = "php";


                phpLayout.setBackgroundResource(R.drawable.round_back_white_stroke10);


                javaLayout.setBackgroundResource(R.drawable.round_back_white10);
                htmlLayout.setBackgroundResource(R.drawable.round_back_white10);
                androidLayout.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        htmlLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                selectedTopicName = "html";


                htmlLayout.setBackgroundResource(R.drawable.round_back_white_stroke10);


                javaLayout.setBackgroundResource(R.drawable.round_back_white10);
                phpLayout.setBackgroundResource(R.drawable.round_back_white10);
                androidLayout.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        androidLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                selectedTopicName = "android";


                androidLayout.setBackgroundResource(R.drawable.round_back_white_stroke10);


                javaLayout.setBackgroundResource(R.drawable.round_back_white10);
                phpLayout.setBackgroundResource(R.drawable.round_back_white10);
                htmlLayout.setBackgroundResource(R.drawable.round_back_white10);
            }
        });


        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (selectedTopicName.isEmpty()) {
                    Toast.makeText(StartActivity.this, "Please select topic first", Toast.LENGTH_SHORT).show();
                } else {


                    final Intent intent = new Intent(StartActivity.this, MainActivity.class);


                    intent.putExtra("selectedTopic", selectedTopicName);


                    startActivity(intent);

                    finish(); // finish (destroy) this activity
                }
            }
        });
    }
}