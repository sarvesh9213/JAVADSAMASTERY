package oopslect11_12_13.lecture_11.lecture_12.skills;

public class APP {

    public String str_1 = "i am a public member " ;

    void printFromClass(){

        System.out.println("within class : "+ str_1);
}
    public static void main(String[] args) {
    APP obj1 = new APP() ;
    obj1.printFromClass();
        System.out.println(obj1.str_1);
    }
}
class APP2 {

}