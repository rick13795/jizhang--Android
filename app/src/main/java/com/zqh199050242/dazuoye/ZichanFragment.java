package com.zqh199050242.dazuoye;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.w3c.dom.Text;

import java.util.List;

public class ZichanFragment extends Fragment {
    int input_sum=0;
    int output_sum=0;
    int after=0;
    int eye=0;
    int i1;
    int i2;
    TextView  textView1;
    TextView  textView2;
    TextView  textView3;

    ProgressBar progressBar_in;
    ProgressBar progressBar_out;
    ImageButton imageButton;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_zichan,container,false);
        textView1=view.findViewById(R.id.zichan_after);
        textView2=view.findViewById(R.id.zichan_sum);
        textView3=view.findViewById(R.id.zichan_out);
        imageButton=view.findViewById(R.id.zichan_eye);
        imageButton.setBackgroundResource(R.mipmap.open_eye);
        progressBar_in=view.findViewById(R.id.zichan_progressbar_sumin);
        progressBar_out=view.findViewById(R.id.zichan_progressbar_sumout);
        List<mingxi> list = mingxilab.get(getContext()).getMmingxi();
        for (mingxi mingxi : list) {
            if(mingxi.getName().equals("收入")){
                input_sum+=mingxi.getMoney();
            }
            else {
                output_sum+=mingxi.getMoney();
            }
        }
        int sum2=input_sum+output_sum;
        i1 = Math.round(input_sum*100/sum2);
        i2 = Math.round(output_sum*100/sum2);

        progressBar_in.setProgress(i1,true);
        progressBar_out.setProgress(i2,true);
        after=input_sum-output_sum;
        //设置各个TextView的资金
        textView1.setText(after+"");
        textView2.setText(input_sum+"");
        textView3.setText(output_sum+"");

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator mvibrator=(Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                mvibrator.vibrate(10);//设置按钮震动
                textView1.setText("****");
                textView2.setText("****");
                textView3.setText("****");
                progressBar_in.setProgress(0);
                progressBar_out.setProgress(0);
                if(eye==0){
                    imageButton.setBackgroundResource(R.mipmap.close_eye);
                }
                if (eye==1){
                    imageButton.setBackgroundResource(R.mipmap.open_eye);
                    textView1.setText(after+"");
                    textView2.setText(input_sum+"");
                    textView3.setText(output_sum+"");
                    progressBar_in.setProgress(i1,true);
                    progressBar_out.setProgress(i2,true);
                }
                if(eye==0){eye=1;}else eye=0;
            }
        });
        return view;
    }
}
