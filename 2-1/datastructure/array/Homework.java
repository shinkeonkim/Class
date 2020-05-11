import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int currentMonth,currentDay, currentYear;
        
        System.out.println("please input current date");
        System.out.print("month: ");
        currentMonth = sc.nextInt();

        System.out.print("day: ");
        currentDay = sc.nextInt();

        System.out.print("year: ");
        currentYear = sc.nextInt();
        System.out.println("-------------------------------------");
        

        System.out.println("Please input 10 employee's information");
        System.out.println("-------------------------------------");
        Employee[] employees = new Employee[11];
        for(int t = 1; t <= 10; t++) {
            int info;
            String first;
            String last;
            String ssn;
            int month,day,year;
            int employmentMonth, employeeDay, employeeYear;
            int salary, hourlyWage, hoursWorked, sales, rate;
            
            System.out.println("SalariedEmployee: 1");
            System.out.println("HourlyEmployee: 2");
            System.out.println("CommissionEmployee: 3");
            System.out.println("BasePlusCommissionEmployee: 4");
            System.out.print("employement info: ");
            info = sc.nextInt();
            String dump = sc.nextLine();
            while(info < 1 || info > 4) {
                System.out.println("please input number 1 to 4");
                info = sc.nextInt();
                dump = sc.nextLine();
            }

            System.out.print("first name: ");
            first = sc.nextLine();

            System.out.print("last name: ");
            last = sc.nextLine();

            System.out.print("Employee number: ");
            ssn = sc.nextLine();            

            // birthDate
            System.out.print("birth month(1~12): ");
            month = sc.nextInt();            

            System.out.print("birth day(1~31): ");
            day = sc.nextInt();            

            System.out.print("birth year(1~2020): ");
            year = sc.nextInt();
            

            System.out.print("employment month(1~12): ");
            employmentMonth = sc.nextInt();            
            
            System.out.print("employment day(1~31): ");
            employeeDay = sc.nextInt();            

            System.out.print("employment year(1~2020): ");
            employeeYear = sc.nextInt();
            
            
            switch(info) {
                case 1:
                    System.out.print("salary: ");
                    salary = sc.nextInt();
                    employees[t] = new SalariedEmployee(first, last, ssn, month, day, year, salary);
                    break;
                case 2:
                    System.out.print("hourlyWage: ");
                    hourlyWage = sc.nextInt();

                    System.out.print("hoursWorked: ");
                    hoursWorked = sc.nextInt();

                    employees[t] = new HourlyEmployee(first, last, ssn, month, day, year, hourlyWage, hoursWorked);
                    break;
                case 3:
                    System.out.print("sales: ");
                    sales = sc.nextInt();

                    System.out.print("rate: ");
                    rate = sc.nextInt();
                    
                    employees[t] = new CommissionEmployee(first, last, ssn, month, day, year, sales, rate);
                    break;
                case 4:
                    System.out.print("sales: ");
                    sales = sc.nextInt();

                    System.out.print("rate: ");
                    rate = sc.nextInt();

                    System.out.print("salary: ");
                    salary = sc.nextInt();

                    employees[t] = new BasePlusCommissionEmployee(first, last, ssn, month, day, year, sales, rate, salary);
                    break;  
            }
            employees[t].setEmploymentDate(employmentMonth,employeeDay,employeeYear);

        }
        

        for(int t=1; t<=10; t++) {
            System.out.println(employees[t]);
            System.out.printf("%d employee earning: $",t);
            System.out.println((employees[t].earnings()+employees[t].getBirthBonus(currentMonth))*employees[t].getBonusRate(currentYear));
        }

        sc.close();

    }
    
}