/** 
 *  Die LoginWindow Klasse erzeugt ein Login Fenster
 *  in diesem kann sich der Rezeptionist mit seiner Rezeptionisten Nr 
 *  einloggen. Es wird überpüft, ob das Passwort des Rezeptionisten korrekt eingegeben wurde.
 *   
**/
package hotel.view;


import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import ManagementUI.*;


public class LoginWindow extends JFrame {
	HotelProgramManager hotelController = new HotelProgramManager(); //Der hotelController regelt den Programm Ablauf
	private JPanel contentPane;
	private JButton btnAnmelden;
	private JButton btnExit;
	private JTextField txtBenutzername;
	private JPasswordField passwordField;
	static LoginWindow frame;  

	/**
	 * Start der Applikation
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new LoginWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Erzeugen des Frames Initialisierung der Komponente und ausführen der Events
	 */
	public LoginWindow() {

		initComponents();
		createEvents();
	}

	/**
	 * Alle Events werden unter der createEvent() Methode zusammengefasst
	 */
	private void createEvents() {
		/**
		 * Exit Button um das Programm zu verlassen.
		 */
		btnExit.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				System.exit(0);											
			}
		});
		
		/**
		 * Anmelde Button überprüft den eingegebenen Benutzernamen und das Passwort,
		 * sind diese korrekt wird die Meldung "Anmeldung erfolgreich" ausgegeben und das MainHotelFormular sichtbar. 
		 * andernfalls nicht.
		 */
		btnAnmelden.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				try {
					if(hotelController.loginManager(txtBenutzername.getText(), passwordField.getPassword())) {	//hotelController regelt die Überprüfung
						JOptionPane.showMessageDialog(null, "Anmeldung erfolgreich!");
						MainHotelFormular main1 = new MainHotelFormular(hotelController); // Erzeugen eines HotelFormular Objektes mit Zugriff auf den hotelController
						main1.setVisible(true);
						frame.setVisible(false);
					} 
					else {
						JOptionPane.showMessageDialog(null, "Anmeldung fehlgeschlagen !");
					}
				} catch (NumberFormatException e1) {									  //Eingabe Fehler werden abgefangen
					System.out.println("falsches Format oder Eingabe inkorrekt "+e1);
					JOptionPane.showMessageDialog(null, "Bitte nur gültige Eingaben!");
				}				
			}
		});
	}
	
	/**
	 * Initialisierungen aller Programm Komponente 
	 */
	private void initComponents() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginWindow.class.getResource("/hotel/resources/hotel_128.png"))); //Icon für das Hotel Management Software Fenster aus Ressource
		setTitle("Hotel Management Software");
///////////////////////////////////////////////////////////////////////////					
/*
 * Labels für das Login Window
 */
		JLabel lblBenutzerLogin = new JLabel("Benutzer Login");

		JLabel lblBenutzerID = new JLabel("BenutzerID:");

		JLabel lblPasswort = new JLabel("Passwort:");
///////////////////////////////////////////////////////////////////////////					
/*
 * Buttons und Textfelder 
 */
		txtBenutzername = new JTextField();
		txtBenutzername.setColumns(10);
		passwordField = new JPasswordField();
		btnAnmelden = new JButton("Anmelden");
		btnExit = new JButton("Exit");
///////////////////////////////////////////////////////////////////////////
/*
 * Layout für contentPane auf GroupLayout gesetzt hinzufügen der Komponente
 */
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(87)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addGroup(gl_contentPane.createSequentialGroup()
														.addComponent(lblPasswort, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
														.addGap(18))
												.addGroup(gl_contentPane.createSequentialGroup()
														.addComponent(lblBenutzerID)
														.addGap(27)))
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(lblBenutzerLogin, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
												.addComponent(txtBenutzername, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
												.addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))
								.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(116)
										.addComponent(btnAnmelden)
										.addGap(18)
										.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)))
						.addGap(131))
				);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGap(56)
						.addComponent(lblBenutzerLogin, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtBenutzername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblBenutzerID, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPasswort, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnAnmelden)
								.addComponent(btnExit))
						.addContainerGap(63, Short.MAX_VALUE))
				);
		contentPane.setLayout(gl_contentPane);

	}
}


