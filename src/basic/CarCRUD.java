package basic;

/**
 *
 * Interface to create CRUD operations on cars DB.
 *
 * @author <a href="mailto:frt1001@alu.ubu.es">Francisco Romero</a>
 * @since 1.0
 * @version 1.0
 */
public interface CarCRUD {

    /**
     * Save car changes.
     */
    String save();

    /**
     *
     * Find all cars that match given condition.
     */
    String findAll();

    /**
     *
     * Delete car from DB.
     */
    String delete();
}
