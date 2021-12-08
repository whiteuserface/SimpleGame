package MakeGame;

public class Soldier {
	Attack2 at;
	Defence df;
	
	String name = "����";
	
	private int hp = 100;
	
	public int swordAttack(int hp) {
		if(hp<0 || hp==0) {
			System.out.println("������ �������� ���͸� �׾����ϴ�.");
			 return hp;
		} else {
			hp = at.swordAttack(this.hp);
			System.out.println("������ �ǰ�"+hp+" ���ҽ��ϴ�.");
			return hp;
		}
	}
	public int shieldAttack(int hp) {
		if(hp<0 || hp==0) {
			System.out.println("������ �������� ���͸� �׾����ϴ�.");
			 return hp;
		} else {
			hp = at.sheildAttack(hp);
			System.out.println("������ �ǰ�"+hp+" ���ҽ��ϴ�.");
			return hp;
		}
	}
	
	public int bowAttack(int hp) {
		if(hp<0 || hp==0) {
			System.out.println("������ �������� ���͸� �׾����ϴ�.");
			return hp;
		} else {
			hp = at.bowAttack(this.hp);
			System.out.println("������ �ǰ�"+hp+" ���ҽ��ϴ�.");
			return hp;
		}
	}
	
	public int punchAttack(int hp) {
		if(hp<0 || hp==0) {
			System.out.println("������ �������� ���͸� �׾����ϴ�.");
			 return hp;
		} else {
			hp = at.punch(hp);
			System.out.println("������ �ǰ�"+hp+" ���ҽ��ϴ�.");
			return hp;
		}
	}
	
	public int magicAttack(int hp) {
		if(hp<0 || hp==0) {
			System.out.println("������ �������� ���͸� �׾����ϴ�.");
			return hp;
		} else {
			hp=at.magicAttack(hp);
			System.out.println("������ �ǰ�"+hp+" ���ҽ��ϴ�.");
			return hp;
		}
	}
	
	public int defenceSword(int hp) {
		hp=df.swordDefence(hp);
		System.out.println("���� ����!");
		System.out.println("������ �ǰ�"+this.hp+" ���ҽ��ϴ�.");
		return hp;
	}
	
	public int defenceShield(int hp) {
		hp=df.shieldDefence(hp);
		System.out.println("���� ����!");
		System.out.println("������ �ǰ�"+this.hp+" ���ҽ��ϴ�.");
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
