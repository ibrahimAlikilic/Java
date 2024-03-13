package pkt;

public class Esya {
	private String isim;
	private double hacim;
	private double kilo;
	
	// kurucu oluşturup atamalarımızı yapalım
	public Esya(String isim,double hacim,double kilo) {
		this.isim=isim;
		this.hacim=hacim;
		this.kilo=kilo;
	}
	
	// kiloyu döndüreceğimiz fonksiyon
	public double getKilo() {
		return kilo;
	}
	
	// Eşitlik kontrolü
	@Override
	public boolean equals(Object obj) {
		if(obj==null || !(obj instanceof Esya)) return false;
		return this.isim.equals(((Esya)obj).isim);
	}
	/*
	 * Metodun imzası: @Override anotasyonu, bu metodun Object sınıfındaki equals metodunu geçersiz kıldığını belirtir.
	Parametre: Object obj parametresi, bu metoda geçirilen nesneyi alır. 
Bu, Java'da tüm sınıfların üst sınıfı olan Object tipidir.
	Tür dönüşümü: instanceof anahtar kelimesi, bir nesnenin belirli bir sınıftan olup olmadığını kontrol eder. 
Burada obj'nin Esya sınıfından olup olmadığı kontrol edilir. Eğer değilse veya null ise, false döndürülür.
	İçerik karşılaştırması: Eğer obj parametresi Esya sınıfındansa, bu sınıfın özellikleri (isim) karşılaştırılır. 
İsimler aynı ise, true döndürülür; aksi halde false döndürülür.
Bu şekilde equals metodu, iki Esya nesnesinin isim özelliklerinin aynı olup olmadığını kontrol ederek nesne eşitliğini belirler. Bu metodu gerektiği gibi uygulamak, özellikle nesnelerin mantıksal eşitlik durumunu belirlemek için önemlidir.
	 */

	@Override
	public String toString() {
		return "\n"+isim+" "+kilo+" kg, hacim : "+hacim;
	}
}
