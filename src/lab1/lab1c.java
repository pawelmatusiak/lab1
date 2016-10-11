package lab1;
import java.util.*;

public class lab1c {

	public static void main(String[] args) {
		Random generator = new Random();
		

		int ilosc_liczb_wszystkich = 0;

		System.out.println("Program licz¹cy œrednia wa¿ona lab 1c  Pawe³ Matusiak!");

      		System.out.print("Enter count of element:");
      		Scanner klawiatura = new Scanner(System.in);
      		 int ilosc2 = klawiatura.nextInt();	
		int ile_elementow = ilosc2;

		
		

	
		int suma_wszystkich = 0;
                int wprowadzona_liczba = 0;
		
		
		for(int i = 0; i< ile_elementow; i++){
			System.out.print("\r\nWartosc: " + i + ": ");
		String wartosc2 = klawiatura.next();	
		int wartosc = Integer.parseInt(wartosc2);

		int waga = generator.nextInt(10);
		System.out.print("waga wylosowana: " + waga);
				
		
		suma_wszystkich = (suma_wszystkich + (wartosc * waga));

		ilosc_liczb_wszystkich = ilosc_liczb_wszystkich + waga;
		
		

		
		
	}

		System.out.println("\r\nWynik:");
		int wynik_2 = suma_wszystkich/ilosc_liczb_wszystkich;
		System.out.println(wynik_2);





	}

}
