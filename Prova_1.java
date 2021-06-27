import java.util.Scanner;

import jdk.swing.interop.SwingInterOpUtils;

public class Prova_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double media,soma=0;
		int programa=0;
		int turma=30;
		String[] nome = new String[turma];
		String[] sobrenome = new String[turma];
		String[] matriculaAluno = new String[turma];
		double[] nota = new double[turma];
		
		System.out.println("Bem-Vindo ao Programa da ESCOLA!\n  Gostaria de iniciar?!\n   1-Sim 0-N�o");
		programa=teclado.nextInt();		
		
		
		while(programa!=0) {
			for(int i=0; i<30; i++) {
				int menu=99;
				System.out.println("Sistema de cadastro de alunos:");
				System.out.println("O que deseja fazer?");
				System.out.println();
				System.out.println("1 - Cadastrar Aluno");
				System.out.println("2 - Informa��es dos Alunos");
				System.out.println("3 - Modificar nota de Aluno");
				System.out.println("4 - Exibir m�dia dos Alunos cadastrados");
				System.out.println("0 - SAIR");
				menu=teclado.nextInt();				
				
				switch(menu) {
					case 0:
						i=99;//for�a sa�da do for
						programa=0;
						break;
					case 1:
						System.out.println("FUN��O CADASTRO: ");
						System.out.println("Insira o NOME do aluno: ");
						nome[i]=teclado.next();
						System.out.println("Insira o SOBRENOME:");
						sobrenome[i]=teclado.next();
						System.out.println("Insira a NOTA do aluno: ");
						nota[i]=teclado.nextDouble();
						while(0>nota[i] || nota[i]>10) {
							System.out.println("Nota INVALIDA!");
							System.out.println("TENTE NOVAMENTE:\n");
							nota[i]=teclado.nextDouble();
						}
						System.out.println("Insira a Matr�cula do aluno:");
						matriculaAluno[i]=teclado.next();
						System.out.println();
						System.out.println("Aluno Cadastro na posi��o :"+i);
						System.out.println();
						break;
					
					case 2:
						System.out.println("FUN��O VER INFORMA��ES: ");
						if(i<=0){
							System.out.println();
							System.out.println("");
							System.out.println("CADASTRE ALUNOS");
							System.out.println("RETORNANDO...");
							System.out.println();
							i--;
							break;
							
						}
						for(int j=0; j<i; j++) {
							
								//System.out.println("ALUNOS CADASTRADOS:");
								System.out.println();
								System.out.println(
									"Nome: "+nome[j]+" "+sobrenome[j]+"\n"+
									"Nota: "+nota[j]+"\n"+
									"Matr�cula: "+matriculaAluno[j]		
													);
								System.out.println();
							}
						i--;
						break;
					case 3:
						if(i<=0) {
							System.out.println("NENHUM ALUNO CADASTRADO!");
							System.out.println();
							i--;
							break;
						}
						String busca;
						System.out.println("FUN��O ALTERAR NOTA: ");
						System.out.println("INSIRA A MATR�CULA DO ALUNO: ");
						busca=teclado.next();
						for(int j=0; j<i; j++) {
							
							if(busca.equals(matriculaAluno[j])) {
								System.out.println("ALUNO ENCONTRADO: ");
								System.out.println();
								System.out.println(
										"Nome: "+nome[j]+" "+sobrenome[j]+"\n"+
										"Nota: "+nota[j]+"\n"+
										"Matr�cula: "+matriculaAluno[j]		
														);
								System.out.println("INSIRA A NOVA NOTA: ");
								nota[j]=teclado.nextDouble();
								while(0>nota[i] || nota[i]>10) {
									System.out.println("Nota INVALIDA!");
									System.out.println("TENTE NOVAMENTE:\n");
									nota[j]=teclado.nextDouble();
								}
								
							}else {
								System.out.println("Matr�cula n�o cadastrada!");
								System.out.println();
							}
							
						}
						i--;
						break;
					case 4:
						int cont=0;
						System.out.println("FUN��O PARA EXIBIR A M�DIA");
						if(i<=0) {
							System.out.println("N�O EXISTEM ALUNOS CADASTRADOS");
							i--;
							break;
						}
						for(int j=0; j<i; j++) {
							if(nota[j]>=0) {
								soma=nota[j]+soma;
								cont++;
							}
						}
						media=soma/cont;
						System.out.println("A M�dia dos Alunos cadastrados �: "+media);
						System.out.println();
						i--;
				}	
			}
		}
		System.out.println("PROGRAMA ENCERRADO!!!");
	}

}
