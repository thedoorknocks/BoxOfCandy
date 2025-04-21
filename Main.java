public class Main{
    public static void main(String[] args){
        Candy[][] box = new Candy[3][4];
        box[0][1] = new Candy("lime");
        box[1][1] = new Candy("orange");
        box[2][2] = new Candy("cherry");
        box[3][1] = new Candy("lemon");
        box[3][2] = new Candy("grape");

        BoxOfCandy b = new BoxOfCandy(box);
        System.out.println(b);

        public String toString()
        {
            String s = "";
            for(int row = 0; row<box.length; row++){
                for(int col = 0; col <box[0].length; col++){
                    s += box[row][col] + "";
                }
                s += "/n"
            }
            return s;
        }
    }
}
