# Sistema-de-Gerenciamento-de-Pedidos
Este projeto demonstra a implementação de alguns padrões de projeto clássicos em Java, incluindo Singleton, Strategy e Facade. O sistema simula a criação e o pagamento de pedidos.
## Padrões de Projeto Utilizados
- Singleton
Classe: OrderManager
Descrição: Garante que apenas uma instância de OrderManager exista e forneça um ponto de acesso global a ela.
- Strategy
Classes: PaymentStrategy, CreditCardPayment, PayPalPayment, PaymentContext
Descrição: Permite a definição de uma família de algoritmos, encapsulando cada um deles e tornando-os intercambiáveis.
- Facade
Classe: OrderFacade
Descrição: Fornece uma interface simplificada para um conjunto de interfaces em um subsistema.

