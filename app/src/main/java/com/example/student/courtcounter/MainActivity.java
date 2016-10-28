package com.example.student.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public void buttonOnClick(View v){
        Button button=(Button) v;
        ((Button) v).setText("clicked");
    }

};

