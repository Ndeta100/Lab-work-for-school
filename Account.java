public class Account {
    private  String id;
    private String name;
    private int balance;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getID(){
        return "564682hhrhg";
    }
    public int getBalance() {
        return balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int credit(int amount){
        return balance -=amount;
    }
    public int debit(int amount){
        return balance +=amount;
    }

    public  void transferTo (Account acc, int amount){
        if (balance< amount){
            System.out.println("Amount exceeded balance");

        }else {
            balance -=amount;

        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
