import java.util.Scanner;

public class Main {
	static Aluno[] valuno = new Aluno[5]; 
	static Avaliação[] vava = new Avaliação[5];
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
		menu += "\n4 - Adicionar Avaliações";
		menu += "\n5 - Verificar Média";
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
				case '4': AddAvaliações();
				break;
				case '5': Verificarmedia();
				break;
				case '6': Sair();
			}
	}
}

	private static void CadastrarTurma() {
		System.out.println("Forneça o nome da disciplina");
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
			Avaliação avamedia = new Avaliação();
			avamedia = vava[cont];
			double media = (avamedia.getnota1()+avamedia.getnota2()+avamedia.getnota3())/3;
			System.out.println("A média do aluno "+valuno[cont]+" é:"+media);
			cont++;
		}
	}

	private static void AddAvaliações() {
		System.out.println("Data da avaliação 1");
		String dataaval1 = Scan.nextLine();
		System.out.println("Data da avaliação 2");
		String dataaval2 = Scan.nextLine();
		System.out.println("Data da avaliação 3");
		String dataaval3 = Scan.nextLine();
		for (Avaliação test : vava) {
			System.out.println("Forneça a nota da avaliação 1 do aluno "+valuno[cont]);
			test.setnota1(Scan.nextDouble());
			test.setdata1(dataaval1);
			System.out.println("Forneça a nota da avaliação 2 do aluno "+valuno[cont]);
			test.setnota2(Scan.nextDouble());
			test.setdata2(dataaval2);
			System.out.println("Forneça a nota da avaliação 3 do aluno "+valuno[cont]);
			test.setnota3(Scan.nextDouble());
			test.setdata3(dataaval3);
			cont++;
		}	
		cont = 0;
	}

	private static void Chamada() {
		System.out.println("Adicione a data da aula:");
		vaula[contaula].setdataaula(Scan.next());
		System.out.println("Forneça a atividade realizada:");
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
		System.out.println("Forneça o Nome do Aluno:");
		alu.setnome(Scan.next());
		System.out.println("Forneça a Matrícula:");
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