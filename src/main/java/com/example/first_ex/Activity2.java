package com.example.first_ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        createGoTomainButton();
        Log.w("MyApp", "Activity2 onCreate() called");
    }

    private void createGoTomainButton() {
        Button goToMainAct = (Button) findViewById(R.id.exit);
        View.OnClickListener oclBtnGoToSecAct = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity2.this, MainActivity.class);
                startActivity(intent);
            }
        };
        goToMainAct.setOnClickListener(oclBtnGoToSecAct);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.w("MyApp", "Activity2 onStart() called");


    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w("MyApp", "Activity2 onStop() called");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w("MyApp", "Activity2 onDestroy() called");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w("MyApp", "Activity2 onPause() called");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w("MyApp", "Activity2 onResume() called");

    }
}