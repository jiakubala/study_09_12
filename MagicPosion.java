package study_09_12;
//��д���෽��
public class MagicPosion extends Item{

	public void effect() {
		System.out.println("wsnd");
	}
	public static void main(String[] args) {

		Item q = new MagicPosion();
		q.effect();
	}

}
