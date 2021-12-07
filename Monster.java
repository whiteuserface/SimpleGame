package MakeGame;

public class Monster {
	Attack at;
	Defence df;
	
	String name = "몬스터";
	
	int hp=60;
	
	int swordAttack(int hp) {
		if(hp<0 || hp==0) {
			System.out.println("몬스터의 공격으로 병사를 죽었습니다.");
			return hp; 
		} else {
			hp = at.swordAttack(hp);
			System.out.println("병사의 피가"+hp+" 남았습니다.");
			return hp;
		}
	}
	int shieldAttack(int hp) {
		if(hp<0 || hp==0) {
			System.out.println("몬스터의 공격으로 병사를 죽었습니다.");
			return hp; 
		} else {
			hp = at.sheildAttack(hp);
			System.out.println("병사의 피가"+hp+" 남았습니다.");
			return hp;
		}
	}
	
	int bowAttack(int hp) {
		if(hp<0 || hp==0) {
			System.out.println("몬스터의 공격으로 병사를 죽었습니다.");
			return hp; 
		} else {
			hp = at.bowAttack(hp);
			System.out.println("병사의 피가"+hp+" 남았습니다.");
			return hp;
		}
	}
	
	int defenceSword(int hp) {
		this.hp=df.swordDefence(hp);
		System.out.println("몬스터 방어성공!");
		System.out.println("몬스터의 피가"+this.hp+" 남았습니다.");
		return this.hp;
	}
	
	int defenceShield(int hp) {
		this.hp=df.shieldDefence(hp);
		System.out.println("몬스터 방어성공!");
		System.out.println("몬스터의 피가"+this.hp+" 남았습니다.");
		return this.hp;
	}
	
	
}
