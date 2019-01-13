/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensat.services;

import com.ensat.DAO.PostDAO;
import com.ensat.entities.Post;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author AGBALU Hanane
 */
@Service
@Transactional
public class PostServices implements Services<Post>{

 @Autowired
 public PostDAO d;
    

    @Override
    public List<Post> all() {
        return d.all();
    }
}