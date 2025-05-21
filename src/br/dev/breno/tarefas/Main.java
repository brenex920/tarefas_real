package br.dev.breno.tarefas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;


public class Main {

    static	public	String caminho = "/Users/25132475/tarefasDS1TA/tarefas";
	
	public static void main(String[] args) {
		
		
		Tarefa tarefa1 = new Tarefa("lavar a louça");
		
		
		
		
		//escreverArquivo();
		//lerAquivo();

}

	private static void escreverArquivo () {
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		
		try {
			
			//adicionando comteudo no arquivo
			fw = new FileWriter(caminho, true);
			bw = new BufferedWriter(fw);
			
			
			bw.append("senai jandira");
			bw.append("Breno");
			bw.flush();
			bw.newLine();
		}catch 
		
	}
	
	
	private static void lerAquivo() {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
		fr = new FireReader(caminho);
		br = BufferedReader(fr);
		
		int retorno = readLine(br);
		retorno = read(br);
		
		String linha = readLine(br);
		
		System.out.println(retorno);
		
		
	} catc FileNotFoundException erro) {
		System.out.println("o arquivo n foi encontrado");
	} catch (Exeption erro) {
		System.out.println("ocoreu um erro");
		
		
	
	 }
	}
   }
