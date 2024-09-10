package com.mycompany.veiculos;

/**
 *
 * @author Alunos
 */
public class Veiculos {

    public static void main(String[] args) {
        Veiculo carro = new CarroPasseio("ABC1234", "Toyota", "Corolla", "Prata", 2022, 2023, 5, 4);
        Veiculo caminhao = new Caminhao("DEF5678", "Scania", "R450", "Azul", 2021, 2022, 20.5, "Carreta");
        Veiculo onibus = new Onibus("GHI9012", "Mercedes", "O500", "Verde", 2020, 2021, 40, true);        
        
        System.out.println("-----------------UTILIZANDO POLIMORFISMO-----------------");
        System.out.println("\n=======Informacoes do veiculo " + carro.getChassi() + "=======");
        System.out.println("Chassi -> " + carro.getChassi());
        System.out.println("Cor -> " + carro.getCor());
        System.out.println("Marca -> " + carro.getMarca());
        System.out.println("Modelo -> " + carro.getModelo());
        System.out.println("Tipo -> " + carro.getTipo());
        System.out.println("Ano Fabricacao -> " + carro.getAnoFabricacao());
        System.out.println("Ano Modelo -> " + carro.getAnoModelo());
        System.out.println("Utilizando o metodo exibirInformacoes");
        carro.exibirInformacoes();
        
        System.out.println("\n=======Informacoes do veiculo " + caminhao.getChassi()+ "=======");
        System.out.println("Chassi -> " + caminhao.getChassi());
        System.out.println("Cor -> " + caminhao.getCor());
        System.out.println("Marca -> " + caminhao.getMarca());
        System.out.println("Modelo -> " + caminhao.getModelo());
        System.out.println("Tipo -> " + caminhao.getTipo());
        System.out.println("Ano Fabricacao -> " + caminhao.getAnoFabricacao());
        System.out.println("Ano Modelo -> " + caminhao.getAnoModelo());
        System.out.println("Tipo -> " + caminhao.getTipo());
        System.out.println("Utilizando o metodo exibirInformacoes");
        caminhao.exibirInformacoes();
        
        System.out.println("\n=======Informacoes do veiculo " + onibus.getChassi()+ "=======");
        System.out.println("Chassi -> " + onibus.getChassi());
        System.out.println("Cor -> " + onibus.getCor());
        System.out.println("Marca -> " + onibus.getMarca());
        System.out.println("Modelo -> " + onibus.getModelo());
        System.out.println("Tipo -> " + onibus.getTipo());
        System.out.println("Ano Fabricacao -> " + onibus.getAnoFabricacao());
        System.out.println("Ano Modelo -> " + onibus.getAnoModelo());
        System.out.println("Tipo -> " + onibus.getTipo());
        System.out.println("Utilizando o metodo exibirInformacoes");
        onibus.exibirInformacoes();
        
        System.out.println("\n-----------------SEM UTILIZAR POLIMORFISMO-----------------");
        CarroPasseio carro2 = new CarroPasseio("ABC1234", "Toyota", "Corolla", "Prata", 2022, 2023, 5, 4);
        Caminhao caminhao2 = new Caminhao("DEF5678", "Scania", "R450", "Azul", 2021, 2022, 20.5, "Carreta");
        Onibus onibus2 = new Onibus("GHI9012", "Mercedes", "O500", "Verde", 2020, 2021, 40, true);   
        
        System.out.println("\n=======Informacoes do veiculo " + carro2.getChassi() + "=======");
        System.out.println("Numero Portas -> " + carro2.getNumeroPortas());
        System.out.println("Numero Passageiros -> " + carro2.getNumeroPassageiros());
        
        System.out.println("\n=======Informacoes do veiculo " + caminhao2.getChassi() + "=======");
        System.out.println("Tipo de Carreta: " + caminhao2.getTipoCarreta());
        System.out.println("Capacidade de Carga: " + caminhao2.getCapacidadeCarga());
        
        System.out.println("\n=======Informacoes do veiculo " + onibus2.getChassi() + "=======");
        System.out.println("Numero de Passageiros: " + onibus2.getNumeroPassageiros());
        System.out.println("Linha Urbana: " + (onibus2.isLinhaUrbana() ? "Sim" : "Não"));
   }
}
