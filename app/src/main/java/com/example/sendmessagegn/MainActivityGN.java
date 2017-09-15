package com.example.sendmessagegn;

/**
 * Created by Administrator on 2017/9/15.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivityGN extends AppCompatActivity {
    Button button;
    String name;
    int age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent1 = getIntent();
        name = intent1.getStringExtra("name");
        age = intent1.getIntExtra("age",1);
        Toast.makeText(this,name+age,Toast.LENGTH_LONG).show();

        button = (Button)findViewById(R.id.bt2);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivityGN.this,MainActivity.class);
                        intent.putExtra("result","姓名："+name+"年龄："+age);
                        setResult(0,intent);
                        finish();
                        //startActivity(intent);
                    }
                }
        );
    }
}

