package tw.bensonwu.polymorphism;

class animal {
	protected void eat() {
		System.out.println("動物會吃東西");
	}

	protected void aniEat(animal ani) {
		ani.eat();
	}

}

class dog extends animal {
	public void eat() {
		System.out.println("狗會吃肉");
	}
}

class cat extends animal {
	public void eat() {
		System.out.println("貓會吃魚");
	}
}

class fish extends animal {
	public void eat() {
		System.out.println("魚會吃飼料");
	}
}

public class TestPolymorphismEx1 {

	public static void main(String[] args) {
		animal a = new animal();
		animal d = new dog();
		animal c = new cat();
		animal f = new fish();
//		a.eat();
//		d.eat();
//		c.eat();
//		f.eat();
		a.aniEat(a);
		a.aniEat(d);
		a.aniEat(c);
		a.aniEat(f);

	}

}
