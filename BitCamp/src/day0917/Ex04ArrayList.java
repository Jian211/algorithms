package day0917;

import java.util.ArrayList;

public class Ex04ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        String s1 = new String("a1");
        String s2 = new String("a2");
        String s3 = new String("a3");
        String s4 = new String("a4");
        String s5 = new String("a5");

        // 1. add(e)
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add("a4");
        list.add("1212");

        // 2. get(index)
        System.out.println("2. get(index)");
        System.out.println("list.get(0): " + list.get(4));
        System.out.println("---------------------------------\n");

        // 3. add(index, e)
        // 원하는 인덱스에 값을 넣기
        System.out.println("3. add(index, e)");
        System.out.println(list);
        System.out.println("add() 전 list.get(1): " + list.get(1));
        System.out.println("add() 전 list.size(): " + list.size());
        list.add(1, s1);
        System.out.println(list);
        System.out.println("add() 후 list.get(1): " + list.get(1));
        System.out.println("add() 후 list.size(): " + list.size());
        System.out.println("---------------------------------\n");

        // 4. size()
        System.out.println("4. size()");
        System.out.println("list.size(): " + list.size());
        System.out.println("---------------------------------\n");

        // 5. isEmpty()
        System.out.println("5. isEmpty()");
        System.out.println("list.isEmpty(): " + list.isEmpty());
        System.out.println("---------------------------------\n");

        // 6. set(index, e)
        // list에 있는 값을 추출
    	System.out.println("6. set(index, e)");
        String temp = "abcd3ef";
        
        System.out.println("set() 전 temp : " + temp);
        System.out.println("set() 전 list.get(0) : " + list.get(0));
        System.out.println("set() 전 list.size() : " + list.size());
        temp = list.set(0, s2);
        
        System.out.println("set() 후 temp : " + temp);
        System.out.println("set() 후 list.get(0) : " + list.get(0));
        System.out.println("set() 후 list.size() : " + list.size());
        System.out.println("---------------------------------\n");

        // 7. clear()
        System.out.println("7. clear()");
        System.out.println("clear() �쟾 list.isEmpty(): " + list.isEmpty());
        System.out.println(list);
        list.clear();
        System.out.println(list);
        System.out.println("clear() �썑 list.isEmpty(): " + list.isEmpty());
        System.out.println("---------------------------------\n");

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s2);
        list.add(s1);
        list.add("a4");

        // 8. contains(e)
        // list 배열안에 파라미터의 값이 존재하냐?? true : false
        System.out.println("8. contains(e)");
        System.out.println("list.contains(s1): " + list.contains(s1));
        System.out.println("list.contains(s4): " + list.contains(s4));
        System.out.println("list.contains(s5): " + list.contains(s5));
        System.out.println("---------------------------------\n");

        // 9. indexOf(e)
        // 파라미터의 값의 인덱스 번호를 얻는다. 없으면 -1을 추출한다. 
        System.out.println("9. indexOf(e)");
        System.out.println("list.indexOf(s1): " + list.indexOf(s1));
        System.out.println("list.indexOf(s4): " + list.indexOf(s4));
        System.out.println("list.indexOf(s5): " + list.indexOf(s5));
        System.out.println("---------------------------------\n");

        // 10. lastIndexOf(e)
        // 파라미터의 값을 list배열 뒤에서부터 찾는다.
        System.out.println("10. lastIndexOf(e)");
        System.out.println("list.lastIndexOf(s1): " + list.lastIndexOf(s1));
        System.out.println("list.lastIndexOf(s4): " + list.lastIndexOf(s4));
        System.out.println("list.lastIndexOf(s5): " + list.lastIndexOf(s5));
        System.out.println("---------------------------------\n");

        // 11. remove(index)
        System.out.println("11. remove(index)");
        System.out.println("remove(index) �쟾 list.get(0): " + list.get(0));
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        System.out.println("remove(index) �썑 list.get(0): " + list.get(0));
        System.out.println("---------------------------------\n");

        // 12. remove(e)
        System.out.println("12. remove(e)");
        System.out.println("remove(e) �쟾 list.contains(s1): " + list.contains(s1));
        System.out.println("remove(e) �쟾 list.contains(s4): " + list.contains(s4));
        System.out.println("remove(e) �쟾 list.size(): " + list.size());
        System.out.println(list);
        list.remove(s1);
        list.remove(s4);
        list.remove(s5);
        System.out.println(list);
        System.out.println("remove(e) �썑 list.contains(s1): " + list.contains(s1));
        System.out.println("remove(e) �썑 list.contains(s4): " + list.contains(s4));
        System.out.println("remove(e) �썑 list.size(): " + list.size());
        System.out.println("---------------------------------\n");
    }
}
