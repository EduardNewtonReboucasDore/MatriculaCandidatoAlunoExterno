
package edu.com.Funcionario;

import java.util.ArrayList;

import edu.com.Disciplina.Disciplinas;



public class Professor extends Funcionario {
	
	private ArrayList<Disciplinas> disciplinas = new ArrayList<Disciplinas>();

	public Professor(String nome, String codigo) {
		
		super(nome, codigo);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public ArrayList<Disciplinas> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplinas> disciplinas) {
		this.disciplinas = disciplinas;
	}
}
