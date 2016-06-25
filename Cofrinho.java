package br.ifpi.exercicio;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
 List<Moeda> moedas = new ArrayList<Moeda>();

public Cofrinho() {

}

public void adicionar(Moeda m){
	moedas.add(m);
}

public double CaucularTotal(){
	double soma = 0;
	for(int i=0; i<moedas.size();i++){
		soma+=moedas.get(i).getValor();
	}
	return soma;
}

public int QuantasMoedas(){
	return moedas.size();
}

public int MesmoValor(double valor){
	int igual = 0;
	for(Moeda m:moedas){
		if(m.getValor() == valor){
			igual++;
		}
	}
	return igual;
}

public double MaiorValor(){
	double maior = moedas.get(0).getValor();

	for(Moeda m:moedas){
      if(m.getValor()>maior){
    	  maior=m.getValor();
      }
	}
	return maior;
}


}


