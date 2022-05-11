package AkilliCihaz;

public class Cihaz {
	 private IEyleyici cihazEyleyici;
	 private IArayuz cihazArayuz;
	 private IVeriTabani cihazVeritabani;
	 private ISicaklikAlgilayici cihazSicaklikAlgilayici;
	 private ITusTakimi cihazTusTakimi;
	 private IEkran cihazEkran;
	 private String surum;

	 private static Cihaz instance;
	 private Cihaz(IVeriTabani veritabani, IArayuz arayuz,IEyleyici eyleyici,ISicaklikAlgilayici sicaklikalgilayici,IEkran ekran,ITusTakimi tus){
		cihazArayuz=arayuz;
		cihazVeritabani=veritabani;
		cihazEyleyici=eyleyici;
		cihazSicaklikAlgilayici=sicaklikalgilayici;
		cihazEkran=ekran;
		cihazTusTakimi=tus;
		surum="1.0.0";
		
		
	 }	

	 public static Cihaz getInstance(IVeriTabani veritabani,IArayuz arayuz,IEyleyici eyleyici,ISicaklikAlgilayici sicaklik,IEkran ekran,ITusTakimi tus){
		 if(instance==null){
			 instance=new Cihaz(veritabani,arayuz,eyleyici,sicaklik,ekran,tus);
		 }
		 return instance;
	 }
	 public void calistir() {
		 cihazEkran.mesajGoruntule("Cihaz Aciliyor...\n");
		 cihazEkran.mesajGoruntule("Cihaz: ACIK\n");
		 cihazEkran.mesajGoruntule("\n");
		 while (!cihazArayuz.giris(cihazVeritabani,cihazEkran,cihazTusTakimi)) { }
		 cihazArayuz.secimEkrani(cihazEyleyici,cihazSicaklikAlgilayici,cihazEkran,cihazTusTakimi);
		 
	 }
	
}
