package com.murilo.apppets;

public class Pet {
    private String nome;
    private String cor;
    private String raca;
    private int idade;
    private String data_aniversario;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(){
        this.cor = cor;
    }

    public String getRaca(){
        return raca;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getData_aniversario(){
        return data_aniversario;
    }

    public void setData_aniversario(String data_aniversario){
        this.data_aniversario = data_aniversario;
    }

    public Pet(String nome, String cor, String raca, int idade, String data_aniversario){
        this.nome = nome;
        this.cor = cor;
        this.raca = raca;
        this.idade = idade;
        this.data_aniversario = data_aniversario;
    }
}
