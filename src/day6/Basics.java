package day6;

//class
class Committee{
    public int id;
    public String name;
    public float percentage;

    public Committee(int i,String n,float p) {
        id=i;
        name=n;
        percentage=p;
    }
    public Committee(int i,String n){
        id=i;
        name=n;
    }
    public Committee(int i){
        id=i;
    }
    public Committee(){

    }
    public void Details(){
        System.out.println("hello from Details");
    }
}


public class Basics {
    public static void main(String[] args) {


        //objects
        Committee c1 = new Committee(101,"Arivu",98.63F);
        System.out.println(c1.id);
        System.out.println(c1.name);
        System.out.println(c1.percentage);
//        System.out.println(c2.id);

        Committee c2=new Committee(101,"kavi");
        Committee c3=new Committee(101);
        Committee c4=new Committee();
        System.out.println("+++++++"+c2.id);
        System.out.println(c2.name);
        System.out.println(c2.percentage);
        System.out.println("+++++++"+c3.id);
        System.out.println(c3.name);
        System.out.println(c3.percentage);
        c1.Details();
    }
}
