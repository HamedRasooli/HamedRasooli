package com.example.testtwo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class paper2 extends AppCompatActivity {
    Button button;
    TextView textView1;
    TextView textView2;

    EditText inputdata = findViewById(R.id.et_text1);
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paper2);
        button= findViewById(R.id.btn_save);

        textView2=findViewById(R.id.txt_family);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Date = inputdata.getText().toString();
                Intent intent = new Intent(paper2.this , Activty_There.class);
                intent.putExtras("profile".KEY_DATA , Date);
                startActivity(intent);
            }
        });


    }
}
