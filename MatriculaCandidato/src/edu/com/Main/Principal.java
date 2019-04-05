package edu.com.Main;

import java.io.ObjectInputStream.GetField;

import edu.com.Aluno.Candidato;
import edu.com.Disciplina.Disciplinas;
import edu.com.Funcionario.Cordenador;
import edu.com.Funcionario.Funcionario;
import edu.com.Funcionario.Professor;
import edu.com.Funcionario.Secretaria;

public class Principal {

	public static void main(String[] args) {
		
		Funcionario cord01 = new Cordenador("Cordenador01", "codCord01");
		Funcionario prof01 = new Professor("Professor01", "codProf01");
		Funcionario sec01 = new Secretaria("Ana Maria", "codSec01");
		
		Disciplinas d1 = new Disciplinas("Algoritmos e Estruturas de Dados", "CABS001");
		Disciplinas d2 = new Disciplinas("Programação Avançada", "CABS002");
		Disciplinas d3 = new Disciplinas("Engenharia de Requisitos", "CAES003");
		Disciplinas d4 = new Disciplinas("Projeto de Software", "CAES004");
		Disciplinas d5 = new Disciplinas("Inteligência Artificial", "CAES005");
		
		Candidato c1 = new Candidato("Eduard Newton", "newtondore@gmail.com", "02773492307");
		Candidato c2 = new Candidato("Maiko Buzzi", "newtondore@gmail.com", "02773492307");
		
		//dentro de validaDisciplinaAluno é criado AlunoExterno
		cord01.validaDisciplinaAluno(c1,d1,true);
		cord01.validaDisciplinaAluno(c2,d1,true);
		cord01.selecionaProfessorDisciplina(d1, prof01);

		
		System.out.println(cord01.getAlunosExternos().get(0));
	}

}
