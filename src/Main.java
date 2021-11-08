public class Main {
    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();

        //Cerinta 1
        op.countWhile(1);
        System.out.println("------");

        //Cerinta 2
        op.reverseWhile(1);
        System.out.println("------");

        //Cerinta 3
        op.fromXToYWhile(1,10);
        System.out.println("------");

        //Cerinta 4
        op.higherNumberWhile(5,10);
        System.out.println("------");

        //Cerinta 5
        op.pareWhile();
        System.out.println("------");

        //Cerinta 6
        op.impareWhile();
        System.out.println("------");

        //Cerinta 7
        op.intervalWhile();
        System.out.println("------");

        //Cerinta 8
        System.out.println(op.dividedBySevenWhile(1,100));
        System.out.println("------");

        //Cerinta 9
        op.fiboWhile();
        System.out.println("------");

        //Cerintas 10
       op.CozaLozaWoza();
    }
}
