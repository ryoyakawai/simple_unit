package com.example.empty;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.hello_world);
        textView.setText(sampleexec(10, 5));

    }

    private String sampleexec(int a, int b) {
        calc cal = new calc();

        int ans00 = cal.div(a, b);
        int ans01 = cal.plus(a, b);

        Log.d("TEST-DEBUG", Integer.toString(ans00));
        Log.d("TEST-DEBUG", Integer.toString(ans01));

        return "Hello Android!!";
    }

}