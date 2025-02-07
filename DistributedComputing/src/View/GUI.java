package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ComputingController;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JList;

public class GUI extends JFrame {

	private JPanel contentPane;
	private ComputingController localComCont;
	private JTextField txtMD5hash;
	private JTextField txtResult;
	private JTextField txtDictionaryPath;
	JLabel lblMdHash = new JLabel("MD5 Hash");
	JLabel lblResult = new JLabel("Ergebnis");
	JLabel lblDictionary = new JLabel("W\u00F6rterbuch");
	JButton btnStart = new JButton("Starten");
	JButton btnStop = new JButton("Stoppen");
	JList listProtocol = new JList();
	JLabel lblProtocol = new JLabel("Protokoll");
	
	public GUI() {
		
	}
	
	public GUI(ComputingController localComCont) {
		this.localComCont = new ComputingController();
		this.localComCont = localComCont;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane = init();
		createEvent();
	}
	/**
	 * Launch the application.
	 */
	public void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI(localComCont);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public void ErrorFunction(boolean noError, String callFunc) {
		if(noError) {
			System.out.println("Korrekt");
		} else {
			System.out.println("Fehler");
		}
	}
		
	public void createEvent() {
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ErrorFunction(localComCont.checkInputData(txtDictionaryPath.getText(), txtMD5hash.getText()),"checkInputData");
				if(localComCont.isCheckInputValue()) {
					localComCont.setPassword(txtMD5hash.getText());
					localComCont.checkClientConnection();
				}else {
					//Error Message
				}
			}
		});
		
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
	
	public JPanel init() {
		txtMD5hash = new JTextField();
		txtMD5hash.setColumns(10);
		txtResult = new JTextField();
		txtResult.setColumns(10);
		txtDictionaryPath = new JTextField();
		txtDictionaryPath.setColumns(10);
		
		JPanel panel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(113, Short.MAX_VALUE)
					.addComponent(btnStart)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnStop)
					.addGap(169))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(txtMD5hash, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
										.addComponent(txtResult, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
										.addComponent(txtDictionaryPath, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
									.addGap(83))
								.addComponent(lblResult)
								.addComponent(lblDictionary))
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblMdHash)
							.addGap(189)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblProtocol)
						.addComponent(listProtocol, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(59, Short.MAX_VALUE))
		);
		
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(16)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMdHash)
						.addComponent(lblProtocol))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(txtMD5hash, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(lblResult)
							.addGap(10)
							.addComponent(txtResult, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
							.addComponent(lblDictionary)
							.addGap(6))
						.addComponent(listProtocol, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtDictionaryPath, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnStart)
						.addComponent(btnStop))
					.addGap(37))
		);
		getContentPane().setLayout(groupLayout);
		
		return panel;
	}
}
