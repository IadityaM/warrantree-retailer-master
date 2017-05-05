package com.android.test.warrantree_retailer;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    Button btLogin, btGoToSignup, btOTP;
    EditText etmobnum, etOTP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etmobnum = (EditText) findViewById(R.id.login_mobnum);
        etOTP = (EditText) findViewById(R.id.login_otp);

        btOTP = (Button) findViewById(R.id.btSendOTP);
        btLogin = (Button) findViewById(R.id.btLogin);
        btGoToSignup = (Button) findViewById(R.id.btGoToSign);

        btOTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btLogin.setVisibility(View.VISIBLE);
                etOTP.setVisibility(View.VISIBLE);
                btOTP.setVisibility(View.GONE);
                etmobnum.getText();
                disableEditText(etmobnum);
            }
        });
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(LoginActivity.this,MainActivity.class));
                startActivity(new Intent(LoginActivity.this, Home.class));
            }
        });
        btGoToSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,SignUpActivity.class));

            }
        });

    }

    //To Disable a TextView
    public void disableEditText(EditText et){
        et.setFocusable(false);
        et.setEnabled(false);
    }

    //To Enable a TextView
    public void enableEditText(EditText et){
        et.setFocusable(true);
        et.setEnabled(true);
    }
}
