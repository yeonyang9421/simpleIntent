package kr.co.woobi.imyeon.simpleintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button buttonThird;
        buttonThird=(Button)findViewById(R.id.buttonThird);
        buttonThird.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
