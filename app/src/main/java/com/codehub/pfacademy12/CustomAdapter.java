package com.codehub.pfacademy12;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

public class CustomAdapter extends ListAdapter<Object,RecViewHolder> {

    private ItemClickListener listener;

    protected CustomAdapter(@NonNull ItemClickListener diffCallback) {
        super(new DiffItemCallbackClass<Object>());
    }

    @NonNull
    @Override
    public RecViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.holder_item_row, parent, false);
        return new RecViewHolder(view, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull RecViewHolder holder, int position) {
        holder.present(getItem(position));

    }
}
