package br.ifpi.exercicio;

public class TestaAgenda {
 public static void main(String[] args) {
	AgendaTelefonica a = new AgendaTelefonica();
	a.inserir("Jackson","99904-0099");
	a.inserir("Jeferson","99904-0098");
	a.inserir("Jairon","99904-0097");
	a.inserir("Jamerson","99904-0096");
	a.inserir("Jorge","99904-0095");

	System.out.println("Nome:Jackson-Numero:"+a.BuscarNumero("Jackson"));
	a.remover("Jamerson");
	System.out.println("Contatos:"+a.Tamanho());
 }
}
