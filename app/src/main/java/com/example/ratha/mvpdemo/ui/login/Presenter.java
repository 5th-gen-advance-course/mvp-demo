package com.example.ratha.mvpdemo.ui.login;

/**
 * Created by ratha on 12/14/2017.
 */

public interface Presenter {

    interface LoginView{
        void onUserNameError();
        void onPasswordError();
        void onShowPrecess();
        void onHidePrecess();
        void onNavigateToHome();
    }

    interface LoginPresenter{
        void validateCredentials(String name,String password);
        void onDestroy();
    }

}
