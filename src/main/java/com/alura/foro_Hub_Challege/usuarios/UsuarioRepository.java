public interface UsuarioRepository extends CrudRepository<Usuario, Long>{
    UserDetails findByUsername(String username);
}

