package com.zqh199050242.dazuoye;

import android.content.Context;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

public class mingxilab {
    private static mingxilab smingxilab;
    private List<mingxi> mmingxi;
    public static mingxilab get(Context context){
        if(smingxilab==null){
            smingxilab=new mingxilab(context);
        }
        return smingxilab;
    }
    private mingxilab(Context context){
        mmingxi = new ArrayList<>();
        mingxi mx = new mingxi("收入","很开心呀",2000,UUID.randomUUID(),"工资",Calendar.getInstance());
        mingxi mx1 = new mingxi("收入","很开心呀",700,UUID.randomUUID(),"租金",Calendar.getInstance());
        mingxi mx2 = new mingxi("收入","很开心呀",300,UUID.randomUUID(),"礼金",Calendar.getInstance());
        mingxi mx3 = new mingxi("收入","很开心呀",500,UUID.randomUUID(),"分红",Calendar.getInstance());
        mingxi mx4 = new mingxi("收入","很开心呀",500,UUID.randomUUID(),"借入",Calendar.getInstance());
        mingxi mx5 = new mingxi("收入","很开心呀",100,UUID.randomUUID(),"其他",Calendar.getInstance());
        mingxi mx6 = new mingxi("支出","很开心呀",300,UUID.randomUUID(),"餐饮",Calendar.getInstance());
        mingxi mx7 = new mingxi("支出","很开心呀",500,UUID.randomUUID(),"购物",Calendar.getInstance());
        mingxi mx8 = new mingxi("支出","很开心呀",500,UUID.randomUUID(),"出行",Calendar.getInstance());
        mingxi mx9 = new mingxi("支出","很开心呀",200,UUID.randomUUID(),"化妆",Calendar.getInstance());
        mingxi mx10 = new mingxi("支出","很开心呀",500,UUID.randomUUID(),"社交",Calendar.getInstance());
        mingxi mx11 = new mingxi("支出","很开心呀",700,UUID.randomUUID(),"学习",Calendar.getInstance());
        mingxi mx12 = new mingxi("支出","很开心呀",300,UUID.randomUUID(),"数码",Calendar.getInstance());
        mmingxi.add(mx);
        mmingxi.add(mx1);
        mmingxi.add(mx2);
        mmingxi.add(mx3);
        mmingxi.add(mx4);
        mmingxi.add(mx5);
        mmingxi.add(mx6);
        mmingxi.add(mx7);
        mmingxi.add(mx8);
        mmingxi.add(mx9);
        mmingxi.add(mx10);
        mmingxi.add(mx11);
        mmingxi.add(mx12);
    }
    public List<mingxi> getMmingxi(){
        return mmingxi;
    }
    public mingxi getmingxi(UUID id){
        for(mingxi mx : mmingxi){
            if(mx.getId().equals(id)){
                return mx;
            }
        }
        return null;
    }
}
