package com.deep.activity1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView txtview;


    @Override
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

      txtview = (TextView)findViewById(R.id.textView);

        Intent rcv = getIntent();
       // String name = rcv.getStringExtra("keyName");
        //String phone = rcv.getStringExtra("keyPhone");
        //int age = rcv.getIntExtra("keyAge",0)
        //txtview.setText(name);

        // 2. Forward Pass - Bundle
        Bundle bundle = rcv.getBundleExtra("keyBundle");
        String name = bundle.getString("keyName");
        String pass = bundle.getString("keyPhone");
       // int age = bundle.getInt("keyAge");
        txtview.setText(name +"\n"+  pass);

    }
}
