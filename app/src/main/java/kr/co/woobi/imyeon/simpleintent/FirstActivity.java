package kr.co.woobi.imyeon.simpleintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button buttonFirst, buttonMain;
        buttonFirst=(Button)findViewById(R.id.buttonFirst);
        buttonMain=(Button)findViewById(R.id.buttonMain);
        buttonFirst.setOnClickListener(this);
        buttonMain.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.buttonFirst) {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        }else{
            Intent intent2= new Intent(this, MainActivity.class);
            startActivity(intent2);
        }
    }
}
