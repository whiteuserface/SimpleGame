package MakeGame;

public class Soldier {
	Attack2 at;
	Defence df;
	
	String name = "병사";
	
	private int hp = 100;
	
	public int swordAttack(int hp) {
		if(hp<0 || hp==0) {
			System.out.println("병사의 공격으로 몬스터를 죽었습니다.");
			 return hp;
		} else {
			hp = at.swordAttack(this.hp);
			System.out.println("몬스터의 피가"+hp+" 남았습니다.");
			return hp;
		}
	}
	public int shieldAttack(int hp) {
		if(hp<0 || hp==0) {
			System.out.println("병사의 공격으로 몬스터를 죽었습니다.");
			 return hp;
		} else {
			hp = at.sheildAttack(hp);
			System.out.println("몬스터의 피가"+hp+" 남았습니다.");
			return hp;
		}
	}
	
	public int bowAttack(int hp) {
		if(hp<0 || hp==0) {
			System.out.println("병사의 공격으로 몬스터를 죽었습니다.");
			return hp;
		} else {
			hp = at.bowAttack(this.hp);
			System.out.println("몬스터의 피가"+hp+" 남았습니다.");
			return hp;
		}
	}
	
	public int punchAttack(int hp) {
		if(hp<0 || hp==0) {
			System.out.println("병사의 공격으로 몬스터를 죽었습니다.");
			 return hp;
		} else {
			hp = at.punch(hp);
			System.out.println("몬스터의 피가"+hp+" 남았습니다.");
			return hp;
		}
	}
	
	public int magicAttack(int hp) {
		if(hp<0 || hp==0) {
			System.out.println("병사의 공격으로 몬스터를 죽었습니다.");
			return hp;
		} else {
			hp=at.magicAttack(hp);
			System.out.println("몬스터의 피가"+hp+" 남았습니다.");
			return hp;
		}
	}
	
	public int defenceSword(int hp) {
		hp=df.swordDefence(hp);
		System.out.println("병사 방어성공!");
		System.out.println("병사의 피가"+this.hp+" 남았습니다.");
		return hp;
	}
	
	public int defenceShield(int hp) {
		hp=df.shieldDefence(hp);
		System.out.println("병사 방어성공!");
		System.out.println("병사의 피가"+this.hp+" 남았습니다.");
		return hp;
	}
	public void setSolHp(int hp) {
		this.hp = hp;
	}
	
	public int getSolHp() {
		int hp = this.hp;
		return hp;
	}
}
