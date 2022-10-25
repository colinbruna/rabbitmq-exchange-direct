package com.brunas.projetorabbitmq.teste;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQProdutorService {

    private final RabbitTemplate rabbitTemplate;

    public RabbitMQProdutorService(final RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void enviarDirectFila1(String mensagem) {
        rabbitTemplate.convertAndSend("direct-exchange", "key1", mensagem);
        System.out.println("Enviando mensagem: " + mensagem);
    }

    public void enviarDirectFila2(String mensagem) {
        rabbitTemplate.convertAndSend("direct-exchange", "key2", mensagem);
        System.out.println("Enviando mensagem: " + mensagem);
    }

    public void enviarDirectFila3(String mensagem) {
        rabbitTemplate.convertAndSend("direct-exchange", "key3", mensagem);
        System.out.println("Enviando mensagem: " + mensagem);
    }
}
