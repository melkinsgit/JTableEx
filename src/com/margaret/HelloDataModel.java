package com.margaret;

import javax.swing.table.AbstractTableModel;

/**
 * Created by sn0173nd on 11/23/2015.
 */
public class HelloDataModel extends AbstractTableModel{

    @Override
    public int getRowCount() {
        return 6;
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt (int row, int col){
        return "Margaret Brower Elkins";
    }
}
