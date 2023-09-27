package com.zqh199050242.dazuoye;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Calendar;
import java.util.UUID;

public class OutputFragment extends Fragment {
    ImageButton btn1;//工资
    ImageButton btn2;//红包
    ImageButton btn3;//租金
    ImageButton btn5;//礼金
    ImageButton btn6;//分红
    ImageButton btn7;//理财
    ImageButton btn8;//年终奖
    ImageButton btn9;//其他
    ImageButton btn10;//借入
    ImageButton btn11;//收款
    ImageButton imgbtn;
    mingxi mx;
    TextView tx;
    Button btn4;
    Button delete;
    EditText ed1;
    String number="";
    String type="";
    private int isadd;
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent =getActivity().getIntent();
        UUID uuid = (UUID) intent.getSerializableExtra("mingxi_id");
        if(uuid==null){
            mx=new mingxi();
            isadd=1;
        }
        else {
            mx=mingxilab.get(getActivity()).getmingxi(uuid);
        }
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_output,container,false);
        btn1=view.findViewById(R.id.output_gongzi);
        btn2=view.findViewById(R.id.output_hongbao);
        btn3=view.findViewById(R.id.output_zujing);
        btn5=view.findViewById(R.id.output_lijing);
        btn6=view.findViewById(R.id.output_fenhong);
        btn7=view.findViewById(R.id.output_licai);
        btn8=view.findViewById(R.id.output_nianzhongjiang);
        btn9=view.findViewById(R.id.output_qita);
        btn10=view.findViewById(R.id.output_jieru);
        btn11=view.findViewById(R.id.output_shoukuan);
        imgbtn=view.findViewById(R.id.rili);
        delete=view.findViewById(R.id.deleteout);
        btn4=view.findViewById(R.id.finist_out);
        ed1=view.findViewById(R.id.wancheng);
        ed1.setText(mx.getContent());
        number=String.valueOf(mx.getMoney());
        type=mx.getType();
        final Button btn_add_1=view.findViewById(R.id.numberout_1);//获取数字1
        final Button btn_add_2=view.findViewById(R.id.numberout_2);//获取数字2
        final Button btn_add_3=view.findViewById(R.id.numberout_3);//获取数字3
        final Button btn_add_4=view.findViewById(R.id.numberout_4);//获取数字4
        final Button btn_add_5=view.findViewById(R.id.numberout_5);//获取数字5
        final Button btn_add_6=view.findViewById(R.id.numberout_6);//获取数字6
        final Button btn_add_7=view.findViewById(R.id.numberout_7);//获取数字7
        final Button btn_add_8=view.findViewById(R.id.numberout_8);//获取数字8
        final Button btn_add_9=view.findViewById(R.id.numberout_9);//获取数字9
        final Button btn_add_0=view.findViewById(R.id.numberout_0);//获取数字0
        tx=view.findViewById(R.id.number_input);//获取到放置数字的textview
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Vibrator mvibrator=(Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                mvibrator.vibrate(10);//设置按钮震动
                btn1.setBackgroundResource(R.drawable.add_biankuang3);
                btn2.setBackgroundResource(R.drawable.add_biankuang2);
                btn3.setBackgroundResource(R.drawable.add_biankuang2);
                btn5.setBackgroundResource(R.drawable.add_biankuang2);
                btn6.setBackgroundResource(R.drawable.add_biankuang2);
                btn7.setBackgroundResource(R.drawable.add_biankuang2);
                btn8.setBackgroundResource(R.drawable.add_biankuang2);
                btn9.setBackgroundResource(R.drawable.add_biankuang2);
                btn10.setBackgroundResource(R.drawable.add_biankuang2);
                btn11.setBackgroundResource(R.drawable.add_biankuang2);
                type="工资";
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Vibrator mvibrator=(Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                mvibrator.vibrate(10);//设置按钮震动
                btn1.setBackgroundResource(R.drawable.add_biankuang2);
                btn2.setBackgroundResource(R.drawable.add_biankuang3);
                btn3.setBackgroundResource(R.drawable.add_biankuang2);
                btn5.setBackgroundResource(R.drawable.add_biankuang2);
                btn6.setBackgroundResource(R.drawable.add_biankuang2);
                btn7.setBackgroundResource(R.drawable.add_biankuang2);
                btn8.setBackgroundResource(R.drawable.add_biankuang2);
                btn9.setBackgroundResource(R.drawable.add_biankuang2);
                btn10.setBackgroundResource(R.drawable.add_biankuang2);
                btn11.setBackgroundResource(R.drawable.add_biankuang2);
                type="红包";
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Vibrator mvibrator=(Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                mvibrator.vibrate(10);//设置按钮震动
                btn1.setBackgroundResource(R.drawable.add_biankuang2);
                btn2.setBackgroundResource(R.drawable.add_biankuang2);
                btn3.setBackgroundResource(R.drawable.add_biankuang3);
                btn5.setBackgroundResource(R.drawable.add_biankuang2);
                btn6.setBackgroundResource(R.drawable.add_biankuang2);
                btn7.setBackgroundResource(R.drawable.add_biankuang2);
                btn8.setBackgroundResource(R.drawable.add_biankuang2);
                btn9.setBackgroundResource(R.drawable.add_biankuang2);
                btn10.setBackgroundResource(R.drawable.add_biankuang2);
                btn11.setBackgroundResource(R.drawable.add_biankuang2);
                type="租金";
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Vibrator mvibrator=(Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                mvibrator.vibrate(10);//设置按钮震动
                btn1.setBackgroundResource(R.drawable.add_biankuang2);
                btn2.setBackgroundResource(R.drawable.add_biankuang2);
                btn3.setBackgroundResource(R.drawable.add_biankuang2);
                btn5.setBackgroundResource(R.drawable.add_biankuang3);
                btn6.setBackgroundResource(R.drawable.add_biankuang2);
                btn7.setBackgroundResource(R.drawable.add_biankuang2);
                btn8.setBackgroundResource(R.drawable.add_biankuang2);
                btn9.setBackgroundResource(R.drawable.add_biankuang2);
                btn10.setBackgroundResource(R.drawable.add_biankuang2);
                btn11.setBackgroundResource(R.drawable.add_biankuang2);
                type="礼金";
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Vibrator mvibrator=(Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                mvibrator.vibrate(10);//设置按钮震动
                btn1.setBackgroundResource(R.drawable.add_biankuang2);
                btn2.setBackgroundResource(R.drawable.add_biankuang2);
                btn3.setBackgroundResource(R.drawable.add_biankuang2);
                btn5.setBackgroundResource(R.drawable.add_biankuang2);
                btn6.setBackgroundResource(R.drawable.add_biankuang3);
                btn7.setBackgroundResource(R.drawable.add_biankuang2);
                btn8.setBackgroundResource(R.drawable.add_biankuang2);
                btn9.setBackgroundResource(R.drawable.add_biankuang2);
                btn10.setBackgroundResource(R.drawable.add_biankuang2);
                btn11.setBackgroundResource(R.drawable.add_biankuang2);
                type="分红";
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Vibrator mvibrator=(Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                mvibrator.vibrate(10);//设置按钮震动
                btn1.setBackgroundResource(R.drawable.add_biankuang2);
                btn2.setBackgroundResource(R.drawable.add_biankuang2);
                btn3.setBackgroundResource(R.drawable.add_biankuang2);
                btn5.setBackgroundResource(R.drawable.add_biankuang2);
                btn6.setBackgroundResource(R.drawable.add_biankuang2);
                btn7.setBackgroundResource(R.drawable.add_biankuang3);
                btn8.setBackgroundResource(R.drawable.add_biankuang2);
                btn9.setBackgroundResource(R.drawable.add_biankuang2);
                btn10.setBackgroundResource(R.drawable.add_biankuang2);
                btn11.setBackgroundResource(R.drawable.add_biankuang2);
                type="理财";
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Vibrator mvibrator=(Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                mvibrator.vibrate(10);//设置按钮震动
                btn1.setBackgroundResource(R.drawable.add_biankuang2);
                btn2.setBackgroundResource(R.drawable.add_biankuang2);
                btn3.setBackgroundResource(R.drawable.add_biankuang2);
                btn5.setBackgroundResource(R.drawable.add_biankuang2);
                btn6.setBackgroundResource(R.drawable.add_biankuang2);
                btn7.setBackgroundResource(R.drawable.add_biankuang2);
                btn8.setBackgroundResource(R.drawable.add_biankuang3);
                btn9.setBackgroundResource(R.drawable.add_biankuang2);
                btn10.setBackgroundResource(R.drawable.add_biankuang2);
                btn11.setBackgroundResource(R.drawable.add_biankuang2);
                type="年终奖";
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Vibrator mvibrator=(Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                mvibrator.vibrate(10);//设置按钮震动
                btn1.setBackgroundResource(R.drawable.add_biankuang2);
                btn2.setBackgroundResource(R.drawable.add_biankuang2);
                btn3.setBackgroundResource(R.drawable.add_biankuang2);
                btn5.setBackgroundResource(R.drawable.add_biankuang2);
                btn6.setBackgroundResource(R.drawable.add_biankuang2);
                btn7.setBackgroundResource(R.drawable.add_biankuang2);
                btn8.setBackgroundResource(R.drawable.add_biankuang2);
                btn9.setBackgroundResource(R.drawable.add_biankuang3);
                btn10.setBackgroundResource(R.drawable.add_biankuang2);
                btn11.setBackgroundResource(R.drawable.add_biankuang2);
                type="其他";
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Vibrator mvibrator=(Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                mvibrator.vibrate(10);//设置按钮震动
                btn1.setBackgroundResource(R.drawable.add_biankuang2);
                btn2.setBackgroundResource(R.drawable.add_biankuang2);
                btn3.setBackgroundResource(R.drawable.add_biankuang2);
                btn5.setBackgroundResource(R.drawable.add_biankuang2);
                btn6.setBackgroundResource(R.drawable.add_biankuang2);
                btn7.setBackgroundResource(R.drawable.add_biankuang2);
                btn8.setBackgroundResource(R.drawable.add_biankuang2);
                btn9.setBackgroundResource(R.drawable.add_biankuang2);
                btn10.setBackgroundResource(R.drawable.add_biankuang3);
                btn11.setBackgroundResource(R.drawable.add_biankuang2);
                type="借入";
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Vibrator mvibrator=(Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                mvibrator.vibrate(10);//设置按钮震动
                btn1.setBackgroundResource(R.drawable.add_biankuang2);
                btn2.setBackgroundResource(R.drawable.add_biankuang2);
                btn3.setBackgroundResource(R.drawable.add_biankuang2);
                btn5.setBackgroundResource(R.drawable.add_biankuang2);
                btn6.setBackgroundResource(R.drawable.add_biankuang2);
                btn7.setBackgroundResource(R.drawable.add_biankuang2);
                btn8.setBackgroundResource(R.drawable.add_biankuang2);
                btn9.setBackgroundResource(R.drawable.add_biankuang2);
                btn10.setBackgroundResource(R.drawable.add_biankuang2);
                btn11.setBackgroundResource(R.drawable.add_biankuang3);
                type="收款";
            }
        });
        btn_add_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Vibrator mvibrator=(Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                mvibrator.vibrate(10);//设置按钮震动
                number+=btn_add_1.getText().toString();
                tx.setText(number);
            }
        });

        btn_add_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Vibrator mvibrator=(Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                mvibrator.vibrate(10);//设置按钮震动
                number+=btn_add_2.getText().toString();
                tx.setText(number);
            }
        });

        btn_add_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Vibrator mvibrator=(Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                mvibrator.vibrate(10);//设置按钮震动
                number+=btn_add_3.getText().toString();
                tx.setText(number);
            }
        });
        btn_add_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Vibrator mvibrator=(Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                mvibrator.vibrate(10);//设置按钮震动
                number+=btn_add_4.getText().toString();
                tx.setText(number);
            }
        });
        btn_add_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Vibrator mvibrator=(Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                mvibrator.vibrate(10);//设置按钮震动
                number+=btn_add_5.getText().toString();
                tx.setText(number);
            }
        });
        btn_add_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Vibrator mvibrator=(Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                mvibrator.vibrate(10);//设置按钮震动
                number+=btn_add_6.getText().toString();
                tx.setText(number);
            }
        });btn_add_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Vibrator mvibrator=(Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                mvibrator.vibrate(10);//设置按钮震动
                number+=btn_add_7.getText().toString();
                tx.setText(number);
            }
        });btn_add_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Vibrator mvibrator=(Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                mvibrator.vibrate(10);//设置按钮震动
                number+=btn_add_8.getText().toString();
                tx.setText(number);
            }
        });
        btn_add_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Vibrator mvibrator=(Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                mvibrator.vibrate(10);//设置按钮震动
                number+=btn_add_9.getText().toString();
                tx.setText(number);
            }
        });
        btn_add_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Vibrator mvibrator=(Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                mvibrator.vibrate(10);//设置按钮震动
                number+=btn_add_0.getText().toString();
                tx.setText(number);
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator mvibrator=(Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                mvibrator.vibrate(10);//设置按钮震动
                number="";
                tx.setText(number);
            }
        });
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getDate();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Vibrator mvibrator=(Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                mvibrator.vibrate(10);//设置按钮震动
                String name ="收入";//获取收入支出类型
                int money = Integer.valueOf(number);//获取money
                mx.setName(name);
                mx.setContent(ed1.getText().toString());//获取备注
                mx.setMoney(money);
                mx.setType(type);
                if (isadd==1){
                    mingxilab.get(getActivity()).getMmingxi().add(mx);
                }
                Intent intent = new Intent(getActivity(),listActivity.class);
                intent.putExtra("call","mingxi");
                startActivity(intent);
            }
        });
        return view;
    }
    public void getDate() {
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog dpd = new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int day) {
                Toast.makeText(getActivity(), year + "年： " + (month + 1) + "月： " + day + "日", Toast.LENGTH_SHORT).show();
                c.set(year,month,day);
                mx.setDate(c);
            }
        }, year, month, day);
        dpd.show();

    }
}
