package com.example.homeworkguidemem421;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    // создание полей
    private ImageButton imageButton3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // присваевание id полям
        imageButton3 = findViewById(R.id.imageButton3);

        // обработка нажатия на кнопки
        imageButton3.setOnClickListener(listener);
    }

    // создадим слушателя кнопки нажатия
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            // переключение на новую активность
            Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
            startActivity(intent);
        }
    };
}