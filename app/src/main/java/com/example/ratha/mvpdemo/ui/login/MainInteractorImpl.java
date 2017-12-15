package com.example.ratha.mvpdemo.ui.login;

import com.example.ratha.mvpdemo.ui.entity.Category;
import com.example.ratha.mvpdemo.ui.main.MainInteractor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ratha on 12/15/2017.
 */

public class MainInteractorImpl implements MainInteractor {
    @Override
    public List<Category> getCategories(OnMainInteractorListener listener) {
        //get data from network or repositoryl
        List<Category> list=getCategories();
        if(list==null) listener.onGetCategoryError();
        else listener.onGetCategorySuccess();
        return null;
    }

    List<Category> getCategories(){
        List<Category> list=new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(new Category());
        }
        return list;
    }


}
