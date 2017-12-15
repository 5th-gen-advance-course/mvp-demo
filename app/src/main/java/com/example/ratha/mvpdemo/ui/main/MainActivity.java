package com.example.ratha.mvpdemo.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.ratha.mvpdemo.R;
import com.example.ratha.mvpdemo.ui.entity.Category;
import com.example.ratha.mvpdemo.ui.main.adapter.CategoryAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements Presenter.View{

    private RecyclerView recyclerView;
    private CategoryAdapter categoryAdapter;
    private ProgressBar progressBar;
    List<Category> categories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.categoryRecycler);
        progressBar=findViewById(R.id.progressBar);

        setUpCategoryRecycler();
        updateCategory();
    }

    private void updateCategory() {

    }

    private void setUpCategoryRecycler() {
        categoryAdapter= new CategoryAdapter(this,categories);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(categoryAdapter);
    }

    @Override
    public void showProgressBar() {
        progressBar.setVisibility(ProgressBar.VISIBLE);
    }

    @Override
    public void HideProgressBar() {
        progressBar.setVisibility(ProgressBar.INVISIBLE);
    }

    @Override
    public void onGetMainCategoryError() {
        Toast.makeText(this,"have an error while carry data from network",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onGetMainCategorySuccess() {
        Toast.makeText(this,"get success",Toast.LENGTH_SHORT).show();
    }
}
