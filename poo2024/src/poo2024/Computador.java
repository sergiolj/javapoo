package poo2024;

public class Computador {
	double preco;
		class Processador{
		int cores;
		String fabricante;
			int getcacheL1() {
				return 1024;
			}
		}
		protected class RAM{
			int capacidade;
			String fabricante;
			int unidades;
				double getVelocidadeClock() {
					return 5.3;
				}
				int getCapacidade() {
					return this.capacidade;
				}
		}
		public void descricao() {

		}
		
		//CONTRUTOR
		public Computador() {}
		
		/*
		 * public Computador(String CPUfabricante,int nroCores) {
				class.=nroCores;
			}
		 */
		
		public static void main(String[] args) {
			//CRIA UM OBJETO DA CLASSE EXTERNA COMPUTADOR
			//CRIA O MEU PCGAMER
				Computador pcGamer = new Computador();
			//CRIA UM OBJETO DA CLASSE INTERNA 
			//CRIA O PROCESSADOR DO MEU PCGAMER
				Computador.Processador meuRyzen9 = pcGamer.new Processador();
				Computador.RAM minhaRAM = pcGamer.new RAM();
				pcGamer.preco=10000;
				meuRyzen9.cores=12;
				minhaRAM.capacidade=32;
				System.out.println("Custo do computador R$: "+pcGamer.preco);
				System.out.println("Processador de "+meuRyzen9.cores+" núcleos");
				System.out.println("Memória RAM: "+minhaRAM.getCapacidade()+"Gb");
		}
}