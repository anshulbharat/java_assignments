import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Collections1 {

	long phoneNumber;
    String contactName,email;
    char gender;
    public Collections1(long phoneNumber,String contactName,String email,char gender)
    {
        this.phoneNumber=phoneNumber;
        this.contactName=contactName;
        this.email=email;
        this.gender=gender;
    }

}
class Collections2
{
    public static void main(String[] args) {
        Map<Long,Collections1>map=new TreeMap<>(Collections.reverseOrder());
        Collections1 c1=new Collections1(82251155L,"Nilesh","nileshraj73@gmail.com",'M');
        Collections1 c2=new Collections1(998887776L,"anshul","anshul@capg.com",'M');
        Collections1 c3=new Collections1(699888666L,"aryan","aryan@gmail.com",'M');
        Collections1 c4=new Collections1(96767656L,"vinnet","vineet@capgemini.com",'M');
        map.put(1L,c1);
        map.put(2L,c2);
        map.put(3L,c3);
        map.put(4L,c4);


        for(Map.Entry<Long, Collections1> entry:map.entrySet()){
            long key=entry.getKey();
            Collections1 c5=entry.getValue();
          System.out.println(key+" Details:");//prints all keys

            System.out.println("phone number: "+c5.phoneNumber+" contact name: "+c5.contactName+"email: "+c5.email+" gender: "+c5.gender);
        }//ABOVE PRINT STATEMENT PRINTS ALLL THE KEY VALUE PAIRS AND DETAILS//
        System.out.print(" ");

    }
}
