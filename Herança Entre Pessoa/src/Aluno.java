
public class Aluno extends Pessoa{
	private int matricula;
	private String curso;
	
	
	public String dadosAluno() {
		return " [matricula=" + matricula + ", curso=" + curso + "]";
	}

	public void cancelarMatricula() {
		System.out.println("Matricula cancelada da(o): !" + this.getNome() );
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
