package br.com.fiap.checkpoint.infrastructure.controller;

import br.com.fiap.checkpoint.application.usecase.remove.RemoveUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/pedidos/remove")
public class RemovePedidoController {

    @Autowired
    private RemoveUseCase removeUseCase;

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity removePedido(@PathVariable Long id) {
        removeUseCase.execute(id);

        return ResponseEntity.status(200).body("PEDIDO DELETADO");
    }
}

