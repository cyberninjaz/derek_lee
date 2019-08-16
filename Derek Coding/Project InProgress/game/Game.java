package game;

import java.util.Scanner;

import game.battle.SingleBattle;
import game.core.Trainer;
import game.pokemon.Charmander;
import game.pokemon.Totodile;
import game.trainer.PlayerTrainer;

public class Game {
	
	public static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Trainer t1 = new PlayerTrainer();
		t1.name = "Ash";
		
		Trainer t2 = new PlayerTrainer();
		t2.name = "Gary";
		
		t1.party[0] = new Totodile();
		
		t2.party[0] = new Charmander();
		
		SingleBattle battle = new SingleBattle();
		battle.trainers[0] = t1;
		battle.trainers[1] = t2;
		battle.start();
	}

}
