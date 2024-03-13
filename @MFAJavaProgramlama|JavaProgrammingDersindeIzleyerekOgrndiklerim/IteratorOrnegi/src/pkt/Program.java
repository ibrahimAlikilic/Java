package pkt;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/*
		 * Bu satır, Java'da bir konsol girişi okumak için kullanılan Scanner sınıfından bir nesne oluşturur. 
		 Scanner, Java'nın java.util paketinde bulunan bir sınıftır ve metin tabanlı girişleri işlemek için kullanılır.

		System.in, standart giriş akışını temsil eder. Yani, kullanıcının klavyeden girdi yapabileceği yerdir. Scanner sınıfı, bu giriş akışından okuma yapabilir ve veriyi Java programına aktarabilir.

		Dolayısıyla, Scanner sınıfından bir nesne oluşturarak, klavyeden girilen verileri okumak için bir araç hazırlanmış olur. Bu nesne, in adı altında kullanılmak üzere tanımlanmıştır.
		 */
		List<Esya> esyalar=new LinkedList<>();
		esyalar.add(new Esya("Masa",20,30));
		esyalar.add(new Esya("Sandalye",10,15));
		esyalar.add(new Esya("Kitap",5,2));
		esyalar.add(new Esya("Defter",5,1));
		
		// maksimum kilo ile karşılaştırma yapıcaz
		System.out.print("Makas kilo : ");
		double makasKilo=in.nextDouble();
		// foreach döngüsü kullanalım dedik
		// bundaki sorun koleksiyonu değiştirince sorun oluyor ( koleksiyonu değiştirdiğimiz an silem işlemimiz
		// bunun gibi sebeplerden ötürü burada iterator kullanacağız
		/*for(var esya:esyalar) {
			if(esya.getKilo()>makasKilo) 
				esyalar.remove(esya); // bunun çalışabilmesi için yazmış olduğumuz equals ihtiyacımız var bunun sayesinde 
									 // bulup silebiliyor
		}*/
		
		// iterator ile
		Iterator<Esya> itr = esyalar.iterator();// iteratöre atamış oldum
		
		while (itr.hasNext()) {// ilerleyebildiğin kadar ilerle demek
			// burada iteratör ile silme yapınca sorun olmayacak
			// veri yapılarında pointe rile gezerken aradaki elemanı silme mantığı gibi düşünmem lazım anladığım kadarıyla
			// hark orada ben bağları kendim oluşturuyordum burada java otomatik yapıyor
			Esya esya = itr.next();
			if(esya.getKilo()>makasKilo) 
				itr.remove();
		}
		System.out.print(esyalar);
	}

}
