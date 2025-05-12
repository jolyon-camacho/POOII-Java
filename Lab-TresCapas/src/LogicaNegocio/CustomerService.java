package LogicaNegocio;

import AccesoDatos.CustomerDAO;
import AccesoDatos.CustomerDAOImpl;

/**
 * Servicio que maneja la lógica de negocio para los clientes.
 */
public class CustomerService {
    private CustomerDAO customerDAO;

    /**
     * Constructor que inicializa el DAO.
     */
    public CustomerService() {
        this.customerDAO = new CustomerDAOImpl();
    }

    /**
     * Método para registrar un nuevo cliente.
     * @param customer Cliente a registrar.
     */
    public void registerCustomer(Customer customer) {
        customerDAO.addCustomer(customer);
    }
}
