package dio.web.springProject.API.controller.Repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import dio.web.springProject.API.model.Usuario;

@Repository
public class UsuarioRepository {
    public void save(Usuario user){
        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        System.out.println(user);
    }
    public void update(Usuario Usuario){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(Usuario);
    }
    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> listAll(){
        System.out.println("LIST - Listando os usários do sistema");
        List<Usuario> Users = new ArrayList<>();
        Users.add(new Usuario("Luan","password"));
        Users.add(new Usuario("Marques","masterpass"));
        return Users;
    }
    public Usuario finById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("Luan","password");
    }
}
