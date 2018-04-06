package edu.hrbeu.ice.wechat;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

public class Login extends AppCompatActivity {

    private LinearLayout Login_title_lin;
    private LinearLayout Login_login_lin;
    private LinearLayout Login_sign_lin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();

    }
    private void initView(){
        Login_title_lin = (LinearLayout)findViewById(R.id.Login_title_lin);
        Login_login_lin = (LinearLayout)findViewById(R.id.Login_login_lin);
        Login_sign_lin = (LinearLayout)findViewById(R.id.Login_sign_lin);
        Login_title_lin.setBackgroundColor(Color.BLACK);
        Login_login_lin.setBackgroundColor(Color.GREEN);
        Login_sign_lin.setBackgroundColor(Color.GREEN);
    }
}
