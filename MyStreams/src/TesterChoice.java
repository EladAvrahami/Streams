import java.util.*;
import java.util.stream.Collectors;

public class TesterChoice {
    public static void main(String[] args) {
        //basic using of streams
        //we will get an array of names,
        // and take out all elements without any name
        List<String> strings = Arrays.asList("zeev","Bar","","","Ofer","","Natan","","Vicktoria");

        /*
        //old way
        List<String> myCleanList = new ArrayList<>();
        for (String item:strings){
            if (item.length()>0){// במידה ואורך הפריט שברשימה גדול מ0 כלומר לא ריק
                myCleanList.add(item);//תוסיף לרשימה הנקייה החדשה
            }
        }

        System.out.println(myCleanList);//תדפיס רשימה חדשה נקייה מאיברים ריקים
        */

        /*

        //like a boss
        //do a stream
        List<String> myCleanList= strings.stream()//לך לרשימת סטרינג ותפעיל עליו סטרים
                //filter the result by condition
                .filter(item->!item.isEmpty())
                //collect all result to list
                .collect(Collectors.toList());

        System.out.println(myCleanList);
        */

        //for each
        Random random = new Random();
        //10 number random any int

        //old way
        /*
        int[] numbers = new int[10];
        for (int counter = 0 ; counter< numbers.length;counter+=1){
            numbers[counter] = random.nextInt();
            System.out.println(numbers[counter]);
        }
        */

        /*
        //for each like a boss
        //יגריל אינט רנדומלי.יגביל את מס ההגרלות ל10 . על כל הגרלה ידפיס את התוצאה (מספר)
        random.ints().limit(10).forEach(System.out::println);
        */

        //map
        List<Integer> numbers = Arrays.asList(3,2,2,7,3,5);

        /*
        //create a new collection with unique numbers and it's square
        //like a boss
        List<Integer> squareList = numbers.stream()
                //iterate on each item in our list
                .map(item -> item*item)//על כך איבר תבצע את האיבר כפול עצמו
                //unique value
                .distinct()
                //we want to get only odd (אי זוגי) numbers
                .filter(item-> item%2!=0)
                //make a list from stream
                .collect(Collectors.toList());

        System.out.println(squareList);
        */

        List<String> words = Arrays.asList("chai","","chai","efg","chai","","chai");

        //get count of empty string
        long count=words.stream().filter(item->item.isEmpty()).count();
        System.out.println(count+" num of empty cells on list 'words'");


        //get count of chai in list
        long count1 = words.stream().filter(item->item.equals("chai")).count();
        System.out.println(count1+" num of cells on list 'words' with the chai string");


        //sorted
        random.ints().limit(10).sorted().forEach(System.out::println);//תדפיס לפי הסדר קטן לגדול 10 מספרים רנדומליים
        System.out.println("//תדפיס לפי הסדר קטן לגדול 10 מספרים רנדומליים");

        //get count of chai object
        //long count = words.parallelStream().filter(item->item.equals("chai")).count();//נעבוד עם פרלל סטרים במסדי נתונים גדולים עבודה במקביל
        //System.out.println(count);




        /*
          //COLLECTORS

        List<String> filtered = strings.stream().filter(item->!item.isEmpty()).collect(Collectors.toList());

        System.out.println("filtered list:"+filtered);
        String mergedString = strings.stream().filter(item->!item.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("MergedString: "+mergedString);

         */


        //Statistics
        List myNumbers = Arrays.asList(3,2,2,3,7,3,5);
          //  הטייפ שלך הוא אינט                              סוג חדש של משתנה
        IntSummaryStatistics statistics = myNumbers.stream().mapToInt((item) -> (int) item).summaryStatistics();
        //לאחר שרשמתי את השורה העליונה המשתנה סטטיסטיק מחזיק בתוכו את כל הסטטיסטיקות
        System.out.println("maximum number: "+statistics.getMax());
        System.out.println("minimum number: "+statistics.getMin() );
        System.out.println("sum of all numbers: "+statistics.getSum());
        System.out.println("average of all numbers: "+statistics.getAverage());
        System.out.println("total count: "+statistics.getCount());
    }
}
