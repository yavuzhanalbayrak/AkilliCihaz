package AkilliCihaz;

import java.sql.Connection;

public interface IVeriTabani {
	
	boolean kullaniciAdiSorgula(String kullanici_adi, IEkran cihazEkran);
	public boolean sifreSorgula(String kullanici_adi, String sifre,IEkran cihazEkran);
}
