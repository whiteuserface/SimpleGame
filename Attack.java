package MakeGame;

public class Attack {
	
	int swordDamage = 10;
	int sheildDamage = 5;
	int bowDamage = 8;
	
	int swordAttack(int hp) {
		hp = hp-swordDamage;
		System.out.println("스워드 공격!");
		return hp;
	}
	int sheildAttack(int hp) {
		hp = hp-sheildDamage;
		System.out.println("방패 공격!");
		return hp;
	}
	int bowAttack(int hp) {
		hp = hp-bowDamage;
		System.out.println("화살 공격!");
		return hp;
	}
}
