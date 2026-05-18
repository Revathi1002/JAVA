class game
{
    private String pname="Virat";
    private int health=80;
    private int level=1;

    public String getpname()
    {
        return pname;
    }
    public int gethealth()
    {
        return health;
    }
    public int getlevel()
    {
        return level;
    }
    public void setpname(String pname)
    {
        this.pname = pname;
    }
    public void sethealth(int health)
    {
        this.health=health;
    }
    public void setlevel(int level )
    {
        this.level=level;
    }
}
public class encap1 {
    public static void main(String[] args) {
        game obj=new game();
        System.out.println("old name"+" "+obj.getpname());
        System.out.println("old health"+" "+obj.gethealth());
        System.out.println("old level"+" "+obj.getlevel());
        obj.setpname("ABD");
        obj.sethealth(85);
        obj.setlevel(2);
        System.out.println("new name"+" "+obj.getpname());
        System.out.println("new health"+" "+obj.gethealth());
        System.out.println("new level"+" "+obj.getlevel());

    }
}
