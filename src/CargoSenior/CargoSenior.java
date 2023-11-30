package CargoSenior;
import Cargo.Cargo;
public class CargoSenior extends Cargo{


    //Atributos

    public int nivel;

    public CargoSenior() {
        super();
        this.nivel = 3;
    }


    public int getNivel() {
        return nivel;
    }

    @Override
    public String getNome(){
        return super.getNome() + " Senior";
    }


    @Override
    public double getSalarioBase(int i) {
        if (i == 3){
            return super.getSalarioBase(i) - (1 * nivel);
        } else {
            return 0;
        }

    }


    @Override
    public String getBeneficios(){
        return "Vale alimentação, GymPass";
    }


}

