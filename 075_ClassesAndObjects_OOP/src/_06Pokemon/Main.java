package _06Pokemon;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pokemon> pokemonOfAsh = initializePokemons();

        // Every pokemon has a name and a type.
        // Certain types are effective against others, e.g. water is effective against fire.

        // Ash has a few pokemon.
        // A wild pokemon appeared!

        Pokemon wildPokemon = new Pokemon("Oddish", "leaf", "water");

        // Which pokemon should Ash use?
        String ashShouldUseThisPokemon = "";
        for (int i = 0; i < 4 ; i++) {      // todo: foreach-csel is! jó lenne megcsinálni
             if (pokemonOfAsh.get(i).isEffectiveAgainst(wildPokemon) == true) {
                 ashShouldUseThisPokemon = pokemonOfAsh.get(i).name;
             }
        }
        System.out.print("I choose you, " + ashShouldUseThisPokemon);
    }

    private static List<Pokemon> initializePokemons() {
        List<Pokemon> pokemon = new ArrayList<>();

        pokemon.add(new Pokemon("Balbasaur", "leaf", "water"));
        pokemon.add(new Pokemon("Pikatchu", "electric", "water"));
        pokemon.add(new Pokemon("Charizard", "fire", "leaf"));
        pokemon.add(new Pokemon("Balbasaur", "water", "fire"));
        pokemon.add(new Pokemon("Kingler", "water", "fire"));

        return pokemon;
    }
}

