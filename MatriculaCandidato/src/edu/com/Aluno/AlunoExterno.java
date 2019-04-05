package edu.com.Aluno;

import edu.com.Disciplina.Disciplinas;

public class AlunoExterno {
	
	private String nome;
	private String cpf;
	private String email;
	private String disciplina;
	private String codigoDisciplina;

	public AlunoExterno(Candidato candidato, Disciplinas disciplina) {
		this.nome = candidato.getNome();
		this.cpf = candidato.getCpf();
		this.email = candidato.getEmail();
		this.disciplina = disciplina.getNome();
		this.codigoDisciplina = disciplina.getCodigo();
	}

}
