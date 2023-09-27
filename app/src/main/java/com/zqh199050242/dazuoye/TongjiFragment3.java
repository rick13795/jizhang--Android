package com.zqh199050242.dazuoye;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.List;

public class TongjiFragment3 extends Fragment {
    int money_canyin;
    int money_gouwu;
    int money_chuxing;
    int money_yule;
    int money_fushi;
    int money_huazhuang;
    int money_zhufang;
    int money_shejiao;
    int money_tongxin;
    int money_xuexi;
    int money_chongwu;
    int money_shuma;
    int money_sum;

    ProgressBar progressBar_canyin;
    ProgressBar progressBar_gouwu;
    ProgressBar progressBar_chuxing;
    ProgressBar progressBar_yule;
    ProgressBar progressBar_fushi;
    ProgressBar progressBar_huazhuang;
    ProgressBar progressBar_zhufang;
    ProgressBar progressBar_shejiao;
    ProgressBar progressBar_tongxin;
    ProgressBar progressBar_xuexi;
    ProgressBar progressBar_chongwu;
    ProgressBar progressBar_shuma;

    TextView textView_canyin;
    TextView textView_gouwu;
    TextView textView_chuxing;
    TextView textView_yule;
    TextView textView_fushi;
    TextView textView_huazhuang;
    TextView textView_zhufang;
    TextView textView_shejiao;
    TextView textView_tongxin;
    TextView textView_xuexi;
    TextView textView_chongwu;
    TextView textView_shuma;
    TextView textView_sum;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tongji_tongji_zhichu,container,false);
        progressBar_canyin=view.findViewById(R.id.progressbar_canyin);
        progressBar_gouwu=view.findViewById(R.id.progressbar_gouwu);
        progressBar_chuxing=view.findViewById(R.id.progressbar_chuxing);
        progressBar_yule=view.findViewById(R.id.progressbar_yule);
        progressBar_fushi=view.findViewById(R.id.progressbar_fushi);
        progressBar_huazhuang=view.findViewById(R.id.progressbar_huazhuang);
        progressBar_zhufang=view.findViewById(R.id.progressbar_zhufang);
        progressBar_shejiao=view.findViewById(R.id.progressbar_shejiao);
        progressBar_tongxin=view.findViewById(R.id.progressbar_tongxin);
        progressBar_xuexi=view.findViewById(R.id.progressbar_xuexi);
        progressBar_chongwu=view.findViewById(R.id.progressbar_chongwu);
        progressBar_shuma=view.findViewById(R.id.progressbar_shuma);

        textView_canyin=view.findViewById(R.id.textview_canyin);
        textView_gouwu=view.findViewById(R.id.textview_gouwu);
        textView_chuxing=view.findViewById(R.id.textview_chuxing);
        textView_yule=view.findViewById(R.id.textview_yule);
        textView_fushi=view.findViewById(R.id.textview_fushi);
        textView_huazhuang=view.findViewById(R.id.textview_huazhuang);
        textView_zhufang=view.findViewById(R.id.textview_zhufang);
        textView_shejiao=view.findViewById(R.id.textview_shejiao);
        textView_tongxin=view.findViewById(R.id.textview_tongxin);
        textView_xuexi=view.findViewById(R.id.textview_xuexi);
        textView_chongwu=view.findViewById(R.id.textview_chongwu);
        textView_shuma=view.findViewById(R.id.textview_shuma);
        textView_sum=view.findViewById(R.id.output_sum);

        List<mingxi> list = mingxilab.get(getContext()).getMmingxi();
        for (mingxi mingxi : list) {
            if(mingxi.getType().equals("餐饮")){
                money_canyin+=mingxi.getMoney();
                money_sum+=mingxi.getMoney();
            }
            else if(mingxi.getType().equals("购物")){
                money_gouwu+=mingxi.getMoney();
                money_sum+=mingxi.getMoney();
            }
            else if(mingxi.getType().equals("出行")){
                money_chuxing+=mingxi.getMoney();
                money_sum+=mingxi.getMoney();
            }
            else if(mingxi.getType().equals("娱乐")){
                money_yule+=mingxi.getMoney();
                money_sum+=mingxi.getMoney();
            }
            else if(mingxi.getType().equals("服饰")){
                money_fushi+=mingxi.getMoney();
                money_sum+=mingxi.getMoney();
            }
            else if(mingxi.getType().equals("化妆")){
                money_huazhuang+=mingxi.getMoney();
                money_sum+=mingxi.getMoney();
            }
            else if(mingxi.getType().equals("住房")){
                money_zhufang+=mingxi.getMoney();
                money_sum+=mingxi.getMoney();
            }
            else if(mingxi.getType().equals("社交")){
                money_shejiao+=mingxi.getMoney();
                money_sum+=mingxi.getMoney();
            }
            else if(mingxi.getType().equals("通信")){
                money_tongxin+=mingxi.getMoney();
                money_sum+=mingxi.getMoney();
            }
            else if(mingxi.getType().equals("学习")){
                money_xuexi+=mingxi.getMoney();
                money_sum+=mingxi.getMoney();
            }
            else if(mingxi.getType().equals("宠物")){
                money_chongwu+=mingxi.getMoney();
                money_sum+=mingxi.getMoney();
            }else if(mingxi.getType().equals("数码")){
                money_shuma+=mingxi.getMoney();
                money_sum+=mingxi.getMoney();
            }
            textView_sum.setText(money_sum+"");
        }
        if(money_sum!=0){
            int i1 = Math.round(money_canyin*100/money_sum);
            int i2 = Math.round(money_gouwu*100/money_sum);
            int i3 = Math.round(money_chuxing*100/money_sum);
            int i4 = Math.round(money_yule*100/money_sum);
            int i5 = Math.round(money_fushi*100/money_sum);
            int i6 = Math.round(money_huazhuang*100/money_sum);
            int i7 = Math.round(money_zhufang*100/money_sum);
            int i8 = Math.round(money_shejiao*100/money_sum);
            int i9 = Math.round(money_tongxin*100/money_sum);
            int i10 = Math.round(money_xuexi*100/money_sum);
            int i11 = Math.round(money_chongwu*100/money_sum);
            int i12 = Math.round(money_shuma*100/money_sum);
            progressBar_canyin.setProgress(i1,true);
            progressBar_gouwu.setProgress(i2,true);
            progressBar_chuxing.setProgress(i3,true);
            progressBar_yule.setProgress(i4,true);
            progressBar_fushi.setProgress(i5,true);
            progressBar_huazhuang.setProgress(i6,true);
            progressBar_zhufang.setProgress(i7,true);
            progressBar_shejiao.setProgress(i8,true);
            progressBar_tongxin.setProgress(i9,true);
            progressBar_xuexi.setProgress(i10,true);
            progressBar_chongwu.setProgress(i11,true);
            progressBar_shuma.setProgress(i12,true);
        }
        textView_canyin.setText(money_canyin+"");
        textView_gouwu.setText(money_gouwu+"");
        textView_chuxing.setText(money_chuxing+"");
        textView_yule.setText(money_yule+"");
        textView_fushi.setText(money_fushi+"");
        textView_huazhuang.setText(money_huazhuang+"");
        textView_zhufang.setText(money_zhufang+"");
        textView_shejiao.setText(money_shejiao+"");
        textView_tongxin.setText(money_tongxin+"");
        textView_xuexi.setText(money_xuexi+"");
        textView_chongwu.setText(money_chongwu+"");
        textView_shuma.setText(money_shuma+"");

        return view;
    }
}
