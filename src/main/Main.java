package main;

import secao10.Quarto;
import secao13.*;
import secao8.Account;
import secao8.Employee;
import secao8.Rectangle;
import secao8.Student;
import secao8.util.CurrencyConverter;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		System.out.println("Insira o nome do exercicio");
		Scanner scanner = new Scanner(System.in);
		Main main = new Main();
		
		switch (scanner.next()){
			
			case "1":
				main.exercicio1();
				break;
				
			case "2":
				main.exercicio2();
				break;
				
			case "3":
				main.exercicio3();
				break;
				
			case "4":
				main.exercicio4();
				break;
				
			case "5":
				main.exercicio5();
				break;
				
			case "6":
				main.exercicio6();
				break;
				
			case "7":
				main.exercicio7();
				break;
				
			case "8":
				main.exercicio8();
				break;
				
			case "9":
				main.exercicio9();
				break;
				
			case "10":
				main.exercicio10();
				break;
				
			case "11":
				Main.exercicio11(scanner);
				break;
				
			case "12":
				Main.exercicio12(scanner);
				break;
			
			case "13":
				Main.exercicio13(scanner);
				break;
			case "14":
				Main.exercicio14(scanner);
				break;
			
			case "15":
				Main.exercicio15(scanner);
				break;
			
			case "Default":
			default:
				System.out.println("não encontrado");
				break;
			
		}
		
		scanner.close();
		System.out.println("Fim do programa");
		
	}
	
	private static void exercicio15(Scanner scanner) throws ParseException {
		
		scanner.nextLine();
		System.out.println("Enter client data:");
		
		System.out.print("Name:");
		String name = scanner.nextLine();
		
		System.out.print("Email:");
		String email = scanner.nextLine();
		
		System.out.print("Birth date (DD/MM/YYYY):");
		String birthDateString = scanner.next();
		
		Date birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(birthDateString);
		Client client = new Client(name,email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status:");
		OrderStatus orderStatus = OrderStatus.valueOf(scanner.next());
		
		System.out.print("How many items to this order ? ");
		int itemsQuantity = scanner.nextInt();
		
		Order order = new Order(new Date(), orderStatus);
		order.setClient(client);
		
		for (int i = 0 ; i < itemsQuantity; i++){
			
			System.out.println("Enter #" + (i + 1) +" item data:");
			scanner.nextLine();
			System.out.print("Product name: ");
			String productName = scanner.nextLine();
			
			System.out.print("Product price: ");
			double productPrice = scanner.nextDouble();
			
			System.out.print("Quantity: ");
			int productQuantity = scanner.nextInt();
			
			Product product = new Product(productName, productPrice);
			OrderItem orderItem = new OrderItem(productQuantity, product);
			
			order.addItem(orderItem);
		}
		
		System.out.print(order.toString());
		
	}
	
	private static void exercicio14(Scanner scanner) {
		
		Integer[][] integers = new Integer[scanner.nextInt()][scanner.nextInt()];
		
		for (int i = 0; i < integers.length; i++) {
			for (int j = 0; j < integers[0].length; j++) {
				integers[i][j] = scanner.nextInt();
			}
		}
		
		int numberToFind = scanner.nextInt();
		
		for (int i = 0; i<integers.length; i++){
			for (int j = 0; j < integers[0].length; j++){
				if (integers[i][j] == numberToFind){
					
					System.out.printf("Position %d,%d:%n", i, j);
					
					if(j > 0){
						System.out.println("Left: " + integers[i][j - 1]);
					}
					
					if(j < integers[i].length - 1){
						System.out.println("Right: " + integers[i][j + 1]);
					}
					
					if(i > 0){
						System.out.println("Up: " + integers[i - 1][j]);
					}
					
					if(i < integers.length - 1){
						System.out.println("Down: " + integers[i + 1][j]);
					}
					
				}
			}
		}
		
	}
	
	private static void exercicio13(Scanner scanner) {
		
		System.out.print("How many employees will be registered ? ");
		int employeesQuantity = scanner.nextInt();
		List<secao10.Employee> employees = new ArrayList<>(employeesQuantity);
		
		for (int i = 0; i < employeesQuantity; i++){
			System.out.println("#"+(i+1)+":");
			
			System.out.print("Id:");
			int id = scanner.nextInt();
			
			System.out.print("Name:");
			scanner.nextLine();
			String name = scanner.nextLine();
			
			System.out.print("Salary: ");
			BigDecimal salary = scanner.nextBigDecimal();
			
			employees.add(new secao10.Employee(id, name, salary));
		}
		
		System.out.print("Enter employee id that will have salary increase : ");
		int employeeWillReceiveIncrease = scanner.nextInt();
		Optional<secao10.Employee> toReceiveIncrease = employees.stream().filter(employee -> employeeWillReceiveIncrease == employee.getId()).findFirst();
		
		if(toReceiveIncrease.isPresent()){
			System.out.print("Enter the percentage: ");
			toReceiveIncrease.get().increaseSalary(scanner.nextDouble());
		}else {
			System.out.println("This is does not exist!");
		}
		
		System.out.println("List of employees:");
		employees.forEach(e -> System.out.println(e.display()));
		
	}
	
	private static void exercicio12(Scanner scanner) {
		
		Quarto[] quartos = new Quarto[10];
		
		System.out.print("How many rooms will be rented?");
		int roomsToRent = scanner.nextInt();
		
		for (int i = 0; i < roomsToRent; i++){
			System.out.printf("Rent #%d:%n", (i + 1));
			System.out.print("Name:");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.print("Email:");
			String email =  scanner.next();
			System.out.print("Room:");
			int room = scanner.nextInt();
			
			quartos[room] = new Quarto(name, email);
		}
		
		for (int i = 0; i < quartos.length; i++){
			Quarto quarto = quartos[i];
			if(quarto != null){
				System.out.println(i +": "+ quarto.toString());
			}
		}
	}
	
	private static void exercicio11(Scanner scanner) {
		
		System.out.print("Enter account number: ");
		int accountNumber = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Enter account holder: ");
		String accountHolder = scanner.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		boolean haveInitialDeposit = scanner.next().charAt(0) == 'y';
		
		double initialDeposit = 0;
		if(haveInitialDeposit){
			System.out.printf("Enter initial deposit value: ");
			initialDeposit = scanner.nextDouble();
		}
		
		System.out.printf("%nAccount data:%n");
		Account account = new Account(accountNumber, accountHolder, initialDeposit);
		System.out.println(account.toString());
		
		System.out.printf("%nEnter a deposit value: ");
		account.deposit(scanner.nextDouble());
		String preInfo = "Updated account data:";
		System.out.println(preInfo);
		System.out.println(account.toString());
		
		System.out.printf("%nEnter a withdraw value: ");
		account.withdraw(scanner.nextDouble());
		System.out.println(preInfo);
		System.out.println(account.toString());
		
	}
	
	public void exercicio1(){
		
		System.out.println("Insira dois valores para fazer uma soma");
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.printf("SOMA = %d%n",(a + b));
		
		scanner.close();
		
	}
	
	public void exercicio2(){
		
		System.out.println("Insira o raio de um circulo para ser calculada a area");
		
		Locale.setDefault(Locale.US);
		
		double raio = new Scanner(System.in).nextDouble();
		
		double area = Math.pow(raio, 2) * 3.14159;
		
		System.out.printf("A=%.4f%n", area);
		
	}
	
	public void exercicio3(){
		
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		int C = scanner.nextInt();
		int D = scanner.nextInt();
		
		System.out.printf("DIFERENÇA = %d%n", (A * B) - (C * D));
		
		scanner.close();
		
	}
	
	public void exercicio4(){
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int numeroDoFuncionario = scanner.nextInt();
		int horasTrabalhadas = scanner.nextInt();
		
		double valorPorHora = scanner.nextDouble();
		
		System.out.printf("NUMBER = %d%n",numeroDoFuncionario);
		System.out.printf("SALARY = %.2f%n",horasTrabalhadas * valorPorHora);
		
		scanner.close();
		
	}
	
	public void exercicio5(){
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int codigoPeca1 = scanner.nextInt();
		int quantidadePeca1 = scanner.nextInt();
		double valorPeca1 = scanner.nextDouble();
		
		int codigoPeca2 = scanner.nextInt();
		int quantidadePeca2 = scanner.nextInt();
		double valorPeca2 = scanner.nextDouble();
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", quantidadePeca1 * valorPeca1 + quantidadePeca2 * valorPeca2);
		
		scanner.close();
		
	}
	
	public void exercicio6(){
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		
		System.out.printf("TRIANGULO: %.3f%n",a * c / 2);
		System.out.printf("CIRCULO: %.3f%n", Math.pow(c,2) * 3.14159);
		System.out.printf("TRAPEZIO: %.3f%n", ((a + b) * c) / 2);
		System.out.printf("QUADRADO: %.3f%n", b*b);
		System.out.printf("RETANGULO: %.3f%n", a*b);
		
		scanner.close();
		
	}
	
	public void exercicio7(){
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height");
		Rectangle rectangle = new Rectangle(scanner.nextDouble(),scanner.nextDouble());
		
		System.out.printf("AREA = %.2f%n", rectangle.area());
		System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
		System.out.println("DIAGONAL = "+ String.format("%.2f%n", rectangle.diagonal(), rectangle.diagonal()));
		
	}
	
	public void exercicio8(){
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.setName(scanner.nextLine());
		scanner.next();
		
		System.out.print("Gross salary: ");
		employee.setGrossSalary(scanner.nextDouble());
		
		System.out.print("Tax: ");
		employee.setTax(scanner.nextDouble());
		System.out.println();
		
		System.out.printf("Employee: %s, $ %.2f", employee.getName(), employee.getGrossSalary());
		System.out.println();
		
		System.out.print("Which percentage to increase salary?");
		employee.increaseSalary(scanner.nextDouble());
		System.out.println();
		
		System.out.printf("Updated data: %s, $ %.2f", employee.getName(), employee.getGrossSalary());
		scanner.close();
		
	}
	
	public void exercicio9(){
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Student student = new Student();
		student.setName(scanner.nextLine());
		student.setNote1(scanner.nextDouble());
		student.setNote2(scanner.nextDouble());
		student.setNote3(scanner.nextDouble());
		
		double pointsToPass = student.pointsToPass();
		
		if(pointsToPass > 0){
			System.out.printf("FINAL GRADE = %.2f%n", student.getTotalPoints());
			System.out.println("MISSION FAILED");
			System.out.printf("MISSING %.2f POINTS%n", pointsToPass);
			
		}else {
			System.out.printf("FINAL GRADE = %.2f%n", student.getTotalPoints());
			System.out.println("PASS");
		}
		scanner.close();
		
	}
	
	public void exercicio10(){
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dolarPrice = scanner.nextDouble();
		
		System.out.print("How many dollars will be bought?");
		double amountOfDollarsWillBuy = scanner.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.convertToReaisFromDollar(dolarPrice, amountOfDollarsWillBuy));
		
	}
	
}
