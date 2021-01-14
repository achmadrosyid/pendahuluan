package Model;

import Entity.AslabEntity07096;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class AslabModel07096 implements ModelInterfaces07096 {

    private ArrayList<AslabEntity07096> aslabEntity07096ArrayList;

    public AslabModel07096() {
        aslabEntity07096ArrayList = new ArrayList<AslabEntity07096>();
    }

    public void insertAslab(AslabEntity07096 aslab) {
        aslabEntity07096ArrayList.add(aslab);
    }

    @Override
    public void view() {
        for (AslabEntity07096 aslabEntity07096 : aslabEntity07096ArrayList) {
            System.out.print(aslabEntity07096.getNpm());
            System.out.print(aslabEntity07096.getNama());
            System.out.print(aslabEntity07096.getPassword());
            System.out.print(aslabEntity07096.getNo_telp());
            System.out.print(new SimpleDateFormat("dd-mm-yyyy").format(aslabEntity07096.getTgllahir()));
            System.out.println();

        }
    }

    //@Override
    public int cekData(String npm, String password) {
        int loop = 0;
        for (AslabEntity07096 aslabEntity07096 : aslabEntity07096ArrayList) {
            if (aslabEntity07096.getNpm().equals(npm) && aslabEntity07096.getPassword().equals(password)) {
                break;
            } else {
                loop++;
            }
        }
        return loop;
    }
    
    public AslabEntity07096 showDataAslab(int index){
        return aslabEntity07096ArrayList.get(index);
    }
}
