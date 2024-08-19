package dio.lab_padroes_projeto_spring.controller;

import dio.lab_padroes_projeto_spring.model.Cliente;
import dio.lab_padroes_projeto_spring.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clientes")
public class ClienteRestController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<Iterable<Cliente>> buscarTodos(){
        return ResponseEntity.ok(clienteService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Iterable<Cliente>> buscarPorId(){
        return ResponseEntity.ok(clienteService.buscarPorId());
    }

    @PostMapping
    public ResponseEntity<Cliente> inserir(RequestBody Cliente cliente){
        clienteService.inserir(cliente);
        return ResponseEntity.ok(cliente);
    }

    @PutMapping
    public ResponseEntity<Cliente> atualizar (@PathVariable Long id, @RequestBody Cliente cliente){
        clienteService.atualizar(id, cliente);
        return ResponseEntity.ok(cliente);
    }
}
