package Exercicio04;
public class Gerente extends Funcionario {

    final private String funcao = "Gerente";

    public Gerente(String nome, Integer idade, Double salario) {
        super(nome, idade, salario);
        super.setFuncao(funcao);
    }

    @Override
    public void bonificacao() {
        Double salarioAtualizado = this.getSalario() + 10000.00;
        this.setSalario(salarioAtualizado);
    }

}