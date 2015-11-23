package com.margaret;

import javax.swing.table.AbstractTableModel;
import java.util.LinkedList;

/**
 * Created by sn0173nd on 11/23/2015.
 */
public class SnakeTableModel extends AbstractTableModel {

    // data in class is a LinkedList of Strings that are snake names
    LinkedList<String> snakes;

    // constructor creates a new LinkedList and Adds to it
    SnakeTableModel (){
        snakes = new LinkedList<>();
        snakes.add("Cobra");
        snakes.add("Boa Constrictor");
        snakes.add("Python");
    }

    @Override
    public int getRowCount() {
        return snakes.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt (int row, int col){
        if (col == 0){
            System.out.println("col 0 where row is " + row);
            return row;  // return row number
        }
        else if (col == 1){
            System.out.println("col 1 where snakes.get(row) is " + snakes.get(row));
            return snakes.get(row);  // LinkedList method to get String at row
        }
        else {
            return null;
        }
    }
}
