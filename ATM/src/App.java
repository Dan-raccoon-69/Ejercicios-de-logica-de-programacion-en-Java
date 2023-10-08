public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(cambio(5252));
		System.out.println(cambio(3246));
    }

    public static String cambio(int num){
    int cQui = 0, cDos = 0, cCien = 0, cCincuenta = 0, mDiez = 0, mPeso = 0;
    System.out.println("\nCambio de: $" + num);

    while(num >= 500 && num!=0){
		num = num - 500;
		cQui++;
	}
    
    while (num >= 200 && num!=0){
    	num = num - 200;
		cDos++;
	}
	
	while (num >= 100 && num!=0){
    	num = num - 100;
		cCien++;
	}
	
	while (num >= 50 && num!=0) {
    	num = num - 50;
		cCincuenta++;
	}
	
	while (num >= 10 && num!=0){
    	num = num - 10;
		mDiez++;
	}
	
	while (num >= 1 && num!=0){
    	num = num - 1;
		mPeso++;
	}
        return "Billetes 500: " + cQui + "\nBilletes 200: " + cDos + "\nBilletes 100: " + cCien + "\nBilletes 50: " + cCincuenta + "\nMonedas 10: " + mDiez + "\nMonedas 1: " + mPeso;
    }
}