package com.example.hm6;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.location.GnssAntennaInfo;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText emailText = findViewById(R.id.email);
        EditText passwordText = findViewById(R.id.password);
        Button button = findViewById(R.id.btn);
        LinearLayout linearLayout = findViewById(R.id.container);
        TextView textView = findViewById(R.id.inputText);
        TextView textView1 = findViewById(R.id.text);


        emailText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (!TextUtils.isEmpty(charSequence)) {
                    button.setBackgroundColor(getColor(R.color.orange));
                } else {
                    button.setBackgroundColor(getColor(R.color.gray));
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });



        button.setOnClickListener(view -> {
            if (emailText.getText().toString().equals("admin") && passwordText.getText().toString().equals("admin")) {
                linearLayout.setVisibility(View.GONE);
                textView.setVisibility(View.GONE);
                textView1.setVisibility(View.GONE);
                Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(MainActivity.this, "Неправильный логин или пароль", Toast.LENGTH_SHORT).show();
            }
        });


    }


}
