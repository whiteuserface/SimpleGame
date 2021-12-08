package MakeGame;

public class Main {
	public static void main(String[] args) {
		Soldier s1 = new Soldier();
		Attack2 at1 = new Attack2();
		Defence df1 = new Defence();
		s1.at = at1;
		s1.df = df1;
		
		
		Monster mon1 = new Monster();
		Attack2 at2 = new Attack2();
		Defence df2 = new Defence();
		mon1.at = at2;
		mon1.df = df2;
		
		s1.setSolHp(mon1.bowAttack(s1.getSolHp())); 
		s1.setSolHp(mon1.magicAttack(s1.getSolHp()));
		
		mon1.setMonHp(s1.magicAttack(mon1.getMonHp()));
		mon1.setMonHp(s1.punchAttack(mon1.getMonHp()));
		
		
		
	}
}
