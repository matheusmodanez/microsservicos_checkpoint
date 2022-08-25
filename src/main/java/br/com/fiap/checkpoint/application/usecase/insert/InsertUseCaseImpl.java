package br.com.fiap.checkpoint.application.usecase.insert;

import br.com.fiap.checkpoint.application.usecase.dto.PedidoInputDTO;
import br.com.fiap.checkpoint.application.usecase.dto.PedidoOutputDTO;
import br.com.fiap.checkpoint.domain.entity.Pedido;
import br.com.fiap.checkpoint.infrastructure.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsertUseCaseImpl implements InsertUseCase{

    @Autowired
    PedidoRepository pedidoRepository;

    @Override
    public PedidoOutputDTO execute(PedidoInputDTO pedidoInputDTO) {

        Pedido pedido = pedidoInputDTO.convert(pedidoRepository);
        pedidoRepository.save(pedido);
        return new PedidoOutputDTO(pedido);
    }
}
