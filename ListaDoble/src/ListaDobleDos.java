public class ListaDobleDos {
    BotellaAgua principio;

    public ListaDobleDos() {
        principio = null;
    }

    public void insertarNodoInicio(String m1, int m2, double m3) {
        BotellaAgua nodo = new BotellaAgua(m1, m2, m3);
        if (principio == null)
            principio = nodo;
        else {
            nodo.siguiente = principio;
            principio.anterior = nodo;
            principio = nodo;
        }
    }

    public void InsertarNodoAlFinal(String m1, int m2, double m3) {
        BotellaAgua aux = new BotellaAgua(m1, m2, m3); //
        BotellaAgua ultimo = new BotellaAgua(m1, m2, m3); //
        BotellaAgua nodo = new BotellaAgua(m1, m2, m3);
        if (principio == null) // LISTA DE LIGA DOBLE VACIA
            principio = nodo; // LISTA DE LIGA DOBLE CON UN SOLO NODO
        else {
            aux = principio;
            while (aux != null) {
                if (aux.siguiente == null) {
                    ultimo = aux;
                    aux = aux.siguiente;
                } else
                    aux = aux.siguiente;
            }
            ultimo.siguiente = nodo;
            nodo.anterior = ultimo;
        }
    }

    public void recorrer() {
        BotellaAgua viajero = new BotellaAgua();
        viajero = principio;
        if (viajero == null)
            System.out.println("LISTA DE LIGA DOBLE VACIA");
        else {
            while (viajero != null) {
                viajero.muestraDatos();
                viajero = viajero.siguiente;
            }
        }
    }

    public void borrar(String marcaB) // BORRAR NODO CON UNA MARCA EN PARTICULAR
    {
        BotellaAgua aux = new BotellaAgua();
        BotellaAgua lugar = new BotellaAgua();
        lugar = null;
        boolean flag = true;
        aux = principio;
        if (aux == null)
            System.out.println("LISTA DE LIGA DOBLE VACIA");
        else {
            if (aux.marca.compareToIgnoreCase(marcaB) == 0) // está al principio
            {
                lugar = aux;
                principio = lugar.siguiente;
                principio.anterior = null;
            } else {
                aux = aux.siguiente;
                while (aux != null && flag == true) {
                    if (aux.marca.compareToIgnoreCase(marcaB) == 0) {
                        lugar = aux;
                        flag = false;
                        aux = aux.siguiente;
                    } else
                        aux = aux.siguiente;
                }
                if (lugar == null)
                    System.out.println("NO EXISTE EL DATO POR BORRAR");
                else {
                    if (lugar.siguiente == null)
                        lugar.anterior.siguiente = null;
                    else {
                        lugar.anterior.siguiente = lugar.siguiente;
                        lugar.siguiente.anterior = lugar.anterior;
                    }
                }
            }
        }
    }

    public void menu()
    { System.out.println("\nOPCION 1: INSERTAR NODO AL INICIO DE LISTA");
      System.out.println("OPCION 2: INSERTAR NODO AL FINAL DE LISTA");
      System.out.println("OPCION 3: RECORRER LA LISTA");
      System.out.println("OPCION 4: BORRAR NODO USANDO LA MARCA");
      System.out.println("OPCION 5: BORRAR NODO USANDO EL VOLUMEN");
      System.out.println("OPCION 6: BORRAR NODO USANDO EL PRECIO");
      System.out.println("OPCION 7: SALIR DE PROGRAMA\n");
    }
}
