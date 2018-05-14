
public class Turma {
	private String name;
	private int[] idaluno;
	private int cont = 0;
	
	public void setname(String name) {
		this.name = name;

	}
	
	public String getname() {
		return name;
	}
	
	public void setidaluno(int idaluno) {
		this.idaluno[cont] = idaluno;
		cont++;
	}

}