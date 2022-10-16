public class Main {

        public static void main(String[] args) {

            int salary = 29_000;
            int total = 0;
            for (int i = 1; i < 13; i++) {
                total += salary;
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");

        }

}}