package com.example.ratha.mvpdemo.ui.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.example.ratha.mvpdemo.R;
import com.example.ratha.mvpdemo.ui.main.MainActivity;

public class LoginActivity extends AppCompatActivity implements
Presenter.LoginView{

    private EditText etName,etPassword;
    private ProgressBar progressBar;

    private Presenter.LoginPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etName=findViewById(R.id.etUserName);
        etPassword=findViewById(R.id.etPassword);
        progressBar=findViewById(R.id.progressBar);

        //inject presenter object
        presenter =new LoginPresenterImpl(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }

    public void onLogin(View view) {
        presenter.validateCredentials(etName.getText().toString(),
                etPassword.getText().toString());
    }

    @Override
    public void onUserNameError() {
        etName.setError("User name Cannot be empty");
    }

    @Override
    public void onPasswordError() {
        etPassword.setError("password cannot be empty");
    }

    @Override
    public void onShowPrecess() {
        progressBar.setVisibility(ProgressBar.VISIBLE);
    }

    @Override
    public void onHidePrecess() {
        progressBar.setVisibility(ProgressBar.INVISIBLE);
    }

    @Override
    public void onNavigateToHome() {
        Intent intent =new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_FORWARD_RESULT| Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }
}
