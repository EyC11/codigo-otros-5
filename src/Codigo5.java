import java.util.Scanner;//Se importó el scanner


public class Codigo5 {
	
	public static void main(String[] args) {
		
	
	Scanner s = new Scanner(System.in);// Se agregó system.in
    System.out.print("Introduzca un número: ");// faltaba comilla doble
    int ni = s.nextInt();//cambiando tipo de dato string a int y el scanner
    //int c = ni; comentando repetición del codigo
    
    int afo = 0;//numero afortunado
    int noAfo = 0;//numero no afortunado
    
    while (ni > 0) {
	  int digito = (ni % 10);// Eliminamos conversion (int)
      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
		afo++;
      } else {
		noAfo++;
	  
	  ni /= 10;//divide entre 10 y se reasigna a ni
    }

    if (afo > noAfo) {
      System.out.println("El " + ni + " es un número afortunado.");// faltaba una t en println
    } else {
      System.out.println("El " + ni + " no es un número afortunado.");// cambiamos c por ni
    }
    
  }
	}//fataba agregar método main
}