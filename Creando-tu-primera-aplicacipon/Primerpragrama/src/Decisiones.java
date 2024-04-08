public class Decisiones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLapelicula = 8.2;
        String tipoPlan = "plus";

        if (fechaDeLanzamiento >= 2022){
            System.out.println("Películas más populaes");
        }else{
            System.out.println("Películas retro que aún vale la pena ver.");
        }

        if (incluidoEnElPlan && tipoPlan.equals("plus")){
            System.out.println("Disfrute de su película");
        }else{
            System.out.println("Película no disponible para su plann actual");
        }
    }
}
