package br.com.fiap.checkpoint.application.usecase.insert;

import br.com.fiap.checkpoint.application.usecase.dto.PedidoInputDTO;
import br.com.fiap.checkpoint.application.usecase.dto.PedidoOutputDTO;

public interface InsertUseCase {

    PedidoOutputDTO execute(PedidoInputDTO pedidoInputDTO);
}
