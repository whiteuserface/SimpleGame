package MakeGame;

public class Attack {
	
	int swordDamage = 10;
	int sheildDamage = 5;
	int bowDamage = 8;
	
	int swordAttack(int hp) {
		hp = hp-swordDamage;
		System.out.println("������ ����!");
		return hp;
	}
	int sheildAttack(int hp) {
		hp = hp-sheildDamage;
		System.out.println("���� ����!");
		return hp;
	}
	int bowAttack(int hp) {
		hp = hp-bowDamage;
		System.out.println("ȭ�� ����!");
		return hp;
	}
}
