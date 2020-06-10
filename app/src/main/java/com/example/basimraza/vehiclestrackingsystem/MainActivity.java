package com.example.basimraza.vehiclestrackingsystem;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private TextInputLayout phoneet, passwordet;
    private String phone, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phoneet = (TextInputLayout) findViewById(R.id.phone);
        passwordet = (TextInputLayout) findViewById(R.id.pass);
        Button loginbtn = (Button) findViewById(R.id.login);

      loginbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!validationPhone() | !validationPass()) {
                        return;
                    }
                    if (phone.equalsIgnoreCase("123") && password.equalsIgnoreCase("123456789")){
                        Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                        startActivity(intent);
                    } else{
                        Intent intent = new Intent(MainActivity.this, Menu.class);
                        startActivity(intent);
                    }
                }
            });
    }

    private boolean validationPhone(){
        phone = phoneet.getEditText().getText().toString();

        if (phone.isEmpty()){
            phoneet.setError("Field can't be empty.");
            return false;
        }
        else {
            phoneet.setError(null);
            return true;
        }
    }

    private boolean validationPass(){
        password = passwordet.getEditText().getText().toString();

        if (password.isEmpty()){
            passwordet.setError("Field can't be empty.");
            return false;
        }
        else if (password.length() < 8){
            passwordet.setError("Password too short.");
            return false;
        }
        else{
            passwordet.setError(null);
            return true;
        }
    }
}
