package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int opc;
		
		
		do{
			
			menuP();
			//opc = Integer.parseInt(reader.readLine());
			opc=n.nextInt();
			//n.nextLine();
			switch(opc){
			case 1:
				ctlCarro.registarCarro();
				break;
			case 2:
				ctlCarro.listarCarro();
				ctlCarro.pausa();
				break;
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
