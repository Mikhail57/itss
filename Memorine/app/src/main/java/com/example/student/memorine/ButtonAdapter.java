package com.example.student.memorine;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;

public class ButtonAdapter extends BaseAdapter {

    public String[] buttons;

    private Context mContext;

    private int rows, cols;

    private int[] hideTextArray;

    Button Buttons[];

    // Gets the context so it can be used later
    public ButtonAdapter(Context c, int rows, int cols) {
        mContext = c;
        buttons = new String[rows*cols];
        for (int i=0; i<rows*cols; i++) {
            buttons[i] = "?";
        }
        this.rows = rows;
        this.cols = cols;
        Buttons = new Button[rows*cols];
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
            Buttons[position] = btn;
        }
        else {
            btn = (Button) convertView;
        }
        btn.setText(buttons[position]);
        // filenames is an array of strings
        btn.setTextColor(Color.WHITE);
        btn.setBackgroundResource(R.drawable.card_back);
        btn.setId(position);

        return btn;
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
            Buttons[position].setText(Integer.toString(hideTextArray[position]));
        }
    }
}
