/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mfz.service;

import com.mfz.entity.ReportTransaksi;
import com.mfz.entity.Transaksi;
import java.util.List;

/**
 *
 * @author DICKA
 */
public interface TransaksiService {
    boolean insertTransaksi(Transaksi transaksi);
    List<ReportTransaksi> getReportTransaksis(String idtransaksi);
    String KodeTransaksi();
}
