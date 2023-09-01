public class Main {
    public static void main(String[] args) {
        //Declaración de objeto
        Bulbasaur bulbasaur = new Bulbasaur(0.7,  6.9, "Macho","Espesura");
        Charmander charmander = new Charmander(0.6,8.5,"Hembra","Mar de llamas");

        bulbasaur.setTipo("Planta");
        System.out.println(bulbasaur.getTipo());

        charmander.setTipo("Fuego");
        System.out.println(charmander.getTipo());
    }
}