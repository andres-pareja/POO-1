
package ClasesYObjetos;


public class Carro {
    //ATRIBUTOS
    String color;
    String marca;
    int km;
    int modelo;
    
    //METEDO
    public static void main(String [] args){
        Carro carro1= new Carro();
        
        carro1.color = "negro";
        carro1.marca = "BMW";
        carro1.km = 300;
        carro1.modelo = 2023;
        
        System.out.println("El color del carro es: "+carro1.color);
        System.out.println("La marca del carro es: "+carro1.marca);
        System.out.println("El Km del carro es: "+carro1.km);
        System.out.println("El modelo del carro es: "+carro1.modelo);
        
        
         Carro carro2= new Carro();
        
        carro2.color = "morado";
        carro2.marca = "AUDI";
        carro2.km = 600;
        carro2.modelo = 2021;
        
        System.out.println("El color del carro 2 es: "+carro2.color);
        System.out.println("La marca del carro 2 es: "+carro2.marca);
        System.out.println("El Km del carro 2 es: "+carro2.km);
        System.out.println("El modelo del carro 2 es: "+carro2.modelo);
    }
    
   
}
