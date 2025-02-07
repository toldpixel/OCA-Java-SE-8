import Controller.ComputingController;
import Modell.ConnectionManager;
import Modell.FileManager;
import Modell.JobScheduler;
import View.GUI;

public class ProgramDriver {

	public static void main(String[] args) {
		ConnectionManager connectionM1 = new ConnectionManager();
		FileManager fileM1 = new FileManager();
		JobScheduler jobSC1 = new JobScheduler();
		ComputingController comCont1 = new ComputingController();
		comCont1.setConnectionM(connectionM1);
		comCont1.setFileM(fileM1);
		comCont1.setJobSC(jobSC1);
		GUI gui1 = new GUI(comCont1);
		comCont1.setGui(gui1);
		gui1.start();
	}

}
