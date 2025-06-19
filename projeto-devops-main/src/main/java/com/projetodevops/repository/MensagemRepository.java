package com.projetodevops.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.projetodevops.model.Mensagem;

@Repository
public interface MensagemRepository extends MongoRepository<Mensagem, String> {
    // Aqui você pode criar consultas customizadas depois, se quiser
}

