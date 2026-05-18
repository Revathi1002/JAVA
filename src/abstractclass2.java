abstract class bannk
{
    String transaction_id;
    int amount;
    bannk(String transaction_id, int amount)
    {
        this.transaction_id=transaction_id;
        this.amount=amount;
    }
    abstract void display();
    void success()
    {
        System.out.println("amount sent successfully");
    }

}

class store extends bannk {
    String name;

    store(String transaction_id, int amount, String name) {
        super(transaction_id, amount);
        this.name = name;
    }

    public void display() {
        System.out.println(transaction_id + " " + amount + " " + name);
    }

    public void done() {
        System.out.println("Displayed successfully");
    }
}
class refund extends bannk
    {
        String demo;
        refund(String transaction_id,int amount,String demo)
        {
            super(transaction_id,amount);
            this.demo=demo;

        }
        public void display()
        {
            System.out.println(transaction_id+" "+amount);
        }
    }


public class abstractclass2 {
   public static void main(String[] args) {
       store obj=new store("rc1235677",200,"insta");
       obj.display();
       obj.success();
       obj.display();
       refund obj1=new refund("gc123",300,"whats");
       obj1.display();
   }
}
