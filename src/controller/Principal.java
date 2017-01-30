package controller;

import java.util.Scanner;

public class Principal {
	
	static Scanner n = new Scanner(System.in);
	
	static ControllerCarro ctlCarro = new ControllerCarro();
	
	static void menuP(){
		System.clearProperty("CLS");
		System.out.println("==============================================");
		System.out.println("====         Solidario Epsilion           ====");
		System.out.println("====                                      ====");
		System.out.println("====        1 - Registar Carro            ====");
		System.out.println("====        2 - Listar Carro              ====");
		System.out.println("====        3 - Sair                      ====");
		System.out.println("====                                      ====");
		System.out.println("====                                      ====");
		System.out.println("====                                      ====");
		System.out.println("==============================================");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc=0;
		char a;
		
		
		do{
			
			menuP();
			opc = n.nextInt();
			switch(opc){
			case 1:
				System.clearProperty("CLS");
				ctlCarro.registarCarro();
				break;
			case 2:
				System.clearProperty("CLS");
				ctlCarro.listarCarro();
			case 3:
				System.out.println("O programa vai ser encerrado....\n\n");
				opc=0;
				break;
			default:
				System.out.println("Opcao invalida...\n\n");
			}
			
		}while(opc!=0);
		
	}

}
