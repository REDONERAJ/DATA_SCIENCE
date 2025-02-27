import java.util.*;
public class valid_date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year:");
        int year = sc.nextInt();
        if(year>1899 && year<2101){
            System.out.print("Enter month:");
            int month = sc.nextInt();
            if(month>=1 && month<=12){
                System.out.print("Enter date:");
                int date = sc.nextInt();
             if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
                if((date<32))
                    System.out.println("Valid");
                else
                    System.out.println("date is invalid");
        }
        else if(month==4 || month==6 || month==9 || month==11){
            if(date<31)
                System.out.println("valid");
            else
                System.out.println("date is invalid");
        }
        else if(month==2){
            if(date==29){
                if(year%400==0 || (year%4==0 && year%100!=0))
                  System.out.println("valid");
                else
                    System.out.println("invalid date");
            }
            else if(date<29){
                System.out.println("valid");
            }
            else
                System.out.println("invalid date");
        }
        }else
            System.out.println("month is invalid");
        }
        else
            System.out.println("year is invalid");
    }
} 