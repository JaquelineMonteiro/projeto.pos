package model;

import static constantes.StatusAluno.APROVADO;
import static constantes.StatusAluno.RECUPERACAO;
import static constantes.StatusAluno.REPROVADO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public Aluno() {
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
		return "Aluno [id=" + id + ", disciplinas=" + disciplinas + "]";
	}


}
