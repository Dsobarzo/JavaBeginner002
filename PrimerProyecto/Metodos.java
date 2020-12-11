public class Metodos
{
    public static void main (String[] args){
        
        //llamda a metodo
        double r = sumaDosNumeros(2, 4);
        System.out.println(r);
        
    }
  //calse publica, tipo static (accesible de la clase main, double: retorna un numero double, nombre de el metodo, lo que recibe el metodo)  
    public static double sumaDosNumeros(double n1, double n2){
    
        double resultado = n1 + n2;
        
        return resultado;
        
    }
}
