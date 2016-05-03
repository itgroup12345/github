package com.thanhlv.thanhlv.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class Manhinhthidau extends AppCompatActivity {

    ImageView minh,doithu;

    ImageButton keo,bua,bao,nha;

    TextView tisominh,tisodoithu, tran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinhthidau);

        minh = (ImageView) findViewById(R.id.minh);
        doithu = (ImageView)findViewById(R.id.doithu);

        keo = (ImageButton)findViewById(R.id.keo);
        bua = (ImageButton)findViewById(R.id.bua);
        bao = (ImageButton)findViewById(R.id.bao);
        nha = (ImageButton)findViewById(R.id.home);

        tisominh = (TextView)findViewById(R.id.tisominh);
        tisodoithu = (TextView)findViewById(R.id.tisodoithu);
        tran = (TextView)findViewById(R.id.tran);

        final int [] tisominh1 = {1};
        final int [] tisodoithu1 = {1} ;
        final int [] transo = {1};
        final int [] a = {1};
        final int [] b = {1};
        final int [] c = {1};

        nha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent manhinhchinh = new Intent(Manhinhthidau.this, Manhinhbatdau.class);
                startActivity(manhinhchinh);
                finish();
            }
        });

        keo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // số trận tăng 1
                a [0] = transo [0]++;
                tran.setText(String.valueOf(a [0]));

                // mình ra kéo
                minh.setImageResource(R.drawable.keo6);

                // đối thủ ra ngẫu nhiên
                ArrayList<Integer> oantuti = new ArrayList<Integer>();
                oantuti.add(R.drawable.keo3);//0
                oantuti.add(R.drawable.bua3);//1
                oantuti.add(R.drawable.bao3);//2

                Random random = new Random();

                int batki = random.nextInt(oantuti.size());// 0 >> 2
                doithu.setImageResource(oantuti.get(batki));

                // nếu mình thắng thì tỉ số của mình tăng 1
                // nếu mình thua thì tỉ số của đối thủ tăng 1
                if (batki==1){
                    b [0] = tisodoithu1 [0] ++;
                    tisodoithu.setText(String.valueOf(b [0]));
                }
                if (batki==2){
                    c [0] = tisominh1 [0] ++;
                    tisominh.setText(String.valueOf(c [0]));
                }

                // nếu tỉ số mình bằng 3 thì kết thúc và mình tăng 1 điểm
                // nếu tỉ số đối thủ bằng 3 thì kết thúc và mình giảm 1 điểm
                if (c[0]==5){
                    Intent ketqua = new Intent(Manhinhthidau.this, Manhinhketqua.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("a",a [0]);
                    bundle.putInt("b",b [0]);
                    bundle.putInt("c",c [0]);
                    ketqua.putExtra("ketqua",bundle);
                    startActivity(ketqua);
                    finish();
                }
                if (b[0]==5){
                    Intent ketqua = new Intent(Manhinhthidau.this, Manhinhketqua.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("a",a [0]);
                    bundle.putInt("b",b [0]);
                    bundle.putInt("c",c [0]);
                    ketqua.putExtra("ketqua",bundle);
                    startActivity(ketqua);
                    finish();
                }
            }
        });

        bua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // số trận tăng 1
                a [0] = transo [0] ++;
                tran.setText(String.valueOf(a[0]));

                // mình ra búa
                minh.setImageResource(R.drawable.bua6);

                // đối thủ ra ngẫu nhiên
                ArrayList<Integer> oantuti = new ArrayList<Integer>();
                oantuti.add(R.drawable.keo3);//0
                oantuti.add(R.drawable.bua3);//1
                oantuti.add(R.drawable.bao3);//2

                Random random = new Random();

                int batki = random.nextInt(oantuti.size());// 0 >> 3
                doithu.setImageResource(oantuti.get(batki));

                // nếu mình thắng thì tỉ số của mình tăng 1
                // nếu mình thua thì tỉ số của đối thủ tăng 1
                if (batki==2){
                    b [0] = tisodoithu1 [0] ++;
                    tisodoithu.setText(String.valueOf(b[0]));
                }
                if (batki==0){
                    c [0] = tisominh1 [0] ++;
                    tisominh.setText(String.valueOf(c[0]));
                }

                // nếu tỉ số mình bằng 3 thì kết thúc và mình tăng 1 điểm
                // nếu tỉ số đối thủ bằng 3 thì kết thúc và mình giảm 1 điểm
                if (c[0]==5){
                    Intent ketqua = new Intent(Manhinhthidau.this, Manhinhketqua.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("a",a [0]);
                    bundle.putInt("b",b [0]);
                    bundle.putInt("c",c [0]);
                    ketqua.putExtra("ketqua",bundle);
                    startActivity(ketqua);
                    finish();
                }
                if (b[0]==5){
                    Intent ketqua = new Intent(Manhinhthidau.this, Manhinhketqua.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("a",a [0]);
                    bundle.putInt("b",b [0]);
                    bundle.putInt("c",c [0]);
                    ketqua.putExtra("ketqua",bundle);
                    startActivity(ketqua);
                    finish();
                }
            }
        });

        bao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // số trận tăng 1
                a [0] = transo [0] ++;
                tran.setText(String.valueOf(a[0]));

                // mình ra bao
                minh.setImageResource(R.drawable.bao6);

                // đối thủ ra ngẫu nhiên
                ArrayList<Integer> oantuti = new ArrayList<Integer>();
                oantuti.add(R.drawable.keo3);//0
                oantuti.add(R.drawable.bua3);//1
                oantuti.add(R.drawable.bao3);//2

                Random random = new Random();

                int batki = random.nextInt(oantuti.size());// 0 >> 3
                doithu.setImageResource(oantuti.get(batki));

                // nếu mình thắng thì tỉ số của mình tăng 1
                // nếu mình thua thì tỉ số của đối thủ tăng 1
                if (batki==0){
                    b [0] = tisodoithu1 [0] ++;
                    tisodoithu.setText(String.valueOf(b[0]));
                }
                if (batki==1){
                    c [0] = tisominh1 [0] ++;
                    tisominh.setText(String.valueOf(c[0]));
                }

                // nếu tỉ số mình bằng 3 thì kết thúc và mình tăng 1 điểm
                // nếu tỉ số đối thủ bằng 3 thì kết thúc và mình giảm 1 điểm
                if (c[0]==5){
                    Intent ketqua = new Intent(Manhinhthidau.this, Manhinhketqua.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("a",a [0]);
                    bundle.putInt("b",b [0]);
                    bundle.putInt("c",c [0]);
                    ketqua.putExtra("ketqua",bundle);
                    startActivity(ketqua);
                    finish();
                }
                if (b[0]==5){
                    Intent ketqua = new Intent(Manhinhthidau.this, Manhinhketqua.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("a",a [0]);
                    bundle.putInt("b",b [0]);
                    bundle.putInt("c",c [0]);
                    ketqua.putExtra("ketqua",bundle);
                    startActivity(ketqua);
                    finish();
                }
            }
        });

    }
}
