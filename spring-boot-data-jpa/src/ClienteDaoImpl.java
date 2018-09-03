//Procedemos a decorar
@Repository
public class ClienteDaoImpl implemets ICLienteDao{


//se relaciona con application.properties
@PersistenceContext
private EntityManager em;

@SuppressWarning("unchecked")
@Transactional(readOnly=true)
@Override
public List<Cliente> findAll(){
return em.createQuery("from Cliente").getResultList();
}

}
