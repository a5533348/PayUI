package cn.xdeveloper.payui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements PayFragment.PayCallBackListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_pay).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PayFragment fragment = new PayFragment();
                fragment.setPaySuccessCallBack(MainActivity.this);
                fragment.show(getSupportFragmentManager(), "Pay");
            }
        });
    }

    @Override
    public void onSuccess(String pwd) {

    }
}
