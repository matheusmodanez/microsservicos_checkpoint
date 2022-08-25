package br.com.fiap.checkpoint.application.usecase.remove;

import br.com.fiap.checkpoint.infrastructure.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RemoveUseCaseImpl implements RemoveUseCase {

    @Autowired
    PedidoRepository pedidoRepository;

    @Override
    public void execute(Long id) {
        pedidoRepository.deleteById(id);
    }
}
