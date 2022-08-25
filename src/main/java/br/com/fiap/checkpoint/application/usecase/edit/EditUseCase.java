package br.com.fiap.checkpoint.application.usecase.edit;

import br.com.fiap.checkpoint.application.usecase.dto.PedidoInputDTO;
import br.com.fiap.checkpoint.application.usecase.dto.PedidoOutputDTO;

public interface EditUseCase {

    PedidoOutputDTO execute(PedidoInputDTO pedidoInputDTO, Long id);

}
