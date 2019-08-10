package com.example.myevents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnlogin,btnregister,btnevent,btnprofile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btnevent = findViewById(R.id.buttonEvents);
        btnevent.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                openAdduser();
            }
        });

        btnlogin = findViewById(R.id.buttonLogin);
        btnlogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                openLogin();
            }
        });
        btnregister = findViewById(R.id.buttonRegister);
        btnregister.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                openRegister();
            }
        });
        btnprofile = findViewById(R.id.buttonAbout_us1);
        btnprofile.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                openProfile();
            }
        });

    }

    public void openAdduser() {

        Intent intent = new Intent(this,add_user_details.class);
        startActivity(intent);

    }
    public void openLogin() {

        Intent intent = new Intent(this,login.class);
        startActivity(intent);

    }

    public void openRegister() {

        Intent intent = new Intent(this,register.class);
        startActivity(intent);

    }

    public void openProfile() {

        Intent intent = new Intent(this,userProfile.class);
        startActivity(intent);

    }
}
