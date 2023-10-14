public class Iphone implements Ipod, Telefone, NavegadorInternet {
	
	//metodos Ipod
	public void tocar() {
		System.out.println("Tocando música no Iphone");
	}
	
	public void pausar() {
		System.out.println("Pausando música no Iphone");
	}
	
	public void selecionarMusica() {
		System.out.println("Selecionando música no Iphone");
	}
	
	
	//metodos Telefone
	public void ligar() {
		System.out.println("Realizando ligação pelo Iphone");
	}
	
	public void atender() {
		System.out.println("Atendendo ligação pelo Iphone");
	}
	
	public void iniciarCorrerioVoz() {
		System.out.println("Iniciando correio de voz pelo Iphone");
	}
	
	
	//metodos NavegadorInternet
	public void exibirPagina() {
		System.out.println("Exibindo página pelo Iphone");
	}
	
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba pelo Iphone");
	}
	
	public void atualizarPagina() {
		System.out.println("Atualizando página pelo Iphone");
	}
	
	
	
	public static void main(String[] args) {
		
		Iphone iphone = new Iphone();
		
		iphone.atualizarPagina();
	}
}