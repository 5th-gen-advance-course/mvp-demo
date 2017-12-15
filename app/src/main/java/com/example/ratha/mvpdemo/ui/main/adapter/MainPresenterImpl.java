package com.example.ratha.mvpdemo.ui.main.adapter;

import com.example.ratha.mvpdemo.ui.entity.Category;
import com.example.ratha.mvpdemo.ui.main.Presenter;

import java.util.List;

/**
 * Created by ratha on 12/15/2017.
 */

public class MainPresenterImpl implements Presenter.MainPresenter{

    private Presenter.View view;

    public MainPresenterImpl(Presenter.View view){
        this.view=view;
    }

    @Override
    public List<Category> getCategories() {
        //get data from interactor
        return null;
    }

    @Override
    public void onDestroyView() {
        if(this.view!=null) this.view=null;
    }
}
