import java.sql.SQLException;

import com.cinema.dao.CustomerDao;
import com.cinema.model.Customer;

public class Main {
    public static void main(String[] args) throws SQLException {
        CustomerDao customerDao =  new CustomerDao();
        Customer customer = customerDao.findbyId(1);
        System.out.println(customer);
    }
}