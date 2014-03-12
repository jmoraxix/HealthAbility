/**
 * Jos� David Mora Lor�a
 * 2014004856
 * 12/03/2014
 */
package healthAbility.vista;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 * @author jmora 12/3/14
 *
 */
@SuppressWarnings("serial")
public class Renderer extends JLabel implements TableCellRenderer 
{
    boolean isBordered = true;

    public Renderer(boolean isBordered) 
	{
        this.isBordered = isBordered;
        setOpaque(false);
    }

    public Component getTableCellRendererComponent(JTable table, Object color, boolean isSelected, boolean hasFocus, int row, int column) 
	{
        return new JButton();     
    }
}
