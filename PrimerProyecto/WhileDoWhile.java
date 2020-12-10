public class WhileDoWhile
{
     public static void main(String[] args){
                                //0   1   2   3   4
        int [] arregloEnteros = {100,200,300,400,500};
        String [] arregloTextos = {"uno","dos","tres","cuatro","cinco"};
        int i = 0;
        int j = 0;
        //Mientras
        while(i <= 4){
            System.out.println(arregloEnteros[i]);
            i++;
        }
        //hacer
        do{
            System.out.println(arregloTextos[j]);
            j++;
        }while(j <= 4);
    
    }
}

