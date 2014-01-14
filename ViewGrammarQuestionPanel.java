import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ViewGrammarQuestionPanel extends JPanel {
	private Controller controller;
	private ArrayList<IQuestion> questions;
	private JPanel scrollPane;

	public ViewGrammarQuestionPanel(Controller controller) {
		this.controller = controller;
		setBackground(new Color(240, 255, 255));
		setPreferredSize(new Dimension(800, 600));
		setBorder(new EmptyBorder(5, 5, 5, 5));

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 50, 660, 50 };
		gridBagLayout.rowHeights = new int[] { 25, 450, 65, 50 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 1.0 };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0 };
		setLayout(gridBagLayout);

		scrollPane = new JPanel();
		scrollPane.setLayout(new BoxLayout(scrollPane, BoxLayout.Y_AXIS));

		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 1;
		add(scrollPane, gbc_scrollPane);

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.CENTER;
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 235);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 2;
		add(btnNewButton, gbc_btnNewButton);
		btnNewButton.addActionListener(controller);

		JButton btnNewButton1 = new JButton("Show Answer");
		btnNewButton1.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_btnNewButton1 = new GridBagConstraints();
		gbc_btnNewButton1.anchor = GridBagConstraints.CENTER;
		gbc_btnNewButton1.insets = new Insets(0, 0, 0, 10);
		gbc_btnNewButton1.gridx = 1;
		gbc_btnNewButton1.gridy = 2;
		add(btnNewButton1, gbc_btnNewButton1);
		btnNewButton1.addActionListener(controller);

		JButton btnNewButton2 = new JButton("Try Another");
		btnNewButton2.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_btnNewButton2 = new GridBagConstraints();
		gbc_btnNewButton2.anchor = GridBagConstraints.CENTER;
		gbc_btnNewButton2.insets = new Insets(0, 0, 0, -245);
		gbc_btnNewButton2.gridx = 1;
		gbc_btnNewButton2.gridy = 2;
		add(btnNewButton2, gbc_btnNewButton2);
		btnNewButton2.addActionListener(controller);

		JButton btnNewButtoni = new JButton("Back");
		btnNewButtoni.setActionCommand("BackToLevelSelectPanel");
		btnNewButtoni.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_btnNewButtoni = new GridBagConstraints();
		gbc_btnNewButtoni.anchor = GridBagConstraints.WEST;
		gbc_btnNewButtoni.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButtoni.gridx = 0;
		gbc_btnNewButtoni.gridy = 3;
		add(btnNewButtoni, gbc_btnNewButtoni);
		btnNewButtoni.addActionListener(controller);
	}

	public void Update() {
		this.questions = controller.getQuestions();
		scrollPane.removeAll();
		for (int i = 0; i < questions.size(); i++) {
			scrollPane.add((Component) questions.get(i));
		}
	}

}
