package Cargo;

public class Cargo {
    //Atributos

    public String nome;

    public Double salarioBase;

    public String beneficios;

    public Cargo() {
        this.nome = "Desenvolvedor";
        this.salarioBase = 50.00;
        this.beneficios = "Vale alimentação";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }


    public double getSalarioBase(int i){
        if (i <= 3){
            return salarioBase;
        } else {
            System.out.println("ERROR");
            return 0.0;
        }
    }
}

