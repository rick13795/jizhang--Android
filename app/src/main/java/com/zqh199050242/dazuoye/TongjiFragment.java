package com.zqh199050242.dazuoye;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import java.util.List;

public class TongjiFragment extends Fragment {
    Button tv1;
    Button tv2;

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tongji,container,false);
        tv1=view.findViewById(R.id.tongji_shouru);
        tv2=view.findViewById(R.id.tongji_zhichu);

        //获取进度条
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Vibrator mvibrator=(Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                mvibrator.vibrate(10);//设置按钮震动
                FragmentManager manager = getFragmentManager();
                Fragment fragment = manager.findFragmentById(R.id.fragment_tj);
                if(fragment==null){
                    fragment=new TongjiFragment2();
                    manager.beginTransaction().replace(R.id.fragment_tongji_tongji,fragment).commit();
                }
            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Vibrator mvibrator=(Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                mvibrator.vibrate(10);//设置按钮震动
                FragmentManager manager = getFragmentManager();
                Fragment fragment = manager.findFragmentById(R.id.fragment_tjzc);
                if(fragment==null){
                    fragment=new TongjiFragment3();
                    manager.beginTransaction().replace(R.id.fragment_tongji_tongji,fragment).commit();
                }
            }
        });

        FragmentManager manager = getFragmentManager();//默认显示支出
        Fragment fragment = manager.findFragmentById(R.id.fragment_tj);
        if(fragment==null){
            fragment=new TongjiFragment2();
            manager.beginTransaction().replace(R.id.fragment_tongji_tongji,fragment).commit();
        }


        return view;
    }
}
