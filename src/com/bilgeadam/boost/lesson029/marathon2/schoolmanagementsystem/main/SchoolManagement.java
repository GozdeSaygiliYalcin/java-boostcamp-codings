package com.bilgeadam.boost.lesson029.marathon2.schoolmanagementsystem.main;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.bilgeadam.boost.lesson029.marathon2.schoolmansystem.employees.Employee;
import com.bilgeadam.boost.lesson029.marathon2.schoolmansystem.employees.Janitor;
import com.bilgeadam.boost.lesson029.marathon2.schoolmansystem.employees.Officer;
import com.bilgeadam.boost.lesson029.marathon2.schoolmansystem.employees.Teacher;
import com.bilgeadam.boost.lesson029.marathon2.schoolmansystem.model.Gender;
import com.bilgeadam.boost.lesson029.marathon2.schoolmansystem.model.Lesson;
import com.bilgeadam.boost.lesson029.marathon2.schoolmansystem.model.Lessons;
import com.bilgeadam.boost.lesson029.marathon2.schoolmansystem.model.Student;


public class SchoolManagement {
	
	private List <Employee> employees;
	private List<Employee> oldEmployeeList = new ArrayList<>();
	private HashMap<String, Teacher> teacherList;
	private HashMap<String, Lessons> lessonList;
	private HashMap <String, Student> students;
	private Map<Integer, List<Employee>> payments;
	
	public SchoolManagement() {
		this.employees = new ArrayList<>();
		this.oldEmployeeList = new ArrayList<>();
		this.teacherList = new HashMap<>();
		this.lessonList = new HashMap<>();
		this.students = new HashMap<>();
	}

	public static void main(String[] args) {
		
		SchoolManagement manager = new SchoolManagement();
		System.out.println(manager.initMenu());
		manager.addEmployeeList();
		manager.showEmployeeList();
		
		int selection = 0;
		boolean process = true;
		do {
			manager.processMenu(selection);
			if (selection != 10) {
				manager.processMenu(selection);
				process = true;
			} else {
				process = endProcess("Are you sure? (Y/N)?", "Y");
				
			}
		} while (process);
	
	}
	
	public HashMap<Integer, String> initMenu() {
		
	
		HashMap<Integer, String> mainMenu = new HashMap<Integer, String>();
		
		mainMenu.put(1, "ADD NEW EMPLOYEE");
		mainMenu.put(2, "SHOW EMPLOYEE LIST");
		mainMenu.put(3, "SHOW OLD EMPLOYE LIST");
		mainMenu.put(4, "OPEN A NEW CLASS");
		mainMenu.put(5, "ASSIGN STUDENTS TO A CLASS");
		mainMenu.put(6, "SHOW LIST OF CLASSES");
		mainMenu.put(7, "CLASSES ATTENDED BY THE STUDEN");
		mainMenu.put(8, "SENDING GIFT LIST");
		mainMenu.put(9, "SALARY CALCULATION LIST");
		mainMenu.put(10, "EXIT FROM THE APPLICATION");
		
		
		return mainMenu;
	}
	
	public void processMenu(int selection) {
			
		Scanner input = new Scanner(System.in);
		int select = input.nextInt();
		
			switch (selection) {
				case 1:
					this.addEmployeeList();
					break;
				case 2:
					this.showEmployeeList();
					break;
				case 3:
					this.showOldEmployeeList();
					break;
				case 4:
					this.openANewClass();
					break;
				case 5:
					// this.assignStudent();
					;
					break;
				case 6:
					 this.showStudent();
					break;
				case 7:
					// this.studentsClasses();
					break;
				case 8:
					// this.sendGift();
					break;
				case 9:
					this.createSalaryList(select);
					break;
				case 10:
					this.endProcess(null, null);
					break;
				default:
					throw new IllegalArgumentException("Wrong selection please check again: " + selection);
			}
	}
		
	private void addEmployeeList() { //1. Create employee - Menüde 1. sıradaki çalışan listesi oluşturuluyor
		this.employees.add(new Janitor("Gozde", "Saygili", Gender.FEMALE, LocalDate.of(1989, 9, 18), LocalDate.of(2021, 5, 4), LocalDate.of(2022, 4, 8), false, 123456, 234567, null, 3200));
		this.employees.add(new Teacher("Hande", "Eda", "Hüdayioğlu", Gender.NO_INFO, LocalDate.of(1978, 4, 8), LocalDate.of(2022, 4, 4), LocalDate.of(2021, 6, 9), true, 123456, 0, null, 6700));
		this.employees.add(new Teacher("Sütlac", "Cat", "Saygili", Gender.FEMALE, LocalDate.of(1989, 8, 8), LocalDate.of(2020, 4, 4), LocalDate.of(2022, 4, 8), false, 123456, 0, null, 4500));
		this.employees.add(new Officer("Ali", "Veli", "Elli", Gender.NO_INFO, LocalDate.of(1995, 3, 3), LocalDate.of(2016, 6, 4), LocalDate.of(2022, 3, 8), false, 123456, 0, null, 5600));
		this.employees.add(new Janitor("Anne", "Shirley", Gender.FEMALE, LocalDate.of(1900, 9, 18), LocalDate.of(2021, 5, 4), LocalDate.now(), true, 123456, 234567, null, 8200));
		this.employees.add(new Officer("Efdal", "Ahmet", "Yalcin", Gender.MALE, LocalDate.of(1986, 3, 6), LocalDate.of(2021, 4, 4), LocalDate.now(), false, 123456, 234567, null, 8200));
	}
	
	private void showEmployeeList() { // 2.Employee List - Oluşturulan çalışan listesi gösteriliyor
		System.out.println(employees);
	}
	
	private void showOldEmployeeList() { //3. Old Employee List - Eski çalışanların 
		System.out.println("Please see the old employee list:");
		
		for (Employee employee : employees) {
			if (employee.getFinishDate().isBefore(LocalDate.now())) {
				oldEmployeeList.add(employee);
			} 
		}
		System.out.println(oldEmployeeList);
	}
	
	private void openANewClass() { //4. Open a new class by using Lesson Class
		
		Lesson l1 = new Lesson(null, null, Lessons.MATH, DayOfWeek.MONDAY, null);
		Lesson l2 = new Lesson(null, null, Lessons.ENGLISH, DayOfWeek.THURSDAY, null);
		
	//	lessonList.put(l2.getLessonName(), l2);
	
	//	lessonList.put(l1.getLessonName(), Lessons.MATH); // Bu kısımda dersleri listeye ekleyemedim
		
	}
	
	private void addStudent() {
		
		Student s1 = new Student("Harry", "James", "Potter", Gender.MALE, LocalDate.of(2015, 6, 4), LocalDate.of(2020, 5, 12), LocalDate.of(2022, 4, 23), false, 2125335009, 11234567, 1234567, null);
		students.put(s1.getRegsNumber(), s1);
		
		Student s2 = new Student("Albus", "James", "Dumbledore", Gender.MALE, LocalDate.of(2012, 3, 4), LocalDate.of(2021, 5, 12), LocalDate.of(2022, 5, 13), false, 1165335009, 12134567, 1234567, null);
		students.put(s2.getRegsNumber(), s2);
		
		Student s3 = new Student("Hermionie", "Granger", Gender.FEMALE, LocalDate.of(2010, 2, 14), LocalDate.of(2021, 4, 15), LocalDate.now(), false, 1165335009, 12134567, 1234567, null);
		students.put(s3.getRegsNumber(), s3);
	}
	
	private void showStudent() {
		
		System.out.println(students);
	}
		
	private void createSalaryList(int period) { //9. Salary List
		
			List<Employee> periodsPayments = new ArrayList<>();
			
			for (Employee employee : this.employees) {
				double payment;
				
				payment =  employee.getSalary();
				
				//periodsPayments.add(payment);
			
				this.payments.put(period, periodsPayments);
		}
		
		periodsPayments = this.payments.get(period);
		periodsPayments.stream().forEach(System.out::println);
		
	}
	
	private void showLessonList() {
		System.out.println(lessonList);
	}
	
	private static boolean endProcess(String s1, String s2) {
		return false;
	}
}
