import java.util.Scanner;

public class KucuktenBuyukSiralama {

	public static void main(String[] args) {
		
		int sayi1, sayi2, sayi3;
		
	    Scanner input = new Scanner(System.in);
	    
	    System.out.print("Birinci sayıyı giriniz : ");
	    sayi1 = input.nextInt();
	    
	    System.out.print("İkinci sayıyı giriniz : ");
	    sayi2 = input.nextInt();
	    
	    System.out.print("Üçüncü sayıyı giriniz : ");
	    sayi3 = input.nextInt();
	    
	    if (sayi1<sayi2 && sayi1<sayi3) {	    	
	    	if (sayi2 < sayi3) System.out.println ("birinci < ikinci < üçüncü");
	    	else System.out.println ("birinci < üçüncü < ikinci");
	    }
	    
	    if (sayi2<sayi1 && sayi2<sayi3) {	    	
	    	if (sayi1 < sayi3) System.out.println ("ikinci < birinci < üçüncü");
	    	else System.out.println ("ikinci < üçüncü < birinci");
	    }
	    
	    if (sayi3<sayi1 && sayi3<sayi2) {
	    	if (sayi1 < sayi2) System.out.println ("üçüncü < birinci < ikinci");
	    	else System.out.println ("üçüncü < ikinci < birinci");	    	
	    }
	    
	}

}
