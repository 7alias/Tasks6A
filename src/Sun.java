public class Sun {

    public static void main(String[] args) {

        StarSystem ss = new StarSystem("Moon", 2, 10000);
        System.out.println(ss.getInfo("Moon", 2 , 100));

        SunSystem sun = new SunSystem(1000, 100000, 700000000);
        System.out.println(sun.getInfo());

    }
}
