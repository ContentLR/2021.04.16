package com.example.register;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        // 初始化控件对象
        Button mBtMainLogout = findViewById(R.id.bt_main_logout);
        // 绑定点击监听器
        mBtMainLogout.setOnClickListener(this);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.bt_main_logout) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
        }
    }


}
