package br.com.fiap;

public class UsaFuncionario1 {
  public static void main(String[] args) {
    Funcionario funcionario1 = new Funcionario();

    funcionario1.setNome("Astrogildo");
    funcionario1.setValorHora(15.17f);

    //Este funcionário trabalha 20h/semana
    System.out.println("Nome: " + funcionario1.getNome());
    System.out.println("Salário: R$" + funcionario1.salario(20f)); 
  }
}
