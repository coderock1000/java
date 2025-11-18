class HillStations{
    void location(){
        System.out.println("Location is : ");
    }
    void FamousFor(){
        System.out.println("Famous for : ");
    }

}
class Manali extends HillStations{
    void location(){
        System.out.println("Location is : Himachal Pradesh");
    }
    void FamousFor(){
        System.out.println("Famous for : Solang Valley and Rohtang Pass");
    }
}
class Mussoorie extends HillStations{
    void location(){
        System.out.println("Location is : Uttarakhand");
    }
    void FamousFor(){
        System.out.println("Famous for : Kempty Falls and Gun Hill");
    }
}
class Gulmarg extends HillStations{
    void location(){
        System.out.println("Location is : Jammu and Kashmir");
    }
    void FamousFor(){
        System.out.println("Famous for : Skiing and Gondola Ride");
    }
}

public class HillStation {
    public static void main(String args[]){
        HillStations A = new HillStations();
        HillStations B = new Manali();
        HillStations C = new Mussoorie();
        HillStations D = new Gulmarg();
        A.location();
        A.FamousFor();
        B.location();
        B.FamousFor();
        C.location();
        C.FamousFor();
        D.location();
        D.FamousFor();
    }
}