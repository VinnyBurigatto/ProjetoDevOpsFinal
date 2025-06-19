package com.projetodevops.controller;

import com.projetodevops.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mensagens")
public class MensagemController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @PostMapping
    public String enviarMensagem(@RequestBody String conteudo) {
        kafkaProducerService.enviarMensagem(conteudo);
        return "Mensagem enviada para Kafka: " + conteudo;
    }
}
