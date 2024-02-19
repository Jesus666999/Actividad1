//Reynoso Garcia Jesus Salvador     22310400

package Principal;

import java.util.Scanner;

public class main {
    static Pila pila;
    static Cola cola;
    public static void main(String[] args) {
        pila = new Pila();
        cola = new Cola();
        menu();  
    }
    
    public static void menu() {
        int num;
        
        Scanner scan = new Scanner(System.in);
        int opc = 0;
        scan = new Scanner(System.in);
        System.out.print("\n\nBienvenido\nIngrese la opcion que desea realizar:\n1.Push pila\n2.Pop pila\n3.Listar pila\n4.Push cola\n5.Pop cola\n6.Listar cola\n7. Salir\n");
        try {
            opc = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ingrese el numero entero de la opcion que desea realizar");
            menu();
        }
        switch (opc) {
            case 1:
                System.out.println("Ingrese el numero que desea ingresar");
                num = Integer.parseInt(scan.nextLine());
                pila.insertar(num);
                menu();
                break;
            case 2:
                pila.eliminar();
                menu();
                break;
            case 3:
                System.out.println(pila.listar());
                menu();
                break;
            case 4:
                System.out.println("Ingrese el numero que desea ingresar");
                num = Integer.parseInt(scan.nextLine());
                cola.insertar(num);
                menu();
                break;
            case 5:
                cola.eliminar();
                menu();
                break;
            case 6:
                System.out.println(cola.listar());
                menu();
                break;
            case 7:
                System.exit(0);
                break;
            default:
                System.out.println("Opcion Invalida");
                menu();
        }
    }
}