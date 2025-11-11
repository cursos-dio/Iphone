package org.dio.desafio.iphone;

public class Teste {
public static void main(String[] args) {
        
        // 1. Instanciando o IPhone
        IPhone meuIphone = new IPhone();
        
        System.out.println("--- 📱 TESTANDO IPHONE COMO MULTIFUNCIONAL ---");
        
        // 2. Testando Reprodutor Musical
        System.out.println("\n*** FUNÇÕES DE MÚSICA ***");
        meuIphone.selecionarMusica("Stairway to Heaven");
        meuIphone.tocar();
        meuIphone.pausar();
        
        // 3. Testando Aparelho Telefônico
        System.out.println("\n*** FUNÇÕES DE TELEFONE ***");
        meuIphone.ligar("55 11 98765-4321");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        
        // 4. Testando Navegador na Internet
        System.out.println("\n*** FUNÇÕES DE NAVEGAÇÃO ***");
        meuIphone.exibirPagina("https://www.dio.me/");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
