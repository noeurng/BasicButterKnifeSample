package com.noeurng.butterknifesample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTextChanged;

public class MainActivity extends Activity {

    @BindView(R.id.editTextEmail)
    EditText editTextEmail;

    @BindView(R.id.editTextPassword)
    EditText editTextPassword;

    @BindString(R.string.app_name)
    String appName;

    @OnClick(R.id.button)
    void submit() {
        Toast.makeText(this, appName + "> Button Login Clicked!!", Toast.LENGTH_SHORT).show();
    }

    @OnTextChanged(R.id.editTextEmail)
    void emailTextChange() {
        Toast.makeText(this, appName + "> Email: " + editTextEmail.getText(), Toast.LENGTH_SHORT).show();
    }

    @OnTextChanged(R.id.editTextPassword)
    void passwordTextChange() {
        Toast.makeText(this, appName + "> Password: " + editTextPassword.getText(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }



}
