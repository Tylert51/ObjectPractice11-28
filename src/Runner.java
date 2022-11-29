public class Runner {
    public static void main(String[] args) {

        // Person Class
        Person Jeff = new Person("Jeff" , "Bezos");
        Jeff.setEmail("coolbeans@gmail.com");
        Jeff.introduce();

        System.out.println("\n\n");

        // Prism Class
        Prism rect = new Prism(5,7,9);
        rect.changeHeight(12);
        System.out.println(rect);
        System.out.println(rect.calcVolume());
        System.out.println(rect.calcSurfaceArea());

        System.out.println("\n\n");

        // Spinner
        Spinner nice = new Spinner(10);
        for(int i = 1; i <= 10; i++) {
            nice.spin();
            System.out.println(nice.returnNum());
        }

        System.out.println(nice.calcAverageSpin());

        System.out.println("\n\n");


        // Student Class
        Student alan = new Student("Alan Turing", 11, "Liberty High School");
        Student ada = new Student("Ada Lovelace", 5);
        Student mary = new Student("Mary Truman", 8);
        Student paul = new Student("Paul Rudd", 2, "Colerain Elementary School");
        Student cindy = new Student("Cindy Long", 4);

        System.out.println(alan);
        System.out.println(ada);
        System.out.println(mary);
        System.out.println(paul);
        System.out.println(cindy);

    }
}
