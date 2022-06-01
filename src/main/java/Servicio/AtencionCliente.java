package Servicio;
//@michi
import java.util.Scanner;
import vista.VistaTurnos;

public class AtencionCliente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        VistaTurnos vistaTurnos = new VistaTurnos();
        int opc = 0;
        do {
            System.out.println("1. Turnos\n2. Cajeros\n3. Reportes"
                    + "\n0.Salir");
            opc = teclado.nextInt();
            switch(opc){
                case 1: vistaTurnos.menu();break;
                case 2: ; break;
                case 3: ; break;
            }
        }while (opc != 0);
    }
}
