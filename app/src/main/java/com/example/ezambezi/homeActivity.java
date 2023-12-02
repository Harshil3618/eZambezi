package com.example.ezambezi;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class homeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Sample data (replace with your actual data)
        ArrayList<Product> productList = createProductList();

        // RecyclerView setup
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        ProductAdapter adapter = new ProductAdapter(productList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private ArrayList<Product> createProductList() {
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(new Product("ASUS Laptop L510 Ultra Thin", "Standing screen display size. 15.6 Inches Display Resolution 1920 x 1080 pixels Max screen resolution 1920 x 1080 pixels", R.drawable.image_1));
        productList.add(new Product("HP Chromebook 14-inch", "IPS Full HD FHD (1920x1080) Business Laptop (Intel Core i5-6300U, 16GB DDR4 RAM, 256GB PCIe NVM)", R.drawable.image_2));
        productList.add(new Product("Dell Inspiron 7630 Laptop", "15.6 inch HD NanoEdge bezel display with stunning 83% screen-to-body ratio, Powerful Intel Silver N5030 Processor 1.1GHz", R.drawable.image_3));
        // Add more products as needed
        return productList;
    }
}
