package com.projetodevops.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.UUID;

@Document(collection = "mensagens")
public class Mensagem {

    @Id
    private String id;

    private String conteudo;

    private Instant timestamp;

    // Construtor padrão obrigatório pelo Spring Data
    public Mensagem() {}

    // Construtor para facilitar criação do objeto
    public Mensagem(String conteudo) {
        this.id = UUID.randomUUID().toString();
        this.conteudo = conteudo;
        this.timestamp = Instant.now();
    }

    // Getters e Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }
}
