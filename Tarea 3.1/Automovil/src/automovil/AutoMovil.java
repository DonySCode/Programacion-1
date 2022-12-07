package automovil;
/**
 *
 * @author donyc
 */
public class AutoMovil {
    private String color;
    private String marca;
    private String modelo;
    private int matricula;
   
    AutoMovil(String marca, String color, String modelo, int matricula){
        System.out.println("Constructor de AutoMóvil");
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.matricula = matricula;
    }
    //Metodos del Automovil
    
    public void Encender(){
        System.out.println("Encendido");
    }
    public void Apagar(){
        System.out.println("Apagado");
    }
    public void Frenar(){
        System.out.println("Frenado");
    }
    public void Acelerar(){
        System.out.println("Acelerando..");
    }
    public void mostrarVehiculo() {
        System.out.println("\nMarca: "+marca+"\nColor: "+color+"\nModelo: "+modelo+"\nMatricula: "+matricula);
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
}
