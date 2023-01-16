import java.util.ArrayList;
import java.util.List;

public class test {
    
    public static void main(String[] args){

        List<Integer> val= new ArrayList<>();
        val.add(1);
        val.add(2);
        val.add(2);
        val.add(4);
        val.add(3);

        int element = 0;
        int count = 0;
        for(int i=0;i<val.size();i++) {
            int tempelement = val.get(i);
            int tempcount = 0;
            for(int k=1;k<val.size();k++) { 
                if(val.get(k)==tempelement) {  // vet inte varför detta fuckar
                    tempcount++;
                }
            }
            if (tempcount>count) {
                element = tempelement;
                count = tempcount;
            }
        }

        System.out.println("the most frequent element is : " + element + " freq : " + count); // här tänkte jag ha if statements med prints
    }    
}
