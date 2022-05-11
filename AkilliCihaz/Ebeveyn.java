package AkilliCihaz;

public class Ebeveyn implements IObserver {

	String adi;
	public Ebeveyn(String adi){
		this.adi=adi;
	}
	
	@Override
	public void update(Observable observable,IEkran cihazEkran) {
		SicaklikAlgilayici algilayici=(SicaklikAlgilayici) observable;
		cihazEkran.mesajGoruntule(adi+":" + " Oda " + algilayici.getAnlikSicaklik( cihazEkran ) + " Derece Olmus!!!\n\n");
		
	}

}
