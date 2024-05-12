package com.example.testtwo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activty_There extends AppCompatActivity

{
    public static final String KEY_DATA ="inputdata";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.gradler_there);
        TextView textView = findViewById(R.id.txt_there2);
        Bundle bundle  = getIntent().getExtras();
        emmty_paper emmtyPaper = (emmty_paper) bundle.get("profile");

        Intent intent = getIntent();intent.putExtras().getSring(KEY_DATA);


        if (bundle != null)
        {
            textView.setText(bundle.getString(KEY_DATA));
        }

    }
}
