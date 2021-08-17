package aula5;

public class TesteCriarObjeto {

	public static void main(String[] args) {
	
		Carro novoCarro = new Carro(); 
		novoCarro.marca ="vw"; 
		novoCarro.modelo ="Fox"; 
		novoCarro.cor ="Azul"; 
		novoCarro.km =15560; 
		novoCarro.capacidadeTanque = 50; 
		novoCarro.kmPorLitro = 12; 
		novoCarro.preco = 28500.00;

		System.out.println("marca:" + novoCarro.marca); 
		System.out.println("modelo:"+ novoCarro.modelo); 
		System.out.println("cor:" + novoCarro.cor); 
		System.out.println("kilometragem de rodagem:" + novoCarro.km); 
		System.out.println("Rodagem de Veículo:" + novoCarro.calcularkm());
		System.out.println("Preço: " + novoCarro.preco);
		System.out.println("Desconto: " + novoCarro.calcularDesconto(2.5,2));
		System.out.println("Valor do Carro com Desconto " + novoCarro.ValorComDesconto);
	}
}	

	
