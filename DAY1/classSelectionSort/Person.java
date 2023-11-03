package DAY1.classSelectionSort;


public class Person implements Comparable<Person>{

	private int id;
	private String name;
	private int age;

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	Person(String name){
		this.name = name;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "\nPerson [id=" + id + ", name=" + name + ", age=" + age + "]";
	}


	@Override
	public int compareTo(Person p1) {
		return this.name.compareTo(p1.getName());
	}
	

}
