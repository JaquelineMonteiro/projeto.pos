package model;

import static constantes.StatusAluno.APROVADO;
import static constantes.StatusAluno.RECUPERACAO;
import static constantes.StatusAluno.REPROVADO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import shared.fluent.Validacao;

@Entity
@Table(name = "aluno")
public class Aluno extends Validacao implements Serializable {

	private static final long serialVersionUID = -6692790779160200106L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private int cpf;
	
	@Column(nullable = true)
	private String email;
	
	@OneToMany(mappedBy = "aluno")
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public Aluno() {
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public double getNota () {		
		double nota = 0.0;		
		for(Disciplina disciplina: disciplinas) {
			nota = disciplina.getNota();
		}		
		return nota;
	}
	
	public String getAlunoAprovado() {
		double media = this.getNota();	
		String resultado;
		if (media >= 5) {				
			resultado = (media >= 7) ? APROVADO : RECUPERACAO;
			return resultado;			
		} else
			return REPROVADO;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", disciplinas="
				+ disciplinas + "]";
	}	
	

}
