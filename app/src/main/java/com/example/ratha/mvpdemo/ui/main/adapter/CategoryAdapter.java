package com.example.ratha.mvpdemo.ui.main.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ratha.mvpdemo.R;
import com.example.ratha.mvpdemo.ui.entity.Category;

import java.util.List;

/**
 * Created by ratha on 12/15/2017.
 */

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder>{

    List<Category> categories;
    Context context;
    public CategoryAdapter(Context context,List<Category> categories){
        this.categories=categories;
        this.context=context;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.category_item_recycler,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvTitle,tvPhone,tvUrl;
        ImageView catImage;

        public ViewHolder(View itemView) {
            super(itemView);
            tvTitle=itemView.findViewById(R.id.catTitle);
            tvPhone=itemView.findViewById(R.id.catPhone);
            tvUrl=itemView.findViewById(R.id.catUrl);
            catImage=itemView.findViewById(R.id.catImage);
        }

    }
}
