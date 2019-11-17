package com.pimjubmai.finalexam0757504;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class activity_register extends AppCompatActivity {
    private Button button;
    DatabaseHelper db;
    EditText e1,e2,e3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        e1 = (EditText) findViewById(R.id.full_name_edit_text);
        e2 = (EditText) findViewById(R.id.username_edit_text);
        e3 = (EditText) findViewById(R.id.password_edit_text);

        button = (Button) findViewById(R.id.register_button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                String s3 = e3.getText().toString();
                activity_register();
            }
        });
    }

    public void  activity_register(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

        Toast t = Toast.makeText(this,"Register successfully",Toast.LENGTH_LONG);
        t.show();
    }




}
