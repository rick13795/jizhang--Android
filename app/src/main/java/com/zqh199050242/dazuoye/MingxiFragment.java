package com.zqh199050242.dazuoye;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Calendar;
import java.util.List;

public class MingxiFragment extends Fragment {
    public RecyclerView mrecycleview;
    public fragmentadapt madapt;
    public ProgressBar psb;
    Button btn1;
    Button back;
    @Nullable
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mingxi,container,false);
        mrecycleview=view.findViewById(R.id.mingxi_recycleview);
        btn1=view.findViewById(R.id.mingxi_add);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),AddActivity.class);
                startActivity(intent);
            }
        });
        mrecycleview.setLayoutManager(new LinearLayoutManager(getActivity()));
        updateUI();
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        updateUI();
    }

    private class fragmentin extends RecyclerView.ViewHolder{
        TextView tv1;//类型
        TextView tv2;//收入支出
        TextView tv3;//钱
        TextView tv4;
        ImageButton imgbtn;
        public void bind(mingxi mx){
            mingxi=mx;
            tv1.setText(mingxi.getType());
            tv2.setText(mingxi.getName());
            tv3.setText(mingxi.getMoney()+"");
            if(mingxi.getDate()==null){
                Toast.makeText(getActivity(),"请输入日期",Toast.LENGTH_LONG).show();
                Calendar calendar = Calendar.getInstance();
                tv4.setText(calendar.getTime().toString());
            }
            tv4.setText(mingxi.getDate());
            if(mingxi.getType().equals("餐饮")){
                imgbtn.setBackgroundResource(R.mipmap.fragment_add_rice1);
            }
            else if(mingxi.getType().equals("购物")){
                imgbtn.setBackgroundResource(R.mipmap.fragment_add_shop1);
            }
            else if(mingxi.getType().equals("出行")){
                imgbtn.setBackgroundResource(R.mipmap.fragment_add_train1);
            }
            else if(mingxi.getType().equals("娱乐")){
                imgbtn.setBackgroundResource(R.mipmap.fragment_add_yule1);
            }
            else if(mingxi.getType().equals("服饰")){
                imgbtn.setBackgroundResource(R.mipmap.fragment_add_fushi1);
            }
            else if(mingxi.getType().equals("化妆")){
                imgbtn.setBackgroundResource(R.mipmap.fragment_add_huazhuang1);
            }
            else if(mingxi.getType().equals("住房")){
                imgbtn.setBackgroundResource(R.mipmap.fragment_add_zhufang1);
            }
            else if(mingxi.getType().equals("社交")){
                imgbtn.setBackgroundResource(R.mipmap.fragment_add_shejiao1);
            }
            else if(mingxi.getType().equals("通信")){
                imgbtn.setBackgroundResource(R.mipmap.fragment_add_tongxin1);
            }
            else if(mingxi.getType().equals("学习")){
                imgbtn.setBackgroundResource(R.mipmap.fragment_add_xuexi1);
            }
            else if(mingxi.getType().equals("宠物")){
                imgbtn.setBackgroundResource(R.mipmap.fragment_add_chongwu1);
            }
            else if(mingxi.getType().equals("工资")){
                imgbtn.setBackgroundResource(R.mipmap.mingxi_gongzi1);
            }
            else if(mingxi.getType().equals("红包")){
                imgbtn.setBackgroundResource(R.mipmap.output_hongbao1);
            }
            else if(mingxi.getType().equals("租金")){
                imgbtn.setBackgroundResource(R.mipmap.output_zujin1);
            }
            else if(mingxi.getType().equals("礼金")){
                imgbtn.setBackgroundResource(R.mipmap.output_lijin1);
            }
            else if(mingxi.getType().equals("分红")){
                imgbtn.setBackgroundResource(R.mipmap.output_fenhong1);
            }
            else if(mingxi.getType().equals("理财")){
                imgbtn.setBackgroundResource(R.mipmap.output_licai1);
            }
            else if(mingxi.getType().equals("年终奖")){
                imgbtn.setBackgroundResource(R.mipmap.output_nianzhongjiang1);
            }
            else if(mingxi.getType().equals("其他")){
                imgbtn.setBackgroundResource(R.mipmap.output_qita1);
            }
            else if(mingxi.getType().equals("借入")){
                imgbtn.setBackgroundResource(R.mipmap.output_jieru1);
            }
            else if(mingxi.getType().equals("收款")){
                imgbtn.setBackgroundResource(R.mipmap.output_shoukuan1);
            }
            else if(mingxi.getType().equals("数码")){
                imgbtn.setBackgroundResource(R.mipmap.fragment_add_shuma1);
            }

        }
        public fragmentin(LayoutInflater inflater, ViewGroup parent){
            super(inflater.inflate(R.layout.mingxi_recycleview,parent,false));
            tv1=itemView.findViewById(R.id.mingxi_rec_type);
            tv2=itemView.findViewById(R.id.mingxi_rec_name);
            tv3=itemView.findViewById(R.id.mingxi_money);
            imgbtn=itemView.findViewById(R.id.mingxi_picture);
            tv4=itemView.findViewById(R.id.riqi);
        }
        private mingxi mingxi;
    }
    private class fragmentadapt extends RecyclerView.Adapter<fragmentin>{
        private List<mingxi> mmingxi;
        private int mpositon;
        public fragmentadapt(List<mingxi> mingxis){
            mmingxi=mingxis;
        }
        public fragmentin onCreateViewHolder(ViewGroup parent, int viewType){
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            return new fragmentin(layoutInflater,parent);
        }
        public void onBindViewHolder(final fragmentin holder, final int positon){
            final mingxi mx =mmingxi.get(positon);
            holder.bind(mx);
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = AddActivity.newintent(getActivity(),mx.getId());
                    startActivity(intent);
                }
            });
            holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    mpositon=holder.getAdapterPosition();
                    mingxilab.get(getActivity()).getMmingxi().remove(mpositon);
                    madapt.notifyItemRemoved(mpositon);
                    return true;
                }
            });
        }
        public int getItemCount(){
            return mmingxi.size();
        }
    }


    private void updateUI(){
        mingxilab mxlab = mingxilab.get(getActivity());
        List<mingxi> mx = mxlab.getMmingxi();
        madapt = new fragmentadapt(mx);
        mrecycleview.setAdapter(madapt);
    }
}
