package br.com.senac.sp.aula1.domainmodel;

import lombok.Getter;
import lombok.Setter;

public class Dados {
    @Getter @Setter private String nome;
    @Getter @Setter private String email;
    @Getter @Setter private int numero;

    public Dados() {
    }

    public Dados(String nome, String email, int numero) {
        this.nome = nome;
        this.email = email;
        this.numero = numero;
    }
}
