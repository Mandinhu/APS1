
public class Aula {
	private String dataaula;
	private String atividade;
	private int idalunopresente;
	private int[] alunopresente;
	private int contid = 0;
	
	public void setdataaula(String dataaula) {
		this.dataaula = dataaula;
		
	}
	
	public String getdataaula() {
		return dataaula;
	}

	public String getAtividade() {
		return atividade;
	}

	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}

	public int getIdalunopresente() {
		return idalunopresente;
	}

	public void setIdalunopresente(int idalunopresente) {
		this.idalunopresente = idalunopresente;
		alunopresente[contid] = this.idalunopresente;
		contid++;
		if(contid > 6) {
			contid = 0;
		}
	}
}