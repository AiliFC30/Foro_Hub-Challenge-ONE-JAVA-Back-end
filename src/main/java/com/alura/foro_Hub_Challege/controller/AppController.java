
@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private TopicoRepository topicoRepository;

    //Registrar nuevo tópico
    @PostMapping
    public void registrarApp(@RequestBody @Valid DatosTopico datosRegistro){
        topicoRepository.save(new Topico (datosRegistro));
        System.out.println(datosRegistro);
    }

    
    //Mostrar todos los tópicos  GET JpaRepository findAll @PageableDefault
    @GetMapping
    public List<Topico> listadoTopicos(){
        return topicoRepository.findAll();
    }

    
    //Detallando los tópicos GET endpoint URI/topicos/{id}  @PathVariable

    @GetMapping
    public void  DatosTopico (Topico topico){
        return this(topico.getId(), topico.getTitulo(), topico.getFecha(), topico.getStatus().toString(),
                 topico.getAutor(), topico.getCurso())
    }


    //Actualizar un topico PUT isPresent()
    @PutMapping
    @Transactional
    public void actualizarTopico(@RequestBody @Valid DatosActualizarTopicos datosActualizarTopicos){
        Topico topico = topicoRepository.getReferenceById(datosActualizarTopicos.id());
        medico.actualizarTopico(datosActualizarTopicos);
    }
    
    //Eliminar un tópico DELETE  isPresent() @PathVariable deleteByID

    @DeleteMapping("/{id}")
    @Transactional
    public void eliminarTopico(@PathVariable Long id){
        Topico topico = topicoRepository.getReferenceById(id);
        topicoRepository.delete(topico);
    }

}
