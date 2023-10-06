package practise;


	class A {
		public Integer dispA() {
			int age = 15;
			if (age < 17 || age > 61) {
				throw new ArithmeticException("Error: The age must be in between 18 to 60.");
			}
			return age;
		}
	}

	class B {
		public Integer dispB() {
			System.out.println("Starting of B");

			System.out.println("Ending of B");
			return new A().dispA();
		}
	}
	class C {
		public Integer dispC() {
			System.out.println("Starting of C");

			System.out.println("Ending of C");
			return new B().dispB();
		}
	}

public	class AppNew {
		public static void main(String[] args) {
			System.out.println("Starting of main");
			Integer result = null;
			try {
				result = new C().dispC();
			} catch (NullPointerException | ArithmeticException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println(result);
			System.out.println("Ending of main");
		}
	}

