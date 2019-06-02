package com.example.count;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.textView);
        //最初に０を表示
        text.setText("0");
    }

    public void add(View v){
        //ボタンを押すごとに１ずつ増えていく
        number = number + 1;
        // 数字をストリング型に変換して、テキストを表示させる
        text.setText(String.valueOf(number));


    }

    public void minus(View v){

        number = number -1;
        text.setText(String.valueOf(number));
    }

    public void reset (View v ){

         number = number * 0;
         text.setText(String.valueOf(number));
    }
}
