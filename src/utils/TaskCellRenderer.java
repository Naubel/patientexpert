
package utils;

import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TaskCellRenderer extends DefaultTableCellRenderer
{
    private static final long serialVersionUID = 6703872492730589499L;

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        ImageIcon icon;

        if(Integer.parseInt(table.getValueAt(row, 1).toString()) == 1)
        {
            setForeground(Color.white);
            icon = new javax.swing.ImageIcon(getClass().getResource("/icon/task_done_icon.png"));
            setIcon(icon);
        } 
        
        else if(Integer.parseInt(table.getValueAt(row, 1).toString()) == 2)
        {
            setForeground(Color.white);
            icon = new javax.swing.ImageIcon(getClass().getResource("/icon/task_notdone_icon.png"));
            setIcon(icon);
        }

        else
        {
            setForeground(Color.white);
            icon = new javax.swing.ImageIcon(getClass().getResource("/icon/task_pending_icon.png"));
            setIcon(icon);
        }
        return cellComponent;
    }
}
