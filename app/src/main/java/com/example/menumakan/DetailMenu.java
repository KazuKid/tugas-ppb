package com.example.menumakan;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailMenu extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        ImageView imgMenu = findViewById(R.id.imgMenu);
        TextView tvNamaMenu = findViewById(R.id.tvNamaMenu);
        TextView tvMenuDetail = findViewById((R.id.tvMenuDetail));

        Menu menu = getIntent().getParcelableExtra(ITEM_EXTRA);
        if (menu != null){
            Glide.with(this)
                    .load(menu.getPhoto())
                    .into(imgMenu);
            tvNamaMenu.setText(menu.getName());
            tvMenuDetail.setText(menu.getDetail());
        }

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Detail Menu");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}