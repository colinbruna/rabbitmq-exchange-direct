### Exchange direct

Para exemplificar, vamos imaginar que um producer precisa emitir uma mensagem de confirmação de compra para três consumers.
Ou seja, o sistema precisa se comunicar com outros três diferentes sistemas para efetuar a compra.

Como o RabbitMQ envia a mensagem separadamente para cada fila, existe uma dinâmica para fazer com que esses outros sistemas recebam
a mensagem diretamente.

O tipo Direct é aquele que você adiciona a routing key específica para o exato ponto que você quer, num padrão mais singular.
