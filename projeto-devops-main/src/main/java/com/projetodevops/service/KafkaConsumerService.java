package com.projetodevops.service;

import com.projetodevops.model.Mensagem;
import com.projetodevops.repository.MensagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @Autowired
    private MensagemRepository mensagemRepository;

    @KafkaListener(topics = "mensagens", groupId = "grupo1")
    public void consumirMensagem(String mensagemRecebida) {
        Mensagem mensagem = new Mensagem(mensagemRecebida);
        mensagemRepository.save(mensagem);
        System.out.println("Mensagem salva no MongoDB: " + mensagemRecebida);
    }
}
