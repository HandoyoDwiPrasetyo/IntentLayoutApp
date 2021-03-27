package com.belajar.andro.intentlayoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveActivityLogin = findViewById(R.id.btn_move_activity);
        btnMoveActivityLogin.setOnClickListener(this);

        Button btnMoveActivityLayout = findViewById(R.id.btn_move_layout);
        btnMoveActivityLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_move_activity){
            Intent moveIntent = new Intent(MainActivity.this, FormLoginActivity.class);
            startActivity(moveIntent);
        } else if (v.getId() == R.id.btn_move_layout){
            Intent moveIntent = new Intent(MainActivity.this, LayoutActivity.class);
            startActivity(moveIntent);
        }
    }
}
