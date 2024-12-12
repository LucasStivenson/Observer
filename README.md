# **Exemplo: Padrão de Projeto Observer**

Este projeto foi desenvolvido como parte de uma apresentação acadêmica para a disciplina de **Fundamentos de Desenvolvimento de Sistemas Computacionais** da **Turma 3A (2024/2)**, no **IFSUL - Campus Sapucaia do Sul**.

---

## **Descrição**

O padrão **Observer** é um padrão comportamental que define uma dependência **um-para-muitos** entre objetos, de modo que quando um objeto (Publisher) muda seu estado, todos os outros objetos interessados (Observers) são notificados automaticamente.

Este projeto implementa um exemplo prático do padrão **Observer** no contexto de um sistema de notificação de produtos em uma loja.

---

## **Exemplo Implementado: Notificação de Lançamento de Produtos**

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
