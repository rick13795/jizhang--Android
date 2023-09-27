package com.zqh199050242.dazuoye;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
public class listActivity extends AppCompatActivity {
    ImageButton btn1;
    ImageButton btn2;
    ImageButton btn3;
    ImageButton btn4;
    ImageButton logo;
    TextView tx;
    String call;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mingxi);
        Toast.makeText(listActivity.this,"长按删除，单击编辑",Toast.LENGTH_LONG).show();
        btn1=findViewById(R.id.mingxi_btn1);
        btn2=findViewById(R.id.mingxi_btn2);
        btn3=findViewById(R.id.mingxi_btn3);
        btn4=findViewById(R.id.mingxi_forback);
        logo=findViewById(R.id.mingxi_toplogo);
        tx=findViewById(R.id.mingxi_text1);

        Intent intent =getIntent();
        if(intent!=null){
            call=intent.getStringExtra("call");
            if(call.equals("mingxi")){
                FragmentManager manager = getSupportFragmentManager();
                Fragment fragment = manager.findFragmentById(R.id.fragment_mingxi);
                if(fragment==null){
                    fragment=new MingxiFragment();
                    manager.beginTransaction().replace(R.id.fragment_container,fragment).commit();
                }
            }
            else{
                FragmentManager manager = getSupportFragmentManager();
                Fragment fragment = manager.findFragmentById(R.id.fragment_zichan);
                if(fragment==null){
                    fragment=new ZichanFragment();
                    manager.beginTransaction().replace(R.id.fragment_container,fragment).commit();
                }
            }
            if(call.equals("mingxi")){
                tx.setText("账目明细");
                logo.setBackgroundResource(R.mipmap.mingxi_rili1);
            }
            else if(call.equals("zichan")){
                tx.setText("");
                logo.setBackgroundColor(Color.rgb(255,255,255));
            }
            else{
                tx.setText("账目统计");
                logo.setBackgroundResource(R.mipmap.mingxi_tongji);
            }
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Vibrator mvibrator=(Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
                mvibrator.vibrate(10);//设置按钮震动
                logo.setBackgroundResource(R.mipmap.mingxi_rili1);
                FragmentManager manager = getSupportFragmentManager();
                Fragment fragment = manager.findFragmentById(R.id.fragment_mingxi);
                if(fragment==null){
                    fragment=new MingxiFragment();
                    manager.beginTransaction().replace(R.id.fragment_container,fragment).commit();
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Vibrator mvibrator=(Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
                mvibrator.vibrate(10);//设置按钮震动
                tx.setText("账目统计");
                logo.setBackgroundResource(R.mipmap.mingxi_tongji);
                FragmentManager manager = getSupportFragmentManager();
                Fragment fragment = manager.findFragmentById(R.id.fragment_tongji);
                if(fragment==null){
                    fragment=new TongjiFragment();
                    manager.beginTransaction().replace(R.id.fragment_container,fragment).commit();
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tx.setText("");
                logo.setBackgroundColor(Color.rgb(255,255,255));
                Vibrator mvibrator=(Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
                mvibrator.vibrate(10);//设置按钮震动
                FragmentManager manager = getSupportFragmentManager();
                Fragment fragment = manager.findFragmentById(R.id.fragment_zichan);
                if(fragment==null){
                    fragment=new ZichanFragment();
                    manager.beginTransaction().replace(R.id.fragment_container,fragment).commit();
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator mvibrator=(Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
                mvibrator.vibrate(10);//设置按钮震动
                finish();
            }
        });
        getIntent().getStringExtra("zichan");
    }
    }
}
