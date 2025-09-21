package oopslect11_12_13;
class student {
    int age = 20 ;
    int rollNo ;
    String studentName ;
}
public class main {
    public static void main(String[] args) {
    student Sarvesh = new student(); // yaha per hum apna ek object bena rhe hai
        System.out.println(Sarvesh.age); // yaha per object ke method/attribute ko access ker rhe hai
        System.out.println(Sarvesh.rollNo);
        System.out.println(Sarvesh.studentName);
     student Saurav = new student();
        System.out.println(Saurav.age); // yaha per object ke method/attribute ko access ker rhe hai
        System.out.println(Saurav.rollNo);
        System.out.println(Saurav.studentName);
    }
}
//"C:\Program Files\Java\jdk-24\bin\java.exe" --enable-preview "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2025.1.2\lib\idea_rt.jar=61848" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\sarve\IdeaProjects\JAVADSAMASTERY\out\production\JAVADSAMASTERY;C:\Users\sarve\.m2\repository\org\jetbrains\annotations\24.0.0\annotations-24.0.0.jar oopslect11_12_13.main
//20
//        0
//        null
//        20
//        0
//        null
//
//Process finished with exit code 0
