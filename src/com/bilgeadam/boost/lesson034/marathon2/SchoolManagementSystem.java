package com.bilgeadam.boost.lesson034.marathon2;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import com.bilgeadam.boost.utilites.BAUtil;

public class SchoolManagementSystem {
	
	private static final int         EXIT = 99;
	private HashMap<Integer, String> menuItems;
	private List<Employee>           employees;
	private List<Student>            students;
	private List<Class>              classes;

	public SchoolManagementSystem() {
		super();
		this.menuItems = new HashMap<>();
		this.employees = new LinkedList<>();
		this.students  = new LinkedList<>();
		this.classes   = new LinkedList<>();
	}
	
	public static void main(String[] args) {
		
		BAUtil.header("School Management System");
		SchoolManagementSystem school = new SchoolManagementSystem();
		school.menu();
		BAUtil.footer();
	}
		private void menu() {
			
			this.initMenuItems();

			boolean exit = false;
			
			while (!exit) {
				int selection = BAUtil.menu(menuItems);
				if (selection == SchoolManagementSystem.EXIT) {
					exit = BAUtil.wantToEnd("Are you sure?", "n");
					continue;
				}
				try {
					this.processSelection(selection);
				}
				catch (UnknownPersonTypeException ex) {
					System.err.println(ex.getMessage());
				}
				
			}
		}
		
		private void processSelection(int sel) throws UnknownPersonTypeException {
			switch(sel) {
			
			case 1:
				Teacher t1 = new Teacher("hello", "world", "female", false, null, null, 1200);
				System.out.println(t1);
				Teacher t2 = new Teacher("boncuk", "yalcin", "female", true, LocalDate.of(2020, 3, 9), LocalDate.of(2021, 4, 4), 4300);
				System.out.println(t2);
				break;
			
			case 2:
				for(Employee employee: employees) {
					
				}
				default:
					throw new IllegalArgumentException("unexpected value" + sel);
			}
		}
		
		private HashMap <Integer, String> initMenuItems() {
			
			HashMap<Integer, String> menuItems = new HashMap<>();
			menuItems.put(1, "Add new employee");
			menuItems.put(2, "Employee List");
			menuItems.put(3, "Old Employees");
			menuItems.put(4, " ");
			return menuItems;
			}
			
		
			
		}
		

	

