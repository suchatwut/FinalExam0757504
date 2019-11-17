package com.pimjubmai.finalexam0757504;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.full_name_edit_text);
        e2 = (EditText) findViewById(R.id.username_edit_text);

        button2 = (Button) findViewById(R.id.login_button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            clicklogin();
            }
        });

        button1 = (Button) findViewById(R.id.register_button);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                activity_register();
            }
        });
    }


    public void  activity_register(){
        Intent intent = new Intent(this,activity_register.class);
        startActivity(intent);
    }
    public void clicklogin(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        Toast t = Toast.makeText(this,"All fields are required",Toast.LENGTH_LONG);
        t.show();


    }
}
