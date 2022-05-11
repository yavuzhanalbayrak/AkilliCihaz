package AkilliCihaz;

public class SogutucuKapat implements IIslem {

	   private static SogutucuKapat instance;

	    private SogutucuKapat(){

	    }

	    public static SogutucuKapat getInstance(){
	        if(instance==null){
	            instance=new SogutucuKapat();
	        }
	        return instance;
	    }
	
	@Override
	public void islemYap(IEkran cihazEkran) {
		cihazEkran.mesajGoruntule("\n");
		cihazEkran.mesajGoruntule("Sogutucu Kapatiliyor...\n");
		cihazEkran.mesajGoruntule("Sogutucu: KAPALI\n\n");
	}

}
