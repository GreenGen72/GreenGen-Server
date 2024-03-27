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


| Atributo   | Descrição e motivo da escolha       | Chave       |
| :---------- | :--------- | :---------------------------------- |
| `id`         | Campo destinado ao armazenamento do identificador único para cada produto no ecommerce. Utiliza o tipo `Long` para suportar um amplo intervalo de valores, facilitando a busca e identificação precisa de produtos. | **PK**    |
| `nome`       | Campo para armazenar o nome do produto, essencial para a identificação e distinção entre produtos. O limite de 100 caracteres permite a inclusão de nomes descritivos sem comprometer a eficiência no armazenamento de dados. |**NN**  |
| `descricao`  | Campo de texto destinado a detalhar informações sobre o produto, permitindo até 1000 caracteres. A capacidade extensa viabiliza descrições detalhadas, que abordam características e fornecem contexto adicional ao consumidor.     |**NN**  |
| `preco`      | Armazena o preço do produto utilizando `BigDecimal`, com precisão para até 10 dígitos, sendo 2 decimais. Esta escolha assegura a exatidão necessária para a representação de valores monetários, fundamental para operações financeiras.|**NN**  |
| `quantidade` | Destinado ao controle de estoque, este campo armazena a quantidade disponível de cada produto usando o tipo `INT`. A escolha facilita o gerenciamento de inventário e a organização de pedidos de reposição. |**NN**  |
| `categoria_id` | Estabelece a relação entre o produto e sua categoria por meio de um identificador único (ID) da categoria, usando o tipo `LONG`. A definição como chave estrangeira permite a organização lógica e a fácil associação entre produtos e categorias. | **FK**   |
<div align="left">


</div>

## Tabela Categoria

<div align="left">

| Atributo   | Descrição e motivo da escolha       | Chave       |
| :---------- | :--------- | :---------------------------------- |
| `id` | Campo destinado à identificação única de cada registro da categoria dos produtos. Utiliza um tipo de dado Long para permitir uma ampla gama de valores.| **NN, PK** |
| `nome` | Campo destinado ao armazenamento do nome dado para a categoria dos produtos com um tamanho maximo 255 caracteres(VARCHAR(255)) . | **NN** |
| `nome` | Campo destinado ao armazenamento do nome da categoria dos produtos. O tipo de dado é VARCHAR(255), o que significa que pode conter até 255 caracteres alfanuméricos, permitindo a inclusão de nomes descritivos e detalhados para cada categoria. | **NN** |
| `descricao` | Campo destinado ao armazenamento da descrição detalhada sobre os produtos dessa categoria com um tamanho maximo 255 caracteres(VARCHAR(255)). | **NN** |
</div>

## Tabela Usuarios

<div align = "left">

| Atributo   | Descrição e motivo da escolha       | Chave       |
| :---------- | :--------- | :---------------------------------- |
| id Long | Identificador único da tabela usuário para buscar usuários pelo id do nome. Ex.:(1,2 etc). | PK |
| nome VARCHAR(255) | Campo para definir o nome do usuário. Ex.:("Gabriel", "Ana" etc). | NN |
| usuario VARCHAR(255) | Define o e-mail de acesso do usuário. Ex.: ("usuario@usuario.com").| NN |
| senha VARCHAR(255) | Define a senha do usuário e a partir da camada de segurança, transforma a senha no formato de Token. (Ex.: "senhaSenha1209", depois de encriptar: "$2a$10$/bWDtq0eJsSXV4XK7WMUauC29D8HjlcA7K322oV7F3eJWyzqoEGA.").| NN |
| foto VARCHAR(255) | Campo destinado para guardar a foto do usuario a partir da URL exata onde essa foto está localizada. (Ex.: "https://avatars.githubusercontent.com/u/9919?s=200&v=4"). | NN |
</div>

## <img align="center" src="https://i.imgur.com/YMtRdEm.gif" width="28" height="28"> Rodando o projeto

Para rodar o projeto, é necessário cloná-lo, copie o código abaixo para rodar na sua IDE favorita:

```
git clone https://github.com/GreenGen72/GreenGen-Server.git
```


## :soon: Implementação futura
+ Estabelecer uma conexão robusta entre os sistemas backend e frontend, assegurando uma comunicação fluida e eficiente entre ambas as partes, garantindo assim uma experiência integrada e consistente para os usuários.

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
