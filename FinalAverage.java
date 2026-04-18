public class FinalAverage{
    double p1;
    double p2;
    double p3;
    double p4;

    public FinalAverage(double p1, double p2, double p3, double p4){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;

    }
    
    public double calculateAverage(){
        return (p1 + p2 + p3 + p4) / 4;
    }

    String getResultt(){
        if(this.calculateAverage() >= 5) return " -> Passed";
        else return " -> Failed";
    }

    public static void main(String[] args) {
     FinalAverage f1 = new FinalAverage(8.7, 7.2, 9.3, 7.4);
     FinalAverage f2 = new FinalAverage(5.2, 3.4, 6.5, 2.1);
     FinalAverage f3 = new FinalAverage(3.4, 5.1, 1.1, 2.0);
        System.out.println("Media: "  + f1.calculateAverage() + f1.getResultt());
        System.out.println("Media: "  + f2.calculateAverage() + f2.getResultt());
        System.out.println("Media: "  + f3.calculateAverage() + f3.getResultt());


    }
}