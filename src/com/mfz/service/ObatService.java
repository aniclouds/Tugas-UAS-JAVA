/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mfz.service;

import com.mfz.entity.Kategori;
import com.mfz.entity.Obat;
import java.util.List;

/**
 *
 * @author DICKA
 */
public interface ObatService {
    void insertObat(Obat obat);
    void updateObat(Obat obat);
    void deleteObat(Obat obat);
    Obat getByid(String id);
    List<Obat> getObat();
    String setAutoNumber();
    List<Obat> getKategori(Kategori kategori);
    void kurangJumlahStokObat(int jumlah, Obat obat);
}
