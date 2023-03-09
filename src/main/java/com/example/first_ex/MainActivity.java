package com.example.first_ex;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createButtonGoToActTwo();
        createButtonGoToLink();

        Log.w("MyApp", "MainActivity onCreate() called");
    }

    private void createButtonGoToLink() {
        Button lincButton = (Button) findViewById(R.id.linkButton);

        View.OnClickListener oclLincButton = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
                startActivity(intent);
            }
        };

        lincButton.setOnClickListener(oclLincButton);
    }

    private void createButtonGoToActTwo() {
        Button goToSecAct = (Button) findViewById(R.id.btnGoToSecAct);

        View.OnClickListener oclBtnGoToSecAct = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                startActivity(intent);
            }
        };

        goToSecAct.setOnClickListener(oclBtnGoToSecAct);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.w("MyApp", "MainActivity onStart() called");


    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w("MyApp", "MainActivity onStop() called");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w("MyApp", "MainActivity onDestroy() called");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w("MyApp", "MainActivity onPause() called");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w("MyApp", "MainActivity onResume() called");

    }
}