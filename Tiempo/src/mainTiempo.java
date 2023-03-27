public class mainTiempo {
    public static void main(String[] args) throws Exception {
        Tiempo t1 = new Tiempo(11, 59, 16);
        Tiempo t2 = new Tiempo(23, 14, 16);
        
        System.out.println("Probando el tick");
        for(int i = 0; i<70; i++){
            t1.imprimeEstandar();
            t1.tick();
            Thread.sleep(1000);
        }
        
        System.out.println("\nProbando metodo Estandar y metodo imprime24Horas");
        t2.imprimeEstandar();
        t2.imprime24Horas();
    }
}
