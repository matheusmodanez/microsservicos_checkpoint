package br.com.fiap.checkpoint.application.usecase.dto;

import br.com.fiap.checkpoint.domain.entity.Pedido;
import br.com.fiap.checkpoint.infrastructure.repository.PedidoRepository;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Optional;

@Data
public class PedidoInputDTO {

    @NotNull
    private Instant dataPedido;

    @NotNull
    @Size(min = 3, max = 5, message = "O código do cliente deve ter entre 3 e 5 dígitos.")
    private Long codigoCliente;

    @NotNull
    private Instant dataCadastro;

    @NotNull
    private BigDecimal valorTotal;

    public Pedido convert(PedidoRepository pedidoRepository){
        return new Pedido().builder()
                .dataPedido(dataPedido)
                .codigoCliente(codigoCliente)
                .dataCadastro(dataCadastro)
                .valorTotal(valorTotal)
                .build();
    }

    public Pedido edit(PedidoRepository pedidoRepository, Long id){
        Optional<Pedido> pedidoById = pedidoRepository.findById(id);

        if (pedidoById == null || pedidoById.isEmpty()){
            throw new IllegalArgumentException("Pedido não encontrado.");
        }

        Pedido pedido = pedidoById.get();

        pedido.setDataPedido(dataPedido);
        pedido.setCodigoCliente(codigoCliente);
        pedido.setDataCadastro(dataCadastro);
        pedido.setValorTotal(valorTotal);
        return pedido;
    }
}
