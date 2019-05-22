package com.bharti.transportassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import com.bharti.transportassignment.adapter.GridviewAdapter;
import java.util.ArrayList;
import java.util.Objects;

public class ShowGridActivity extends AppCompatActivity {
    private int i;
    private int item_count;
    private int row;
    private int col;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_grid);
        GridView grid= findViewById(R.id.grid_img);
        Bundle b = getIntent().getExtras();
        row=Integer.parseInt(Objects.requireNonNull(b).getString("Rows"));
        col=Integer.parseInt(Objects.requireNonNull(b.getString("Cols")));
        item_count=row*col;
        ArrayList<Integer> grid_details = new ArrayList<>();
        for(i=0;i<item_count;i++){
            grid_details.add(i+1);
        }
        grid.setNumColumns(col);
        GridviewAdapter adapter = new GridviewAdapter(ShowGridActivity.this, grid_details);
        grid.setAdapter(adapter);

        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button



}
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
