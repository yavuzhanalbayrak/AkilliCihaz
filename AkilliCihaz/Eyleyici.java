package AkilliCihaz;

public class Eyleyici implements IEyleyici{

	private IIslem eyleyiciIslemi;
	private static Eyleyici instance;
    private IIslem sogutucuAcma;
    private IIslem sogutucuKapatma;

    private Eyleyici(){
        sogutucuAcma=SogutucuAc.getInstance();
        sogutucuKapatma=SogutucuKapat.getInstance();
    }
    public static Eyleyici getInstance(){
        if(instance==null){
            instance=new Eyleyici();
        }
        return instance;
    }
	
	@Override
	public void eyleyiciIslem(IIslem eyleyiciIslemi,IEkran cihazEkran) {
		eyleyiciIslemi.islemYap(cihazEkran);
		
	}

}
