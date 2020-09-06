package ViewKill;

import KillController.TaskKill;

public class MainTaskKill {

	public static void main(String[] args) {	
		
		
		TaskKill kill = new TaskKill();
		
		String os = kill.os();
		System.out.println(os);		

//		String process = "TASKLIST /FO TABLE";
//		kill.readProcess(process);
//
//		String param = "5232";
//		kill.killProcess(param);
	}

}
