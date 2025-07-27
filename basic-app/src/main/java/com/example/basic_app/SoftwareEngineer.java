package com.example.basic_app; // ESTE DEVE SER O TEU NOME DE PACOTE

public class SoftwareEngineer {
	private Integer id;
	private String name;
	private String techStack;

	// Construtor vazio (ou default)
	public SoftwareEngineer() {
		// Este construtor é muitas vezes necessário por frameworks como o Spring/JPA
		// para criar instâncias da classe.
	}

	// Construtor com todos os campos
	public SoftwareEngineer(Integer id, String name, String techStack) {
		this.id = id;
		this.name = name;
		this.techStack = techStack;
	}

	// --- Getters e Setters ---
	// Vão ser usados para aceder e modificar os atributos privados da classe.

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTechStack() {
		return techStack;
	}

	public void setTechStack(String techStack) {
		this.techStack = techStack;
	}

	// --- (Opcional) Método toString() ---
	// Útil para debugging, para imprimir o objeto de forma legível.
	@Override
	public String toString() {
		return "SoftwareEngineer{" +
				"id=" + id +
				", name='" + name + '\'' +
				", techStack='" + techStack + '\'' +
				'}';
	}

	// --- (Opcional) Métodos equals() e hashCode() ---
	// Essenciais se quiseres comparar objetos SoftwareEngineer por valor
	// ou usá-los em coleções (HashSet, HashMap).
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		SoftwareEngineer that = (SoftwareEngineer) o;
		return id.equals(that.id) && name.equals(that.name) && techStack.equals(that.techStack);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(id, name, techStack);
	}
}
