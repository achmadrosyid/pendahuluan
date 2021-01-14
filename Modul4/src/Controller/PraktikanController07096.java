/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Bariq Qushoyyi
 */
import Entity.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class PraktikanController07096 implements ControllerInterface07096 {

    int indexLogin = 0;

    public PraktikanController07096() {
    }

    public PraktikanEntity07096 getData() {
        return AllObjectModel07096.praktikanmodel07096.getPraktikanEntityArrayList(indexLogin);
    }

    public void daftarPraktikum(int indexPraktikum, PraktikanEntity07096 praktikanEntity, boolean isVerified) {
        AllObjectModel07096.daftarprakmodel07096.insertDataDaftarprak(new DaftarprakEntity07096(indexPraktikum, praktikanEntity, isVerified));
    }

    @Override
    public void login(String npm, String password) {
        indexLogin = AllObjectModel07096.praktikanmodel07096.cekData(npm, password);
    }

    public void insert(String npm, String password, String nama, String no_telp, Date tglLahir, String kelas) {
        AllObjectModel07096.praktikanmodel07096.insert(new PraktikanEntity07096(npm, password, nama, no_telp, tglLahir, kelas));
    }

    public PraktikanEntity07096 praktikanEntity() {
        return AllObjectModel07096.praktikanmodel07096.getPraktikanEntityArrayList(indexLogin);
    }

    public int cekDaftarprak(String npm) {
        int cek = AllObjectModel07096.daftarprakmodel07096.cekData(npm, null);
        return cek;
    }

    public DaftarprakEntity07096 showDaftarprak(int index) {
        return AllObjectModel07096.daftarprakmodel07096.showDaftarprak(index);
    }

    public DefaultTableModel daftarprak() {
        DefaultTableModel dtmdaftarprak = new DefaultTableModel();
        Object[] kolom = {"NPM", "Nama", "Password", "No Telp", "Tgl Lahir", "praktikum", "Verified", "Kelas"};
        dtmdaftarprak.setColumnIdentifiers(kolom);
        int size = AllObjectModel07096.daftarprakmodel07096.alldataprak().size();
        String verif = null;
        for (int i = 0; i < size; i++) {
            if (AllObjectModel07096.daftarprakmodel07096.alldataprak().get(i).isVerified() == false) {
                verif = "no";
            } else {
                verif = "yes";
            }
            Object[] data = new Object[8];
            data[0] = AllObjectModel07096.daftarprakmodel07096.alldataprak().get(i).getPraktikan().getNpm();
            data[1] = AllObjectModel07096.daftarprakmodel07096.alldataprak().get(i).getPraktikan().getNama();
            data[2] = AllObjectModel07096.daftarprakmodel07096.alldataprak().get(i).getPraktikan().getPassword();
            data[3] = AllObjectModel07096.daftarprakmodel07096.alldataprak().get(i).getPraktikan().getNo_telp();
            data[4] = new SimpleDateFormat("dd-mm-yyy").format(AllObjectModel07096.daftarprakmodel07096.alldataprak().get(i).getPraktikan().getTgllahir());
            data[5] = PraktikumEntity07096.nama[AllObjectModel07096.daftarprakmodel07096.alldataprak().get(i).getIndexPrak()];
            data[6] = verif;
            data[7] = AllObjectModel07096.daftarprakmodel07096.alldataprak().get(i).getPraktikan().getKelas();
            dtmdaftarprak.addRow(data);
        }
        return dtmdaftarprak;
    }
}
