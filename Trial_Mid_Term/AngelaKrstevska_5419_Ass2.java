class Player{
	
	String name;
	int points;
	String team;
	Player(String name, String team){
		this.name = name;
		this.team = team;
		points = (int)(Math.random()*100)%50;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	public int getPoints() {
		return points;
	}
	public String getTeam() {
		return team;
	}
	public void setPoints(int points) {
		points = this.points;
	}
	public static Player MVP(Player players[]) {
		Player mvp = players[0];
			for(int i =0;i<players.length;i++) {
			if(players[i].points>mvp.points) {
				mvp = players[i];
			}
		}
			return mvp;
	}
}


public class AngelaKrstevska_5419_Ass2 {

	public static void main(String[] args) {
		Player[] miamiHeat = new Player[5];
		System.out.println("Miami Heat");
		
		for(int i=0;i<5;i++) {
			miamiHeat[i] = new Player("Player-" +i, "miamiHeat");
		}
		int sum1 = 0;
		for(int i=0;i<5;i++) {
			sum1 += miamiHeat[i].getPoints();
			System.out.println(miamiHeat[i].getName() + "   "+ miamiHeat[i].getPoints() + " points");
		}
		
		Player[] LALakers = new Player[5];
		System.out.println("La Lakers");
		for(int i=0;i<5;i++) {
			LALakers[i] = new Player("Player-" +i, "LALakers");
		}
		int sum2 = 0;
		for(int i=0;i<5;i++) {
			sum2 += LALakers[i].getPoints();
			System.out.println(LALakers[i].getName() + "   "+ LALakers[i].getPoints() + " points");
		}
		System.out.println("Miami Heat : LA Lakers = " + sum1 + " : "+ sum2);
		Player mvpArray[] = new Player[5];
		if(sum1 >sum2) {
			System.out.println("The winner is Miami Heat");
			mvpArray = miamiHeat;
		}
		else if(sum1 <sum2) {
			System.out.println("The winner is LA Lakers");
			mvpArray = LALakers;
		}
		else {
			System.out.println("Its a tie");
		}
		Player mvp = Player.MVP(mvpArray);

		System.out.println("MVP is " + mvp.getName() + " from " + mvp.getTeam() + " with " + mvp.getPoints()+ " points");
		
		
	}

}
