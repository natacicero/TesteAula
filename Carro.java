package aula5;

public class Carro {

	// Propriedade ou Atributos 

		String marca; 
		String modelo; 
		String cor; 
		int km; 
		int capacidadeTanque; 
		int kmPorLitro; 
		double preco;
		double ValorComDesconto;
		    
		     // Métodos 

		    int calcularkm(){ 
		    	return this.capacidadeTanque*this.kmPorLitro; 
	}
		    
		    double calcularDesconto(double percentualDescontoVendedor) {
		    	
		    	if(percentualDescontoVendedor>=0 && percentualDescontoVendedor<=4) {
		    		return this.preco * (percentualDescontoVendedor/100);
		    	}else if(percentualDescontoVendedor<0) {
		    		return 0.0;
		    	}else {
		    		return this.preco * 0.04;
		    	}
		    }
		    
		    double calcularDesconto(double percentualDescontoVendedor, double percentualDescontoGerente){
		    	
		    	//Alterar o percentual do Vendedor se a venda for menor que 0 ou maior que 4
		    	if(percentualDescontoVendedor<0) {
		    		percentualDescontoVendedor=0;
		    	}else if(percentualDescontoVendedor>4) {
		    		percentualDescontoVendedor=4;
		    	}
		    	
		    	//Alterar o percentual do Gerente se a venda for menor que 0 ou maior que 2
		    	if(percentualDescontoGerente<0) {
		    		percentualDescontoGerente=0;
		    	}else if(percentualDescontoGerente>2) {
		    		percentualDescontoGerente=2;
		    	}
		    	
		    	double Desconto this.preco * ((percentualDescontoVendedor/100) + (percentualDescontoGerente/100));
		    	this.ValorComDesconto = this.preco - Desconto;
		    	
		    	return Desconto;
		    }
	}
