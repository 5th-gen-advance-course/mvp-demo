package com.example.ratha.mvpdemo.ui.main;

import com.example.ratha.mvpdemo.ui.entity.Category;

import java.util.Calendar;
import java.util.List;

/**
 * Created by ratha on 12/15/2017.
 */

public interface MainInteractor{

    interface OnMainInteractorListener{
        void onGetCategorySuccess();
        void onGetCategoryError();
        void onSuccess();
    }

    List<Category> getCategories(OnMainInteractorListener listener);


}
