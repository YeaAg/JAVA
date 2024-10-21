import java.util.*;

public class MyArrayList {
    public static void main(String[] args) {
//        int[] arr = new int[2];
//        arr[0] = 1;
//        arr[1] = 2;

        ArrayList array = new ArrayList();
        array.add("Hello");
        array.add(1);
        array.add("Java");

        // "Java"를 찾아서 제거하라!
        array.remove("Java");
        // 없으니까 넘어간가(pass)
        array.remove("ㄴㅁ아ㅣ런ㅇ라ㅣㅓ");

        // 내부에 몇 개의 요소가 있는지 정수로 알려준다
        int len = array.size();
        System.out.println("내부 계수: "+ len);
        System.out.println(array);

        // index 1번 자리에 5.5를 넣고 원래 index 1번 이상 값들은 뒤로 다 미뤄라
        array.add(1, 5.5);

        // 요소 중 5.5가 있는가 없는가?
        boolean isExists = array.contains(5.5);
        System.out.println("존재하는가?:" + isExists);
        System.out.println(array);

        /*****************************************/

        ArrayList<Integer> newList = new ArrayList<>();
        // newList.add("안녕?");
        newList.add(5555);
        newList.add(1000);
        newList.add(55);
        newList.add(778);
        newList.add(1);
        int r = newList.get(1);
        // 0번째 index 값을 가져와서 출력하세요
        System.out.println( newList.get(0));
        System.out.println( newList.get(1) + 10);
        // 오름차순 정렬해주세요
        newList.sort(null);
        System.out.println(newList);

        /*****************************************/

        String s = "100";
        String[] splitResult = s.split("");
        String result = Arrays.toString(splitResult);
        System.out.println(result);

        Integer i = 100; // 객체 형태의 정수
        String ss1 = i.toString(); // String 형태로 변경
        String ss2 = "" + i; // String 형태로 변경
        String ss3 = String.valueOf(i); // String 형태로 변경
        // Integer j = new Integer(200); // 이제 안 씀
        System.out.println(i);

        String a = i + "abc";
        System.out.println(a);

        // String 혹은 int 형이 아닌 다른 형태를 Integer 혹은 int형으로 변경
        int z1 = Integer.parseInt("100"); // => int 형으로
        Integer z1_1 = Integer.parseInt("100"); // => int 형으로
        Integer z2 = Integer.valueOf("200"); // => Integer 형으로

        /*****************************************/

        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("Java");
        strings.remove(0); // 0번째 index를 제거하라
        strings.remove("Java");
        System.out.println(strings);

        /*****************************************/

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(100);
        numbers.remove(new Integer(10)); // 0번째 index를 제거하라
        numbers.remove("Java");
        System.out.println(numbers);

        /*****************************************/

        char c = 97;
        System.out.println(c);
    }
}
