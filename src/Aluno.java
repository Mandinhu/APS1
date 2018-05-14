
public class Aluno {
	private String nome;
	private int matricula;
	private int idaluno;
	
	public void setnome(String nome) {
		this.nome = nome;
		
	}
	
	public void setmatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public Object getnome() {
		return nome;
	}

	public int getmatricula() {
		return matricula;
		
	}

	public int getidaluno() {
		return idaluno;
	}

	public void setidaluno(int idaluno) {
		this.idaluno = idaluno;
	}
}