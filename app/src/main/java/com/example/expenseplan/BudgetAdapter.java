package com.example.expenseplan;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BudgetAdapter extends RecyclerView.Adapter<BudgetAdapter.BudgetViewHolder> {
    private List<BudgetItem> budgetItems;
    public class BudgetViewHolder extends RecyclerView.ViewHolder {
        public TextView tvPrice, tvItem, tvType;

        public BudgetViewHolder(@NonNull View itemView) {
            super(itemView);
            tvPrice = itemView.findViewById(R.id.tv_price);
            tvItem = itemView.findViewById(R.id.tv_item);
            tvType = itemView.findViewById(R.id.tv_type);
        }
    }
    public BudgetAdapter(List<BudgetItem> budgetItems) {
        this.budgetItems = budgetItems;
    }

    @NonNull
    @Override
    public BudgetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_budget, parent, false);
        return new BudgetViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BudgetViewHolder holder, int position) {
        BudgetItem item = budgetItems.get(position);
        holder.tvPrice.setText(String.format("$%.2f", item.getPrice()));
        holder.tvItem.setText(item.getItem());
        holder.tvType.setText(item.getType());
    }

    @Override
    public int getItemCount() {
        return budgetItems.size();
    }
}