package Cuentas;//nombre del paquete que estoy usando
public class Main {//nombre de la clase en la que estoy trabajando
    public static void main(String[]args) {//Creación del metodo que permitirá mostrar cosas por pantalla
    	operativa_cuenta();//metodo añadido
    }
    public static void operativa_cuenta() {
    }
      public static void main1(String[] args) {//Creación del metodo que permitirá mostrar cosas por pantalla
     float cantidad;//parametros:
		CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);//indicacion del texto que aparecerá por pantalla
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );//impresion de texto por pantalla

        try {
        	cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");//impresion de texto por pantalla
        }
        try {
            System.out.println("Ingreso en cuenta");//impresion de texto por pantalla
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");//impresion de texto por pantalla
        }
    }
}
