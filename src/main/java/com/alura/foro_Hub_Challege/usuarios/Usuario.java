
@Table(name = "usuarios")
@Entity{name = "Usuario"}
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class  Usuario  {
    @Id
    @GeneratedValue(Strategy = GenerationType.IDENTITY)
    private Long id;
    private String login; 
    private String clave;
}
