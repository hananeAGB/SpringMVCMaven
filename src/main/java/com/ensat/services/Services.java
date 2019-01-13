/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensat.services;

import java.util.List;

/**
 *
 * @author AGBALU Hanane
 */
public interface Services<T> {
     public List<T> all();
    //  public Boolean SaveOrUpdate(T user);
    //public Boolean delete(T t);
   //public T findById(String id);
}
