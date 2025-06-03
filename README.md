# 🧾 Sistema de Controle de Estoque
<strong>Programação de Soluções Computacionais A3</strong>


Sistema desenvolvido para gerenciar o estoque de uma empresa, permitindo cadastrar produtos e categorias, controlar entradas e saídas, emitir alertas de estoque e gerar relatórios gerenciais.

---

## ✅ Requisitos Funcionais

RF01 - O sistema deve permitir o cadastro de produtos com os atributos nome, preço, unidade, categoria, estoque mínimo e máximo.  
RF02 - O sistema deve permitir o cadastro de categorias com nome, embalagem e tamanho.  
RF03 - O sistema deve controlar a entrada e a saída de produtos no estoque.  
RF04 - O sistema deve emitir alertas quando o estoque estiver abaixo do mínimo ou acima do máximo.  
RF05 - O sistema deve gerar relatórios de produtos com filtros por categoria, quantidade e estoque.  
RF06 - O sistema deve validar todos os campos obrigatórios no momento do cadastro.

---

## ⚙ Requisitos Não Funcionais

RNF01 - O sistema deve ser desenvolvido em Java, utilizando a IDE NetBeans.  
RNF02 - O sistema deve utilizar banco de dados MySQL para armazenar os dados.  
RNF03 - A interface gráfica deve ser implementada com Swing.  
RNF04 - O sistema deve ser executado em ambiente desktop (local).  
RNF05 - O código-fonte deve ser organizado em camadas (modelo, DAO, view, controller).

---

## 🛠 Tecnologias Utilizadas

- Java 21  
- Apache NetBeans IDE 25  
- MySQL 8.0
- JDBC 8.0.33
- Maven 3.9.9 

---

## 🗄️ Configuração do Banco de Dados

Para executar o sistema corretamente, utilize as seguintes credenciais de acesso ao MySQL:

- **Usuário:** `a3prog`  
- **Senha:** `unisul@prog3`

Antes de iniciar o sistema, é necessário criar o banco de dados.  
O script SQL para criação da base de dados e tabelas está disponível neste repositório:

📄 [`ControleEstoqueA3.sql`](ControleEstoqueA3.sql)

---

## 👨‍💻 Desenvolvedores do Projeto

| Nome                          | Matrícula      | GitHub                     |
|-------------------------------|----------------|----------------------------|
| Adhriano Machado de Oliveira | 10725114655    | [adhrianom](https://github.com/adhrianom), feeh, adhrianom, 10725114655 |
| Ahron Stoco Simões           | 10724261491    | [ahronstoco](https://github.com/ahronstoco), Ahron |
| Eduardo Souza Jeremias       | 10724262460    | [eduardosjeremias](https://github.com/eduardosjeremias) |
| Gabriel Rodrigues Victurino  | 10725113959    | [gabriel-victurino](https://github.com/gabriel-victurino), gabri |

---

Feito por estudantes da *Unisul* — 2025

