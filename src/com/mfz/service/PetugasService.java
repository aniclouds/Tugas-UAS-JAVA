/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mfz.service;

import com.mfz.entity.Petugas;
import java.util.List;

/**
 *
 * @author DICKA
 */
public interface PetugasService {
    void insertPetugas(Petugas petugas);
    void updatePetugas(Petugas petugas);
    void deletePetugas(Petugas petugas);
    Petugas getByid(String id);
    List<Petugas> petugase();
    String setAutoNumber();
    Petugas loginPetugas(String username, String password);
}
