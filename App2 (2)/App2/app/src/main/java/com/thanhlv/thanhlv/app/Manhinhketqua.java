package com.thanhlv.thanhlv.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Manhinhketqua extends AppCompatActivity {

    TextView nhanxet;

    ImageView hinhanh,hinhanhkq;

    ImageButton nha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinhketqua);

        nhanxet = (TextView)findViewById(R.id.nhanxet);

        hinhanh = (ImageView)findViewById(R.id.hinhanh);
        hinhanhkq = (ImageView)findViewById(R.id.hinhanhketqua);

        nha = (ImageButton)findViewById(R.id.home);

        final int [] a = {0};
        final int [] b = {0};
        final int [] c = {0};
        final int [] tile = {0};

        Intent callerIntent = getIntent();
        Bundle packagefromcaller = callerIntent.getBundleExtra("ketqua");
        a [0]= packagefromcaller.getInt("a");
        b [0]= packagefromcaller.getInt("b");
        c [0]= packagefromcaller.getInt("c");
        tile [0] = c[0]/a[0];

        if (c[0]== 5 && b[0]==0){
            nhanxet.setText("Thật không thể tin được!!!" +"\n" +
                    "Thắng tuyệt đối");
            hinhanh.setImageResource(R.drawable.icon1);
            hinhanhkq.setImageResource(R.drawable.chienthang);
        }
        if (c[0]== 5 && b[0]>=1){
            nhanxet.setText("Thật tuyệt vời!!!" +"\n" +
                    "Thắng gần như tuyệt đối");
            hinhanh.setImageResource(R.drawable.icon2);
            hinhanhkq.setImageResource(R.drawable.chienthang);
        }
        if (c[0]== 5 && b[0]>=2){
            nhanxet.setText("Giỏi lắm!!!" +"\n" +
                    "Chiến thắng");
            hinhanh.setImageResource(R.drawable.icon7);
            hinhanhkq.setImageResource(R.drawable.chienthang);
        }
        if (c[0]== 5 && b[0]==4){
            nhanxet.setText("May quá!!!" +"\n" +
                    "Suýt thua");
            hinhanh.setImageResource(R.drawable.icon6);
            hinhanhkq.setImageResource(R.drawable.chienthang);
        }
        if (c[0]<= 4){
            nhanxet.setText("Tệ thật!!!" +"\n" +
                    "Thua rồi");
            hinhanh.setImageResource(R.drawable.icon5);
            hinhanhkq.setImageResource(R.drawable.thuacuoc);
        }
        if (c[0]<= 2){
            nhanxet.setText("Bực quá!!!" +"\n" +
                    "Đấu lại nào");
            hinhanh.setImageResource(R.drawable.icon4);
            hinhanhkq.setImageResource(R.drawable.thuacuoc);
        }
        if (c[0]== 0){
            nhanxet.setText("Hết thuốc chữa!!!" +"\n" +
                    "Thất bại thảm hại");
            hinhanh.setImageResource(R.drawable.icon3);
            hinhanhkq.setImageResource(R.drawable.thuacuoc);
        }


        nha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Manhinhketqua.this, Manhinhbatdau.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
