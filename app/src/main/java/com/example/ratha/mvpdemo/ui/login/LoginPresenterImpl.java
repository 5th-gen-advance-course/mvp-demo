package com.example.ratha.mvpdemo.ui.login;

/**
 * Created by ratha on 12/15/2017.
 */

public class LoginPresenterImpl implements Presenter.LoginPresenter
, LoginInteractor.OnLoginListener{
    private Presenter.LoginView loginView;
    private LoginInteractor interactor;

    public LoginPresenterImpl(Presenter.LoginView loginView){
        this.loginView=loginView;
        this.interactor=new LoginInteractorImpl();
    }
    @Override
    public void validateCredentials(String name, String password) {
        if(this.loginView!=null) loginView.onShowPrecess();
        interactor.login(name,password,this);
    }

    @Override
    public void onDestroy() {
        if(loginView!=null) loginView=null;
    }


    @Override
    public void onUserNameError() {
        if (loginView!=null) {
            loginView.onUserNameError();
            loginView.onHidePrecess();
        }
    }

    @Override
    public void onPasswordError() {
        if(loginView!=null) {
            loginView.onPasswordError();
            loginView.onHidePrecess();
        }
    }

    @Override
    public void onSuccess() {
        if(loginView!=null) loginView.onNavigateToHome();
    }
}
