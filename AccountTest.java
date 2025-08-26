public class AccountTest {
    //Data Pengguna Bank
    public static void main(String[] args) {
        SavingsAccount account1 = new SavingsAccount();
        account1.name = "Ilham";
        account1.balance = 190000.0;
        account1.interestRate = 0.02;
        account1.jumlahpenarikan += 110000;
        account1.informasiPengguna();
        account1.calcInterest();
        account1.deposit(55000);
        account1.withdraw();
        account1.setTermAndRate(12);
        account1.earnInterest();
    
        SavingsAccount account2 = new SavingsAccount();
        account2.name = "Fauzi";
        account2.balance = 50000.0;
        account2.interestRate = 0.2;
        account2.jumlahpenarikan += 100000;
        account2.informasiPengguna();
        account2.deposit(40000);
        account2.calcInterest();
        account2.withdraw();
        account2.setTermAndRate(34);
        account2.earnInterest();
        
        SavingsAccount account3 = new SavingsAccount();
        account3.name = "Ahmad";
        account3.balance = 650000.0;
        account3.interestRate = 0.2;
        account3.jumlahpenarikan += 220000;
        account3.informasiPengguna();
        account3.deposit(40000);
        account3.calcInterest();
        account3.withdraw();
        account3.setTermAndRate(18);
        account3.earnInterest();
    }
}