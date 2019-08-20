package br.com.senaigo.mobile.vouaprenderandroid.entidades;

public class Nota {

    protected String texto;

    public Nota(final String texto) {
        this.texto = texto;
    }

    public String getTexto(){
        return texto;
    }

    @Override
    public String toString() {
        return "Nota{texto=" + texto + "}";
    }
}