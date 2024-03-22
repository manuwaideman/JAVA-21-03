package br.com.fiap;

import java.util.Scanner;

public class UsaFuncionario2 {
  public static void main(String[] args) {
    Funcionario funcionario1 = new Funcionario();
    float semana = 0.0f;
    Scanner scan;
    
    try {
      scan = new Scanner(System.in);
      System.out.println("Digite seu nome:");
      funcionario1.setNome(scan.nextLine());
      System.out.println("Digite quanto ganha por hora:");
      funcionario1.setValorHora(scan.nextFloat());
      System.out.println("Quantas horas trabalha na semana?");
      semana = scan.nextFloat();

      System.out.println("Nome:" + funcionaeio1.getNome());
      System.out.println("Salário: R$" + funcionario1.salario(semana));
    } catch (Exception e) {
      System.out.println("
    }
  }
}
