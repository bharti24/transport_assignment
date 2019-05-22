package com.bharti.transportassignment;

import android.content.Intent;
import android.support.v4.content.IntentCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText row_count;
    private EditText col_count;
    //Button generate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        row_count= findViewById(R.id.editText_Row);
        col_count= findViewById(R.id.editText_col);
        //generate=(Button)findViewById(R.id.button_generate);
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        row_count.setText("");
        col_count.setText("");
        row_count.requestFocus();
    }
    public void ShowGrid(View view)
    {
        Intent intent = new Intent(getApplicationContext(), ShowGridActivity.class);
        Bundle b = new Bundle();
        b.putString("Rows", row_count.getText().toString());
        b.putString("Cols", col_count.getText().toString());
        intent.putExtras(b);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }




}
