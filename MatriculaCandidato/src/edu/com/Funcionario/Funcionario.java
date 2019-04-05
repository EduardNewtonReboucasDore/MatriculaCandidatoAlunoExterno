package edu.com.Funcionario;

import java.util.ArrayList;

import edu.com.Aluno.AlunoExterno;
import edu.com.Aluno.Candidato;
import edu.com.Disciplina.Disciplinas;

public class Funcionario {
	
	protected String nome;
	protected String codigo;

	public Funcionario(String nome, String codigo) {
		
		this.nome = nome;
		this.codigo = codigo;
	}
	
	public void validaDisciplinaAluno(Candidato candidato, Disciplinas disciplina, boolean validacao) {}
	public void selecionaProfessorDisciplina(Disciplinas diciplina, Funcionario professor) {}
	public ArrayList<AlunoExterno> getAlunosExternos(){ return null; }

}
