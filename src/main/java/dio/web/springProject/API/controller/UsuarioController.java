package dio.web.springProject.API.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.web.springProject.API.controller.Repository.UsuarioRepository;
import dio.web.springProject.API.model.Usuario;

@RestController
@RequestMapping("usuarios")
    public class UsuarioController{
        @Autowired
        private UsuarioRepository repository;
        @GetMapping()
        public List<Usuario> getUsuarios(){
            return repository.listAll();
        }

        @DeleteMapping("/{id}")
        public Usuario getOne(@PathVariable("id") Integer id){
            return repository.finById(id);
        }
        
        @PostMapping()
        public void postUser(@RequestBody Usuario usuario){
            repository.save(usuario);
        }
    }

