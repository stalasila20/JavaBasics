public class Switch {
    public static void main(String args[]){
        char charvalue = 'A';
        switch (charvalue){
            case 'A':
                System.out.println("A is found");
                break;
            case 'B':
                System.out.println("B is found");
                break;
            case 'C':
                System.out.println("C is found");
                break;
                case 'D':
                    System.out.println("D is found");
                    break;
                    case 'E':
                        System.out.println("E is found");
                        break;
            default:
                System.out.println("not found");
                break;
        }
    }
}
