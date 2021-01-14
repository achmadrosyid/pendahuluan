package Entity;

import java.util.Date;

public class PraktikanEntity07096 extends MahasiswaAbstractEntity07096 {

    private String kelas;

    public PraktikanEntity07096(String npm, String password, String nama, String no_telp, Date tgllahir, String kelas) {
        super(npm, password, nama, no_telp, tgllahir);
        this.kelas = kelas;
    }

    @Override
    public String getNpm() {
        return npm;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
}
