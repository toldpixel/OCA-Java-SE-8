import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class SwingPanel extends JFrame implements ActionListener {
	private String[] str;
	JButton btn[];
	
	public SwingPanel() {
		super();
	setTitle("Test");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel hauptPanel = init();
	this.add(hauptPanel);
	}
	
	
	public static void main(String[] args) {
		SwingPanel hauptfenster = new SwingPanel();
		hauptfenster.setSize(700,700);
		hauptfenster.setLocation(200, 300);
		hauptfenster.setVisible(true);

	}
	
	private JPanel init() {
		
		str =  new String[7];
		str[0] = "Montag";
		str[1] = "Dienstag";
		str[2] = "Mittwoch";
		str[3] = "Donnerstag";
		str[4] = "Freitag";
		str[5] = "Samstag";
		str[6] = "Sonntag";
		btn = new JButton[str.length];
		
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
		JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
		
		
	
		for(int i=0 ; i< str.length; i++){
		    btn[i] = new JButton(String.valueOf(i));
		    btn[i].setPreferredSize(new Dimension(75,75));
		    panel.add(btn[i]);
		    
		    
		}
		
		for(int i=0 ; i<str.length; i++){
		    JLabel lbl = new JLabel(str[i]);
		    lbl.setPreferredSize(new Dimension(75,75));
		    panel2.add(lbl);
		}
		
		JPanel borderPnl = new JPanel(new BorderLayout());
		
		borderPnl.add(panel, BorderLayout.NORTH);
		borderPnl.add(panel2, BorderLayout.SOUTH);
		
		JPanel container = new JPanel(new FlowLayout(FlowLayout.LEFT));
		container.add(borderPnl);
		
		container.setBackground(Color.white);
		
		
		
		return container;
	}
	
	public void actionPerformed(ActionEvent event) {
			
		}
	}

