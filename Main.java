package MakeGame;

public class Main {
	public static void main(String[] args) {
		Soldier s1 = new Soldier();
		Attack at1 = new Attack();
		Defence df1 = new Defence();
		s1.at = at1;
		s1.df = df1;
		
		
		Monster mon1 = new Monster();
		Attack at2 = new Attack();
		Defence df2 = new Defence();
		mon1.at = at2;
		mon1.df = df2;
		
		s1.bowAttack(mon1.hp);
		s1.swordAttack(mon1.defenceShield(mon1.hp));
		mon1.bowAttack(s1.hp);
	}
}
