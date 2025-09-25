# Sistema de Controle de Estoque

Um sistema de linha de comando para gerenciamento de inventário, desenvolvido em Java com foco em uma arquitetura robusta de Programação Orientada a Objetos (POO).

## 📖 Sobre o Projeto

Este projeto implementa uma solução para controle de estoque, permitindo o gerenciamento completo de produtos e usuários. A aplicação é executada via console e foi projetada para ser uma ferramenta eficiente e direta para o controle de inventário.

A arquitetura do sistema é fundamentada em POO, utilizando herança e encapsulamento para modelar as entidades do mundo real de forma coesa e organizada.

## ✨ Funcionalidades

- **Gerenciamento de Produtos**: Cadastro, consulta, atualização e remoção de produtos do inventário.
- **Controle de Quantidade**: Operações para registrar entrada e saída de itens do estoque.
- **Gerenciamento de Usuários**: Cadastro de usuários com dois níveis de acesso distintos:
  - **Gerente**: Papel com permissões administrativas sobre o sistema.
  - **Colaborador**: Papel com acesso a operações rotineiras.

## 🏗️ Estrutura do Projeto

O sistema é modularizado em classes, cada uma com uma responsabilidade única:

- `SistemaEstoque.java`: É o núcleo da aplicação, responsável por centralizar e processar toda a lógica de negócio e as interações do usuário.
- `Produto.java`: Encapsula os atributos e comportamentos dos itens do estoque, como código, nome, preço e quantidade.
- `Pessoa.java`: É a superclasse que serve como modelo base para os usuários, definindo atributos comuns a todos.
- `Gerente.java` e `Colaborador.java`: São as classes que herdam de `Pessoa` e representam os papéis específicos dentro do sistema, cada um com suas respectivas permissões.



# Inventory Control System

A command-line inventory management system developed in Java with a focus on a robust Object-Oriented Programming (OOP) architecture.

## 📖 About The Project

This project implements a solution for inventory control, enabling the complete management of products and users. The application runs via the console and is designed to be an efficient and straightforward tool for inventory tracking.

The system's architecture is built on OOP principles, using inheritance and encapsulation to model real-world entities in a cohesive and organized manner.

## ✨ Features

- [cite_start]**Product Management**: Create, read, update, and delete products from the inventory[cite: 34, 42].
- **Quantity Control**: Operations to register stock entries and exits.
- **User Management**: User registration with two distinct access levels:
  - [cite_start]**Manager**: A role with administrative permissions over the system[cite: 32, 41].
  - [cite_start]**Collaborator**: A role with access to routine operations[cite: 30, 31].

## 🏗️ Project Structure

The system is modularized into classes, each with a unique responsibility:

- [cite_start]`SistemaEstoque.java`: This is the application's core, responsible for centralizing and processing all business logic and user interactions[cite: 35, 36, 37, 38, 39, 40].
- [cite_start]`Produto.java`: Encapsulates the attributes and behaviors of inventory items, such as ID, name, price, and quantity[cite: 34, 42].
- [cite_start]`Pessoa.java`: The superclass that serves as the base model for users, defining common attributes[cite: 33, 42].
- [cite_start]`Gerente.java` (Manager) and `Colaborador.java` (Collaborator): These classes inherit from `Pessoa` and represent the specific roles within the system, each with its respective permissions[cite: 30, 31, 32, 41].