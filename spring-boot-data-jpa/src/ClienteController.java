@Controller
public class ClienteController{

@Autowired
private IClienteDao clienteDao;

@RequestMapping(value="/listar", method=requestMethod.GET)
public String listar(Model model){
model.addAttribute("titulo","Listado de clientes");
model.addAttribute("clientes",clienteDao.findAll());
return "listar";

}
}
