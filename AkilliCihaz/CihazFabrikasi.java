package AkilliCihaz;

public class CihazFabrikasi {
	public static Cihaz getCihaz(String surum) {
		Cihaz cihaz;
		if("1.0.0".equalsIgnoreCase(surum)) {
			cihaz=Cihaz.getInstance(VeriTabaniPostgreSQL.getInstance(),Arayuz.getInstance(),Eyleyici.getInstance(),SicaklikAlgilayici.getInstance(15,35),Ekran.getInstance(),TusTakimi.getInstance());

			
		}else {
			System.out.println("Gecerli Bir Surum Giriniz");
			cihaz=null;
		}
		return cihaz;
		
	}

}
