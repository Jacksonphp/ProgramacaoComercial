package br.ifpi.exercicio;

import java.util.HashMap;
import java.util.Map;

public class AgendaTelefonica {
 String nome,numero;
 Map<String, String> colecao = new HashMap<String, String>();

 public void inserir(String nome,String numero){
   colecao.put(nome, numero);
 }

 public String BuscarNumero(String nome){
	 return colecao.get(nome).toString();
 }

 public void remover(String nome){
	 colecao.remove(nome);
 }

 public int Tamanho(){
	 return colecao.size();
 }
}


