package MakeGame;

public class Soldier {
	Attack at;
	Defence df;
	
	String name = "����";
	
	int hp = 100;
	
	int swordAttack(int hp) {
		if(hp<0 || hp==0) {
			System.out.println("������ �������� ���͸� �׾����ϴ�.");
			return hp; 
		} else {
			hp = at.swordAttack(hp);
			System.out.println("������ �ǰ�"+hp+" ���ҽ��ϴ�.");
			return hp;
		}
	}
	int shieldAttack(int hp) {
		if(hp<0 || hp==0) {
			System.out.println("������ �������� ���͸� �׾����ϴ�.");
			return hp; 
		} else {
			hp = at.sheildAttack(hp);
			System.out.println("������ �ǰ�"+hp+" ���ҽ��ϴ�.");
			return hp;
		}
	}
	
	int bowAttack(int hp) {
		if(hp<0 || hp==0) {
			System.out.println("������ �������� ���͸� �׾����ϴ�.");
			return hp; 
		} else {
			hp = at.bowAttack(hp);
			System.out.println("������ �ǰ�"+hp+" ���ҽ��ϴ�.");
			return hp;
		}
	}
	
	int defenceSword(int hp) {
		this.hp=df.swordDefence(hp);
		System.out.println("���� ����!");
		System.out.println("������ �ǰ�"+this.hp+" ���ҽ��ϴ�.");
		return this.hp;
	}
	
	int defenceShield(int hp) {
		this.hp=df.shieldDefence(hp);
		System.out.println("���� ����!");
		System.out.println("������ �ǰ�"+this.hp+" ���ҽ��ϴ�.");
		return this.hp;
	}
}
