package com.zqh199050242.dazuoye;

import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class dengluActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    String username;
    String password;
    EditText ed1;
    EditText ed2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denglu);
//        Toast.makeText(dengluActivity.this,"默认账号密码均为123456",Toast.LENGTH_LONG).show();
        final Vibrator vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        btn1=findViewById(R.id.denglu_denglu);
        btn2=findViewById(R.id.register);
        ed1=findViewById(R.id.username);
        ed2=findViewById(R.id.password);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(40);
                username=ed1.getText().toString();
                password=ed2.getText().toString();
                if("123456".equals(username)&&password.equals("123456")){
                    Intent intent = new Intent(dengluActivity.this,MainActivity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(dengluActivity.this,"请输入正确的账号密码",Toast.LENGTH_LONG).show();
                    System.out.println("111"+username+password);
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dengluActivity.this,registerActivity.class);
                startActivity(intent);
            }
        });
    }
}
