package CargoPleno;
import Cargo.Cargo;
public class CargoPleno extends Cargo{


    //Atributos

    public int nivel;

    public CargoPleno() {
        super();
        this.nivel = 2;
    }


    public int getNivel() {
        return nivel;
    }

    @Override
    public String getNome(){
        return super.getNome() + " Pleno";
    }


    @Override
    public double getSalarioBase(int i) {
        if (i == 2){
            return super.getSalarioBase(i) - (5 * nivel);
        } else {
            return 0;
        }

    }


}

