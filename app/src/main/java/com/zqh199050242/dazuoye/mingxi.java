package com.zqh199050242.dazuoye;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;

public class mingxi {
    String name;
    String content;
    int money;
    UUID id;
    String type;
    Calendar date;

    public mingxi(String name, String content, int money, UUID id, String type, Calendar date) {
        this.name = name;
        this.content = content;
        this.money = money;
        this.id = id;
        this.type = type;
        this.date = date;
    }


    public String getDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = sdf.format(date.getTime());
        return dateStr;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public mingxi() {
        id= UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

}
