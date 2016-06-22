package br.ifpi.exercicio;

public class Teste {
 public static void main(String[] args) {
  Cofrinho c = new Cofrinho();
  Moeda m = new Moeda(0.25,"centavos");
  Moeda m1 = new Moeda(0.25,"centavos");
  Moeda m2 = new Moeda(0.50,"centavos");
  c.adiciona(m);
  c.adiciona(m1);
  c.adiciona(m2);
  System.out.println("Total:"+c.CalculaTotal());

 }
}
