package br.com.fiap;

public class Funcionario {
  private String nome;
  private float valorHora;

  public String getNome() {
    return nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public float getValorhora() {
    return valorHora;
  }

  public void setValorHora(float valorHora) {
    this.valorHora = valorHora;
  }

  public float salario(float horasSemana) {
    float salario = valorHora * horasSemana * 4;
    return salario;
  }
}
