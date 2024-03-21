<h1 align="center">:recycle: Green Gen</h1>

## :memo: Descrição
Plataforma de e-commerce com gamificação para incentivo no consumo de produtos renováveis.

##  <img align="center" src="https://i.imgur.com/OT1B2Qy.gif" width="28" height="28" style="margin-right: 8px;"> Funcionalidades
:construction: <b>Em construção.</b> :construction:

## :wrench: Tecnologias utilizadas
- Java;
- Spring Boot;
- MySQL.

## Tabela Produto

<div align="left">

| Atributo   | Descrição e motivo da escolha       | Chave       |
| :---------- | :--------- | :---------------------------------- |
| `id` long | Identificador único da tabela produto usado para busca de produtos dentro do ecommerce. | **PK** |
| `nome` VARCHAR(100) | Identifica o nome do produto. | **NN** |
| `descricao` VARCHAR(1000) | Identifica as características técnicas do produto. | **NN** |
| `preco` BigDecimal | Armazena o preço do produto na plataforma. | **NN** |
| `quantidade` Long | Armazena a quantidade do produto na plataforma. | **NN** |
| `categoria_id` long | Usado para criar o relacionamento entre tabelas produto e categoria. | **FK** |
</div>

## Tabela Categoria

<div align="left">

| Atributo   | Descrição e motivo da escolha       | Chave       |
| :---------- | :--------- | :---------------------------------- |
| `id` Long | Identificador único da tabela categoria para buscar produtos pelo id da descrição. | **PK** |
| `nome` VARCHAR(255) | Nome dado para categorizar produtos. | **NN** |
| `descricao` VARCHAR(255) | Descrição um pouco mais detalhada sobre os produtos dessa categoria. | **NN** |

</div>

## <img align="center" src="https://i.imgur.com/YMtRdEm.gif" width="28" height="28"> Rodando o projeto

Para rodar o projeto, é necessário cloná-lo, copie o código abaixo para rodar na sua IDE favorita:

```
git clone https://github.com/GreenGen72/GreenGen-Server.git
```


## :soon: Implementação futura
Adição das outras Classes models (Produtos e Usuários) e suas relações no banco de dados;

## :handshake: Colaboradores
<table>
  <tr>
    <td align="center">
      <a href="https://github.com/ApenasGabs">
        <img src="https://avatars.githubusercontent.com/u/52265978?v=4" width="100px;" alt="Foto de Gabriel Rodrigues no GitHub"/><br>
        <sub>
          <b>Gabriel Rodrigues</b>
        </sub>
      </a>
    </td>
      <td align="center">
      <a href="https://github.com/dori-minante">
        <img src="https://avatars.githubusercontent.com/u/99691142?v=4" width="100px;" alt="Foto de Dorivania Minante no GitHub"/><br>
        <sub>
          <b>Dorivania Minante</b>
        </sub>
      </a>
    </td>
     <td align="center">
      <a href="https://github.com/Jonathangaruti">
        <img src="https://avatars.githubusercontent.com/u/137525224?v=4" width="100px;" alt="Foto de Jonathan Garuti no GitHub"/><br>
        <sub>
          <b>Jonathan Garuti</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/NandayGB">
        <img src="https://avatars.githubusercontent.com/u/112911182?v=4" width="100px;" alt="Foto de Fernanda Barbosa no GitHub"/><br>
        <sub>
          <b>Fernanda Barbosa</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/RaviBrito">
        <img src="https://avatars.githubusercontent.com/u/147649384?v=4" width="100px;" alt="Foto de Ravi Brito no GitHub"/><br>
        <sub>
          <b>Ravi Brito</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/tainapoppi">
        <img src="https://avatars.githubusercontent.com/u/157232091?v=4" width="100px;" alt="Foto de Tainá Poppi no GitHub"/><br>
        <sub>
          <b>Tainá Poppi</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/devgabrielnascimento">
        <img src="https://avatars.githubusercontent.com/u/92201977?v=4" width="100px;" alt="Foto de Gabriel Nascimento no GitHub"/><br>
        <sub>
          <b>Gabriel Nascimento</b>
        </sub>
      </a>
    </td>
  </tr>
</table>

## :dart: Status do projeto
:construction: <b>Em construção.</b> :construction: