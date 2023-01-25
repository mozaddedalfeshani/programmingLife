

class votterCheck {
    public static boolean check(int age){
        if(age>18){
            return true;
            
        }
        else{
            return false;
        }
        
    }
    public static void main(String[] args) {
      
        int age =28;
        System.out.println("The answer is "+ check(age));
    }
}