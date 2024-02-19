//Reynoso Garcia Jesus Salvador     22310400
package Principal;

import java.lang.reflect.GenericDeclaration;
import javax.swing.JOptionPane;

public class Cola {

    Nodo primero;

    public Cola() {
        primero = null;
    }

    public void insertar(int data) {
        Nodo nuevo = new Nodo(data);
        if (primero == null) {
            primero = nuevo;
        } else {
            Nodo actual = primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }

    public void eliminar() {
        if (primero == null) {
            System.out.println("La cola esta vacia :(");
        } else {
            if (primero.getSiguiente() == null) {
                primero = null;
                System.out.println("Primer Nodo de la cola eliminado correctamente");
            } else {
                primero = primero.getSiguiente();
                System.out.println("Primer Nodo de la cola eliminado correctamente");
            }
        }
    }

    public String listar() {
        int cont = 1;
        String texto = "-----Cola-----";
        Nodo actual = primero;
        if (primero == null) {
            texto = "La cola esta vacia :(";
        } else {
            while (actual != null) {
                texto = texto + "\nNumero " + cont + ":\t" + actual.getData()+ "\n";
                actual = actual.getSiguiente();
                cont ++;
            }
        }
        return texto;
    }
}
