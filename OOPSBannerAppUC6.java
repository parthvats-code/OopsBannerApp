public class HelloApp_UC6 {
    public static void main(String[] args) {
        
        StringBuilder names = new StringBuilder();
        for(String name : args){
            names.append(name).append(", ");
        }
        
       if(names.length() > 0){
           String name = names.substring(0, names.length()-2);
           System.out.println(name);
       }

    }
}
