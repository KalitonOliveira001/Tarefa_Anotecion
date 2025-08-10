// Endereço onde esse arquivo está guardado no projeto.
package com.kaliton.tarefaanotacao.model;

// Aqui importamos a anotação Tabela para poder usar nela.
import com.kaliton.tarefaanotacao.annotations.Tabela;

// Aqui usamos a anotação Tabela.
// Isso quer dizer que essa classe Cliente está ligada à tabela "clientes" no banco de dados.
@Tabela("clientes")
public class Cliente {

    // Aqui guardamos o número que identifica o cliente.
    private int id;

    // Aqui guardamos o nome do cliente.
    private String nome;

    // Construtor vazio — serve para criar um cliente sem dados no início.
    public Cliente() { }

    // Construtor com dois dados — serve para criar o cliente já com id e nome.
    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Aqui pegamos o id do cliente.
    public int getId() {
        return id;
    }

    // Aqui mudamos o id do cliente.
    public void setId(int id) {
        this.id = id;
    }

    // Aqui pegamos o nome do cliente.
    public String getNome() {
        return nome;
    }

    // Aqui mudamos o nome do cliente.
    public void setNome(String nome) {
        this.nome = nome;
    }
}
