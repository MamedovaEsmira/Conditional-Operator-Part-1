package Work5;
public class Task1 {
        public static void main(String[] args) {
            // Задача1
            int age = 29;
            if (age >= 18) {
                System.out.println("Поздравляю с совершеннолетием");
            }
            if (age < 18) {
                System.out.println("Возраст совершеннолетия еще не наступил, нужно еще подождать");
            }
            //Задача2
            if (age >= 7 && age < 18) {
                System.out.println("Ребенок ходит в школу");
            }
            if (age >= 18 && age < 24) {
                System.out.println("Человек ходит в универ");
            }
            if (age >= 24) {
                System.out.println("Человек ходит на работу");
            }
            //Задача3
            int CarCapasity = 102;
            int Seating = 62;//Сидячие места
            int StandingPlaces = CarCapasity - Seating; //Стоячие места
            int seatingUsed = 68;
            int StandingUsed = 32;
            if (seatingUsed < Seating) {
                System.out.println("Есть еще" + (Seating - seatingUsed) + "сидячих мест");
            }
            if (seatingUsed == Seating) {
                System.out.println("Сидячих мест нет");
            }
            if (StandingPlaces > StandingUsed) {
                    System.out.println("Есть еще" + (StandingPlaces-StandingUsed - seatingUsed) + "стоячих мест");
                }
                if (StandingPlaces == StandingUsed) {
                    System.out.println("Стоячих мест нет");

                }

            }
        }

