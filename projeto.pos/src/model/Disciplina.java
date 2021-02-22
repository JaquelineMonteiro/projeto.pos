package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "disciplina")
public class Disciplina implements Serializable {

	private static final long serialVersionUID = -7284182390082106173L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String nomeDisciplina;
	
	@Column(nullable = true)
	private double nota;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private Aluno aluno;
	
	public Disciplina() {
		
	}	

	public Disciplina(String nomeDisciplina, double nota) {
		super();
		this.nomeDisciplina = nomeDisciplina;
		this.nota = nota;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	public double getNota() {
		return nota;
	}	
	public void setNota(double nota) {
		this.nota = nota;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	@Override
	public String toString() {
		return "Disciplina [id=" + id + ", nomeDisciplina=" + nomeDisciplina + ", nota=" + nota + ", aluno=" + aluno
				+ "]";
	}
	
	
}
