# 📚 FórumHub API - Challenge Back End

Bem-vindo(a) ao **FórumHub**, um projeto desenvolvido como parte do **Challenge Back End** da Alura.  
O objetivo deste desafio é implementar uma **API REST** completa para gerenciamento de tópicos de um fórum, utilizando **Java + Spring Boot**.

---
## 🚀 Descrição do Projeto

O **FórumHub** é uma API para gerenciar tópicos de um fórum, permitindo criar, visualizar, atualizar e excluir tópicos.  
O projeto segue as melhores práticas REST e inclui autenticação via **JWT**.

---
## 📋 Funcionalidades

- ✅ Criar novo tópico  
- ✅ Listar todos os tópicos  
- ✅ Buscar tópico por ID  
- ✅ Atualizar tópico  
- ✅ Deletar tópico  
- 🔐 Autenticação e autorização com JWT  
- 📄 Documentação automática com **SpringDoc / OpenAPI**  

---
## 🛠 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Security
- JWT (JSON Web Token)
- SpringDoc / OpenAPI
- PostgreSQL ou H2 (para testes)
- Maven

---
## 📂 Estrutura do Projeto

```bash
src/
 ├── main/
 │    ├── java/
 │    │     └── br.com.seuprojeto.forumhub
 │    │           ├── controller   # Endpoints
 │    │           ├── domain       # Entidades
 │    │           ├── repository   # Interfaces JPA
 │    │           ├── service      # Lógica de negócio
 │    │           └── security     # Autenticação/Autorização
 │    └── resources/
 │          ├── application.properties
 │          └── schema.sql / data.sql (opcional)
 └── test/                         # Testes
```
---
👩‍💻 Autoria
Desenvolvido por Márcia Escolástico como parte do Challenge Back End - Alura.
