

//JPA

@Table(name = "topico")
@Entity{name = "Topico"}
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public final class Topico{
    @Id
    @GeneratedValue(Strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String fecha;
    @Enumerated(EnumType.STRING)
    private String status;
    private String autor;
    private String curso;

    public Topico(DatosTopico datosRegistro){
        this.titulo = datosRegistro.titulo();
        this.fecha = datosRegistro.fecha();
        this.status = datosRegistro.status();
        this.autor = datosRegistro.autor();
        this.curso = datosRegistro.curso();
    }

    public void actualizarTopico(DatosActualizarTopicos datosActualizarTopicos){
        if(datosActualizarTopicos.titulo() != null){
            this.titulo = datosRegistro.titulo();
        }
        if(datosActualizarTopicos.fecha() != null){
            this.fecha = datosRegistro.fecha();
        }
        if(datosActualizarTopicos.status() != null){
            this.status = datosRegistro.status();
        }
        if(datosActualizarTopicos.autor() != null){
            this.autor = datosRegistro.autor();
        }
        if(datosActualizarTopicos.curso() != null){
            this.curso = datosRegistro.curso();
        }
        
        
        
        
    }
}