package model;

import static constantes.StatusAluno.APROVADO;
import static constantes.StatusAluno.RECUPERACAO;
import static constantes.StatusAluno.REPROVADO;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "aluno")
public class Aluno extends Pessoa implements Serializable {

	private static final long serialVersionUID = -6692790779160200106L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToMany(mappedBy = "aluno")
	@Column
	private Disciplina disciplina;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, int cpf, String email, Disciplina disciplina) {
		super(nome, cpf, email);	
		this.disciplina = disciplina;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	public double getNota () {		
		double nota = 0.0;		
		nota = disciplina.getNota();		
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
		return "Aluno [id=" + id + ", disciplina=" + disciplina + "]";
	}


}
