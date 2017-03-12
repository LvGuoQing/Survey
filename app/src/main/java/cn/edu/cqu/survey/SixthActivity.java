package cn.edu.cqu.survey;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by lenovo on 2017/3/12.
 */

public class SixthActivity extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sixth_layout);
        Button btnHur=(Button)findViewById(R.id.btnHour);
        btnHur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SixthActivity.this,SeventhActivity.class);
                startActivity(intent);
            }
        });
    }
}
