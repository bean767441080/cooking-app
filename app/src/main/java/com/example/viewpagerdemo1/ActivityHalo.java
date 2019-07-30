package com.example.viewpagerdemo1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityHalo extends AppCompatActivity {

    public static void start(Context context) {
        Intent starter = new Intent(context, ActivityHalo.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halo);
    }
}
