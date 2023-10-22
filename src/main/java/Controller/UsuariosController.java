package Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import Domain.Usuarios;
import Service.UsuariosServices;

@CrossOrigin
@Controller
@RequestMapping(value = "/usuarios")
public class UsuariosController {

    @Autowired
    private UsuariosServices usuariosServices;

    @GetMapping
    public ResponseEntity<List<Usuarios>> findAll() {
        List<Usuarios> usuarios = usuariosServices.findall();
        return ResponseEntity.ok(usuarios);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuarios> findById(@PathVariable Long id) {
        Optional<Usuarios> usuarios = usuariosServices.findById(id);
        if (usuarios.isPresent()) {
            return ResponseEntity.ok(usuarios.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Usuarios> criarConta(@RequestBody Usuarios usuarios) {
        if (usuarios != null) {
            Usuarios newAccount = usuariosServices.CreateAccount(usuarios);
            return ResponseEntity.status(HttpStatus.CREATED).body(newAccount);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }
}
