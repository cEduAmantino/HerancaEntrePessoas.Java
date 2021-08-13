
public class Principal {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Aluno a1 = new Aluno();
		Professor prof1 = new Professor();
		Funcionario f1 = new Funcionario();
		
		p1.setNome("Aldair"); 
		p1.setSexo('M'); 
		p1.setIdade(60); 
		p1.fazerAniversario();
		
		a1.setNome("Jéssica"); 
		a1.setSexo('F'); 
		a1.setIdade(26); 
		a1.setCurso("Java"); 
		a1.setMatricula(112233);

		
		prof1.setNome("Adailton");
		prof1.setSexo('M'); 
		prof1.setIdade(55);
		prof1.setEspecialidade("Matematica");
		prof1.setSalario(3500);
		prof1.fazerAniversario();
		prof1.receberAumento(500);
		
		f1.setNome("Osvaldo"); 
		f1.setSexo('M'); 
		f1.setIdade(29);
		f1.setSetor("Secretaria");
		f1.setTrabalhando(false);
		f1.mudarTrabalho();
		
		System.out.println(p1.toString());
		System.out.println(a1.toString() + a1.dadosAluno());
		System.out.println(prof1.toString()+ prof1.dadosProfessor());	
		System.out.println(f1.toString() + f1.dadosFuncionario());
		

	}

}
