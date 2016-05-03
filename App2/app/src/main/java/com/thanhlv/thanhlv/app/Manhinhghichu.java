package com.thanhlv.thanhlv.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Manhinhghichu extends AppCompatActivity {

    ImageButton home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinhghichu);

        home = (ImageButton)findViewById(R.id.home);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Manhinhghichu.this, Manhinhbatdau.class);
                startActivity(intent);
                finish();
            }
        });


    }
}
