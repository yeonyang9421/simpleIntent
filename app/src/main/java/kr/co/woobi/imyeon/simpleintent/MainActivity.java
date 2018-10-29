package kr.co.woobi.imyeon.simpleintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1, button2, button3;
        button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                Intent intent1=new Intent(this, FirstActivity.class);
                startActivity(intent1);
                break;
            case R.id.button2:
                Intent intent2=new Intent(this, SecondActivity.class);
                startActivity(intent2);
                break;
            case R.id.button3:
                Intent intent3=new Intent(this, ThirdActivity.class);
                startActivity(intent3);
                break;
        }
    }
}
