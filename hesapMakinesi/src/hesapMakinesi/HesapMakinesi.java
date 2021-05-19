package hesapMakinesi;

public class HesapMakinesi {
	
	private int sayi1;
	private int sayi2;
	
	public HesapMakinesi() {
		
	}
	
	public HesapMakinesi(int sayi1, int sayi2) {
		
		this.sayi1 = sayi1;
		this.sayi2 = sayi2;
	}

	public int getSayi1() {
		return sayi1;
	}

	public void setSayi1(int sayi1) {
		this.sayi1 = sayi1;
	}

	public int getSayi2() {
		return sayi2;
	}

	public void setSayi2(int sayi2) {
		this.sayi2 = sayi2;
	}

	
	public int getTopla() {
		return sayi1+sayi2;
	}
	
	public int getCikar() {
		return sayi1-sayi2;
	}
	public int getCarp() {
		return sayi1*sayi2;
	}
	
	public int getBol() {
		return sayi1/sayi2;
	}



}


