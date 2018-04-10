package pipe.gui;
import javax.swing.JTabbedPane;

import pipe.dataLayer.Arc;
import pipe.dataLayer.DataType;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.util.Vector;

import javax.swing.JSeparator;
import javax.swing.JTextField;

public class ArcModifier extends JPanel {
	private Arc currentArc;
	private JTextField txtName;
	private JTextField textField_1;
	
	public ArcModifier(Arc anArc) {
		setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 400, 380);
		add(tabbedPane);
		
		JPanel ArcEditor = new JPanel();
		tabbedPane.addTab("Arc Editor", null, ArcEditor, null);
		ArcEditor.setLayout(null);
		
		JLabel lblVariable = new JLabel("Type:");
		lblVariable.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVariable.setBounds(10, 37, 57, 23);
		ArcEditor.add(lblVariable);
		
		JLabel lblDataType = new JLabel("Null Data Type");
		lblDataType.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblDataType.setBounds(70, 42, 262, 14);
		ArcEditor.add(lblDataType);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 27, 375, 2);
		ArcEditor.add(separator);
		
		// HANDLE DATA 
		currentArc = anArc;
		setDataType(lblDataType);
		
		
		// END HANDLE DATA
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName.setBounds(10, 81, 57, 23);
		ArcEditor.add(lblName);
		
		JLabel lblVariable_1 = new JLabel("Variable:");
		lblVariable_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVariable_1.setBounds(10, 122, 57, 23);
		ArcEditor.add(lblVariable_1);
		
		txtName = new JTextField();
		txtName.setBounds(70, 84, 262, 20);
		ArcEditor.add(txtName);
		txtName.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(70, 125, 262, 20);
		ArcEditor.add(textField_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 166, 375, 2);
		ArcEditor.add(separator_1);

	}
	

	
	private void setDataType(JLabel aDataType)
	{
	  DataType d = currentArc.getDataType();
   	  if(d.getDef())
   	  {
   		  Vector<String> types = d.getTypes();
			  String s;
			  if(d.getPow())
				  s = "P(< ";
			  else s = "< ";
			  for(int j = 0; j < types.size(); j ++)
			  {
				  s += types.get(j);
				  if(j < types.size() - 1)
				  {
					  s += " ,";
				  }
			  }
			  if(d.getPow())
				  s += " >)";
			  else s += " >";
			  aDataType.setText(s);
		   
	}
	}
	
	/**
	 * Loads all of the relevant data from a selected arc onto the form
	 * @param anArc
	 */
	private void setName(JTextField aNameField)
	{

		aNameField.setText(currentArc.getName());
	}
}
