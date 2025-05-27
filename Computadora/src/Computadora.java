public class Computadora {
    private String marca;
    private String modelo;
    private boolean encendida=false;


    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void encendida(){
        if(!encendida){
            this.encendida = true;
            System.out.println("Encendido");
        }
        /*else{
            this.encendida = false;
            System.out.println("Apagando");
        }*/

    }
    public void apagar(){
        if(encendida){
            this.encendida = false;
            System.out.println("Apagando");
        }
    }

}
