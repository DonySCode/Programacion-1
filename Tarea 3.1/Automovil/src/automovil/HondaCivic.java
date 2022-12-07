package automovil;
/**
 *
 * @author donyc
 */
public class HondaCivic extends AutoMovil{
    
    //Metodo constructor
    
    public HondaCivic(){
        System.out.println("Constructor de HondaCivic");
    }
    //Metodos de nuestro Automovil
    
    @Override
    public void Encender(){
    super.Encender();
        System.out.println("Encendiendo");
    }
    
    @Override
    public void Apagar(){
    super.Apagar();
        System.out.println("Apagando");
    }
    

    
}  

