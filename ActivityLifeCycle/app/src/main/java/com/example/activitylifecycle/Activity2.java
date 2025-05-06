package com.example.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.e("aaa", "on start 2 activity");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.e("aaa", "on restart 2 activity");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.e("aaa", "on resume 2 activity");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.e("aaa", "on pause 2 activity");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.e("aaa", "on stop 2 activity");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.e("aaa", "on destroy 2 activity");
    }

    public void ToActivity1(View view) {
        Intent intent = new Intent(Activity2.this, MainActivity.class);
        startActivity(intent);
    }

    public void CloseActivity2(View view) {
        finish();
    }
}