package com.brunas.projetorabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    //Nas exchanges do tipo Direct, são add routing keys e a mensagem é enviada diretamente para o ponto que nós queremos

    //FILAS
    @Bean
    public Queue fila1() { return new Queue("fila1", true); }

    @Bean
    public Queue fila2() {
        return new Queue("fila2", true);
    }

    @Bean
    public Queue fila3() {
        return new Queue("fila3", true);
    }

    @Bean
    public Queue fila4() {
        return new Queue("fila4", true);
    }

    //EXCHANGE DO TIPO DIRECT
    @Bean
    DirectExchange exchange() {
        return new DirectExchange("direct-exchange");
    }

    //BINDINGS
    @Bean
    Binding binding(Queue fila1, DirectExchange exchange) {
        return BindingBuilder.bind(fila1).to(exchange).with("key1");
    }

    @Bean
    Binding binding2(Queue fila2, DirectExchange exchange) {
        return BindingBuilder.bind(fila2).to(exchange).with("key2");
    }

    @Bean
    Binding binding3(Queue fila3, DirectExchange exchange) {
        return BindingBuilder.bind(fila3).to(exchange).with("key3");
    }

    @Bean
    Binding binding4(Queue fila4, DirectExchange exchange) {
        return BindingBuilder.bind(fila4).to(exchange).with("key3");
    }
}
