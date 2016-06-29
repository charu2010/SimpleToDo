package com.codepath.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    int itempos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        String itemDetails = getIntent().getStringExtra("value");
        itempos        = getIntent().getIntExtra("position",0);
        EditText etItem = (EditText) findViewById(R.id.editText);
        etItem.setText(itemDetails);
    }


    public void onUpdateItem(View V) {
        EditText etItem = (EditText) findViewById(R.id.editText);
        String itemText = etItem.getText().toString();
        Intent data = new Intent();
        data.putExtra("value", itemText);
        data.putExtra("position", itempos);
        setResult(RESULT_OK, data);
        finish();
    }
}
