package AkilliCihaz;
import java.sql.DriverManager;
import java.sql.*;

public class VeriTabaniPostgreSQL implements IVeriTabani{

	private static VeriTabaniPostgreSQL instance;
	private VeriTabaniPostgreSQL(){

	}
	private Connection baglan(IEkran cihazEkran){
		
		Connection conn=null;

		try {
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/akillicihaz","postgres","12345");
			if (conn != null);
			else
				cihazEkran.mesajGoruntule("Baglanti girisimi basarisiz!\n");
	        } 
		catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static VeriTabaniPostgreSQL getInstance(){
		if(instance==null){
			instance=new VeriTabaniPostgreSQL();
		}
		return instance;
	}
	    
	    
	    
	
	@Override
	public boolean kullaniciAdiSorgula(String kullanici_adi,IEkran cihazEkran) {
		Connection conn=this.baglan(cihazEkran);

		String sql= "SELECT \"kullanici_adi\" FROM \"kullanicilar\" WHERE \"kullanici_adi\"="+"'"+kullanici_adi+"'";

		try {
			Statement state = conn.createStatement();
			ResultSet result = state.executeQuery(sql);

			conn.close();
			if(!result.next()){
				return false;
			}
			else{
				return true;
			}

		}
		catch (Exception e){
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean sifreSorgula(String kullanici_adi, String sifre,IEkran cihazEkran) {
		Connection conn=this.baglan(cihazEkran);

		String sql= "SELECT \"kullanici_adi\",\"sifre\" FROM \"kullanicilar\" WHERE \"kullanici_adi\"="+"'"+kullanici_adi+"'"+"AND \"sifre\"="+"'"+sifre+"'";

		try {
			Statement state = conn.createStatement();
			ResultSet result = state.executeQuery(sql);

			conn.close();

			if(!result.next()){
				return false;
			}
			else{
				cihazEkran.mesajGoruntule("Kullanici Girisi Basarili..!\n\n");
				return true;
			}

		}
		catch (Exception e){
			e.printStackTrace();
			return false;
		}
	}

	
}
