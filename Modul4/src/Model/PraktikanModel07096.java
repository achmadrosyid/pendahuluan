package Model;

import Entity.AslabEntity07096;
import Entity.PraktikanEntity07096;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class PraktikanModel07096 implements ModelInterfaces07096 {

    private ArrayList<PraktikanEntity07096> praktikanEntity07096ArrayList;

    public PraktikanModel07096() {
        praktikanEntity07096ArrayList = new ArrayList<PraktikanEntity07096>();
    }

    public void insert(PraktikanEntity07096 praktikanEntity07096) {
        praktikanEntity07096ArrayList.add(praktikanEntity07096);
    }

    @Override
    public void view() {
        for (PraktikanEntity07096 praktikanEntity07096 : praktikanEntity07096ArrayList) {
            System.out.println("===============================================================");
            System.out.println(" NPM : " + praktikanEntity07096.getNpm()
                    + "\n Nama : " + praktikanEntity07096.getNama()
                    + "\n Password : " + praktikanEntity07096.getPassword()
                    + "\n No Telp : " + praktikanEntity07096.getNo_telp()
                    + "\n Tanggal Lahir : " + praktikanEntity07096.getTgllahir());
            System.out.println("===============================================================");
        }
    }

    //@Override
    public int cekData(String npm, String password) {
        int loop = 0;
        while (!praktikanEntity07096ArrayList.get(loop).getNpm().equals(npm)
                && !praktikanEntity07096ArrayList.get(loop).getPassword().equals(password)) {
            loop++;
        }
        return loop;
    }
    
    public PraktikanEntity07096 getPraktikanEntityArrayList(int index){
        return praktikanEntity07096ArrayList.get(index);
    }
}
