
package utils;

import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TaskRenderer extends DefaultTableCellRenderer
{
    private static final long serialVersionUID = 6703872492730589499L;

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/icon/task_icon.png"));
        setIcon(icon);
        setForeground(Color.white);
        //setText("");

        return cellComponent;
    }
}
