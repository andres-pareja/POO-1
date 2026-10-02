
package ClasesYObjetos;

import javax.swing.JOptionPane;


public class Metodos {
    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    float division;
    
    //Metodos
    
    //metodo que pide dos numeros
    
    public void leerNumeros(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
    }
    
    public void sumar(){
    
        suma = numero1+numero2;
    }
    
    public void restar(){
    
        resta = numero1-numero2;
    }
    
    public void multiplicar(){
    
        multiplicacion = numero1*numero2;
    }
    
    public void dividir(){
    
        division = numero1/numero2;
    }
    
    public void mostrarResultados(){
        System.out.println("la suma es: "+suma);
        System.out.println("la resta es: "+resta);
        System.out.println("la multiplicacion es: "+multiplicacion);
        System.out.println("la divison es: "+division);
        System.out.println("el numero 1 es: "+numero1);
        System.out.println("el numero 2 es: "+numero2);
    }
    
}
