package br.com.fiap.checkpoint.infrastructure.controller;

import br.com.fiap.checkpoint.application.usecase.dto.PedidoInputDTO;
import br.com.fiap.checkpoint.application.usecase.dto.PedidoOutputDTO;
import br.com.fiap.checkpoint.application.usecase.insert.InsertUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import javax.validation.Valid;

@RestController
@RequestMapping("/pedidos/insert")
public class InsertPedidoController {

    @Autowired
    private InsertUseCase insertUseCase;

    @PostMapping
    @Transactional
    public ResponseEntity<PedidoOutputDTO> insertPedido(@RequestBody @Valid PedidoInputDTO pedidoInputDTO) {
        PedidoOutputDTO pedidoOutputDTO = insertUseCase.execute(pedidoInputDTO);

        return ResponseEntity.status(201).body(pedidoOutputDTO);
    }
}
