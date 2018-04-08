package pipe.gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class ObjectModifier extends JPanel {
	public ObjectModifier() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblDefaultEditorLabel = new JLabel("SUIE Object Editor");
		lblDefaultEditorLabel.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblDefaultEditorLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblDefaultEditorLabel.setBounds(64, 0, 163, 30);
		add(lblDefaultEditorLabel);
		
		JLabel lblHeaderAccent = new JLabel("");
		lblHeaderAccent.setBackground(Color.DARK_GRAY);
		lblHeaderAccent.setBounds(0, 30, 300, 2);
		lblHeaderAccent.setOpaque(true);
		
		
		add(lblHeaderAccent);
	}
}
