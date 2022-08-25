package br.com.fiap.checkpoint.infrastructure.controller;

import br.com.fiap.checkpoint.application.usecase.dto.PedidoInputDTO;
import br.com.fiap.checkpoint.application.usecase.dto.PedidoOutputDTO;
import br.com.fiap.checkpoint.application.usecase.edit.EditUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;

@RestController
@RequestMapping("/pedidos/edit")
public class EditPedidoController {

    @Autowired
    private EditUseCase editUseCase;

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<PedidoOutputDTO> editPedido(@RequestBody @Valid PedidoInputDTO pedidoInputDTO, @PathVariable Long id) {
        PedidoOutputDTO pedidoOutputDTO = editUseCase.execute(pedidoInputDTO, id);

        return ResponseEntity.status(200).body(pedidoOutputDTO);
    }
}
