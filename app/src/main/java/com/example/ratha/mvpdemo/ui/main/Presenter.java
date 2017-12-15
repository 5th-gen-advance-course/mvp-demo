package com.example.ratha.mvpdemo.ui.main;

import com.example.ratha.mvpdemo.ui.entity.Category;

import java.util.List;

/**
 * Created by ratha on 12/15/2017.
 */

public interface Presenter {

    interface View{

        void showProgressBar();
        void HideProgressBar();
        void onGetMainCategoryError();
        void onGetMainCategorySuccess();
    }

    interface MainPresenter{
        List<Category> getCategories();
        void onDestroyView();
    }
}
