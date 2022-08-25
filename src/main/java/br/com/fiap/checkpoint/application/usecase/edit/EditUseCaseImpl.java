package br.com.fiap.checkpoint.application.usecase.edit;

import br.com.fiap.checkpoint.application.usecase.dto.PedidoInputDTO;
import br.com.fiap.checkpoint.application.usecase.dto.PedidoOutputDTO;
import br.com.fiap.checkpoint.application.usecase.insert.InsertUseCase;
import br.com.fiap.checkpoint.domain.entity.Pedido;
import br.com.fiap.checkpoint.infrastructure.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditUseCaseImpl implements EditUseCase {

    @Autowired
    PedidoRepository pedidoRepository;

    @Override
    public PedidoOutputDTO execute(PedidoInputDTO pedidoInputDTO, Long id) {

        Pedido pedido = pedidoInputDTO.edit(pedidoRepository, id);
        return new PedidoOutputDTO(pedido);
    }
}
