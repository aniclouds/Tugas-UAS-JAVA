/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mfz.service;

import com.mfz.entity.Kategori;
import java.util.List;

/**
 *
 * @author DICKA
 */
public interface KategoriService {
    void insertKategori(Kategori kategori);
    void updateKategori(Kategori kategori);
    void deleteKategori(Kategori kategori);
    Kategori getByid(String id);
    List<Kategori> getkatKategori();
}
