public class Candy{
    private String flavor;
    public Candy(String f){
        flavor = f;
    }
    public BoxOfCandy(Candy[][] b)
    {
        box = b;
    }
    public String toString(){
        return flavor;
    }

}