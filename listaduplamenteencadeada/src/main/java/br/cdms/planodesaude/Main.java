package br.cdms.planodesaude;

public class Main {
    public static void main(String[] args) {
        
        ListaDuplamenteEncadeada<String> minhaLista = new ListaDuplamenteEncadeada<>();
        
        minhaLista.add("c1");
        minhaLista.add("c2");
        minhaLista.add("c3");
        minhaLista.add("c4");
        minhaLista.add("c5");
        minhaLista.add("c6");
        minhaLista.add("c7");
        minhaLista.add("c8");
        minhaLista.add("c9");
        minhaLista.add("c10");
        
        System.out.println(minhaLista);
        
        minhaLista.remove(3);
        System.out.println(minhaLista);
        minhaLista.add(3, "99");
        
        System.out.println(minhaLista);
        
        System.out.println(minhaLista.get(3));
    }
}