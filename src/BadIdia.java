import java.util.*;
import java.util.stream.Collectors;

public class BadIdia {
    public static void main(String[] args) {
        String[] x = {"good","bad","bad","bad","good","good","good"};
        int c=0;
      for(String q : x) {
          if (q.equals("good")) {
            c+=1;



         }
          }

        System.out.println(c);
      if(c<=2){
          System.out.println("opublicovat!");
      }else if(c>2){
          System.out.println("i feel zapah serii!");
      } else{
          System.out.println("fail!");
      }
      }

       // List<String> output = new ArrayList<>();
        //List<Integer> count = new ArrayList<>();
        //findWords(s, output, count);
        //System.out.println(output);
       // System.out.println(count);



      //  var freq = Arrays.stream(x)
      //          .collect(Collectors.groupingBy(xx -> xx, Collectors.counting()));
       // System.out.println(freq);
        //int a = 0;


        //System.out.println(a);
       // }

    //private static void findWords(String s, List<String> output, List<Integer> count){
       // String[] words = s.split(",");
       // Map<String, Integer> map = new LinkedHashMap<>();
       // Arrays.stream(words).forEach(e->map.put(e, map.getOrDefault(e, 0) + 1));
        //map.forEach((k,v)->{
         //   output.add(k);
          //  count.add(v);
      //  });
    }






