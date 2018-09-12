package study_09_12;
//重写父类方法
public class MagicPosion extends Item{

	public void effect() {
		System.out.println("wsnd");
	}
	public static void main(String[] args) {

		Item q = new MagicPosion();
		q.effect();
	}

}
