package Loja;

import java.util.ArrayList;
import java.util.Scanner;

import Automoveis.*;

public class Loja {
	
	private String nome;
	private String endereco;		
	ArrayList<Carro> estoqueDeCarros = new ArrayList<Carro>();
	ArrayList<Motocicleta> estoqueDeMotocicletas = new ArrayList<Motocicleta>();
	Scanner s = new Scanner(System.in);
	String sc = null;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public Loja(){
		
	}
	
	public Loja(String endereco, String nome){
		setEndereco(endereco);
		setNome(nome);
	}
	
	public void adicionarCarro(){	
		String cor = null;
		String tipo = null;
		String cambio = null;
		
		Carro carro = new Carro();
		
		System.out.print("Insira o chassi do carro: ");
		carro.setChassi(s.nextLine());
		System.out.print("Insira a montadora do carro: ");
		carro.setMontadora(s.nextLine());
		System.out.print("Insira o modelo do carro: ");
		carro.setModelo(s.nextLine());
		
		while(tipo == null){
			System.out.print("Insira o tipo de carro desejado: ");
			tipo = s.nextLine();		
			switch(tipo.toLowerCase()){
				case "sedan":
					carro.setTipo(TipoDeCarro.SEDAN);
					break;
				case "hatch":
					carro.setTipo(TipoDeCarro.HATCH);
					break;
				case "picape":
					carro.setTipo(TipoDeCarro.PICAPE);
					break;
				case "conversivel":
					carro.setTipo(TipoDeCarro.CONVERSIVEL);
					break;
				case "comercial":
					carro.setTipo(TipoDeCarro.COMERCIAL);
					break;
				default:
					tipo = null;
					System.out.println("Tipo Inválido");
			}
		}
		
		while(cor == null){
			System.out.print("Digite a cor desejada para o carro: ");
			cor = s.nextLine();		
			switch(cor.toLowerCase().trim()){
				case "vermelho":
					carro.setCor(Cor.VERMELHO);
					break;
				case "amarelo":
					carro.setCor(Cor.AMARELO);
					break;
				case "verde":
					carro.setCor(Cor.VERDE);
					break;
				case "azul":
					carro.setCor(Cor.AZUL);
					break;
				case "preto":
					carro.setCor(Cor.PRETO);
					break;
				case "prata":
					carro.setCor(Cor.PRATA);
					break;
				default:
					cor = null;
					System.out.println("Cor Inválida");
			}
		}		
		while(cambio == null){
			System.out.print("Digite o câmbio do carro: ");
			cambio = s.nextLine();		
			switch(cambio.toLowerCase().trim()){
				case "automatico":
					carro.setCambio(Cambio.AUTOMATICO);
					break;
				case "semiautimatico":
					carro.setCambio(Cambio.SEMIAUTOMATICO);
					break;
				case "manual":
					carro.setCambio(Cambio.MANUAL);
					break;
				default:
					cambio = null;
					System.out.println("Opção de câmbio inválida");
			}
		}
		
		System.out.print("Insira a motorização do carro: ");
		carro.setMotorizacao(s.nextFloat());
		sc = s.nextLine();
		System.out.print("Insira o preço do carro: ");
		carro.setPreco(s.nextFloat());
		sc = s.nextLine();
		
		estoqueDeCarros.add(carro);
	}
	
	public void adicionarMoto(){
		String tipo = null;
		String cor = null;
		Motocicleta moto = new Motocicleta();
		
		System.out.print("Insira o chassi da moto: ");
		moto.setChassi(s.nextLine());		
		System.out.print("Insira a montadora: ");
		moto.setMontadora(s.nextLine());
		System.out.print("Insira o modelo: ");
		moto.setModelo(s.nextLine());
		
		while(tipo == null){
			System.out.print("Digite o tipo da moto: ");
			tipo = s.nextLine();		
			switch(tipo.toLowerCase().trim()){
				case "scooter":
					moto.setTipo(TipoDeMoto.SCOOTER);
					break;
				case "chopper":
					moto.setTipo(TipoDeMoto.CHOPPER);
					break;
				case "esportiva":
					moto.setTipo(TipoDeMoto.ESPORTIVA);
					break;
				case "offroad":
					moto.setTipo(TipoDeMoto.OFFROAD);
					break;
				case "sidecar":
					moto.setTipo(TipoDeMoto.SIDECAR);
					break;
				default:
					tipo = null;
					System.out.println("Opção de tipo inválida");
			}
		}
		
		while(cor == null){
			System.out.print("Digite a cor desejada para o carro: ");
			cor = s.nextLine();		
			switch(cor.toLowerCase().trim()){
				case "vermelho":
					moto.setCor(Cor.VERMELHO);
					break;
				case "amarelo":
					moto.setCor(Cor.AMARELO);
					break;
				case "verde":
					moto.setCor(Cor.VERDE);
					break;
				case "azul":
					moto.setCor(Cor.AZUL);
					break;
				case "preto":
					moto.setCor(Cor.PRETO);
					break;
				case "prata":
					moto.setCor(Cor.PRATA);
					break;
				default:
					cor = null;
					System.out.println("Cor Inválida");
			}
		}
		System.out.println("Insira a cilindrada: ");
		moto.setCilindrada(s.nextInt());
		sc = s.nextLine();
		System.out.println("Insira a capacidade do tanque: ");
		moto.setCapacidadeDoTanque(s.nextFloat());
		sc = s.nextLine();
		System.out.println("Preço: ");
		moto.setPreco(s.nextFloat());
		sc = s.nextLine();
		
		estoqueDeMotocicletas.add(moto);
	}
	
	public Carro pesquisarCarro(){		
		return null;
	}
	
	public Motocicleta pesquisarMoto(){		
		return null;
	}
	
	public Carro buscarCarro(String Chassi){		
		return null;
	}
	
	public Motocicleta buscarMoto(String Chassi){		
		return null;
	}
	
	public void removerCarro(){		
	}
	
	public void removerMoto(){		
	}
	
	public void listarEstoquedeCarros(){		
		
		for(Carro c : estoqueDeCarros){		
			System.out.println("*************************************************");
			System.out.println("Modelo: " + c.getModelo());
			System.out.println("Montadora: " + c.getMontadora());
			System.out.println("Câmbio: " + c.getCambio().tipoDeCambio());
			System.out.println("Chassi: " + c.getChassi());
			System.out.println("Cor: " + c.getCor().nomeDaCor());			
			System.out.println("Motorização: " + c.getMotorizacao());
			System.out.println("Tipo: " + c.getTipo().tipo());
			System.out.println("Preço: " + c.getPreco());
		}
	}
	
	public void listarEstoquedeMotos(){		
		
		for(Motocicleta m : estoqueDeMotocicletas){		
			System.out.println("*************************************************");	
			System.out.println("Modelo: " + m.getModelo());
			System.out.println("Montadora: " + m.getMontadora());
			System.out.println("Chassi: " + m.getChassi());
			System.out.println("Cilindradas: " + m.getCilindrada());
			System.out.println("Cor: " + m.getCor().nomeDaCor());
			System.out.println("Tipo: " + m.getTipo().tipo());
			System.out.println("Capacidade do Tanque: " + m.getCapacidadeDoTanque() + " Km/L");
			System.out.println("Preço: " + m.getPreco());
		}
	}
}
