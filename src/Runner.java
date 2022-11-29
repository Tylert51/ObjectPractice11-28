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
    }
}
