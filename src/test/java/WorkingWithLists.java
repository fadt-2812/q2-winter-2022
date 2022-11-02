import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    @Test
    public void createAndWorkWithLists() {
        Student valera = new Student();
        valera.setFirstName("Valera");
        valera.setLastname("The Tester");
        valera.setEmail("valerunchik@test.lv");
        valera.setPhone("+37122222222");

        Student liga = new Student("Līga", "Ivanova", "liga@test.lv", "+37233333333");
        Student dimko = new Student("Dimon", "Bizon", "dimon@test", "+37144444444");
        Student artis = new Student("Artis", "Greatest", null, "+37155555555");
        // вместо null может быть " "


        List<Student> students = new ArrayList<>();
        students.add(valera);   //0
        students.add(liga);     //1
        students.add(dimko);    //2
        students.add(artis);    //3

        // ----------------FOR-----------------------------
        //for (int i = 0; i < 4; i++ ) {                                           // начало в цикле, конец, шаг i = 1 +1  ->> i++
        for (int i = 0; i < students.size(); i++) {
            //System.out.println(students.get(i).getFirstName());                  // i - текущий индекс
            //System.out.println(students.get(i).getLastname());
            //System.out.println(students.get(i).getEmail());
            //System.out.println(students.get(i).getPhone());
        }

        // --------------FOREACH---------------------------
        for (Student s : students) {                                          // проходит все записи
            //System.out.println(s.getFirstName());
            //System.out.println(s.getLastname());
            //System.out.println(s.getEmail());
            //System.out.println(s.getPhone());

            //System.out.println(s.getFirstName() + " " + s.getLastname());             // 2-ой метод
            System.out.println(s.getFullName());
        }
        //------------------------FOREACH with IF----------------------------------------
            System.out.println("Printing students with phone nr starting with +371:");
            for (Student s : students) {
                if (s.getPhone().startsWith("+371")) {
                System.out.println(s.getFullName());
            }
        }
    }
}
