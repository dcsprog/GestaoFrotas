package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import model.Carro;

public class ControllerCarro extends Carro{

	public ControllerCarro(){
		super();
	}
	
	Scanner n = new Scanner(System.in);
	Carro[] car; 
	
	public void registarCarro(){
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Quantos registos deseja efetuar?");
		car = new Carro[n.nextInt()];
		//n.next();
		n.nextLine();
		System.out.println();
		for(int i=0; i<car.length;i++){
			car[i]= new Carro();
			car[i].setId_carro(i);
			//System.out.println();
			System.out.println("\tInsira os dados do carro\n\n");
			//System.out.println();
			System.out.print("Marca: ");
			car[i].setMarca(n.nextLine());
			//System.out.println("");
			System.out.print("Modelo: ");
			car[i].setModelo(n.nextLine());
			System.out.print("Matricula: ");
			car[i].setMatricula(n.nextLine());
			System.out.print("Ano: ");
			car[i].setAno(n.nextInt());
			n.nextLine();
			System.out.print("Combustivel: ");
			car[i].setNomeCombustivel(n.nextLine());
			System.out.print("Kilometros Atuais: ");
			car[i].setKmInio(n.nextFloat());
			car[i].setEstado(true);
		}
		
		
	}
	
	
	public void listarCarro(){
		if(car!=null){
			for(int i=0; i<car.length;i++){
				System.out.println("\t\t Dados do carro\n\n");
				System.out.print("Marca: "+car[i].getMarca()+"\n");
				System.out.print("Modelo: "+car[i].getModelo()+"\n");
				System.out.print("Matricula: "+car[i].getMatricula()+"\n");
				System.out.print("Ano: "+car[i].getAno()+"\n");
				System.out.print("Combustivel: "+car[i].getNomeCombustivel()+"\n");
				System.out.print("Kilometros Atuais: "+car[i].getKmInio()+"\n");
				if(car[i].isEstado()==true){
					System.out.println("Estado: Disponivel\n");
				}else{
					System.out.println("Estado: Indisponivel\n");
				}
			}
		}else{
			System.out.println("Nao existem carros registados...\n\n");
		}
	}
	
	public void pausa(){
		System.out.println("System pause, pressione enter para continuar...");
		n.nextLine();
	}
	

}
