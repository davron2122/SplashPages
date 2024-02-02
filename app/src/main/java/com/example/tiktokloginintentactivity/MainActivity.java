package com.example.tiktokloginintentactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static String TAG = "Activitylifecycle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.d(TAG,"Oncreate: MainActivity is created!");

        Button button = (Button) findViewById(R.id.secondactivity);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"Button is clicked");
                Intent intent = new Intent(MainActivity.this, secondactivity.class);
                startActivity(intent);

            }
        });

    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart: MainActivity is started");

    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG,"onResume: MainActivity is resumed");
    }



    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG,"onPause: MainActivity is paused");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy: MainActivity is destroyed");
    }
}






