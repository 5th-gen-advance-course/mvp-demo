package com.example.ratha.mvpdemo.ui.login;

/**
 * Created by ratha on 12/14/2017.
 */

public interface LoginInteractor {

    interface OnLoginListener{
        void onUserNameError();
        void onPasswordError();
        void onSuccess();
    }

    //Model can access to memory or remote repo ...
    void login(String name,String password ,OnLoginListener listener);

}
