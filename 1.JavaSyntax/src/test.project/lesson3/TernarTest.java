package test.project.lesson3;

public class TernarTest {
    int age;
    TernarTest(int age){
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        TernarTest man = new TernarTest(15);
        System.out.println(man.getAge() >= 18 ? "Все в порядке, проходите!" : "Этот фильм не подходит для вашего возраста!");

//

      //  String securityAnswer = (man.getAge() >= 18) ? System.out.println("Все в порядке, проходите!"); : "Этот фильм не подходит для вашего возраста!";
         String securityAnswer = (man.getAge() >= 18) ? ("Все в порядке, проходите!") : "Этот фильм не подходит для вашего возраста!";

        System.out.println(securityAnswer);

    }
}
