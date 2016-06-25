package br.ifpi.exercicio;

public class TestaCofre {
 public static void main(String[] args) {
  Moeda m = new Moeda(0.25,"centavos");
  Moeda m1 = new Moeda(0.30,"centavos");
  Moeda m2 = new Moeda(0.40,"centavos");
  Moeda m3 = new Moeda(0.25,"centavos");

  Cofrinho c = new Cofrinho();

  c.adicionar(m);
  c.adicionar(m1);
  c.adicionar(m2);
  c.adicionar(m3);

  System.out.println("Total:"+c.CaucularTotal());
  System.out.println("Quantidade:"+c.QuantasMoedas()+" moedas");
  System.out.println("Mesmo valor:"+c.MesmoValor(0.25)+" de 0.25 centavos");
  System.out.println("Maior valor:"+c.MaiorValor());

 }
}
