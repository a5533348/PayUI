package cn.xdeveloper.payui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PayPwdView.InputCallBack, View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_pay).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_pay:
                Bundle bundle = new Bundle();
                bundle.putString(PayFragment.EXTRA_CONTENT, "提现：¥ " + 100.00);

                PayFragment fragment = new PayFragment();
                fragment.setArguments(bundle);
                fragment.setPaySuccessCallBack(MainActivity.this);
                fragment.show(getSupportFragmentManager(), "Pay");
                break;
        }
    }

    @Override
    public void onInputFinish(String result) {
        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
    }
}
