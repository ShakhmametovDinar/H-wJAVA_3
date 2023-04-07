package Task;

import java.util.*;

public class Task1 {
    public static void arrayLists(){
        double sum = 0;
        List<Integer> list1 = new ArrayList<>(Arrays.asList(2, 4, 8 , 10 ,5 ,1, 9, 20, 18, 7));
        List<Integer> list2 = new ArrayList<>();
        List<Integer> dif = new ArrayList<>();
        List<Integer> symdif = new ArrayList<>();
        for(int i = 0; i < list1.size(); i++){
            if(list1.get(i) % 2 !=0){
                list2.add(list1.get(i)); // список нечетных чисел
            }
        }
        for(int i = 0; i < list1.size(); i++){
            int step = 0;
            for(int j = 0; j < list2.size(); j++){
                if(list1.get(i)==list2.get(j)){
                    dif.add(list1.get(i));
                    step++; // разность массивов
                }
                if(j == list2.size()-1 & step == 0){
                    symdif.add(list1.get(i)); // симметрическая разность
                }
            }
        }
        for(int i = 0; i < list1.size(); i++){
            sum += list1.get(i); // сумма цифр списка
        }
        sum /= list1.size(); // среднее  арифметическое
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(dif);
        System.out.println(symdif);
        System.out.println(Collections.max(list1));
        System.out.println(Collections.min(list1));
        System.out.println(sum);
    }
}
