package com.zqh199050242.dazuoye;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.List;

public class TongjiFragment2 extends Fragment {
    int money_gongzi=0;
    int money_hongbao=0;
    int money_zujin=0;
    int money_lijin=0;
    int money_fenhong=0;
    int money_licai=0;
    int money_nianzhongjiang=0;
    int money_qita=0;
    int money_jieru=0;
    int money_shoukuan=0;
    int sum;

    ProgressBar progressBar_gongzi;
    ProgressBar progressBar_hongbao;
    ProgressBar progressBar_zujin;
    ProgressBar progressBar_lijin;
    ProgressBar progressBar_fenhong;
    ProgressBar progressBar_licai;
    ProgressBar progressBar_nianzhongjiang;
    ProgressBar progressBar_qita;
    ProgressBar progressBar_jieru;
    ProgressBar progressBar_shoukuan;


    TextView textView_gongzi;
    TextView textView_hongbao;
    TextView textView_zujin;
    TextView textView_lijin;
    TextView textView_fenhong;
    TextView textView_licai;
    TextView textView_nianzhongjiang;
    TextView textView_qita;
    TextView textView_jieru;
    TextView textView_shoukuan;
    TextView tx;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tongji_tongji,container,false);

        progressBar_gongzi=view.findViewById(R.id.progressbar_gongzi);
        progressBar_hongbao=view.findViewById(R.id.progressbar_hongbao);
        progressBar_zujin=view.findViewById(R.id.progressbar_zujin);
        progressBar_lijin=view.findViewById(R.id.progressbar_lijin);
        progressBar_fenhong=view.findViewById(R.id.progressbar_fenhong);
        progressBar_licai=view.findViewById(R.id.progressbar_licai);
        progressBar_nianzhongjiang=view.findViewById(R.id.progressbar_nianzhongjiang);
        progressBar_qita=view.findViewById(R.id.progressbar_qita);
        progressBar_jieru=view.findViewById(R.id.progressbar_jieru);
        progressBar_shoukuan=view.findViewById(R.id.progressbar_shoukuan);


        textView_gongzi=view.findViewById(R.id.gongzi_money);
        textView_hongbao=view.findViewById(R.id.hongbao_money);
        textView_zujin=view.findViewById(R.id.zujing_money);
        textView_lijin=view.findViewById(R.id.lijin_money);
        textView_fenhong=view.findViewById(R.id.fenhong_money);
        textView_licai=view.findViewById(R.id.licai_money);
        textView_nianzhongjiang=view.findViewById(R.id.nianzhongjiang_money);
        textView_qita=view.findViewById(R.id.qita_money);
        textView_jieru=view.findViewById(R.id.jieru_money);
        textView_shoukuan=view.findViewById(R.id.shoukuan_money);

        tx=view.findViewById(R.id.input_sum);//获取list集合，通过lab获取
        List<mingxi> list = mingxilab.get(getContext()).getMmingxi();
        for (mingxi mingxi : list) {
            if(mingxi.getType().equals("工资")){
                money_gongzi+=mingxi.getMoney();
                sum+=mingxi.getMoney();
            }
            else if(mingxi.getType().equals("红包")){
                money_hongbao+=mingxi.getMoney();
                sum+=mingxi.getMoney();
            }
            else if(mingxi.getType().equals("租金")){
                money_zujin+=mingxi.getMoney();
                sum+=mingxi.getMoney();
            }
            else if(mingxi.getType().equals("礼金")){
                money_lijin+=mingxi.getMoney();
                sum+=mingxi.getMoney();
            }
            else if(mingxi.getType().equals("分红")){
                money_fenhong+=mingxi.getMoney();
                sum+=mingxi.getMoney();
            }
            else if(mingxi.getType().equals("理财")){
                money_licai+=mingxi.getMoney();
                sum+=mingxi.getMoney();
            }
            else if(mingxi.getType().equals("年终奖")){
                money_nianzhongjiang+=mingxi.getMoney();
                sum+=mingxi.getMoney();
            }
            else if(mingxi.getType().equals("其他")){
                money_qita+=mingxi.getMoney();
                sum+=mingxi.getMoney();
            }
            else if(mingxi.getType().equals("借入")){
                money_jieru+=mingxi.getMoney();
                sum+=mingxi.getMoney();
            }
            else if(mingxi.getType().equals("收款")){
                money_shoukuan+=mingxi.getMoney();
                sum+=mingxi.getMoney();
            }
        }
        tx.setText(sum+"");
        if(sum!=0){
            int i1 = Math.round(money_gongzi*100/sum);
            int i2 = Math.round(money_hongbao*100/sum);
            int i3 = Math.round(money_zujin*100/sum);
            int i4 = Math.round(money_lijin*100/sum);
            int i5 = Math.round(money_fenhong*100/sum);
            int i6 = Math.round(money_licai*100/sum);
            int i7 = Math.round(money_nianzhongjiang*100/sum);
            int i8 = Math.round(money_qita*100/sum);
            int i9 = Math.round(money_jieru*100/sum);
            int i10 = Math.round(money_shoukuan*100/sum);
            progressBar_gongzi.setProgress(i1,true);
            progressBar_hongbao.setProgress(i2,true);
            progressBar_zujin.setProgress(i3,true);
            progressBar_lijin.setProgress(i4,true);
            progressBar_fenhong.setProgress(i5,true);
            progressBar_licai.setProgress(i6,true);
            progressBar_nianzhongjiang.setProgress(i7,true);
            progressBar_qita.setProgress(i8,true);
            progressBar_jieru.setProgress(i9,true);
            progressBar_shoukuan.setProgress(i10,true);
        }
        textView_gongzi.setText(money_gongzi+"");
        textView_hongbao.setText(money_hongbao+"");
        textView_zujin.setText(money_zujin+"");
        textView_lijin.setText(money_lijin+"");
        textView_licai.setText(money_licai+"");
        textView_nianzhongjiang.setText(money_nianzhongjiang+"");
        textView_fenhong.setText(money_fenhong+"");
        textView_qita.setText(money_qita+"");
        textView_jieru.setText(money_jieru+"");
        textView_shoukuan.setText(money_shoukuan+"");
        return view;
    }
}
