public class StudentChecker {

    public static void main(String[] args) {
        Student Damian = new Student();
        Damian.name = "Damian Marzec";
        Damian.nick = "damianeiro";
        Damian.email = "damianek01@o2.pl";
        Damian.index = 502335;

        Student Maciek = new Student();
        Maciek.name = "Maciej Kowalski";
        Maciek.nick = "MackoZBogdanca";
        Maciek.email = "macius321@wp.pl";
        Maciek.index = 502336;

        Student Jarek = new Student();
        Jarek.name = "Jaroslaw Nowak";
        Jarek.nick = "jaro";
        Jarek.email = "jareczek123@tlen.pl";
        Jarek.index = 502337;

        Student[] ListOfStudents = {Damian, Maciek, Jarek};

        for (int i = 0; i < ListOfStudents.length; i++) {
            System.out.println("Student " + (i+1) + ": ");
            ListOfStudents[i].getName();
            ListOfStudents[i].getEmail();
            ListOfStudents[i].getNick();
            ListOfStudents[i].getIndex();
        }



    }
}
