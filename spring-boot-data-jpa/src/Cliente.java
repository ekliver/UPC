@Entity
@Table(name="clientes")
public class Cliente implements Serializable{

private static final long serialVersionUID=1L;

@Id
@GenerateValue(Strategy = GenerationType.IDENTITY)
private Long id;


private String nombre;
private String apellido;
private String email;

@Column(name="create_at")
@Temporal(TemporalType.DATE)
private Date createAt;


}
