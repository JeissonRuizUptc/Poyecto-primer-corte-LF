package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JPanel;

import model.Production;

public class ProductionsPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel accumulatedPanel;

	public ProductionsPanel(List<Production> list) {
		setLayout(new BorderLayout(0, 0));
		setBackground(Color.WHITE);
		
		accumulatedPanel = new JPanel();
		add(accumulatedPanel, BorderLayout.CENTER);
		accumulatedPanel.setBackground(Color.WHITE);
		accumulatedPanel.setLayout(new GridLayout(list.size(), 1, 10, 10));
		refreshPanel(list);
	}

	public void refreshPanel(List<Production> list) {
		accumulatedPanel.removeAll();
		for (Production production : list) {
			accumulatedPanel.add(new ProductionCard(production));
		}
		repaint();
		revalidate();
	}

}
