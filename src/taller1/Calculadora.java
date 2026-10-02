package taller1;
 
import javax.swing.JOptionPane;
 
public class Calculadora {
    //Atributos
    int numero1;
    int numero2;
    int multiplicacion;
    int division;
    boolean divisionValida;
 
    //Metodos
 
    //metodo que pide dos numeros
    // Integer.parseInt(JOptionPane.showInputDialog crea un cuadro de dialogo para pedir el numero y lo convierte a entero
    
    public void leerNumeros(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
    }
 
    //multiplica sin usar el operador * (sumas sucesivas)
    public void multiplicar(){
        int a = Math.abs(numero1);
        int b = Math.abs(numero2);
 
        multiplicacion = 0;
        for (int i = 0; i < b; i++) {
            multiplicacion = multiplicacion + a;
        }
 
        //el resultado es negativo si solo uno de los dos es negativo
        if ((numero1 < 0) != (numero2 < 0)) {
            multiplicacion = -multiplicacion;
        }
    }
 
    //divide sin usar el operador / (restas sucesivas)
    public void dividir(){
        if (numero2 == 0) {
            divisionValida = false;
            return;
        }
        divisionValida = true;
 
        int dividendo = Math.abs(numero1);
        int divisor = Math.abs(numero2);
 
        division = 0;
        while (dividendo >= divisor) {
            dividendo = dividendo - divisor;
            division++;
        }
 
        if ((numero1 < 0) != (numero2 < 0)) {
            division = -division;
        }
    }
 
    public void mostrarResultados(){
        System.out.println("el numero 1 es: " + numero1);
        System.out.println("el numero 2 es: " + numero2);
        System.out.println("la multiplicacion es: " + multiplicacion);
        if (divisionValida) {
            System.out.println("la division es: " + division);
        } else {
            System.out.println("la division no se puede hacer: no se puede dividir entre cero");
        }
    }
 
}