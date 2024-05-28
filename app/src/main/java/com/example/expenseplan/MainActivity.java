package com.example.tontineapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.expenseplan.BudgetAdapter;
import com.example.expenseplan.BudgetItem;
import com.example.expenseplan.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        // Get the Recycler View
        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        // Set the layout manager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Create the budget items
        List<BudgetItem> budgetItems = new ArrayList<>();
        budgetItems.add(new BudgetItem(10.99, "Groceries", "Food"));
        budgetItems.add(new BudgetItem(25.50, "Rent", "Housing"));
        budgetItems.add(new BudgetItem(45.00, "Electricity", "Utilities"));

        // Create the adapter and set it on the Recycler View
        BudgetAdapter adapter = new BudgetAdapter(budgetItems);
        recyclerView.setAdapter(adapter);
    }
}