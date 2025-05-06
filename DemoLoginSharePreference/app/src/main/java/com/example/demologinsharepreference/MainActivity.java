package com.example.demologinsharepreference;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    CheckBox rememberMe;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        init();
        checkLogin();
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//Toast.makeText(MainActivity.this,username.getText().toString().equals("admin") + "",Toast.LENGTH_SHORT).show();
                if(username.getText().toString().equals("admin") &&
                        password.getText().toString().equals("123456"))
                {
                    if (rememberMe.isChecked())
                    {
                        SharedPreferences sharedPreferences = getSharedPreferences("login_check",MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("login","true");
                        editor.apply();
                    }

                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity.this,"Vui lòng nhập lại mật khẩu",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void checkLogin()
    {
        SharedPreferences sharedPreferences = getSharedPreferences("login_check",MODE_PRIVATE);
        String login = sharedPreferences.getString("login","");
        if(login.equals("true"))
        {
            Intent intent = new
                    Intent(MainActivity.this,MainActivity2.class);
            startActivity(intent);
        }

    }
    private void init(){
        username = findViewById(R.id.username_input);
        password = findViewById(R.id.password_input);
        btnLogin = findViewById(R.id.login_btn);
        rememberMe = findViewById(R.id.rememberMe);
    }
}