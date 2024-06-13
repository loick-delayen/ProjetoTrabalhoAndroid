package com.example.projetotrabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class HomeActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        ImageView image1 = findViewById(R.id.image1);
        ImageView image2 = findViewById(R.id.image2);
        ImageView image3 = findViewById(R.id.image3);
        ImageView image4 = findViewById(R.id.image4);
        ImageView image5 = findViewById(R.id.image5);
        ImageView image6 = findViewById(R.id.image6);

        image1.setOnClickListener(v -> openProductDetails("Camisa Retrô 1993 Vitória", "R$ 399,90", R.drawable.camisa_retro_vitoria_ba_1993_17_1_562d176a7b59df9ba3682b603131c1f2));
        image2.setOnClickListener(v -> openProductDetails("Camisa Retrô 1999 Vitória", "R$ 349,90", R.drawable.camisa_vitoria_retro_1999_435_1_20200806182441));
        image3.setOnClickListener(v -> openProductDetails("Camisa Retrô 1997 Vitória", "R$ 499,90", R.drawable.camisa_retro_vitoria_ba_1997_amarela_1449_1_57782d9580622d402262e18a5de14746));
        image4.setOnClickListener(v -> openProductDetails("Camisa Raizes 2013 Vitória", "R$ 799,90", R.drawable.raizvitoria_penalty_190720130092));
        image5.setOnClickListener(v -> openProductDetails("Camisa 2024 Vitória", "R$ 249,90", R.drawable.camisavit24));
        image6.setOnClickListener(v -> openProductDetails("Camisa 2023 Vitória", "R$ 199,90", R.drawable.camisavit23));
    }

    private void openProductDetails(String productName, String productPrice, int imageResource) {
        Intent intent = new Intent(HomeActivity2.this, ProductDetailsActivity.class);
        intent.putExtra("PRODUCT_NAME", productName);
        intent.putExtra("PRODUCT_PRICE", productPrice);
        intent.putExtra("IMAGE_RESOURCE", imageResource);
        startActivity(intent);
    }
}
