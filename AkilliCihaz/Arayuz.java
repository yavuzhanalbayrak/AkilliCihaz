package AkilliCihaz;

import java.util.Scanner;

public class Arayuz implements IArayuz {
	
	private int islem;
	private static Arayuz instance;
	
	private Arayuz(){
		
    }

    public static Arayuz getInstance(){
        if(instance==null){
            instance=new Arayuz();
        }
        return instance;
    }
	
	@Override
	public boolean giris(IVeriTabani veritabani, IEkran cihazEkran,ITusTakimi cihazTusTakimi) {
		
		String kullaniciAdi;
		String sifre;
		
		cihazEkran.mesajGoruntule("Kullanici Adi: ");
		kullaniciAdi = cihazTusTakimi.veriAl();;
		if (veritabani.kullaniciAdiSorgula(kullaniciAdi,cihazEkran)) {
			cihazEkran.mesajGoruntule("Sifre: ");
			sifre = cihazTusTakimi.veriAl();;
			
			if (veritabani.sifreSorgula(kullaniciAdi,sifre,cihazEkran)) {
				return true;
			}
			else {
				cihazEkran.mesajGoruntule("Kullanici Girisi Basarisiz: \n\n");
				return false;
			}
			
		}
		else {
			cihazEkran.mesajGoruntule("Kullanici Adi Gecersiz: \n\n");
			return false;
		}
		
		
		
	}

	@Override
	public void secimEkrani(IEyleyici cihazEyleyici,ISicaklikAlgilayici cihazSicaklikAlgilayici, IEkran cihazEkran,ITusTakimi cihazTusTakimi) {
		
		while(2>1) {
			cihazEkran.mesajGoruntule("1-Sicaklik Goruntule: \n");
			cihazEkran.mesajGoruntule("2-Sogutucu Ac\n");
			cihazEkran.mesajGoruntule("3-Sogutucu Kapat\n");
			cihazEkran.mesajGoruntule("4-Cikis\n\n");
			cihazEkran.mesajGoruntule("Islem Giriniz: ");
			islem = Integer.parseInt(cihazTusTakimi.veriAl());
		
			if (islem==1) {
				sicaklikTalebi(cihazSicaklikAlgilayici,cihazEkran);
			}
			else if(islem==2) {
				sogutucuAcmaTalebi(cihazEyleyici,cihazEkran);
			}
			else if(islem==3) {
				sogutucuKapamaTalebi(cihazEyleyici,cihazEkran);
			}
			else if(islem==4) {
				cihazEkran.mesajGoruntule("\n");
				cihazEkran.mesajGoruntule("Cihaz Kapatiliyor...\n");
				cihazEkran.mesajGoruntule("Cihaz: KAPALI\n");
				break;
			}
			else {
				cihazEkran.mesajGoruntule("Gecerli Bir Islem Giriniz.\n\n");
			}
			
		}
		
		
	}

	
	@Override
	public void sicaklikTalebi(ISicaklikAlgilayici cihazSicaklikAlgiliyici, IEkran cihazEkran) {
		cihazSicaklikAlgiliyici.sicaklikOku(cihazEkran);
		
	}

	@Override
	public void sogutucuAcmaTalebi(IEyleyici cihazEyleyici, IEkran cihazEkran) {
		cihazEyleyici.eyleyiciIslem(SogutucuAc.getInstance(),cihazEkran);
		
	}

	@Override
	public void sogutucuKapamaTalebi(IEyleyici cihazEyleyici, IEkran cihazEkran) {
		cihazEyleyici.eyleyiciIslem(SogutucuKapat.getInstance(),cihazEkran);
		
	}

	
	
}
