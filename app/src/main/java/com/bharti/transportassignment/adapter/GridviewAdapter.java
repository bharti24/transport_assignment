package com.bharti.transportassignment.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.bharti.transportassignment.R;

import java.util.ArrayList;

public class GridviewAdapter extends BaseAdapter {
    private final Context mContext;
    private final ArrayList<Integer> grid_details;
    public GridviewAdapter(Context c, ArrayList<Integer> sheetdetails) {
        mContext = c;
        this.grid_details= sheetdetails;
    }

    @Override
    public int getCount() {
        return grid_details.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View grid;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            //grid = new View(mContext);
            grid = inflater.inflate(R.layout.gridview_layout, null);

            ImageView imageView = grid.findViewById(R.id.image);
            imageView.setImageResource(R.drawable.ic_women);

        } else {
            grid = convertView;
        }

        return grid;
    }
}
