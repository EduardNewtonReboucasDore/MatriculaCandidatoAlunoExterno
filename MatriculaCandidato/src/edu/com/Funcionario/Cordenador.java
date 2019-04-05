package edu.com.Funcionario;

import java.util.ArrayList;
import edu.com.Aluno.AlunoExterno;
import edu.com.Aluno.Candidato;
import edu.com.Disciplina.Disciplinas;

public class Cordenador extends Funcionario{
	
	ArrayList<AlunoExterno> alunosExternos = new ArrayList<AlunoExterno>();

	public Cordenador(String nome, String codigo) {
		super(nome, codigo);
	}
	
	public void validaDisciplinaAluno(Candidato candidato, Disciplinas disciplina, boolean validacao) {
		
		AlunoExterno aluno = new AlunoExterno(candidato, disciplina);
		
		if(validacao) {
			alunosExternos.add(aluno);
			aluno  = null;//zera o objeto
		}
	}
	
	public void selecionaProfessorDisciplina(ArrayList<Disciplinas> disciplina, Professor professor) {
		professor.setDisciplinas(disciplina);
	}

	public ArrayList<AlunoExterno> getAlunosExternos() {
		return alunosExternos;
	}
}
