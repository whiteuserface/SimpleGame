package MakeGame;

public class Attack2 extends Attack {
	int magicDamage = 40;
	int punchDamage = 5;
	
	int magicAttack(int hp) {
		hp = hp-magicDamage;
		System.out.println("마법 공격!");
		return hp;
	}
	
	int punch(int hp) {
		hp = hp-punchDamage;
		System.out.println("펀치 공격!");
		return hp;
	}

}
