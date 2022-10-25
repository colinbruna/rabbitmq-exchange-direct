package com.brunas.projetorabbitmq.controller;

import com.brunas.projetorabbitmq.teste.RabbitMQProdutorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/direct")
public class RabbitMQController {

    private final RabbitMQProdutorService produtorService;

    public RabbitMQController(RabbitMQProdutorService produtorConfig) {
        this.produtorService = produtorConfig;
    }

    @PostMapping("/fila1")
    public void enviarFila1(@RequestBody String mensagem) {
        produtorService.enviarDirectFila1(mensagem);
    }

    @PostMapping("/fila2")
    public void enviarFila2(@RequestBody String mensagem) { produtorService.enviarDirectFila2(mensagem); }

    @PostMapping("/fila3")
    public void enviarFila3(@RequestBody String mensagem) {
        produtorService.enviarDirectFila3(mensagem);
    }

}
