package com.margaret;

import javax.swing.*;
import javax.swing.table.TableCellEditor;

/**
 * Created by sn0173nd on 11/23/2015.
 */
public class TableGUIForm extends JFrame { // has to extend JFrame
    private JTable table1;
    private JPanel containsTable;

    // constructor
    protected TableGUIForm() {
        setContentPane(containsTable);
        pack();
        setVisible(true);

        // references data model
        // create a data model
        HelloDataModel helloModel = new HelloDataModel();
        table1.setModel(helloModel);

        SnakeTableModel snakeModel = new SnakeTableModel();
        table1.setModel(snakeModel);
    }
}
