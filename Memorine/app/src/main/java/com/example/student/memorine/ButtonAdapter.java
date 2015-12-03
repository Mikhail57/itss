package com.example.student.memorine;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class ButtonAdapter extends BaseAdapter {

    public String[] buttons;

    private Context mContext;

    private int rows, cols;

    private int[] hideTextArray;

    List<Button> Buttons;

    // Gets the context so it can be used later
    public ButtonAdapter(Context c, int rows, int cols) {
        mContext = c;
        buttons = new String[rows*cols];
        for (int i=0; i<rows*cols; i++) {
            buttons[i] = "?";
        }
        this.rows = rows;
        this.cols = cols;
        Buttons = new ArrayList<Button>();
    }

    public void setButtonsHideText(int[] array) {
        hideTextArray = array.clone();
    }

    // Total number of things contained within the adapter
    public int getCount() {
        return buttons.length;
    }

    // Require for structure, not really used in my code.
    public Object getItem(int position) {
        return null;
    }

    // Require for structure, not really used in my code. Can
    // be used to get the id of an item in the adapter for
    // manual control.
    public long getItemId(int position) {
        return position;
    }

    public int getRowsCount() {
        return rows;
    }

    public int getColsCount() {
        return cols;
    }

    public View getView(int position,
                        View convertView, ViewGroup parent) {
        Button btn;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            btn = new Button(mContext);
            int square = parent.getWidth()/cols;
            if (square > parent.getHeight()/rows){
                square = parent.getHeight()/rows;
            }
            square -= 2;
            btn.setLayoutParams(new GridView.LayoutParams(square, square));
            btn.setPadding(8, 8, 8, 8);

            btn.setOnClickListener(new MyOnClickListener(position));
            Buttons.add(position, btn);
        }
        else {
            btn = (Button) convertView;

            if (position == 0) {
                if (Buttons.get(0).getLayoutParams().width < 5) {
                    int square = parent.getWidth()/cols;
                    if (square > parent.getHeight()/rows){
                        square = parent.getHeight()/rows;
                    }
                    square -= 2;
                    Buttons.get(0).setLayoutParams(new GridView.LayoutParams(square, square));
                    Buttons.get(0).setPadding(8, 8, 8, 8);
                    Buttons.get(0).setOnClickListener(new MyOnClickListener(0));
                }
            }
        }


        /*if (convertView == null && position == 0) {
            btn = new Button(mContext);
            int square = parent.getWidth()/cols;
            if (square > parent.getHeight()/rows){
                square = parent.getHeight()/rows;
            }
            square -= 2;
            btn.setLayoutParams(new GridView.LayoutParams(square, square));
            btn.setPadding(8, 8, 8, 8);

            Log.e("Lololo", "Zero position");

            btn.setOnClickListener(new MyOnClickListener(position));
            Buttons.add(position, btn);
        }*/

        Log.e("Lololo", "position="+position+"; length="+buttons.length);
        btn.setText(buttons[position]);
        // filenames is an array of strings
        btn.setTextColor(Color.WHITE);
        btn.setBackgroundResource(R.drawable.card_back);
        btn.setId(position);

        if (position<Buttons.size()) {
            return Buttons.get(position);
        }
        return null;
    }


    class MyOnClickListener implements View.OnClickListener
    {
        private final int position;

        public MyOnClickListener(int position)
        {
            this.position = position;
        }

        public void onClick(View v)
        {
            Buttons.get(v.getId()+1).setText(Integer.toString(hideTextArray[v.getId()]));
        }
    }
}
