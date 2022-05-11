package br.edu.up;

import br.edu.up.model.Cachorro;
import br.edu.up.model.Gato;
import br.edu.up.model.Homem;
import br.edu.up.model.Humano;
import br.edu.up.model.Mulher;

public class Programa {

	public static void main(String[] args) {
		
		try {
		
		Cachorro cachorro1 = new Cachorro();
		cachorro1.raça = "Rottweiller";
		cachorro1.nome = "Eros";
		cachorro1.setIdade(3);
		cachorro1.porte = "medio";
		
		Cachorro cachorro2 = new Cachorro();
		cachorro2.raça = "Vira-lata";
		cachorro2.nome = "Susi";
		cachorro2.setIdade(3);
		cachorro2.porte = "pequeno";
		
		
		Cachorro cachorro3 = new Cachorro();
		cachorro3.raça = "Vira-lata";
		cachorro3.nome = "Goa";
		cachorro3.setIdade(4);
		cachorro3.porte = "medio";
		
		Gato gato =  new Gato();
		gato.setIdade(4);
		gato.nome = "Fred";
		
		Homem homem = new Homem();
		homem.setIdade(54);
		homem.nome = "Gabriel";
		
		
		Humano humano = new Humano();
		humano.setIdade(-96);
		humano.nome = "Elizabeth";
		
		Mulher mulher = new Mulher();
		mulher.setIdade(43);
		mulher.nome = "Cleonice";
		
		}catch (Exception e){
			System.out.println(e.toString());
			
		}
		
	}
	

}
