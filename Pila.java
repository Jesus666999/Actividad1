//Reynoso Garcia Jesus Salvador     22310400
package Principal;

public class Pila {

    Nodo primero;

    public Pila() {
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
        Nodo actual = primero;
        if (primero == null) {
            System.out.println("La pila esta vacia :(");
        } else {
            if (actual.getSiguiente() == null) {
                primero = null;
                System.out.println("Numero eliminado de la pila exitosamente");
            } else {
                while (actual.getSiguiente().getSiguiente() != null) {
                    actual = actual.getSiguiente();
                }
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                System.out.println("Numero eliminado de la pila exitosamente");
            }
        }
    }

    public String listar() {
        int cont = 1;
        String texto = "-----Pila-----";
        Nodo actual = primero;
        if (primero == null) {
            texto = "La pila esta vacia :(";
        } else {
            while (actual != null) {
                texto = texto + "\nNumero " + cont + ":\t" + actual.getData()+"\n";
                actual = actual.getSiguiente();
                cont ++;
            }
        }
        return texto;
    }
}
