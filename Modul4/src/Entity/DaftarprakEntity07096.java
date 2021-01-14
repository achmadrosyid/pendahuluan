package Entity;

public class DaftarprakEntity07096 {
    private PraktikanEntity07096 praktikan;
    private boolean isVerified;
    private int indexPraktikum;

    public DaftarprakEntity07096(int indexPraktikum, PraktikanEntity07096 praktikan, boolean isVerified) {
        this.praktikan = praktikan;
        this.isVerified = isVerified;
        this.indexPraktikum = indexPraktikum;
    }

    public PraktikanEntity07096 getPraktikan() {
        return praktikan;
    }

    public void setPraktikan(PraktikanEntity07096 praktikan) {
        this.praktikan = praktikan;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }

    public int getIndexPrak() {
        return indexPraktikum;
    }

    public void setIndexPrak(int indexPraktikum) {
        this.indexPraktikum = indexPraktikum;
    }
    
    
}
