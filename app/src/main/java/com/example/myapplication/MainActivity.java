package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private String text = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText email = (EditText)findViewById(R.id.editTextTextEmailAddress);
        email.addTextChangedListener(new TextWatcher(){
            @Override
            public void beforeTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                text = email.getText().toString();
                for (int i = 0; i < text.length(); i++){
                    if (text.charAt(i) == '@'){
                        email.setTextColor(Color.BLACK);
                        for (int j = 0; j < text.length(); j++){
                            if (text.charAt(j) == '.'){
                                email.setTextColor(Color.GREEN);
                            }
                        }
                    }
                }
            }

        });

        EditText phone = (EditText)findViewById(R.id.editTextNumber);
        phone.addTextChangedListener(new TextWatcher(){
            @Override
            public void beforeTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                text = phone.getText().toString();
                for (int i = 0; i < text.length(); i++){
                            if (text.length() == 11){
                                phone.setTextColor(Color.RED);
                            }else {
                                phone.setTextColor(Color.BLACK);
                            }
                        }
                }

        });

        EditText pass = (EditText)findViewById(R.id.editTextTextPassword);
        pass.addTextChangedListener(new TextWatcher(){
            @Override
            public void beforeTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                text = pass.getText().toString();
                for (int i = 0; i < text.length(); i++){
                    if (text.length() == 8){
                        pass.setTextColor(Color.BLACK);
                    }else {
                        pass.setTextColor(Color.RED);
                    }
                }
            }
        });

        EditText pass1 = (EditText)findViewById(R.id.editTextTextPassword2);
        pass1.addTextChangedListener(new TextWatcher(){
            @Override
            public void beforeTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                text = pass1.getText().toString();
                for (int i = 0; i < text.length(); i++){
                    if(pass1.equals(pass)){
                        pass1.setTextColor(Color.GREEN);
                    }else{
                        pass1.setTextColor(Color.RED);
                    }
                }
            }
        });
    }
}