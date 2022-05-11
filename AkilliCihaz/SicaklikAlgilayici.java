package AkilliCihaz;

import java.util.Random;

public class SicaklikAlgilayici extends Observable implements ISicaklikAlgilayici {
	 private int anlikSicaklik;
	 private int minSicaklik;
	 private int maxSicaklik;
	 private Random random=new Random();
	 private static SicaklikAlgilayici instance;
	 

	 private SicaklikAlgilayici(int min,int max){
		 super();
		 minSicaklik=min;
		 maxSicaklik=max;
		 Ebeveyn anne = new Ebeveyn("Buse");
		 ekle(anne);
	 }

	 public static SicaklikAlgilayici getInstance(int min,int max){
		 if(instance==null){
			 instance=new SicaklikAlgilayici(min,max);
		 }
		 return instance;
	 }
	 
	 @Override
	 public void sicaklikOku(IEkran cihazEkran) {
		 anlikSicaklik=Math.abs(random.nextInt()%50);
		 cihazEkran.mesajGoruntule("\n");
		 cihazEkran.mesajGoruntule("Sicaklik: ");
		 cihazEkran.mesajGoruntule(anlikSicaklik+"\n\n");
		 
		 sicaklikKontrolEt( cihazEkran);
	   

	   
	 }
	 @Override
	 public int getAnlikSicaklik(IEkran cihazEkran) {
		 return anlikSicaklik;
	 }
	 @Override
	 public void sicaklikKontrolEt(IEkran cihazEkran) {
		
		 if(anlikSicaklik<minSicaklik) {
			 haberVer( cihazEkran);
		 }
		 else if(anlikSicaklik>maxSicaklik) {
			 haberVer( cihazEkran);
			 
		 }
	 }

	
	

}
