package Work5;

public class Task3 {
    public static void main(String[] args) {
        //Задача1
        System.out.println("Задача1");
        int age = 12;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в универ");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
            // Задача2
            System.out.println("Задача2");
            if (age < 5) {
                System.out.println("Ребенок не может кататься на аттракционе");
            } else if (age < 14) {
                System.out.println("Ребенок может кататься на аттракционе, только при сопровождении взрослого. Если взрослого нет то кататься нельзя");
            } else {
                System.out.println("Ребенок  может кататься на аттракционе");
            }
            //Задача3
            System.out.println("Задача3");
            int one = 510;
            int two = 126;
            int three = 738;
            if (one > two) {
                if (one >= three) {
                    System.out.println("Максимальное число-" + one);
                } else {
                    System.out.println("Максимальное число-" + three);
                }
                }else if (two > one) {
                if (two >= three) {
                    System.out.println("Максимальное число-" + two);
                } else {
                    System.out.println("Максимальное число-" + three);
                }
            } else {
          if (one>three) {
          }else if (three>one){
              System.out.println("Максимальное число-" + one);
          } else {
              System.out.println("Максимальное число-" + three);
          }
          }
                }
            }

