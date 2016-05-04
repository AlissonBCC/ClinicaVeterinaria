package clinica.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Consulta extends Produto {
		@ManyToOne
		private Animal animal;
		@ManyToOne
		private Veterinario veterinario;
		@OneToOne
		private Receita receita;
		
		
		
		public Consulta() {
		}
		
		public Animal getAnimal() {
			return animal;
		}

		public void setAnimal(Animal animal) {
			this.animal = animal;
		}

		public Veterinario getVeterinario() {
			return veterinario;
		}

		public void setVeterinario(Veterinario veterinario) {
			this.veterinario = veterinario;
		}
		
		
		
}
