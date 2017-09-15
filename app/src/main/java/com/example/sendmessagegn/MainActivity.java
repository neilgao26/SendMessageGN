package com.example.sendmessagegn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.bt1);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this,MainActivityGN.class);
                        intent.putExtra("name","张三");
                        intent.putExtra("age",20);
                        startActivityForResult(intent,0);
                    }
                }
        );

    }

    protected void onActivityResult(int requestCode,int resultCode,Intent data){

        super.onActivityResult(requestCode,resultCode,data);

        if(requestCode==0&&resultCode==0){
            String s = data.getStringExtra("result");
            Toast.makeText(this,s,Toast.LENGTH_LONG).show();
        }

    }

}
