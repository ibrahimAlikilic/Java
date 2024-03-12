package pck;

public class Greens implements IFood,ISalad {
	private String name;
	private double cookingTime;
	
	// kurucu oluşturalım
	public Greens(String name, double cookingTime) {
		this.name=name;
		this.cookingTime=cookingTime;
	}
	
	@Override
	public String getFood() {
		return name + " " + cookingTime;
	}
	
	@Override
	public String getSalad() {
		return name;
	}
	/*
	 @Override anotasyonu, bir metodun (method) alt sınıfta (subclass) üst sınıfta (superclass) tanımlandığına dair 
	 bir belirteçtir. Yani, bu anotasyon kullanılarak belirtilen metotun, superclass'ta (üst sınıfta) zaten tanımlı 
	 bir metodu ezdiği (override ettiği) ifade edilir. 
	 Bu, Java dilinde genellikle polymorphism (çok biçimlilik) ve method overriding (metodun üzerine yazma) 
	 gibi konseptlerle ilgili olduğunu gösterir.

	Örneğin, yukarıdaki kodda Greens sınıfı, IFood ve ISalad arayüzlerini uyguladığı için bu arayüzlerin içinde tanımlı olan 
	metotları (getFood ve getSalad) implemente etmek zorundadır. 
	Bu metotların başına @Override eklenmiş, çünkü bu metotlar zaten bu sınıfın üst sınıflarında (interface'lerinde) 
	tanımlanmıştır ve bu sınıf bu metotları ezerek (override ederek) implemente etmektedir. 
	Bu, programcılara hata yapma durumunda uyarı verir ve metotların gerçekten ezilip ezilmediğini kontrol etmelerini sağlar.
	*/
}
