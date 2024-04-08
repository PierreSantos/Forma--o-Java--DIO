package br.cdms.planodesaude;

public class NoDuplo<T> {

    private T conteudo;
    private NoDuplo<T> noProximo;
    private NoDuplo<T> noAnterior;

    public NoDuplo(T conteudo) {
        this.conteudo = conteudo;
        this.noProximo = null;
        this.noAnterior = null;
    }

    public NoDuplo(T conteudo, NoDuplo<T> noProximo, NoDuplo<T> noAnterior) {
        this.conteudo = conteudo;
        this.noProximo = noProximo;
        this.noAnterior = noAnterior;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo<T> getNoProximo() {
        return noProximo;
    }

    public void setNoProximo(NoDuplo<T> noProximo) {
        this.noProximo = noProximo;
    }

    public NoDuplo<T> getNoAnterior() {
        return noAnterior;
    }

    public void setNoAnterior(NoDuplo<T> noAnterior) {
        this.noAnterior = noAnterior;
    }

    @Override
    public String toString() {
        return "NoDuplo{" +
                "conteudo=" + conteudo +
                '}';
    }
}
