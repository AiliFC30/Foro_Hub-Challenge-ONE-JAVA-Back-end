

public record DatosTopico ( 
                
                @NotBlank 
                String titulo,

                @NotBlank 
                String fecha,

                @NotNull 
                String status,

                @NotBlank 
                String autor, 

                @NotBlank 
                String curso) {

}