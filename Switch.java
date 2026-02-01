public class Switch {
  public static void main(String[] args) {
    int day = 5;
    switch (day) {
        // Example of weekdays
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;                       
        default:
            System.out.println("this is not a day");
            break;
    }


    // Example of seasons:
       int season = 2;
       switch (season) {
        case 1:
            System.out.println("this is Summer season");
            break;
        case 2:
            System.out.println("this is rainy reason");
            break;
        case 3:
            System.out.println("this is winter season");
            break;
        default:
            System.out.println("that's type of not season");
            break;
       }

       // Example of Months:
       int month = 7;
       switch (month) {
            case 1:
            System.out.println("January");
            break;
            case 2:
            System.out.println("February");
            break;
            case 3:
            System.out.println("March");
            break;
            case 4:
            System.out.println("April");
            break;
            case 5:
            System.out.println("May");
            break;
            case 6:
            System.out.println("June");
            break;
            case 7:
            System.out.println("July");
            break;
            case 8:
            System.out.println("August");
            break;
            case 9:
            System.out.println("September");
            break;
            case 10:
            System.out.println("October");
            break;
            case 11:
            System.out.println("November");
            break;
            case 12:
            System.out.println("December");
            break;
        default:
            System.out.println("this is not a month");
            break;
       }

    }
  }

