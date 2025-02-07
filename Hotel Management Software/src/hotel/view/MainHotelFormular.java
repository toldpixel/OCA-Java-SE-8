/**
 * Das MainHotelFormular zeigt die Gesamte Hotel Management Software an. Alle Komponente der Software werden
 * über dieses Formular konfiguriert. 
 */

package hotel.view;

import java.awt.*;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;


import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.LayoutStyle.ComponentPlacement;

import Datumpkg.Datum;

import javax.swing.JTextField;

import javax.swing.JButton;


import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import ManagementUI.*;
import Reservierungpkg.Reservierung;
import java.util.Random;

public class MainHotelFormular extends JFrame {
///////////////////////////////////////////////////////////////////////////	
/**
 * Alle Felder, Listen, Arrays und Buttons welche Innerhalb der Übersicht verwendet werden	
 */
	private HotelProgramManager hotelController;
	private CardLayout cl;
	JButton gaesteBtn;
	JButton zimmerBtn;
	JButton rechnungBtn;
	JPanel  cardPanel;
	private JTextField txtGastNr;
	private JTextField txtNachname;
	private JTextField txtVorname;
	private JTextField txtPLZ;
	private JTextField txtStrasse;
	private JTextField txtHausNr;
	private JTextField txtGeburtsdatum;
	private JTextField txtStaatsangehoerigkeit;
	private JButton btnGaesteHinzufuegen;
	private JList<String> listGaeste;
	private JList<String> listZimmer;
	private JList<String> listRechnung;
	private JButton btnGastAnzeigen;
	private JButton btnLschen;
	private JButton btnExit;
	private JTextField txtZimmerNr;
	private JTextField txtZimmerName;
	private JTextField txtAnzahlBetten;
	private JTextField txtPreisProNacht;
	private JLabel lblZimmer;
	private JButton btnAnzeigenZimmer;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JCheckBox chckbxZimmerfrei;
	private JCheckBox chckbxZimmerbelegt;
	private JButton reservierungBtn;
	private JList<String> listZimmerReservierung;
	private JList<String> listGastReservierung;
	private String[] zimmerResElemente;															//Als Feld kann die Liste einmal zur Initialisierung und einmal beim Panel aufruf aktuallisiert werden
	private String[] gastResElemente;			
	private JTextField txtCheckIn;
	private JTextField txtCheckOut;
	private JButton btnReservieren;
	private JLabel label_1;
	private Datum checkIn = new Datum();
	private Datum checkOut = new Datum();
	Reservierung neue_Reservierung;
	private JTextField txtRechnungNr;
	private JTextField txtGastRechnungNr;
	private JTextField txtDatumRechnungCheckIn;
	private JTextField txtDatumRechnungCheckOut;
	private JTextField txtRechnungKosten;
	private JButton btnRechnungAnzeigen;
	private JTextField txtRechnungZimmerNr;
	private JLabel lblZimmerNr;
	private Random rand;
	private int aktuellerechnungsnr = 1;
	private JButton btnCheckOut;
///////////////////////////////////////////////////////////////////////////	
/**
* Erzeugen der Frame Initialisierung der Komponente und ausführen der Events
*/
	public MainHotelFormular(HotelProgramManager hotelController) {								//hotelController wird zur weiteren Verwendung aus Login Window genutzt
		this.hotelController = hotelController;
		initComponents();
		createEvents();
	}
///////////////////////////////////////////////////////////////////////////	
/**
 * Methode zum ansprechen des hotelControllers
 */
	public HotelProgramManager getHotelController() {	
		return this.hotelController;
	}
///////////////////////////////////////////////////////////////////////////	
/**
* Alle Events werden unter der createEvent() Methode zusammengefasst
* Die Buttons zum wechseln der unterschiedlichen content Pane und innerhalb der einzelnen Panes werden hier zusammengefasst
*/
	private void createEvents() {
		
		zimmerBtn.addActionListener(new ActionListener() {										//Button zum Wechsel in das Zimmer Panel
			public void actionPerformed(ActionEvent e) {
				cl.show(cardPanel,"ZimmerPanel");
			}
		});

		rechnungBtn.addActionListener(new ActionListener() {									//Button zum Wechsel in das Rechnung Panel
			public void actionPerformed(ActionEvent e) {
				cl.show(cardPanel, "RechnungPanel"); 
				String[] rechnungElemente = getHotelController().rechnungAnzeigenListe();		//Beim wechsel soll die rechnungListe mit neuen Daten gefüllt werden
				listRechnung.setListData(rechnungElemente);
			}
		});

		gaesteBtn.addActionListener(new ActionListener() {										//Button zum Wechsel in das Gaeste Panel
			public void actionPerformed(ActionEvent e) {
				cl.show(cardPanel,"GaestePanel");
			}
		});

		reservierungBtn.addActionListener(new ActionListener() {								//Button zum Wechsel in das Reservierung Panel
			public void actionPerformed(ActionEvent arg0) {
				cl.show(cardPanel,"ReservierungPanel");
				zimmerResElemente = getHotelController().zimmerVerfuegbarAnzeigen();			//Beim wechsel sollen die Listen mit neuen Daten gefüllt werden
				listZimmerReservierung.setListData(zimmerResElemente);
				gastResElemente =  getHotelController().gaesteVerfuegbarAnzeigen();
				listGastReservierung.setListData(gastResElemente);
			}
		});

		btnExit.addActionListener(new ActionListener() {										//Button zum verlassen des Programmes
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);	
			}
		});	
///////////////////////////////////////////////////////////////////////////			
/*
 *Buttons innerhalb der Menue Panels 
 */
		btnGaesteHinzufuegen.addActionListener(new ActionListener() {							//Gaeste Attribute werden über den hotelController in ein Gaeste Objekt übergeben
			public void actionPerformed(ActionEvent e) {			
				try {
					if(checkIn.isValidGeb(txtGeburtsdatum.getText())) {
						if(getHotelController().gaesteHinzufuegen(
								txtGastNr.getText(),
								txtNachname.getText(),
								txtVorname.getText(),
								txtPLZ.getText(),
								txtStrasse.getText(),
								txtHausNr.getText(),
								txtGeburtsdatum.getText(),
								txtStaatsangehoerigkeit.getText(),
								false																	//true/false um anzuzeigen ob Gast ein Zimmerreserviert hat. Verwendung nur in Reservierung
								)) {																	
							System.out.println("[DEBUG] Gast ist nicht 2 mal vorhanden");	
							String[] element = getHotelController().gaesteAnzeigenListe();				//Liste mit hinzugefügtem Gast ergänzen 
							listGaeste.setListData(element);
						}
						else {
							System.out.println("[DEBUG] GastNr schon vorhanden");
							JOptionPane.showMessageDialog(null, "Gast schon vorhanden bitte GastNr wechseln!");
						}
					} else {
						System.out.println("[Debug] Datum im falschen Format");
						JOptionPane.showMessageDialog(null, "Bitte nur gültiges Datum Format ausgeben!");
					}
						
				} catch (NumberFormatException e1) {												//Eingabe Fehler werden abgefangen
					System.out.println("[DEBUG] falsches Format oder Eingabe inkorrekt "+e1);
					JOptionPane.showMessageDialog(null, "Bitte nur gültige Eingaben!");
				}
			}
		});
		
		btnGastAnzeigen.addActionListener(new ActionListener() {								//Attribute der Gäste werden aus dem GästeContainer zurück auf die Textfelder ausgegeben
			public void actionPerformed(ActionEvent arg0) {
				if(listGaeste.getSelectedValue() == null) {
					JOptionPane.showMessageDialog(null, "Bitte eine Gaeste Nr. aus der Liste wählen!");
				}else {
					String ausgewaehlt = listGaeste.getSelectedValue();
					String[] gaesteAttribArr = getHotelController().gastAttributeAbfragen(ausgewaehlt);
					txtGastNr.setText(gaesteAttribArr[0]);
					txtNachname.setText(gaesteAttribArr[1]);
					txtVorname.setText(gaesteAttribArr[2]);
					txtPLZ.setText(gaesteAttribArr[3]);
					txtStrasse.setText(gaesteAttribArr[4]);
					txtHausNr.setText(gaesteAttribArr[5]);
					txtStaatsangehoerigkeit.setText(gaesteAttribArr[6]);
					txtGeburtsdatum.setText(gaesteAttribArr[7]);
				}
			}
		});

		btnLschen.addActionListener(new ActionListener() {													//Ausgewählter Gast wird aus der Liste gelöscht
			public void actionPerformed(ActionEvent arg0) {
				if(listGaeste.getSelectedValue() == null) {
					JOptionPane.showMessageDialog(null, "Bitte eine Gaeste Nr. aus der Liste wählen!");
				}
				String ausgewaehlt = listGaeste.getSelectedValue();
				if(getHotelController().gastLoeschen(ausgewaehlt)) {										//Aufruf der gastLoeschen Methode aus hotelController
					JOptionPane.showMessageDialog(null, "Gast gelöscht!");
					String[] element = getHotelController().gaesteAnzeigenListe();							//Nach Löschung die daten in der Gaeste Liste neu Anzeigen
					listGaeste.setListData(element);
				}else {
					JOptionPane.showMessageDialog(null, "Gast konnte nicht gelöscht werden!");
				}
			}
		});

		btnAnzeigenZimmer.addActionListener(new ActionListener() {											//Zimmer können aus Liste ausgewählt werden und Attribute werden angezeigt
			public void actionPerformed(ActionEvent arg0) {	    		
				if(listZimmer.getSelectedValue() == null) {
					JOptionPane.showMessageDialog(null, "Bitte eine Zimmer Nr. aus der Liste wählen!");
				} else {		    		
					String ausgewaehlt = listZimmer.getSelectedValue();
					String[] zimmerAttribArr = getHotelController().zimmerAttributeAbfragen(ausgewaehlt);
					txtZimmerNr.setText(zimmerAttribArr[0]);
					txtZimmerName.setText(zimmerAttribArr[1]);
					txtAnzahlBetten.setText(zimmerAttribArr[2]);
					if(zimmerAttribArr[3].equals("false")){													//zimmerAttribArr[3]  ob das Zimmer verfügbar ist. Checkbox wird entsprechend gesetzt
						chckbxZimmerfrei.setEnabled(true);
						chckbxZimmerfrei.setSelected(true);
						chckbxZimmerbelegt.setEnabled(false);
					} else {
						chckbxZimmerbelegt.setEnabled(true);
						chckbxZimmerbelegt.setSelected(true);
						chckbxZimmerfrei.setEnabled(false);
					}


					txtPreisProNacht.setText(zimmerAttribArr[4]);
				}
			}	    	
		});

		btnReservieren.addActionListener(new ActionListener() {												//Zur Angabe einer Reservierung werden alle Angaben vor ausführung einer Reservierung überprüft
			public void actionPerformed(ActionEvent arg0) {
				if(txtCheckIn.getText().equals("") || txtCheckOut.getText().equals("")) 									//Prüfung: leere felder für CheckIn und CheckOut
					JOptionPane.showMessageDialog(null, "Bitte beide Datum Felder im Format <dd.mm.yyyy> ausfüllen!");		
				if(listZimmerReservierung.isSelectionEmpty() == true)														//
					JOptionPane.showMessageDialog(null, "Bitte ein Zimmer aus der Liste auswaehlen!");
				if(listGastReservierung.isSelectionEmpty() == true)															//
					JOptionPane.showMessageDialog(null, "Bitte einen Gast aus der Liste auswaehlen!");
				if((!txtCheckIn.getText().isEmpty()																			//
						&& !txtCheckOut.getText().isEmpty()) 
						&& !listZimmerReservierung.isSelectionEmpty() 
						&& !listGastReservierung.isSelectionEmpty()) {    			
					//-- Unterer Code wird nur ausgeführt wenn alle Grundbedingungen erfüllt sind --
					if(!checkIn.isValid(txtCheckIn.getText()) || !checkOut.isValid(txtCheckOut.getText())) {								//Überprüfe ob Format korrekt ! und Zeitpunkte bzgl. Datum korrekt auseinander liegen. CheckOut darf nicht in der Vergangenheit liegen
						JOptionPane.showMessageDialog(null, "Datum Format nicht korrekt oder Datum liegt in der Vergangenheit!");
					} else {
						if(checkIn.beforeAndAfterDate(txtCheckIn.getText(),txtCheckOut.getText())) {										//Überprüfen ob CheckIn in der Vergangenheit liegt CheckIn nur mit aktuellem Datum möglich
							neue_Reservierung = new Reservierung(listZimmerReservierung.getSelectedValue(), txtCheckIn.getText(), txtCheckOut.getText(), listGastReservierung.getSelectedValue());		//Wenn alles ok wird ein neues Reservierungs Objekt angelegt
							if(getHotelController().neueReservierung(neue_Reservierung)) {																												//Reservierung hinzugefügt
								JOptionPane.showMessageDialog(null, "Neue Reservierung Angelegt!");

								zimmerResElemente = getHotelController().zimmerVerfuegbarAnzeigen();										
								listZimmerReservierung.setListData(zimmerResElemente);
								gastResElemente =  getHotelController().gaesteVerfuegbarAnzeigen();
								listGastReservierung.setListData(gastResElemente);    							

							} else {
								JOptionPane.showMessageDialog(null, "Es besteht bereits eine Reservierung für den Gast!");
							}
						} else {
							JOptionPane.showMessageDialog(null, "CheckOut liegt in der Vergangenheit");
						}
					}

				}

			}	
		});
		
		btnRechnungAnzeigen.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {													//Rechnung wird über Attribute in Liste angezeigt 
				if(listRechnung.getSelectedValue() == null) {
					JOptionPane.showMessageDialog(null, "Bitte eine Gaeste Nr. aus der Liste wählen!");
				}else {
					String ausgewaehlt = listRechnung.getSelectedValue();
					String[] rechnungAttribArr = getHotelController().rechnungAttributeAbfragen(ausgewaehlt);
					txtGastRechnungNr.setText(rechnungAttribArr[0]);
					txtRechnungNr.setText(Integer.toString(aktuellerechnungsnr)); 
					txtDatumRechnungCheckIn.setText(rechnungAttribArr[1]);
					txtDatumRechnungCheckOut.setText(rechnungAttribArr[2]);
					txtRechnungZimmerNr.setText(rechnungAttribArr[3]);
					txtRechnungKosten.setText(rechnungAttribArr[4]);
				}
				aktuellerechnungsnr+=1;																		//Mit jeder Anzeige einer Rechnung wird RechnungsNr immer um 1 erhöht
			}
		});

		btnCheckOut.addActionListener(new ActionListener() {												//Gast Auschecken durch löschen des Gastes aus der ArrayList
			public void actionPerformed(ActionEvent e) {
				if(listRechnung.getSelectedValue() == null) {
					JOptionPane.showMessageDialog(null, "Bitte eine Gaeste Nr. aus der Liste wählen!");
				}else {
					String ausgewaehltGast = listRechnung.getSelectedValue();								//Lösch Methoden
					getHotelController().gastLoeschen(ausgewaehltGast);
					getHotelController().reservierungLoeschen(ausgewaehltGast);
					JOptionPane.showMessageDialog(null, "Gast ausgecheckt!");

					String[] rechnungElemente = getHotelController().rechnungAnzeigenListe();				//Liste für Rechnungen Aktualisieren (leeren)
					listRechnung.setListData(rechnungElemente);
					txtGastRechnungNr.setText("");
					txtRechnungNr.setText(""); 
					txtDatumRechnungCheckIn.setText("");
					txtDatumRechnungCheckOut.setText("");
					txtRechnungZimmerNr.setText("");
					txtRechnungKosten.setText("");
				}
			}
		});
	}
///////////////////////////////////////////////////////////////////////////
/*
 *Date Picker Objekt bessere möglichkeit um Datum zu verwalten.
 *Leider nicht implementiert. Bitte nicht beachten.
 */
	//Formatter für JDate Picker SDF
	/*public class DateLabelFormatter extends AbstractFormatter {

	    private String datePattern = "yyyy-MM-dd";
	    private SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);

	    @Override
	    public Object stringToValue(String text) throws ParseException {
	        return dateFormatter.parseObject(text);
	    }

	    @Override
	    public String valueToString(Object value) throws ParseException {
	        if (value != null) {
	            Calendar cal = (Calendar) value;
	            return dateFormatter.format(cal.getTime());
	        }

	        return "";
	    }

	}*/
///////////////////////////////////////////////////////////////////////////
/**
 * Initialisierung der Komponente
 */
	private void initComponents() {																			
		cl = new CardLayout();																				//Verwendung eines CardLayout zum wechseln der Panels innerhalb des Programmes
		cardPanel = new JPanel(cl);
///////////////////////////////////////////////////////////////////////////		
/*
 * Alle Menue Panels werden hier zum CardLayout hinzugefügt
 */
		JPanel panelGaeste = new JPanel();
		JPanel panelZimmer = new JPanel();
		JPanel panelReservierung = new JPanel();
		JPanel panelRechnung = new JPanel();
		cardPanel.add(panelGaeste, "GaestePanel");
		cardPanel.add(panelZimmer, "ZimmerPanel");
		cardPanel.add(panelReservierung, "ReservierungPanel");
		cardPanel.add(panelRechnung,"RechnungPanel");
///////////////////////////////////////////////////////////////////////////
		JLabel lblRechnungsnr = new JLabel("Rechnungsnr:");

		JLabel lblGastnrRechnung = new JLabel("GastNr:");

		JLabel lblDatumCheckin_1_Rechnung = new JLabel("Datum CheckIn:");

		JLabel lblDatumCheckout_1_Rechnung = new JLabel("Datum CheckOut:");

		JLabel lblKostenRechnung = new JLabel("Kosten in EUR:");
///////////////////////////////////////////////////////////////////////////
		txtRechnungNr = new JTextField();
		txtRechnungNr.setColumns(10);
		txtGastRechnungNr = new JTextField();
		txtGastRechnungNr.setColumns(10);
		txtDatumRechnungCheckIn = new JTextField();
		txtDatumRechnungCheckIn.setColumns(10);
		txtDatumRechnungCheckOut = new JTextField();
		txtDatumRechnungCheckOut.setColumns(10);
		txtRechnungKosten = new JTextField();
		txtRechnungKosten.setColumns(10);
		listRechnung = new JList<String>();
		JLabel lblBuchung = new JLabel("Buchung f\u00FCr Gast Nr:");
		btnRechnungAnzeigen = new JButton("Anzeigen");	//Anzeigen der Reservierugen Gäste Nr. 
		btnAnzeigenZimmer = new JButton("Anzeigen");
		txtRechnungZimmerNr = new JTextField();
		txtRechnungZimmerNr.setColumns(10);
		lblZimmerNr = new JLabel("Zimmer Nr:");
		btnCheckOut = new JButton("Check Out");
///////////////////////////////////////////////////////////////////////////		
/**
 * Rechnung Panel Group Layout
 */
		GroupLayout gl_panelRechnung = new GroupLayout(panelRechnung);
		gl_panelRechnung.setHorizontalGroup(
				gl_panelRechnung.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelRechnung.createSequentialGroup()
						.addGap(19)
						.addGroup(gl_panelRechnung.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelRechnung.createSequentialGroup()
										.addGroup(gl_panelRechnung.createParallelGroup(Alignment.LEADING)
												.addComponent(lblRechnungsnr)
												.addComponent(txtRechnungNr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(27)
										.addGroup(gl_panelRechnung.createParallelGroup(Alignment.LEADING)
												.addComponent(lblGastnrRechnung)
												.addComponent(txtGastRechnungNr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(39)
										.addGroup(gl_panelRechnung.createParallelGroup(Alignment.LEADING)
												.addComponent(lblDatumCheckin_1_Rechnung)
												.addComponent(txtDatumRechnungCheckIn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(66)
										.addGroup(gl_panelRechnung.createParallelGroup(Alignment.LEADING)
												.addComponent(lblDatumCheckout_1_Rechnung)
												.addComponent(txtDatumRechnungCheckOut, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(49)
										.addGroup(gl_panelRechnung.createParallelGroup(Alignment.LEADING)
												.addComponent(txtRechnungZimmerNr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblZimmerNr))
										.addPreferredGap(ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
										.addGroup(gl_panelRechnung.createParallelGroup(Alignment.LEADING)
												.addComponent(txtRechnungKosten, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblKostenRechnung))
										.addGap(97))
								.addGroup(gl_panelRechnung.createSequentialGroup()
										.addGroup(gl_panelRechnung.createParallelGroup(Alignment.LEADING)
												.addComponent(lblBuchung)
												.addGroup(gl_panelRechnung.createSequentialGroup()
														.addComponent(listRechnung, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addComponent(btnCheckOut, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
												.addComponent(btnRechnungAnzeigen))
										.addContainerGap(620, Short.MAX_VALUE))))
				);
		gl_panelRechnung.setVerticalGroup(
				gl_panelRechnung.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelRechnung.createSequentialGroup()
						.addGap(57)
						.addGroup(gl_panelRechnung.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDatumCheckin_1_Rechnung)
								.addComponent(lblDatumCheckout_1_Rechnung)
								.addComponent(lblRechnungsnr)
								.addComponent(lblGastnrRechnung)
								.addComponent(lblKostenRechnung)
								.addComponent(lblZimmerNr))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panelRechnung.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtGastRechnungNr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtDatumRechnungCheckIn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtDatumRechnungCheckOut, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtRechnungNr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtRechnungKosten, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtRechnungZimmerNr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(49)
						.addComponent(lblBuchung)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panelRechnung.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelRechnung.createSequentialGroup()
										.addComponent(listRechnung, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(btnRechnungAnzeigen))
								.addComponent(btnCheckOut))
						.addContainerGap(164, Short.MAX_VALUE))
				);
		panelRechnung.setLayout(gl_panelRechnung);
///////////////////////////////////////////////////////////////////////////
/**
 * Date Picker nicht implementiert		
 */
		/*JDatePickerImpl datePicker;	    
	    JLabel l22=new JLabel("DATE :");
	    l22.setBounds(100,350,100,20);
	    panelReservierung.add(l22);*/

		/*JDate Picker Implementation Properties p = new Properties();
	    UtilDateModel model = new UtilDateModel();
	    JDatePanelImpl datePanel = new JDatePanelImpl(model,p);
	     datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
	     datePicker.setBounds(220,350,120,30);
	     panelReservierung.add(datePicker);
		 */
///////////////////////////////////////////////////////////////////////////
		JLabel lblNewLabel = new JLabel("Verf\u00FCgbare Zimmer:");

		JLabel lblDatumCheckin = new JLabel("Datum CheckIn:");

		JLabel lblDatumCheckout = new JLabel("Datum CheckOut:");

		JLabel lblGastName = new JLabel("G\u00E4ste Nr ohne Buchung:");
///////////////////////////////////////////////////////////////////////////
		listZimmerReservierung = new JList<String>();	    
		listGastReservierung = new JList<String>();
		String[] zimmerResElemente = getHotelController().zimmerVerfuegbarAnzeigen();
		listZimmerReservierung.setListData(zimmerResElemente);
		String[] gastResElemente =  getHotelController().gaesteVerfuegbarAnzeigen();
		listGastReservierung.setListData(gastResElemente);
		txtCheckIn = new JTextField();
		txtCheckIn.setColumns(10);
		txtCheckOut = new JTextField();
		txtCheckOut.setColumns(10);
		btnReservieren = new JButton("Reservieren");
		label_1 = new JLabel("<Datumsformat: dd.mm.yyyy>");
///////////////////////////////////////////////////////////////////////////
/**
* Reservierung Panel Group Layout
*/
		GroupLayout gl_panelReservierung = new GroupLayout(panelReservierung);
		gl_panelReservierung.setHorizontalGroup(
				gl_panelReservierung.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelReservierung.createSequentialGroup()
						.addGap(32)
						.addGroup(gl_panelReservierung.createParallelGroup(Alignment.LEADING)
								.addComponent(btnReservieren)
								.addGroup(gl_panelReservierung.createSequentialGroup()
										.addGroup(gl_panelReservierung.createParallelGroup(Alignment.LEADING)
												.addComponent(txtCheckIn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel)
												.addComponent(listZimmerReservierung, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblDatumCheckin))
										.addGap(34)
										.addGroup(gl_panelReservierung.createParallelGroup(Alignment.LEADING)
												.addComponent(lblDatumCheckout)
												.addGroup(gl_panelReservierung.createSequentialGroup()
														.addComponent(txtCheckOut, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addGap(18)
														.addComponent(label_1))
												.addComponent(listGastReservierung, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblGastName))))
						.addContainerGap(367, Short.MAX_VALUE))
				);
		gl_panelReservierung.setVerticalGroup(
				gl_panelReservierung.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelReservierung.createSequentialGroup()
						.addGap(57)
						.addGroup(gl_panelReservierung.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel)
								.addComponent(lblGastName))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panelReservierung.createParallelGroup(Alignment.BASELINE)
								.addComponent(listZimmerReservierung, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(listGastReservierung, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
						.addGap(31)
						.addGroup(gl_panelReservierung.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDatumCheckin)
								.addComponent(lblDatumCheckout))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panelReservierung.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtCheckIn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtCheckOut, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_1))
						.addGap(62)
						.addComponent(btnReservieren)
						.addContainerGap(143, Short.MAX_VALUE))
				);
		panelReservierung.setLayout(gl_panelReservierung);
///////////////////////////////////////////////////////////////////////////
		JLabel lblZimmernr = new JLabel("ZimmerNr:");

		JLabel lblZimmerName = new JLabel("Zimmer Name:");

		JLabel lblAnzahlBetten = new JLabel("Anzahl Betten:");

		JLabel lblZimmerStatus = new JLabel("Zimmer Status:");

		JLabel lblPreisProNacht = new JLabel("Preis pro Nacht in EUR:");
///////////////////////////////////////////////////////////////////////////
		txtZimmerNr = new JTextField();
		txtZimmerNr.setColumns(10);
		txtZimmerName = new JTextField();
		txtZimmerName.setColumns(10);
		txtAnzahlBetten = new JTextField();
		txtAnzahlBetten.setColumns(10);
		txtPreisProNacht = new JTextField();
		txtPreisProNacht.setColumns(10);
		chckbxZimmerfrei = new JCheckBox("frei");
		buttonGroup.add(chckbxZimmerfrei);
		chckbxZimmerbelegt = new JCheckBox("belegt");
		buttonGroup.add(chckbxZimmerbelegt);
///////////////////////////////////////////////////////////////////////////
/**
 * Anzeigen der Zimmer beim Start (Initialisierungsphase) 
 * des Programms Liste Initialisierung beim Programmstart
 */
		lblZimmer = new JLabel("Zimmer:");
		listZimmer = new JList<String>();			
		String[] zimmerElemente = getHotelController().zimmerAnzeigenListe();
		listZimmer.setListData(zimmerElemente);
		btnAnzeigenZimmer = new JButton("Anzeigen");
///////////////////////////////////////////////////////////////////////////
/**
* Zimmer Panel Group Layout
*/
		GroupLayout gl_panelZimmer = new GroupLayout(panelZimmer);
		gl_panelZimmer.setHorizontalGroup(
				gl_panelZimmer.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelZimmer.createSequentialGroup()
						.addGap(65)
						.addGroup(gl_panelZimmer.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblZimmerName)
								.addComponent(lblPreisProNacht)
								.addGroup(gl_panelZimmer.createParallelGroup(Alignment.LEADING)
										.addComponent(lblAnzahlBetten)
										.addComponent(lblZimmerStatus))
								.addComponent(lblZimmernr))
						.addGap(18)
						.addGroup(gl_panelZimmer.createParallelGroup(Alignment.LEADING)
								.addComponent(txtZimmerNr, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
								.addGroup(gl_panelZimmer.createSequentialGroup()
										.addComponent(chckbxZimmerfrei)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(chckbxZimmerbelegt))
								.addComponent(txtPreisProNacht, 98, 162, Short.MAX_VALUE)
								.addComponent(txtZimmerName, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
								.addComponent(txtAnzahlBetten, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
						.addGap(43)
						.addGroup(gl_panelZimmer.createParallelGroup(Alignment.LEADING)
								.addComponent(lblZimmer)
								.addComponent(btnAnzeigenZimmer)
								.addComponent(listZimmer, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE))
						.addGap(164))
				);
		gl_panelZimmer.setVerticalGroup(
				gl_panelZimmer.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelZimmer.createSequentialGroup()
						.addGap(36)
						.addGroup(gl_panelZimmer.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panelZimmer.createSequentialGroup()
										.addGroup(gl_panelZimmer.createParallelGroup(Alignment.BASELINE)
												.addComponent(txtZimmerNr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblZimmernr))
										.addGap(18))
								.addGroup(gl_panelZimmer.createSequentialGroup()
										.addComponent(lblZimmer)
										.addPreferredGap(ComponentPlacement.RELATED)))
						.addGroup(gl_panelZimmer.createParallelGroup(Alignment.BASELINE)
								.addGroup(gl_panelZimmer.createSequentialGroup()
										.addComponent(lblZimmerName)
										.addGap(22)
										.addGroup(gl_panelZimmer.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblAnzahlBetten)
												.addComponent(txtAnzahlBetten, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
										.addGroup(gl_panelZimmer.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblZimmerStatus)
												.addComponent(chckbxZimmerfrei)
												.addComponent(chckbxZimmerbelegt))
										.addGap(9))
								.addComponent(txtZimmerName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(listZimmer, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_panelZimmer.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelZimmer.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtPreisProNacht, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblPreisProNacht))
								.addComponent(btnAnzeigenZimmer))
						.addGap(234))
				);
		panelZimmer.setLayout(gl_panelZimmer);
///////////////////////////////////////////////////////////////////////////
		JLabel lblGastNr = new JLabel("GastNr:");
		JLabel lblNachname = new JLabel("Nachname:");
		JLabel lblNewLabel_1 = new JLabel("Vorname:");
		JLabel lblPLZ = new JLabel("PLZ:");
		JLabel lblStrasse = new JLabel("Strasse:");
		JLabel lblHausNr = new JLabel("HausNr:");
		JLabel lblGeburtsdatum = new JLabel("Geburtsdatum:");
		JLabel lblStaatsangehrigkeit = new JLabel("Staatsangeh\u00F6rigkeit:");
		JLabel lblGaesteNr = new JLabel("G\u00E4steNr:");
///////////////////////////////////////////////////////////////////////////
		txtGastNr = new JTextField();
		txtGastNr.setColumns(10);
		txtNachname = new JTextField();
		txtNachname.setColumns(10);
		txtVorname = new JTextField();
		txtVorname.setColumns(10);
		txtPLZ = new JTextField();
		txtPLZ.setColumns(10);
		txtStrasse = new JTextField();
		txtStrasse.setColumns(10);
		txtHausNr = new JTextField();
		txtHausNr.setColumns(10);
		txtGeburtsdatum = new JTextField();
		txtGeburtsdatum.setColumns(10);
		txtStaatsangehoerigkeit = new JTextField();
		txtStaatsangehoerigkeit.setColumns(10);
///////////////////////////////////////////////////////////////////////////
/**
 * Anzeigen der Gaeste beim Start des Programms Liste Initialisierung beim Programmstart
 */
		listGaeste = new JList<String>();			
		String[] gaesteElemente = getHotelController().gaesteAnzeigenListe();
		listGaeste.setListData(gaesteElemente);
///////////////////////////////////////////////////////////////////////////
		btnGastAnzeigen = new JButton("Anzeigen");
		btnLschen = new JButton("L\u00F6schen");
		btnGaesteHinzufuegen = new JButton("Hinzuf\u00FCgen");
///////////////////////////////////////////////////////////////////////////
/**
* Gast Panel Group Layout
*/
		GroupLayout gl_panel = new GroupLayout(panelGaeste);
		gl_panel.setHorizontalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblGastNr, Alignment.TRAILING)
								.addComponent(lblHausNr, Alignment.TRAILING)
								.addComponent(lblGeburtsdatum, Alignment.TRAILING)
								.addComponent(lblStrasse, Alignment.TRAILING)
								.addComponent(lblPLZ, Alignment.TRAILING)
								.addComponent(lblNewLabel_1, Alignment.TRAILING)
								.addComponent(lblNachname, Alignment.TRAILING))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(txtGastNr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(txtPLZ, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(txtVorname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(txtStrasse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(txtHausNr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel.createSequentialGroup()
														.addGap(18)
														.addComponent(lblStaatsangehrigkeit)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(txtStaatsangehoerigkeit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_panel.createSequentialGroup()
														.addGap(66)
														.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
																.addComponent(lblGaesteNr)
																.addComponent(listGaeste, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
																.addGroup(gl_panel.createSequentialGroup()
																		.addComponent(btnGastAnzeigen)
																		.addPreferredGap(ComponentPlacement.RELATED)
																		.addComponent(btnLschen))))))
								.addComponent(txtNachname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
										.addGap(1)
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(btnGaesteHinzufuegen, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
												.addComponent(txtGeburtsdatum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(104, Short.MAX_VALUE))
				);
		gl_panel.setVerticalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
						.addGap(21)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblGastNr)
								.addComponent(txtGastNr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblStaatsangehrigkeit)
								.addComponent(txtStaatsangehoerigkeit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
										.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblNachname)
												.addComponent(txtNachname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblNewLabel_1)
												.addComponent(txtVorname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblPLZ)
												.addComponent(txtPLZ, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblStrasse)
												.addComponent(txtStrasse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblHausNr)
												.addComponent(txtHausNr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panel.createSequentialGroup()
										.addComponent(lblGaesteNr)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(listGaeste, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)))
						.addGap(18)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblGeburtsdatum)
								.addComponent(txtGeburtsdatum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnGastAnzeigen)
								.addComponent(btnLschen))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btnGaesteHinzufuegen)
						.addContainerGap(44, Short.MAX_VALUE))
				);

		panelGaeste.setLayout(gl_panel);
/////////////////////////////////////////////////////////////////////////// 
/**
 * Button Panel für Menue 
 */
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(SystemColor.activeCaption);
		zimmerBtn = new JButton("Zimmer");	 
		rechnungBtn = new JButton("Rechnung");
		gaesteBtn = new JButton("Gäste");
///////////////////////////////////////////////////////////////////////////		
/**
 * Komponente dem JFrame hinzufügen
 */
		JFrame frame = new JFrame("Hotel Management Software");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(MainHotelFormular.class.getResource("/hotel/resources/hotel_128.png")));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(cardPanel, BorderLayout.CENTER);
		frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		btnExit = new JButton("Exit");
		reservierungBtn = new JButton("Reservierung");
///////////////////////////////////////////////////////////////////////////	    
/**
* Button Panel Group Layout
*/
		GroupLayout gl_buttonPanel = new GroupLayout(buttonPanel);
		gl_buttonPanel.setHorizontalGroup(
				gl_buttonPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_buttonPanel.createSequentialGroup()
						.addContainerGap()
						.addComponent(gaesteBtn)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(zimmerBtn)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(reservierungBtn)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(rechnungBtn)
						.addGap(214)
						.addComponent(btnExit)
						.addContainerGap())
				);
		gl_buttonPanel.setVerticalGroup(
				gl_buttonPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_buttonPanel.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_buttonPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(gaesteBtn)
								.addComponent(zimmerBtn)
								.addComponent(btnExit)
								.addComponent(rechnungBtn)
								.addComponent(reservierungBtn))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);
		buttonPanel.setLayout(gl_buttonPanel);
	}
}