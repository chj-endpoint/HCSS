package com.chx.hcss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        Intent intentEdit = getIntent();
        long id = intentEdit.getLongExtra("id", 0);
//        TextView tv = findViewById(R.id.title);
//        tv.setText(Long.toString(id));
    }
}
