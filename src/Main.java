import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Cargo> listaCargo = new ArrayList<>();

        listaCargo.add(new CargoJunior());
        listaCargo.add(new CargoPleno());
        listaCargo.add(new CargoSenior());
//        listaCargo.add(new teste());

        int codigoSalario = 1;
        for (Cargo cargo : listaCargo) {
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