package hesapMakinesi;

public class HesapMakinesiManager {
	
	public void toplaSonuc (HesapMakinesi hesapMakinesi){
		System.out.println("Say?lar Topland? ve Sonu? : " + hesapMakinesi.getTopla() );
	}
	
	public void cikarSonuc (HesapMakinesi hesapMakinesi){
		System.out.println("Say?lar ??kar?ld? ve Sonu? : " + hesapMakinesi.getCikar() );
	}
	
	public void carpSonuc (HesapMakinesi hesapMakinesi){
		System.out.println("Say?lar ?arp?ld? ve Sonu? : " + hesapMakinesi.getCarp() );
	}
	public void bolSonuc (HesapMakinesi hesapMakinesi){
		System.out.println("Say?lar B?l?nd? ve Sonu? : " + hesapMakinesi.getBol() );
	}
	
	

}
