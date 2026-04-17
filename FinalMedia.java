public class FinalMedia{
    double p1;
    double p2;
    double p3;
    double p4;

    public FinalMedia(double p1, double p2, double p3, double p4){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;

    }
    
    public double arithmeticMedia(){
        return (p1 + p2 + p3 + p4) / 4;
    }

    String result(){
        if(this.arithmeticMedia() >= 5) return " -> approved";
        else return " -> failed";
    }

    public static void main(String[] args) {
        FinalMedia f1 = new FinalMedia(8.7, 7.2, 9.3, 7.4);
        FinalMedia f2 = new FinalMedia(5.2, 3.4, 6.5, 2.1);
        FinalMedia f3 = new FinalMedia(3.4, 5.1, 1.1, 2.0);
        System.out.println("Media: "  + f1.arithmeticMedia() + f1.result());
        System.out.println("Media: "  + f2.arithmeticMedia() + f2.result());
        System.out.println("Media: "  + f3.arithmeticMedia() + f3.result());


    }
}