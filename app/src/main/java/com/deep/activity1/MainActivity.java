package com.deep.activity1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.id.message;

public class MainActivity extends AppCompatActivity {

    EditText eUName,ePass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eUName = (EditText) findViewById(R.id.editText);
        ePass = (EditText) findViewById(R.id.editText2);
        //System.out.println("ActivityOne - onCreate");
        Log.i("MainActivity","--onCreate--");
        Toast.makeText(this,"MainActivity - onCreate",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        //System.out.println("ActivityOne - onStart");
        Log.i("MainActivity","--onStart--");
        Toast.makeText(this,"MainActivity - onStart",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //System.out.println("ActivityOne - onResume");
        Log.i("MainActivity","--onResume--");
        Toast.makeText(this,"MainActivity - onResume",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //System.out.println("ActivityOne - onPause");
        Log.i("MainActivity","--onPause--");
        Toast.makeText(this,"MainActivity - onPause",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        //System.out.println("ActivityOne - onStop");
        Log.i("MainActivity","--onStop--");
        Toast.makeText(this,"MainActivity - onStop",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //System.out.println("ActivityOne - onDestroy");
        Log.i("MainActivity","--onDestroy--");
        Toast.makeText(this,"MainActivity - onDestroy",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        //System.out.println("ActivityOne - onRestart");
        Log.i("MainActivity","--onRestart--");
        Toast.makeText(this,"MainActivity - onRestart",Toast.LENGTH_LONG).show();
    }

    public void clickHandler(View view) {

        String uname = eUName.getText().toString().trim();
        String pass = ePass.getText().toString().trim();


/* 2. Forward Pass - Bundle
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
       intent.putExtra("keyName", uname);
        intent.putExtra("keyPhone",pass);
        //intent.putExtra("keyAge",20);
        startActivity(intent);*/

        // 2. Forward Pass - Bundle
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);

        Bundle bundle = new Bundle();
        bundle.putString("keyName",uname);
        bundle.putString("keyPhone",pass);
      //  bundle.putInt("keyAge",25);

        intent.putExtra("keyBundle",bundle);


        startActivity(intent);





    }





// 1. Forward Pass - Direct
       // Intent intent = new Intent(ActivityOne.this,ActivityTwo.class);
//        intent.putExtra("keyName",name);
//        intent.putExtra("keyPhone",phone);
//        intent.putExtra("keyAge",20);
//        startActivity(intent);

    }
