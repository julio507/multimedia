package com.example.multimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonView1 = null;
    private Button buttonView2 = null;
    private Button buttonClose = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonView1 = findViewById(R.id.button_view1);
        buttonView2 = findViewById(R.id.button_view2);
        buttonClose = findViewById(R.id.button_close);

        buttonView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, View1Activity.class);
                intent.setAction( Intent.ACTION_VIEW );

                startActivity( intent );
            }
        });

        buttonView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, View2Activity.class);
                intent.setAction( Intent.ACTION_VIEW );

                startActivity( intent );
            }
        });

        buttonClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}