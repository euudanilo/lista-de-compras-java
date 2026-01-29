# 🛒 Lista de Compras em Java

Aplicação em Java para gerenciamento de uma lista de compras via console.  
O sistema permite cadastrar produtos, visualizar a lista, remover itens, calcular o valor total da compra e exportar os dados para um arquivo de texto.

---

## 📌 Objetivo do projeto

Este projeto foi desenvolvido com o objetivo de praticar lógica de programação, organização de código e conceitos básicos de orientação a objetos, criando uma aplicação simples, funcional e fácil de entender.

---

## ✅ Funcionalidades

- Adicionar produtos com nome, valor unitário e quantidade
- Listar todos os produtos cadastrados
- Remover produtos pelo nome
- Calcular o valor total da compra
- Exportar a lista de compras para um arquivo `.txt`
- Menu interativo executado no console

---

## 🧱 Estrutura e organização

O projeto foi desenvolvido utilizando **orientação a objetos**, separando as responsabilidades em classes diferentes:

- **Produto**  
  Representa um item da lista de compras, armazenando nome, valor e quantidade, além de calcular o valor total do produto.


- **ListaDeComprasService**  
  Responsável por gerenciar a lista de produtos, incluindo adição, remoção, listagem, cálculo do total e exportação para arquivo.


- **Main**  
  Responsável pela interação com o usuário, exibição do menu e controle do fluxo do programa.

Essa organização torna o código mais claro, fácil de manter e simples de evoluir.

---

## 🛠️ Tecnologias utilizadas

- Java
- Scanner para entrada de dados
- ArrayList para armazenamento de dados
- Escrita de arquivos de texto (`.txt`)
- Orientação a objetos

---

## ▶️ Como executar o projeto

1. Abra o projeto em uma IDE Java (IntelliJ, Eclipse ou VS Code)
2. Execute o arquivo `Main.java`
3. Utilize o menu exibido no console para interagir com o sistema

---

## 📄 Exportação para arquivo de texto

Ao escolher a opção de exportação, o sistema cria um arquivo chamado: lista_de_compras.txt


O arquivo contém a lista de produtos cadastrados e o valor total da compra, podendo ser aberto no Bloco de Notas.

---

## 🧠 Conceitos aplicados

- Estruturas de decisão
- Estruturas de repetição
- Manipulação de listas
- Leitura de dados do usuário
- Escrita de arquivos
- Orientação a objetos
- Separação de responsabilidades

---

## 📈 Possíveis melhorias futuras

- Salvar e carregar a lista automaticamente
- Validações mais avançadas de entrada
- Uso de tipos específicos para valores monetários
- Exportação em outros formatos
- Interface gráfica ou aplicação web

---

## 👤 Autor

Projeto desenvolvido para fins de aprendizado e prática em Java, com foco em clareza, organização e boas práticas iniciais de desenvolvimento.
