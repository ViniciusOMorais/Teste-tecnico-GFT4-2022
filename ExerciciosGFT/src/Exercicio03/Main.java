package Exercicio03;

public class Main {
	
	public static void main(String[] args) {
		Livro livro1 = new Livro("Os segredos da mente milionaria", 460);
		Leitor leitor1 = new Leitor("Ubiratan", livro1);
		
		Livro livro2 = new Livro("Do mil ao milhão", 335);
		Leitor leitor2 = new Leitor("Clecio", livro2);
		
		Livro livro3 = new Livro("Quem pensa enriquece", 530);
		Leitor leitor3 = new Leitor("Vinicius", livro3);
		
		
		
		leitor1.adicionarLivro(livro2);
		leitor2.adicionarLivro(livro1);
		leitor3.adicionarLivro(livro1);
		
		System.out.println("Leitor 1: " + leitor1.getEstanteLivros().toString());
		System.out.println("Leitor 2: " + leitor2.getEstanteLivros().toString());
		System.out.println("Leitor 3: " + leitor3.getEstanteLivros().toString());
		
		leitor3.adicionarLivro(livro2);
		
		System.out.println("Leitor 3 após acresentar livro: " + leitor3.getEstanteLivros().toString());
		
		leitor3.removerLivro(livro2);
		
		System.out.println("Leitor 3 após remover livro: "  + leitor3.getEstanteLivros().toString());
		
		leitor2.getLivroFavorito().adicionarPaginasLidas(75);
		System.out.println("Porcentagem lida: " + leitor2.getLivroFavorito().verificarProgresso());
		
		leitor1.removerLivro(livro2);
		System.out.println("Livro após remoção: " + leitor1.getEstanteLivros().toString());
	}

}