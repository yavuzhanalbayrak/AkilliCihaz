package AkilliCihaz;

public class SogutucuAc implements IIslem {
    private static SogutucuAc instance;

    private SogutucuAc(){

    }

    public static SogutucuAc getInstance(){
        if(instance==null){
            instance=new SogutucuAc();
        }
        return instance;
    }
	@Override
	public void islemYap(IEkran cihazEkran) {
		cihazEkran.mesajGoruntule("\n");
		cihazEkran.mesajGoruntule("Sogutucu Aciliyor...\n");
		cihazEkran.mesajGoruntule("Sogutucu: ACIK\n\n");
	}

}
