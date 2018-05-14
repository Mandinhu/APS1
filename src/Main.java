import java.util.Scanner;

public class Main {
	static Aluno[] valuno = new Aluno[5]; 
	static Avalia��o[] vava = new Avalia��o[5];
	static Scanner Scan = new Scanner(System.in);
	static Aula[] vaula = new Aula[80];
	static int cont = 0;
	static int contaula = 0;
	static Turma clase = new Turma();
	public static void main(String[] args) {
		String menu = "\n";
		menu += "Menu";
		menu += "\n==========================";
		menu += "\n1 - Cadastrar Aluno";
		menu += "\n3 - Chamada";
		menu += "\n4 - Adicionar Avalia��es";
		menu += "\n5 - Verificar M�dia";
		menu += "\n6 - Sair";
		while(true) {
			System.out.println(menu);
			switch(digita().charAt(0)) {
				case '1': CadastrarAluno(valuno);
				break;
				case '2': CadastrarTurma();
				break;
				case '3': Chamada();
				break;
				case '4': AddAvalia��es();
				break;
				case '5': Verificarmedia();
				break;
				case '6': Sair();
			}
	}
}

	private static void CadastrarTurma() {
		System.out.println("Forne�a o nome da disciplina");
		clase.setname(Scan.next());
		System.out.println("Turma cadastrada com sucesso!");
	}

	private static String digita() {
		return Scan.next();
		
	}

	private static void Sair() {
		System.exit(0);
		
	}

	private static void Verificarmedia() {
		for(Aluno alu : valuno) {
			Avalia��o avamedia = new Avalia��o();
			avamedia = vava[cont];
			double media = (avamedia.getnota1()+avamedia.getnota2()+avamedia.getnota3())/3;
			System.out.println("A m�dia do aluno "+valuno[cont]+" �:"+media);
			cont++;
		}
	}

	private static void AddAvalia��es() {
		System.out.println("Data da avalia��o 1");
		String dataaval1 = Scan.nextLine();
		System.out.println("Data da avalia��o 2");
		String dataaval2 = Scan.nextLine();
		System.out.println("Data da avalia��o 3");
		String dataaval3 = Scan.nextLine();
		for (Avalia��o test : vava) {
			System.out.println("Forne�a a nota da avalia��o 1 do aluno "+valuno[cont]);
			test.setnota1(Scan.nextDouble());
			test.setdata1(dataaval1);
			System.out.println("Forne�a a nota da avalia��o 2 do aluno "+valuno[cont]);
			test.setnota2(Scan.nextDouble());
			test.setdata2(dataaval2);
			System.out.println("Forne�a a nota da avalia��o 3 do aluno "+valuno[cont]);
			test.setnota3(Scan.nextDouble());
			test.setdata3(dataaval3);
			cont++;
		}	
		cont = 0;
	}

	private static void Chamada() {
		System.out.println("Adicione a data da aula:");
		vaula[contaula].setdataaula(Scan.next());
		System.out.println("Forne�a a atividade realizada:");
		vaula[contaula].setAtividade(Scan.next());
		for(Aluno alu : valuno) {
			System.out.println(alu.getnome()+" Compareceu? S/N");
			String compareceu = Scan.next();
			if(compareceu == "S") {
				vaula[contaula].setIdalunopresente(alu.getidaluno());
			}
			
		}
	}
	
	private static void CadastrarAluno(Aluno Aluno[]) {
		for(Aluno alu : valuno ) {
		System.out.println("Forne�a o Nome do Aluno:");
		alu.setnome(Scan.next());
		System.out.println("Forne�a a Matr�cula:");
		alu.setmatricula(Scan.nextInt());
		valuno[cont] = alu;
		alu.setidaluno(cont);
		cont++;
		clase.setidaluno(alu.getidaluno());
		}
		System.out.println("Alunos cadastrados com sucesso!");
		cont = 0;
	}
}