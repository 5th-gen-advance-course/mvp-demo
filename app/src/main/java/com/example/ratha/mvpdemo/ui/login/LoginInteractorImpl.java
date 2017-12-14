package com.example.ratha.mvpdemo.ui.login;

import android.os.Handler;
import android.text.TextUtils;

import org.w3c.dom.Text;

/**
 * Created by ratha on 12/15/2017.
 */

public class LoginInteractorImpl implements LoginInteractor {

    // get data ready you have interactor call back to presenter
    @Override
    public void login(final String name, final String password, final OnLoginListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(TextUtils.isEmpty(name)){
                    listener.onUserNameError();
                }else if(TextUtils.isEmpty(password)){
                    listener.onPasswordError();
                }else{
                    listener.onSuccess();
                }
            }
        }, 2000);
    }
}
