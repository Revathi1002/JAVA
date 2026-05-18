class bank1 {
    String IFSC;

    bank1(String IFSC) //parent
    {
        this.IFSC = IFSC;

    }

    public void bdetails() {
        System.out.println(IFSC);
    }
}
class person11 extends bank1                    //child1
{
    String name;
    String address;


    person11(String IFSC, String name, String address)
    {
        super(IFSC);
        this.name = name;
        this.address = address;
    }

    public void person11details()
    {
        System.out.println(name + " " + address + " " + IFSC);
    }
}
class person12 extends bank1
{
    String name;
    String acc_no;

    person12(String name,String acc_no,String IFSC)
    {
        super(IFSC);
        this.name = name;
        this.acc_no = acc_no;
    }

    public void person12details()
    {
    System.out.println(name+" "+acc_no+" "+IFSC);
    }
}
public class hirarchialinherit1 {
    public static void main(String[] args) {
        person11 obj11=new person11("Tejas","Davanagere","abc1234");
        obj11.person11details();
        person12 obj12=new person12("Mohitha","Mandya","abc1234");
        obj12.person12details();


    }
}



