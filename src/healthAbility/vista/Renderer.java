/**
 * Primer Proyecto POO
 * José David Mora Loría
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
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
