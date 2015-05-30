/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import apps.model.Customers;
import java.util.List;
import org.hibernate.Criteria; 
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ade
 */
@Transactional(readOnly=true)
public class ServiceImpl implements Service {
    @Autowired 
    private SessionFactory sessionFactory;
    
    @Override
    public void get(){
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Customers.class);
        List<Customers> customers = criteria.list();
        for (Customers customer : customers) {
            System.out.println(" dataaa"+customer.getNama_perusahaan());
        }
    }
}
