package Controller;

import Modell.ConnectionManager;
import Modell.FileManager;
import Modell.JobScheduler;
import View.GUI;

public class ComputingController {
	private GUI gui = new GUI();
	private ConnectionManager connectionM = new ConnectionManager();
	private FileManager fileM = new FileManager();
	private JobScheduler jobSC = new JobScheduler();
	private boolean checkInputValue = false;

	public void setGui(GUI gui) {
		this.gui = gui;
	}

	public void setConnectionM(ConnectionManager connectionM) {
		this.connectionM = connectionM;
	}

	public void setFileM(FileManager fileM) {
		this.fileM = fileM;
	}

	public void setJobSC(JobScheduler jobSC) {
		this.jobSC = jobSC;
	}

	public void start() {
		
	}

	public boolean checkInputData(String txtDictionaryPath, String txtMD5hash) {
		this.checkInputValue = fileM.checkDataAvailable(txtDictionaryPath,txtMD5hash);
		
		if(isCheckInputValue()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void setPassword(String passwd) {
		fileM.setMD5Hash(passwd);
	}

	public boolean isCheckInputValue() {
		return checkInputValue;
	}

	public void setCheckInputValue(boolean checkInputValue) {
		this.checkInputValue = checkInputValue;
	}

	public void checkClientConnection() {
		connectionM.checkClientsAvailable();
		
	}

}
