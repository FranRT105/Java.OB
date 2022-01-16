package basic;

/**
 *
 * Implementation of CarCRUD Interface for cars DB.
 *
 * @author <a href="mailto:frt1001@alu.ubu.es">Francisco Romero</a>
 * @since 1.0
 * @version 1.0
 */
public class CarCRUDImpl implements CarCRUD{

    /**
     * {@inheritDoc}
     *
     * @return string
     */
    public String save(){
        return "Save car changes.";
    }

    /**
     * {@inheritDoc}
     *
     * @return string
     */
    public String findAll(){
        return "Find all cars that match the condition.";
    }

    /**
     * {@inheritDoc}
     *
     * @return string
     */
    public String delete(){
        return "Delete car from DB.";
    }
}
