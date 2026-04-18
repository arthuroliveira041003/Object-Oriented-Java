public class TestFinalAverage{
    void runAllTests(){

        FinalAverage f1 = new FinalAverage(8.7, 7.2, 9.3, 7.4);
        FinalAverage f2 = new FinalAverage(5.2, 3.4, 6.5, 2.1);
        FinalAverage f3 = new FinalAverage(3.4, 5.1, 1.1, 2.0);

        System.out.println("Starting tests...");

        if (f1.calculateAverage() != (f1.p1 + f1.p2 + f1.p3 + f1.p4) / 4){
            System.out.println("calculateAverage failed");
        }
        else{
            System.out.println("f1 Expected result: Passed" + " / " + "getResult : " +  f1.getResultt());
        }

        if (f2.calculateAverage() != (f2.p1 + f2.p2 + f2.p3 + f2.p4) / 4){
            System.out.println("calculateAverage failed");
        }
        else{
            System.out.println("f2 Expected result: Failed" + " / " + "getResult : " +  f2.getResultt());
        }

        if (f3.calculateAverage() != (f3.p1 + f3.p2 + f3.p3 + f3.p4) / 4){
            System.out.println("calculateAverage failed");
        }
        else{
            System.out.println("f3 Expected result: Failed" + " / " + "getResult : " +  f3.getResultt());
        }

        System.out.println("All tests completed!");
    }

    public static void main(String[] args) {
        new TestFinalAverage().runAllTests();
    }
}