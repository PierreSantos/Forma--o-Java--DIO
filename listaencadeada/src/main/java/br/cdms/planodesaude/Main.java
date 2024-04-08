package br.cdms.planodesaude;

public class Main {
    public static void main(String[] args) {
        
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        
        lista.add(45);
        lista.add(12);
        lista.add(23);
        lista.add(78);
        lista.add(34);

        System.out.println(lista.toString());
        System.out.println(lista.get(2));
        System.out.println(lista.remove(3));
        System.out.println(lista.toString());
        
    }
}