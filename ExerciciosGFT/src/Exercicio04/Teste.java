package Exercicio04;

public class Teste {

    public static void main (String [] args){

        Funcionario gerente = new Gerente("Vinicius", 23, 10000.00);
        gerente.bonificacao();
        System.out.println(gerente.toString());

        Funcionario surpevisor = new Supervisor("Pedro", 53, 5500.00);
        surpevisor.bonificacao();
        System.out.println(surpevisor.toString());

        Funcionario vendedor = new Vendedor("Thiago", 49, 3550.00);
        vendedor.bonificacao();
        System.out.println(vendedor.toString());
    }
}