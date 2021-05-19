package hesapMakinesi;

public class HesapMakinesiManager {
	
	public void toplaSonuc (HesapMakinesi hesapMakinesi){
		System.out.println("Sayılar Toplandı ve Sonuç : " + hesapMakinesi.getTopla() );
	}
	
	public void cikarSonuc (HesapMakinesi hesapMakinesi){
		System.out.println("Sayılar Çıkarıldı ve Sonuç : " + hesapMakinesi.getCikar() );
	}
	
	public void carpSonuc (HesapMakinesi hesapMakinesi){
		System.out.println("Sayılar Çarpıldı ve Sonuç : " + hesapMakinesi.getCarp() );
	}
	public void bolSonuc (HesapMakinesi hesapMakinesi){
		System.out.println("Sayılar Bölündü ve Sonuç : " + hesapMakinesi.getBol() );
	}
	
	

}
