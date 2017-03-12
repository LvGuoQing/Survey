package cn.edu.cqu.survey;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by lenovo on 2017/3/12.
 */

public class FifthActivity  extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifth_layout);
        Button btnedu=(Button)findViewById(R.id.btnEdu);
        btnedu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FifthActivity.this,SixthActivity.class);
                startActivity(intent);
            }
        });
    }
}
