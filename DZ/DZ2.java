package DZ;
//Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
public class DZ2 {
    public static int  sum2d(String[][] arr) {
       int sum = 0;
       for(int  i = 0; i < arr.length; i++)
        for(int j = 0; j < 5; j++){ // Выход за ппределы массива
            int val = Integer.parseInt(arr[i][j]);// нет проверки на наличие посторонних символов в массиве, кроме числовых "fd"
             sum += val;
        }

       return sum; 
    }
    public static void main(String[] args) {
        System.out.println(sum2d(new String[][]{{"1","2","6","6","5","4"},{"fd","3"}}));
    }
}
