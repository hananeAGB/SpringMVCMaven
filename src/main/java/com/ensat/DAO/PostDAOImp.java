/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensat.DAO;

import com.ensat.entities.Post;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author AGBALU Hanane
 */
@Repository
@Transactional
public class PostDAOImp implements PostDAO{
    @Autowired(required = true)
    private SessionFactory sessionFactory;

    @Override
    public List<Post> all() {
           Session s = sessionFactory.getCurrentSession();
           List<Post> l=s.createQuery("from Post").list();
            return l;
    }
    
}
