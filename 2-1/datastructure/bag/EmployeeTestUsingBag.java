import java.util.Scanner;

public class EmployeeTestUsingBag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current month: ");
        int currentMonth = sc.nextInt();
        System.out.print("Enter current year: ");
        int currentYear = sc.nextInt();

        ArrayBag <Employee> employees = new ArrayBag<>();
        // LinkedBag <Employee> employees2 = new LinkedBag<>();
        // 0, 2, 5, 6, 7 > confirmed before 4.1, 3 people 
        Employee employee0 = new HourlyEmployee("david","kim","111-11",3,15,2000,5000,8);
        employee0.setEmploymentDate(3, 10, 2020);
        employee0.setCovid19(true);
        employee0.setCovid19ConfirmedDate(new Date(5,1,2020));
        Employee employee1 = new HourlyEmployee("Jihoon","Lee","222-22",1,22,1995,10000,10);
        employee1.setEmploymentDate(2, 15, 2010);
        Employee employee2 = new BasePlusCommissionEmployee("Junho","Choi","333-33",12,25,1998,1200, 0.8, 1000000);
        employee2.setEmploymentDate(9, 22, 2018);
        employee2.setCovid19(true);
        employee2.setCovid19ConfirmedDate(new Date(4,15,2020));
        Employee employee3 = new BasePlusCommissionEmployee("BaekJoon","Choi","444-44",11,223,1990,2000, 0.4, 2000000);
        employee3.setEmploymentDate(10, 15, 2020);
        Employee employee4 = new CommissionEmployee("Ho","Choi","555-55",9,12,1950,1500,0.9);
        employee4.setEmploymentDate(10, 15, 2020);
        Employee employee5 = new CommissionEmployee("Nabee","Zan","666-66",12,12,1990,1000,0.8);
        employee5.setEmploymentDate(10, 31, 2010);
        employee5.setCovid19(true);
        employee5.setCovid19ConfirmedDate(new Date(3,10,2020));
        Employee employee6 = new CommissionEmployee("Brown","Kim","777-77",10,15,1998,1100,0.7);
        employee6.setEmploymentDate(11, 30, 2018);
        employee6.setCovid19(true);
        employee6.setCovid19ConfirmedDate(new Date(3,30,2020));
        Employee employee7 = new SalariedEmployee("Black","Choi","888-88",11,11,2005,2000);
        employee7.setEmploymentDate(2, 9, 2020);
        employee7.setCovid19(true);
        employee7.setCovid19ConfirmedDate(new Date(3,15,2020));
        Employee employee8 = new SalariedEmployee("Bald","No","999-99",1,1,2001,1500);
        employee8.setEmploymentDate(5, 2, 2020);
        Employee employee9 = new SalariedEmployee("Blue","Kim","000-00",2,2,2002,1700);
        employee9.setEmploymentDate(8, 1, 2018);

        employees.add(employee0);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
        employees.add(employee8);
        employees.add(employee9);
        // employees2.add(employee0);
        // employees2.add(employee1);
        // employees2.add(employee2);
        // employees2.add(employee3);
        // employees2.add(employee4);
        // employees2.add(employee5);
        // employees2.add(employee6);
        // employees2.add(employee7);
        // employees2.add(employee8);
        // employees2.add(employee9);
    
        System.out.println("-----------------arayBag----------------------");
        
        ArrayBag <Employee> e2 = new ArrayBag<>();
        
        int confirmedEmployee = 0;
        int BeforeAprilConfirmedEmployee =0;
        
        while(!employees.isEmpty()) {
            Employee person = employees.remove();
            e2.add(person);
            if(person.getCovid19()) {
                confirmedEmployee++;
                int confirmedYear = person.getCovid19ConfirmedDate().getYear();
                int confirmedMonth = person.getCovid19ConfirmedDate().getMonth();
                if(confirmedYear == 2020 && confirmedMonth <4) {
                    BeforeAprilConfirmedEmployee++;
                }
                else if(confirmedYear < 2020) {
                    BeforeAprilConfirmedEmployee++;
                }
            }

        }

        System.out.println("-------------covid19 confirmed Employee: " + confirmedEmployee+"-----------");
        System.out.println("-------------Before April covid19 confirmed Employee: " + BeforeAprilConfirmedEmployee+"-----------");
        ArrayBag <Employee> e3 = new ArrayBag<>();

        System.out.println("-------------now---------------------------");
        while(!e2.isEmpty()) {
            Employee person = e2.remove();
            e3.add(person);
            System.out.println(person);
            System.out.printf("employee earning: ");
            System.out.println((person.earnings()+person.getBirthBonus(currentMonth))*person.getBonusRate(currentYear));
            System.out.println("---------------------------------------------");
        }

        currentMonth++;
        if(currentMonth > 12) {
            currentYear++;
        }

        System.out.println("-------------next month---------------------------");
        while(!e3.isEmpty()) {
            Employee person = e3.remove();
            System.out.println(person);
            System.out.printf("employee earning: ");
            System.out.println((person.earnings()+person.getBirthBonus(currentMonth))*person.getBonusRate(currentYear));
            System.out.println("---------------------------------------------");
        }
        // System.out.println("-----------------LinkedBag----------------------");

        // while(!employees2.isEmpty()) {
        //     System.out.println("---------------------------------------------");
        //     Employee person = employees2.remove();
        //     System.out.println(person);
        //     System.out.printf("employee earning: ");
        //     System.out.println((person.earnings()+person.getBirthBonus(currentMonth))*person.getBonusRate(currentYear));
        //     System.out.println("---------------------------------------------");
        // }
    }
    
}