import Cargo.Cargo;
import CargoJunior.CargoJunior;
import CargoPleno.CargoPleno;
import CargoSenior.CargoSenior;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1ª Versão
//    Cargo desenvolvedor = new Cargo();
//
//        System.out.println(desenvolvedor.getNome());
//        desenvolvedor.verificarSalario(desenvolvedor.getSalarioBase(1));
//        System.out.println(desenvolvedor.getBeneficios());
//
//        desenvolvedor.setNome("Web Design");
//        desenvolvedor.setBeneficios("GymPass");
//
//        System.out.println(desenvolvedor.getNome());
//        desenvolvedor.verificarSalario(desenvolvedor.getSalarioBase(0));
//        System.out.println(desenvolvedor.getBeneficios());


        List<Cargo> listaCargo = new ArrayList<>();

        listaCargo.add(new CargoJunior());
        listaCargo.add(new CargoPleno());
        listaCargo.add(new CargoSenior());

        int codigoSalario = 1;
        for (Cargo cargo : listaCargo){
            exibirInformacoes(cargo, codigoSalario++);
        }

    }

    private static void exibirInformacoes(Cargo cargo, int codigoSalario ){
        System.out.println("Nome do cargo: " + cargo.getNome());
        System.out.println("Salário base: " + cargo.getSalarioBase(codigoSalario));
        System.out.println("Benefício: " + cargo.getBeneficios());
        System.out.println("--------------------------------");
    }

}


