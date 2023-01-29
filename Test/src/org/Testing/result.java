package org.Testing;

class people {
	void copycat() {

	}
}

class Male extends people {
	void copycat() {
		System.out.println("aniruth here");
	}
}

class Female extends people {
	void copycat() {
		System.out.println("harrish ");
	}
}

class copyroom {
	void check(people n) {
		System.out.println("checking");
		n.copycat();
	}
}

public class result {
	public static void main(String[] args) {
		copyroom c = new copyroom();
		Male a = new Male();
		Female b = new Female();

		c.check(a);
		c.check(b);
	}
}
