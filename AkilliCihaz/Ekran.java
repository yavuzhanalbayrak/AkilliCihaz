package AkilliCihaz;

public class Ekran implements IEkran {
	private static Ekran instance;
	
	private Ekran() {
		
	}
	public static Ekran getInstance() {
		 if(instance==null){
	            instance=new Ekran();
	        }
	        return instance;
		
	}
	
	public void mesajGoruntule(String mesaj) {
        System.out.print(mesaj);
    }
}
