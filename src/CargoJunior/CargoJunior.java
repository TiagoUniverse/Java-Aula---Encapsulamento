package CargoJunior;
import Cargo.Cargo;

public class CargoJunior extends Cargo{

    //Atributos
    public int nivel;

    public CargoJunior() {
        super();
        this.nivel = 1;
    }

    public int getNivel() {
        return nivel;
    }


    @Override
    public String getNome(){
        return super.getNome() + " Junior";
    }


    @Override
    public double getSalarioBase(int i) {
        if (i == 1){
            return super.getSalarioBase(i) - (20 * nivel);
        } else {
            return 0;
        }

    }


    @Override
    public String getBeneficios(){
        return "Vale passagem";
    }




}

