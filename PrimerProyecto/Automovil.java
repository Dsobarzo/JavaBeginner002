public class Automovil
{
    
    public String marca;
    public int precio;
    public int numPuertas;
    public String color;
    
    //contructor
    public Automovil()
    {
        marca = "Mazda";
        precio = 5000000;
        numPuertas = 4;
        color = "Negro";
      
      
    }
    //contructor que recibe parametros
    public Automovil(String m, int p, int np, String c){
    
        marca = m;
        precio = p;
        numPuertas = np;
        color = c;
        
    }

   public void mostrarPropiedades()
    {
        System.out.println("La marca es: "+ marca + " El precio es: "+ precio +" El numero de puertas es: "+ numPuertas +" El color es: " + color);
    }
    
    public void encender(){
    
        System.out.println("El automovil Encendio!!");
        
    }
    
    public void acelerar(){
    
        System.out.println("El automovil acelero!!");
        
    }
}
