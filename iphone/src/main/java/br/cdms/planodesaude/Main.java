package br.cdms.planodesaude;

public class Main {
    public static void main(String[] args) {
        
        Iphone iphone = new Iphone();

        //Funcionalidades do ReprodutorMusicial
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        //Funcionalidades do AparelhoTelefonico
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        //Funcionalidades do NavegadorInternet
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        

    }
}