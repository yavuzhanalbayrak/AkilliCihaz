package AkilliCihaz;

import java.util.Scanner;

public class TusTakimi implements ITusTakimi{

private static TusTakimi instance;
	
	private TusTakimi() {
		
	}
	public static TusTakimi getInstance() {
		 if(instance==null){
	            instance=new TusTakimi();
	        }
	        return instance;
		
	}
	
	@Override
	public String veriAl() {
		 Scanner input=new Scanner(System.in);
	        return input.next(); 
	}

}
