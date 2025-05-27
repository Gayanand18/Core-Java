public class VariablesArgumentsDemo {

    static void showList(int start,String...names){
        for(String name : names){
            System.out.println(start +". " + name);
            start++;
        }
    }

    static void showList2(String...names2){
        for (int i = 0; i < names2.length; i++) {
            System.out.println((i + 1) + ". " + names2[i]);
        }
    }
    public static void main(String[] args){
        showList(1,"Alice", "Bob", "Charlie");
        System.out.println();
        showList2("Alice", "Bob", "Charlie", "David");
        System.out.println();
        
    }
}
