package Work5;

public class Task2 {
    public static void main(String[] args) {

        //Задача1
        int age = 15;
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно еще подождать");

            //Задача2
            if (age >= 7 && age < 18) {
                System.out.println("Ребенок ходит в школу");
            } else if (age >= 18 && age < 24) {
                System.out.println("Человек ходит в универ");
            } else if (age >= 24) {
                System.out.println("Человек ходит на работу");
            }
            //Задача3
            int CarCapasity = 102;
            int Seating = 62;//Сидячие места
            int StandingPlaces = CarCapasity - Seating; //Стоячие места
            int seatingUsed = 68;
            int StandingUsed = 31;
            if (seatingUsed < Seating) {
                System.out.println("Есть еще" + (Seating - seatingUsed) + "сидячих мест");
            } else {
                System.out.println("Сидячих мест нет");
            }
            if (StandingPlaces > StandingUsed) {
                System.out.println("Есть еще" + (StandingPlaces - StandingUsed) + "стоячих мест");
            } else {
                System.out.println("Стоячих мест нет");
            }
        }
    }
}








