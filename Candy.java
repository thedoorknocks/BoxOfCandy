public class Candy {
    private String flavor;

    public Candy(String f) {
        flavor = f;
    }

    public String toString() {
        return flavor;
    }

    // BoxOfCandy inner class
    public static class BoxOfCandy {
        private Candy[][] box;

        public BoxOfCandy(Candy[][] b) {
            box = b;
        }

        public String toString() {
            String s = "";
            for (int row = 0; row < box.length; row++) {
                for (int col = 0; col < box[0].length; col++) {
                    s += box[row][col] + " ";
                }
                s += "\n";
            }
            return s;
        }

        public static boolean moveCandyToFirstRow(Candy[][] box, int col) {
            if (box[0][col] != null) return true;  
            for (int i = 1; i < box.length; i++) {
                if (box[i][col] != null) {
                    box[0][col] = box[i][col];  
                    box[i][col] = null;
                    return true;
                }
            }
            return false; 
        }

        public Candy removeNextByFlavor(String flavor) {
            for (int row = box.length - 1; row >= 0; row--) {
                for (int col = 0; col < box[0].length; col++) {
                    if (box[row][col] != null && box[row][col].flavor.equals(flavor)) {
                        Candy removedCandy = box[row][col];
                        box[row][col] = null;  
                        return removedCandy; 
                    }
                }
            }
            return null;  
        }
    }
}
