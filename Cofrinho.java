package br.ifpi.exercicio;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
 List<Moeda> moedas = new ArrayList<Moeda>();

public Cofrinho() {

}

public void adiciona(Moeda m){
  moedas.add(m);
}

public int QtdMoedas(){
	return moedas.size();
}

public double CalculaTotal(){
 double total = 0;
 for(Moeda moeda: moedas){
  total+=moeda.valor;
 }
 return total;
}

public int MesmaMoeda(){
	int qtd=0;
	for(int i=0;1<moedas.size();i++){
}
	return qtd;
}

public double MaiorValor(){
	double maior = 0;

	return maior;
}


}
