package com.thanhlv.thanhlv.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class Manhinhbatdau extends AppCompatActivity {

    RelativeLayout manhinhChinh;

    ImageButton play, exit, notepad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinhbatdau);

        manhinhChinh = (RelativeLayout)findViewById(R.id.manhinhchinh);
        manhinhChinh.setBackgroundResource(R.drawable.anhnen);

        play = (ImageButton)findViewById(R.id.play);
        exit = (ImageButton)findViewById(R.id.exit);
        notepad = (ImageButton)findViewById(R.id.notepad);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // chuyển vào màn hình thi đấu
                Intent thidau = new Intent(Manhinhbatdau.this, Manhinhthidau.class);
                startActivity(thidau);
                finish();
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Quay về trang chủ
                Intent intent = new Intent(Manhinhbatdau.this, MainActivity.class);
                startActivity(intent);
            }
        });

        notepad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển sang màn hình ghi chú
                Intent intent = new Intent(Manhinhbatdau.this, Manhinhghichu.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
