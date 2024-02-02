package com.example.tiktokloginintentactivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class secondactivity extends AppCompatActivity {


    public static String TAG="ActivityLifeCycle";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(TAG,"SecondActivity is created");

        Button SecondActivity =(Button) findViewById(R.id.SecondActivity);
        Button Facebook =(Button) findViewById(R.id.Facebook);
        Button Instagram =(Button) findViewById(R.id.Instagram);

        SecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(secondactivity.this, tiktok_splash.class);
                startActivity(intent);



            }
        });
        Facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(secondactivity.this, facebook_splash.class);
                startActivity(intent1);
            }
        });
        Instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(secondactivity.this, instagram.class);
                startActivity(intent2);
            }
        });





    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart: SecondActivity is started");

    }
     @Override
     protected void onResume(){
        super.onResume();
        Log.d(TAG,"onResume: SecondActivity is resumed");

     }

     @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG,"onPause: SecondActivity is paused");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"SecondActivity is stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy: SecondActivity is destroyed");
    }




}
