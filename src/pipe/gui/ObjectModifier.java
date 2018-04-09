package pipe.gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.CardLayout;
import javax.swing.JTabbedPane;

public class ObjectModifier extends JPanel {
	public ObjectModifier() {
		setBackground(Color.WHITE);
		setLayout(new CardLayout(0, 0));
		
		JTabbedPane ObjectEditorTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		add(ObjectEditorTabbedPane, "name_30526268090565");
		
		JPanel panel = new JPanel();
		ObjectEditorTabbedPane.addTab("Editor", null, panel, null);
		
		JPanel panel_1 = new JPanel();
		ObjectEditorTabbedPane.addTab("Result", null, panel_1, null);
		
		JLabel lblDefaultEditorLabel = new JLabel("SUIE Object Editor");
		lblDefaultEditorLabel.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblDefaultEditorLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblDefaultEditorLabel, "name_30463073190476");
		
		JLabel lblHeaderAccent = new JLabel("");
		lblHeaderAccent.setBackground(Color.DARK_GRAY);
		lblHeaderAccent.setOpaque(true);
		
		
		add(lblHeaderAccent, "name_30463091437946");
	}
}
