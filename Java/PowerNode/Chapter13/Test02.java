public class Test02 {
	public static void main(String[] args) {
		Employee employee1 = new Employee("Alice", 1);
		Employee employee2 = new SalariedEmployee("Bob", 2, 5000);
		Employee employee3 = new HourlyEmployee("Candy", 3, 150, 30);
		Employee employee4 = new HourlyEmployee("David", 4, 170, 30);
		Employee employee5 = new SalesEmployee("Eva", 5, 30000, 0.1);

		System.out.println("员工1的生日月份的薪水是：" + employee1.getSalary(1));
		System.out.println("员工2的生日月份的薪水是：" + employee2.getSalary(2));
		System.out.println("员工3的生日月份的薪水是：" + employee3.getSalary(3));
		System.out.println("员工4的生日月份的薪水是：" + employee4.getSalary(4));
		System.out.println("员工5的生日月份的薪水是：" + employee5.getSalary(5));

		System.out.println("员工1的非生日月份的薪水是：" + employee1.getSalary(2));
		System.out.println("员工2的非生日月份的薪水是：" + employee2.getSalary(3));
		System.out.println("员工3的非生日月份的薪水是：" + employee3.getSalary(4));
		System.out.println("员工4的非生日月份的薪水是：" + employee4.getSalary(5));
		System.out.println("员工5的非生日月份的薪水是：" + employee5.getSalary(6));

	}
}

class Employee {
	private String name;
	private int birthMonth;

	public Employee(String name, int birthMonth) {
		this.name = name;
		this.birthMonth = birthMonth;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}

	public String getName() {
		return this.name;
	}

	public int birthMonth() {
		return this.birthMonth;
	}

	public double getSalary(int month) {
		return birthMonth == month ? 250 : 0;
	}
}

class SalariedEmployee extends Employee {
	private double monthlySalary;

	public SalariedEmployee(String name, int birthMonth, double monthlySalary) {
		super(name, birthMonth);
		this.monthlySalary = monthlySalary;
	}

	@Override
	public double getSalary(int month) {
		return monthlySalary + super.getSalary(month);
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public double getMonthlySalary() {
		return this.monthlySalary;
	}
}

class HourlyEmployee extends Employee {
	private int hours;
	private double hourlySalary;

	public HourlyEmployee(String name, int birthMonth, int hours, double hourlySalary) {
		super(name, birthMonth);
		this.hours = hours;
		this.hourlySalary = hourlySalary;
	}

	@Override
	public double getSalary(int month) {
		return hours > 160 ? super.getSalary(month) + 160 * hourlySalary + (hours - 160) * hourlySalary * 1.5 : super.getSalary(month) + hours * hourlySalary;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public void setHourlySalary(double hourlySalary) {
		this.hourlySalary = hourlySalary;
	}

	public int getHours() {
		return this.hours;
	}

	public double getHourlySalary() {
		return this.hourlySalary;
	}
}

class SalesEmployee extends Employee {
	private double sales;
	private double comm;

	@Override
	public double getSalary(int month) {
		return super.getSalary(month) + sales * comm;
	}

	public SalesEmployee(String name, int birthMonth, double sales, double comm) {
		super(name, birthMonth);
		this.sales = sales;
		this.comm = comm;
	}

	public void setSales(double sales) {
		this.sales = sales;
	}

	public void setComm(double comm) {
		this.comm = comm;
	}

	public double getSales() {
		return this.sales;
	}

	public double getComm() {
		return this.comm;
	}
}