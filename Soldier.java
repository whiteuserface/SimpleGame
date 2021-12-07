package MakeGame;

public class Soldier {
	Attack at;
	Defence df;
	
	String name = "병사";
	
	int hp = 100;
	
	int swordAttack(int hp) {
		if(hp<0 || hp==0) {
			System.out.println("병사의 공격으로 몬스터를 죽었습니다.");
			return hp; 
		} else {
			hp = at.swordAttack(hp);
			System.out.println("몬스터의 피가"+hp+" 남았습니다.");
			return hp;
		}
	}
	int shieldAttack(int hp) {
		if(hp<0 || hp==0) {
			System.out.println("병사의 공격으로 몬스터를 죽었습니다.");
			return hp; 
		} else {
			hp = at.sheildAttack(hp);
			System.out.println("몬스터의 피가"+hp+" 남았습니다.");
			return hp;
		}
	}
	
	int bowAttack(int hp) {
		if(hp<0 || hp==0) {
			System.out.println("병사의 공격으로 몬스터를 죽었습니다.");
			return hp; 
		} else {
			hp = at.bowAttack(hp);
			System.out.println("몬스터의 피가"+hp+" 남았습니다.");
			return hp;
		}
	}
	
	int defenceSword(int hp) {
		this.hp=df.swordDefence(hp);
		System.out.println("병사 방어성공!");
		System.out.println("병사의 피가"+this.hp+" 남았습니다.");
		return this.hp;
	}
	
	int defenceShield(int hp) {
		this.hp=df.shieldDefence(hp);
		System.out.println("병사 방어성공!");
		System.out.println("병사의 피가"+this.hp+" 남았습니다.");
		return this.hp;
	}
}
