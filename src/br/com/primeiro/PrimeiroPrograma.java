package br.com.primeiro;

import br.com.primeiro.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
//        System.out.println("hello");

        Gato gato = new Gato();
        Livro livro = new Livro();

        System.out.println(gato);
        System.out.println(livro);
    }
}

class Livro {
    private String nome;
    private Integer anoLancamento;

    public Livro() {
    }

    public Livro(String nome, Integer anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", anoLancamento=" + anoLancamento +
                '}';
    }
}