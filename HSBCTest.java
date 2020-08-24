package com.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HSBCTest {

	static List<Employee> EmpList= new  ArrayList<Employee>();
	private static List<Employee> GetEmployeeDataFromCSV(String filePath) 
	{
		List<Employee> inputList = new ArrayList<Employee>();
		try 
		{
		      InputStream inputFileSstream = new FileInputStream(new File(filePath));
		      BufferedReader br = new BufferedReader(new InputStreamReader(inputFileSstream));
		  
		      String line;
		      int i=0;
		      while ((line = br.readLine()) != null) {
		    	 if(i !=0) {
		          String[] values = line.split(",");
		          
		          Employee Emp =new Employee();
		          Emp.setEMP_NO(Long.parseLong(values[0]));
		          Emp.setFIRST_NAME(values[1]);
		          Emp.setMID_INIT(values[2]);
		          Emp.setLAST_NAME(values[3]);
		          Emp.setDEPT(values[4]);
		          Emp.setPHONE_NO(Long.parseLong(values[5]));
		          
		          SimpleDateFormat formatter1=new SimpleDateFormat("MM/dd/yyyy");
		          Date date1=formatter1.parse(values[6]);  
		          //System.out.println(date1.);
		          Emp.setHIRE_DATE(date1);
		          
		          
		          Emp.setJOB_TITLE(values[7]);
		          Emp.setEMP_LEVEL(Long.parseLong(values[8]));
		          inputList.add(Emp);
		    	 }
		    	 i++;
		      }
		      
		      return inputList;
		 }
		catch (Exception e) 
		{
			System.out.println("inside GetEmployeeDataFromCSV catch  " +e);
			return inputList;
		}
		
		
	}
	
	private static void getEmpWithDeptList(String dept_name)
	{
		
		EmpList.stream()
		.filter(e-> e.getDEPT().equals(dept_name))
		.forEach(e ->System.out.println(e.getFIRST_NAME()+" "+e.getMID_INIT()+" "+e.getLAST_NAME()+" "+e.getDEPT()));
		
	}
	
	private static void getSortedEmployee(String string)
	{
		if(string.equals("First Name")) {
			EmpList.stream()
			.sorted(Comparator
			.comparing(Employee::getFIRST_NAME)).collect(Collectors.toList())
			.forEach(e ->System.out.println(e.getEMP_NO()+" "+e.getFIRST_NAME()+" "+e.getEMP_LEVEL()));
		}
		else if (string.equals("Hire Date")) {
			EmpList.stream()
			.sorted(Comparator
			.comparing(Employee::getHIRE_DATE)).collect(Collectors.toList())
			.forEach(e ->System.out.println(e.getEMP_NO()+" "+e.getFIRST_NAME()+" "+e.getEMP_LEVEL()+" 		"+DateFormat.getDateInstance().format(e.getHIRE_DATE())));
		}
		else if(string.equals("Emp Level")) {
			EmpList.stream()
			.sorted(Comparator
			.comparingLong(Employee::getEMP_LEVEL))
			.forEach(e ->System.out.println(e.getEMP_NO()+" "+e.getFIRST_NAME()+" "+e.getMID_INIT()+" "+e.getLAST_NAME()+" "+e.getEMP_LEVEL()));
		}
		
	}
	
	private static void getEmployeeWithHireDate() {
		EmpList.stream()
		.forEach(e->System.out.println(e.getFIRST_NAME()+" "+e.getMID_INIT()
		+" "+e.getLAST_NAME()+",HireDate==>"
		+  (DateFormat.getDateInstance().format(e.getHIRE_DATE())).substring(4,5)+" "
		+  (DateFormat.getDateInstance().format(e.getHIRE_DATE())).substring(0,3)
		+  (DateFormat.getDateInstance().format(e.getHIRE_DATE())).substring(7)
		))
		;
		
	}
	 
	public static void main(String[] args) 
	{
		String filePath="E://study//Java//CoreJava//HSBCTest//src//com//test//emp.csv";
		//List<Employee> EmpList= new  ArrayList<Employee>();
		EmpList=GetEmployeeDataFromCSV(filePath);
		Scanner sc= new Scanner(System.in);
		String Dept_name;
				
		for(;;)
		{
			System.out.println("Enter your Choice");
			System.out.println("1.Find Employees as per Dept\n2.Sort Employee By First Name\n3.Sort Employee By HireDate\n4.Sort Employee By Emp Level\n5.Employee List with Hire Date\n6.Exit");
			int ch= sc.nextInt();
			switch(ch)
			{	
				case 1: System.out.println("Enter Dept Name");
						Dept_name=sc.next();
						getEmpWithDeptList(Dept_name);
						break;
				case 2: getSortedEmployee("First Name");
					break;
				case 3: getSortedEmployee("Hire Date");
					break;
				case 4:  getSortedEmployee("Emp Level");
						break;
				case 5: getEmployeeWithHireDate();
						break;
				case 6:System.exit(0);
					break;
				default :System.out.println("Please Give Proper Input");
					break;
			}
		}
		
		
	}

	

	

}
