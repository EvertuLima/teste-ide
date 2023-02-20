package com.projeto_teste.projeto1.Bola;

public class Bola {
	
	private String cor;
	private int tamanho;
	
	public Bola() {}
	
	public Bola(String cor, int tamanho) {
		this.cor = cor;
		this.tamanho = tamanho;
		
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	
}
