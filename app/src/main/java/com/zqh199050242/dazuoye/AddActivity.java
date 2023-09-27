package com.zqh199050242.dazuoye;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import java.util.UUID;

public class AddActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    ImageButton imgbtn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        Toast.makeText(AddActivity.this,"请注意要添加时间哦！！",Toast.LENGTH_LONG).show();
        btn1=findViewById(R.id.add_input);
        btn2=findViewById(R.id.add_output);
        imgbtn=findViewById(R.id.add_forback);
        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = manager.findFragmentById(R.id.fkc);
        if(fragment==null){
            fragment=new InputFragment();
            manager.beginTransaction().replace(R.id.fragment_add,fragment).commit();
        }

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Vibrator mvibrator=(Vibrator) getSystemService(VIBRATOR_SERVICE);
                mvibrator.vibrate(10);//设置按钮震动
                FragmentManager manager = getSupportFragmentManager();
                Fragment fragment = manager.findFragmentById(R.id.fkc);
                if(fragment==null){
                    fragment=new InputFragment();
                    manager.beginTransaction().replace(R.id.fragment_add,fragment).commit();
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Vibrator mvibrator=(Vibrator) getSystemService(VIBRATOR_SERVICE);
                mvibrator.vibrate(10);//设置按钮震动
                FragmentManager manager = getSupportFragmentManager();
                Fragment fragment = manager.findFragmentById(R.id.fkc1);
                if(fragment==null){
                    fragment=new OutputFragment();
                    manager.beginTransaction().replace(R.id.fragment_add,fragment).commit();
                }
            }
        });
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator mvibrator=(Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
                mvibrator.vibrate(10);//设置按钮震动
                finish();
            }
        });

    }
    public static Intent newintent(Context context, UUID id){
        Intent intent = new Intent(context,AddActivity.class);
        intent.putExtra("mingxi_id",id);
        return intent;
    }
}
