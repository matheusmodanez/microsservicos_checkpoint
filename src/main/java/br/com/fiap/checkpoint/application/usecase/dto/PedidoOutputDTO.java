package br.com.fiap.checkpoint.application.usecase.dto;


import br.com.fiap.checkpoint.domain.entity.Pedido;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
public class PedidoOutputDTO {

    private Instant dataPedido;

    private Long codigoCliente;

    private Instant dataCadastro;

    private BigDecimal valorTotal;

    public PedidoOutputDTO(Pedido pedido) {
        this.dataPedido = pedido.getDataPedido();
        this.codigoCliente = pedido.getCodigoCliente();
        this.dataCadastro = pedido.getDataCadastro();
        this.valorTotal = pedido.getValorTotal();
    }
}