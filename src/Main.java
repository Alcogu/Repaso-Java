public class Main {

    public static void main(String[] args) {
        Charmander charmander = new Charmander(0.6, 8.5, "Macho", "Mar Llamas");
        Bulbasaur bulbasaur = new Bulbasaur();

        bulbasaur.setAltura(0.7);
        bulbasaur.setPeso(6.9);
        bulbasaur.setSexo("Macho");
        bulbasaur.setHabilidad("Espesura");
        bulbasaur.setDebilidades();

        charmander.ataqueMarLlamas(bulbasaur, 23);

        System.out.println("Los puntos de vida restantes son: ");
        System.out.println(bulbasaur.getPuntosVida());

    }
}