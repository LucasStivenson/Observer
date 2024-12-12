# Exemplo: Padrão de Projeto Observer

Este projeto foi desenvolvido como parte de uma apresentação acadêmica para a disciplina de **Fundamentos de Desenvolvimento de Sistemas Computacionais** da **Turma 3A (2024/2)**, no **IFSUL - Campus Sapucaia do Sul**.

## Descrição
O padrão **Observer** é um padrão comportamental que define uma dependência **um-para-muitos** entre objetos, de modo que quando um objeto (Publisher) muda seu estado, todos os outros objetos interessados (Observers) são notificados automaticamente.

Este projeto implementa um exemplo prático do padrão **Observer** no contexto de um sistema de notificação de produtos em uma loja.


### Exemplo Implementado: Notificação de Lançamento de Produtos
O sistema simula o funcionamento de uma loja (Publisher) que notifica seus clientes (Observers) sempre que um **novo produto** estiver disponível. Os clientes podem se inscrever (subscribe) ou cancelar a inscrição (unsubscribe) para receber essas notificações.

### **Elementos Principais**

1. **Loja (Store):**  
   Representa o Publisher.  
   - Permite que os clientes se inscrevam ou cancelem a inscrição.  
   - Notifica os clientes sobre novos produtos.

2. **Clientes (Customer):**  
   Representam os Observers.  
   - Recebem notificações sempre que um novo produto é lançado.

3. **Interface Observer:**  
   Define o contrato que todos os Observers devem implementar.

4. **Interface Subject:**  
   Define o contrato que o Publisher deve implementar, como métodos para adicionar, remover e notificar Observers.

5. **Classe Principal (Main):**  
   Demonstra o funcionamento do padrão, com adição e remoção de clientes e lançamento de produtos.

---

## **Estrutura do Projeto**

**Interface base** (Observer): Define o contrato para os Observers.

**Classe concreta** (Customer): Representa um cliente que implementa a interface Observer e reage às notificações.

**Interface base** (Subject): Define o contrato para o Publisher (Store), com métodos para adicionar e remover Observers, além de notificá-los.

**Classe concreta** (Store): Representa a loja, que implementa a interface Subject e gerencia a lista de Observers.

**Classe principal** (Main): Demonstra o uso do padrão Observer com a interação entre a loja e os clientes.

---

## **Benefícios do Padrão Observer**

- **Desacoplamento:** A loja (Publisher) não precisa conhecer os detalhes dos clientes (Observers).  
- **Flexibilidade:** Permite adicionar ou remover clientes dinamicamente, sem alterar o código da loja.  
- **Escalabilidade:** Facilita a adição de novos tipos de Observers sem grandes modificações.

---

### Arquivo PDF da apresentação
[Aula 2 – Padrões de Comportamentais.pdf](//)

