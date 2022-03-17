package Exercicio04;
public class Supervisor extends Funcionario{

    final private String funcao = "Surpevisor";

    public Supervisor(String nome, Integer idade, Double salario) {
        super(nome, idade, salario);
        super.setFuncao(funcao);
    }

    @Override
    public void bonificacao() {
        Double salarioAtualizado = this.getSalario() + 5000.00;
        this.setSalario(salarioAtualizado);
    }
}