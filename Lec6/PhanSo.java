package Lec6;

public class PhanSo {
    private int tuSo;
    private int mauSo;
    public PhanSo(int tuSO, int mauSo) {
        if (mauSo == 0) {
            throw new IllegalArgumentException("Mẫu số không thể bằng 0");
        }
        this.tuSo = tuSO;
        this.mauSo = mauSo;
    }
    public PhanSo() {
        System.out.println("da tao!");
    }

    public int getTuSO() {
        return tuSo;
    }

    public void setTuSO(int tuSO) {
        this.tuSo = tuSO;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauso(int mauSo){
        if (mauSo == 0) {
            throw new IllegalArgumentException("Mẫu số không thể bằng 0");
        }
        this.mauSo = mauSo;
    }
    public PhanSo cong(PhanSo ps) {
        int tuMoi = this.tuSo * ps.mauSo + ps.tuSo * this.mauSo;
        int mauMoi = this.mauSo * ps.mauSo;
        return new PhanSo(tuMoi, mauMoi);
    }
    public PhanSo nhan(PhanSo ps) {
        int tuMoi = this.tuSo * ps.tuSo;
        int mauMoi = this.mauSo * ps.mauSo;
        return new PhanSo(tuMoi, mauMoi);
    }
    public void hienThi() {
        System.out.println(tuSo + "/" + mauSo);
    }


    }

