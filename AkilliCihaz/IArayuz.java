package AkilliCihaz;

public interface IArayuz {
	boolean giris(IVeriTabani veritabani, IEkran cihazEkran, ITusTakimi cihazTusTakimi);
	void secimEkrani(IEyleyici cihazEyleyici,ISicaklikAlgilayici cihazSicaklikAlgiliyici, IEkran cihazEkran, ITusTakimi cihazTusTakimi);
	void sicaklikTalebi(ISicaklikAlgilayici cihazSicaklikAlgiliyici, IEkran cihazEkran);
	void sogutucuAcmaTalebi(IEyleyici cihazEyleyici, IEkran cihazEkran);
	void sogutucuKapamaTalebi(IEyleyici cihazEyleyici, IEkran cihazEkran);
	
}
