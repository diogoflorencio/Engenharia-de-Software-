package bluej.editor.moe;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentListener;

import bluej.utility.DBox;

public abstract class AttributesFindPanel extends JPanel {
	MoeEditor editor;
	JComponent findBody;
	DBox findTextBody;
	DBox optionsBody;
	JPanel mcBody;
	JPanel closeBody;
	DBox findLabelBox;
	JLabel replaceLabel;
	JTextField findTField;

	public AttributesFindPanel(BorderLayout borderLayout) {
		// TODO Auto-generated constructor stub
	}
}
