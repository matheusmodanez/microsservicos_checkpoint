# 🦅 **Microservice And Web Engineering**



* *Turma:* 3SIT FIAP
* *Graduação:* Sistemas de Informação
* *Ano:* 2022

| Autor               | RM                                                |
| ----------------- | ---------------------------------------------------------------- |
| Isabela Caovila Baldim        | 84141 |
| Matheus Nathan Modanez        | 86065 |


## O Projeto
> Nossa aplicação se trata de um CRUD funcional desenvolvido seguindo os princípios de Clean Architecture e Design Patterns, em especial, o padrão Command. É possível criar, editar e deletar um pedido, como detalhado a seguir.

# Criar Pedido - POST
Rota para acesso:
> **localhost:8080/api/v1/pedidos/insert/**

Exemplo de body para requisição: 
```json
{
    "dataPedido":"2022-02-15T18:35:24.00Z",
    "codigoCliente":"1",
    "dataCadastro":"2022-02-15T18:35:24.00Z",
    "valorTotal":"150.00"
}
```

# Editar Pedido - PUT
Rota para acesso:
> **localhost:8080/api/v1/pedidos/edit/{id}**


# Deletar Pedido - DELETE
Rota para acesso:
> **localhost:8080/api/v1/pedidos/remove/{id}**
