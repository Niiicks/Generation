package PolimorfismoVan;

public class Animal {
    public String nome;
    public int idade;
    public String som;
    public String movimento;



    public String movimentarAnimal() {
        return movimento;
    }

    public String emitirSom() {
        return som;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSom() {
        return som;
    }

    public void setSom(final String som) {
        this.som = som;
    }

    public String getMovimento() {
        return movimento;
    }

    public void setMovimento(String movimento) {
        this.movimento = movimento;
    }


}