// Exercise 10.8 Solution: Employee.java
// Employee abstract superclass.

public abstract class Employee implements Comparable <Employee>
{
   private String firstName;
   private String lastName;
   private Date birthDate;
   private Date employmentDate;
   private int ssn;

   // six-argument constructor
   public Employee( String first, String last, int socialSecurityNumber,
      int month, int day, int year)
   {
      firstName = first;
      lastName = last;
      ssn = socialSecurityNumber;
      birthDate = new Date( month, day, year );
   } // end six-argument Employee constructor

   @Override
   public int compareTo(Employee e) {
      if(this.ssn > e.ssn) return 1;
      return -1;
   }
   // set first name
   public void setFirstName( String first )
   {
      firstName = first;
   } // end method setFirstName

   // return first name
   public String getFirstName()
   {
      return firstName;
   } // end method getFirstName

   // set last name
   public void setLastName( String last )
   {
      lastName = last;
   } // end method setLastName

   // return last name
   public String getLastName()
   {
      return lastName;
   } // end method getLastName

   // set social security number
   public void setSocialSecurityNumber(int  socialSecurityNumber )
   {
      ssn = socialSecurityNumber;  // should validate
   } // end method setSocialSecurityNumber

   // return social security number
   public int getSocialSecurityNumber()
   {
      return ssn;
   } // end method getSocialSecurityNumber

   // set birth date
   public void setBirthDate( int month, int day, int year )
   {
      birthDate = new Date( month, day, year );
   } // end method setBirthDate

   // return birth date
   public Date getBirthDate()
   {
      return birthDate;
   } // end method getBirthDate

   public void setEmploymentDate(int month, int day,int year)
   {
      employmentDate = new Date(month, day,year);
   }
   public Date getEmploymentDate()
   {
      return employmentDate;
   }

   public int getBirthBonus(int currentMonth) {
      if(currentMonth == getBirthDate().getMonth()) {
         return 10;
      }
      return 0;
   }

   public double getBonusRate(int currentYear) {
      if(currentYear - getEmploymentDate().getYear() > 10) {
         return 1.1;
      }
      return 1;
   }

   // return String representation of Employee object
   @Override
   public String toString()
   {
      return String.format( "%s %s\n%s: %s\n%s: %s\n%s: %s", 
         getFirstName(), getLastName(), 
         "social security number", getSocialSecurityNumber(), 
         "birth date", getBirthDate(),
         "employment date",getEmploymentDate());
   } // end method toString

   // abstract method overridden by subclasses
   public abstract double earnings();
} // end abstract class Employee

/**************************************************************************
 * (C) Copyright 1992-2010 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/ 