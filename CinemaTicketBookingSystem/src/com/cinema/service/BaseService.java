package com.cinema.service;

import com.cinema.dao.AbstractDao;
import com.cinema.model.Customer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public abstract class BaseService {

    public AbstractDao abstractDao;

    public BaseService(AbstractDao abstractDao){
        this.abstractDao = abstractDao;
    }
    public abstract String getEntity();

    public void actionMenu() {
        System.out.println("Choose an action:");
        System.out.println("1: Find "+ getEntity()+" by ID");
        System.out.println("2: Get All "+ getEntity());
        System.out.println("3: Create a New "+ getEntity());
        System.out.println("4: Delete "+ getEntity());
        System.out.println("5: Exit");
    }

    private void destroyCustomer() throws IOException, SQLException {
        System.out.println("Enter Customer Id : ");
        int id = Integer.parseInt(br.readLine());
        T entity = new T();
        customer.setId(id);
        customerDao.delete(customer);
    }

    private void registerCustomer() throws SQLException, IOException {
        System.out.println("Enter customer name: ");
        String name = br.readLine();
        Customer customer = new Customer();
        customer.setName(name);
        customerDao.create(customer);
    }

    private static void getAllCusomter() throws SQLException {
        System.out.println("*** All Customers ***");
        List<Customer> customers = customerDao.getALl();
        for (Customer c: customers) {
            System.out.println(c);
        }
    }

    private void findCustomer() throws IOException, SQLException {
        System.out.println("Enter Customer Id: ");
        int id = Integer.parseInt(br.readLine());
        Customer customer = customerDao.findbyId(id);
    }
}
