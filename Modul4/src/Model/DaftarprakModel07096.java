package Model;

import Entity.DaftarprakEntity07096;
import Entity.PraktikumEntity07096;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class DaftarprakModel07096 implements ModelInterfaces07096 {

    private ArrayList<DaftarprakEntity07096> daftarprak07096ArrayList;

    public DaftarprakModel07096() {
        daftarprak07096ArrayList = new ArrayList<DaftarprakEntity07096>();
    }
    
    public ArrayList<DaftarprakEntity07096> alldataprak() {
        return daftarprak07096ArrayList;
    }


    public void insertDataDaftarprak(DaftarprakEntity07096 daftarPrak07096) {
        daftarprak07096ArrayList.add(daftarPrak07096);
    }

    public ArrayList<DaftarprakEntity07096> getDaftarprakArrayList() {
        return daftarprak07096ArrayList;
    }

    @Override
    public void view() {
        for (DaftarprakEntity07096 daftarprak07096 : daftarprak07096ArrayList) {
            System.out.println("===============================================================");
            System.out.println(" NPM : " + daftarprak07096.getPraktikan().getNpm()
                    + "\n Nama : " + daftarprak07096.getPraktikan().getNama()
                    + "\n Password : " + daftarprak07096.getPraktikan().getPassword()
                    + "\n No Telp : " + daftarprak07096.getPraktikan().getNo_telp()
                    + "\n Tanggal Lahir : " + new SimpleDateFormat("dd-MM-yyyy").format(daftarprak07096.getPraktikan().getTgllahir())
                    + "\n Praktikum : " + PraktikumEntity07096.nama[daftarprak07096.getIndexPrak()]
                    + "\n IsVerified : ");
            if (daftarprak07096.isVerified() == false) {
                System.out.println("Belum Di Verifikasi Admin");
            } else {
                System.out.println("Telah Di Verifikasi");
            }
            System.out.println("===============================================================");
        }
    }

    @Override
    public int cekData(String npm, String password) {
        int loop = 0;
        if (daftarprak07096ArrayList.size() == 0) {
            loop = -1;//data kosong
        } else {
            for (int i = 0; i < daftarprak07096ArrayList.size(); i++) {
                if (daftarprak07096ArrayList.get(i).getPraktikan().getNpm().equals(npm)) {
                    loop = i;
                    break;
                } else {
                    loop = -2;
                }
            }
        }
        return loop;
    }

    public DaftarprakEntity07096 showDaftarprak(int index) {
        return daftarprak07096ArrayList.get(index);
    }
    
    public void updateIsVerified(int index, DaftarprakEntity07096 daftarprak07096){
        daftarprak07096ArrayList.set(index, daftarprak07096);
    }
}
