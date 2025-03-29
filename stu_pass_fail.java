public class stu_pass_fail {
    public static void main(String[] args) {
       int marks = 15;
       if(marks>=33){
        System.out.println("Pass");
       } 
       else{
        System.out.println("fail");
       }

       //ternary operator
       String result = (marks>=33)?"Pass":"Fail";
       System.out.println(result);
    }
}
