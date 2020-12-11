public class AutomovilElectrico extends Automovil
{
    //EJEMPLO DE HERENCIA
    public int nivelCarga;
    
    public AutomovilElectrico(){
    
        //llamada a contructor sin enviar parametros
        super();
        nivelCarga = 50;
    
    }
    
    public void recargar(){
    
        nivelCarga = 100;
        
    
    }
     public void mostrarCarga(){
    
        System.out.println("El nivel de carga es: "+ nivelCarga);
        
    
    }
    
}
