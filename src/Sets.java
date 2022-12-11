public class Sets {


    public void printAll(int amt){
        printAll(amt, "", 1);
    }

    public void printAll(int amt, String soFar, int currentSize){
        if (amt <= 0 ){
            System.out.println(soFar);
            return;
        }
        if( (amt - currentSize) < 0 ){
            return;
        }
        // use it
        printAll(amt - currentSize, soFar + " " + currentSize, currentSize);

        // dont use it
        printAll(amt, soFar, currentSize + 1);
    }

    public static void main(String[] args){
        Sets sets = new Sets();
        sets.printAll(10);
    }

}
