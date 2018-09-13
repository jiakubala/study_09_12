package study_09_12;

import study_09_11.Hero;

public class Support extends Hero implements Healer {

	
	public Support(String heroName) {
		super(heroName);
	}

	@Override
	public void heal() {
        System.out.println("Œ“ «∏®÷˙");
		
	}

	public static void main(String[] args) {

		Support s = new Support("zzz");
		s.heal();
	}


}
