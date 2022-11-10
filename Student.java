
public class Student {
	static int id;
	static String name;
	static int mark;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, int mark) {
		this.mark = mark;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Student.id = id;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Student.name = name;
	}

	public static int getMark() {
		return mark;
	}

	public static void setMark(int mark) {
		Student.mark = mark;
	}

	void print() {
		if (mark < 40) {
			System.out.println("fail");
		} else {
			System.out.println("Pass");
		}
	}

	public static void main(String[] args) {
		Student s1 = new Student(111, "Rahul", 88);
		s1.print();
		Student s2 = new Student();
		s2.setId(111);
		s2.setName("Rahul");
		s2.setMark(88);
		System.out.println(s2.getId() + "\t" + s2.getName() + "\t" + +s2.getMark());
		s2.print();
	}

}