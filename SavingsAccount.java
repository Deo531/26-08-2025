public class SavingsAccount {
    public String name;
    public double balance, interestRate, rate;
    public int term;
    
    //Informasi Akun
    public void informasiPengguna(){
        System.out.println("===Informasi Pengguna===");
        System.out.println("Nama Customer           : " + name);
        System.out.println("Saldo                   : Rp " + balance);
    }
    //Menghitung bunga bulanan
    public double calcInterest(){
        System.out.println("---------Bunga---------");
        double bunga =  balance * interestRate / 12;
        System.out.println("Bunga                   : " + (interestRate * 100) + "%");
        System.out.println("Total Bunga perbulan    : Rp " + bunga);
        return bunga;
    }
    //Menambahkan Dana ke saldo
    public void deposit(int x) {
        balance += x;
        System.out.println("--------Deposit--------");
        System.out.println("Deposit                 : Rp " + x);
        System.out.println("Saldo setelah deposit   : Rp " + balance);
    }
    //Menarik uang dari saldo
    public int jumlahpenarikan;
    public double saldoSetelahPenarikan;
    public void withdraw() {
        System.out.println("-------Penarikan-------");
        System.out.println("Anda Melakukan Penarikan");
        System.out.println("Jumlah Penarikan        : Rp "+ jumlahpenarikan);
        
        if (jumlahpenarikan <= 0){
            System.out.println("Penarikan tidak boleh negatif");
        } else if (jumlahpenarikan >= 150000){
            System.out.println("Maaf Anda Mencapai Batas Nominal Maksimal Penarikan yaitu Rp 150.000");
        }else if (balance <= jumlahpenarikan) {
            System.out.println("Maaf Saldo anda tidak cukup");
            System.out.println("Saldo Anda Sekarang     : Rp " + balance);
        } else {
            saldoSetelahPenarikan = balance - jumlahpenarikan;
            balance = saldoSetelahPenarikan;
            System.out.println("Selamat anda berhasil melakukan penarikan");
            System.out.println("Saldo anda sekarang     : Rp" + saldoSetelahPenarikan);
        } System.out.println("========================");
    }
    // Mengatur termin dan suku bunga sesuai ketentuan tier
    public void setTermAndRate(int t) {
        System.out.println("===Obligasi: "+name+"===");
        if (t >= 0 && t < 12) {
            rate = 0.005;
        } else if (t >= 12 && t < 24) {
            rate = 0.010;
        } else if (t >= 24 && t < 36) {
            rate = 0.015;
        } else if (t >= 36 && t < 48) {
            rate = 0.020;
        } else if (t >= 48 && t <= 60) {
            rate = 0.025;
        } else {
            System.out.println("Bulan tidak valid");
            t = 0;
        }
        term = t;
    }

    // Mendapatkan bunga bulanan hingga jatuh tempo
    public void earnInterest() {
        if (term > 0) {
            balance += balance * rate / 12;
            term--;
            System.out.println("Saldo      : Rp " + balance);
            System.out.println("Bunga      : " + (rate * 100) + "%");
            System.out.println("Sisa Bulan : " + term);
            System.out.println("========================");
            System.out.println();
        } else {
            System.out.println("Obligasi Jatuh Tempo");
            System.out.println();
        }
    }
}
