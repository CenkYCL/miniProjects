package hesapMakinesi;

public class Main {

	public static void main(String[] args) {
		
		HesapMakinesi hesapMakinesi = new HesapMakinesi();		
		hesapMakinesi.setSayi1(10);
		hesapMakinesi.setSayi2(2);
		
		HesapMakinesiManager hesapMakinesiManager = new HesapMakinesiManager();
		hesapMakinesiManager.toplaSonuc(hesapMakinesi);
		hesapMakinesiManager.cikarSonuc(hesapMakinesi);
		hesapMakinesiManager.carpSonuc(hesapMakinesi);
		hesapMakinesiManager.bolSonuc(hesapMakinesi);
		
		

	}

}
