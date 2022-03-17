package Exercicio04;
public class Vendedor extends Funcionario{

    final private String funcao = "Vendedor";

    public Vendedor(String nome, Integer idade, Double salario) {
        super(nome, idade, salario);
        super.setFuncao(funcao);
    }

    @Override
    public void bonificacao() {
        Double salarioAtualizado = this.getSalario() + 3000.00;
        this.setSalario(salarioAtualizado);
    }
}