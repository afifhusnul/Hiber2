/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apoae.service;

import com.apoae.model.bukuModel;
import java.util.List;

/**
 *
 * @author NUSNAFIF
 */
public interface bukuService {
    public void save(bukuModel buku);
    List<bukuModel> getAll();
    
}
