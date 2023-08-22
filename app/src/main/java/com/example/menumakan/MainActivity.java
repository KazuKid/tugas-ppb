package com.example.menumakan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMenu;
    private final ArrayList<Menu> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMenu = findViewById(R.id.rv_menu);
        rvMenu.setHasFixedSize(true);

        list.addAll(MenuData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvMenu.setLayoutManager(new LinearLayoutManager(this));
        ListMenuAdaptor listMenuAdaptor = new ListMenuAdaptor(list);
        rvMenu.setAdapter(listMenuAdaptor);

        listMenuAdaptor.setOnItemClickCallback(new ListMenuAdaptor.OnItemClickCallback() {
            @Override
            public void onItemClicked(Menu menu) {

                Intent moveIntent = new Intent(MainActivity.this,DetailMenu.class);
                moveIntent.putExtra(DetailMenu.ITEM_EXTRA, menu);
                startActivity(moveIntent);
            }
        });

    }


}