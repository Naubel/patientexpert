
package utils;

import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ConsultationCellRenderer extends DefaultTableCellRenderer
{
    private static final long serialVersionUID = 6703872492730589499L;

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        ImageIcon icon;

        //table.setFont(new java.awt.Font("Dialog", 0, 11));
        if(Integer.parseInt(table.getValueAt(row, column).toString()) == 10)
        {
            setForeground(Color.white);
            icon = new javax.swing.ImageIcon(getClass().getResource("/icon/condition_10.png"));
            setIcon(icon);
        } 
        
        else if(Integer.parseInt(table.getValueAt(row, column).toString()) == 25)
        {
            setForeground(Color.white);
            icon = new javax.swing.ImageIcon(getClass().getResource("/icon/condition_25.png"));
            setIcon(icon);
        }
        else if(Integer.parseInt(table.getValueAt(row, column).toString()) == 50)
        {
            setForeground(Color.white);
            icon = new javax.swing.ImageIcon(getClass().getResource("/icon/condition_50.png"));
            setIcon(icon);
        }
        
        else if(Integer.parseInt(table.getValueAt(row, column).toString()) == 75)
        {
            setForeground(Color.white);
            icon = new javax.swing.ImageIcon(getClass().getResource("/icon/condition_75.png"));
            setIcon(icon);
        }
        else
        {
            setForeground(Color.white);
            icon = new javax.swing.ImageIcon(getClass().getResource("/icon/condition_100.png"));
            setIcon(icon);
        }
        return cellComponent;
    }
}
