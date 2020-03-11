package br.fai.projeto03;

public  abstract class Animal {

	Gato gato = new Gato();
	Cachorro cachorro = new Cachorro();

	
	public void som() {
		System.out.println("Esse é o som padrão de animal");
	}
	public void dizerMeuNome() {
		System.out.println("O nome do Animal eh: "+ gato);
	}
	private void dizerMinhaIdade() {
		System.out.println("Minha idade eh: ");
	}
	
	public Gato getGato() {
		return gato;
	}
	public void setGato(Gato gato) {
		this.gato = gato;
	}
	public Cachorro getCachorro() {
		return cachorro;
	}
	public void setCachorro(Cachorro cachorro) {
		this.cachorro = cachorro;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	private String cor = "Preto";
	private int idade = 5;
	private String nome = "Não definido";
	
}
