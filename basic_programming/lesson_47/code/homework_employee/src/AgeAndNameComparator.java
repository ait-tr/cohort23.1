import java.util.Comparator;

public class AgeAndNameComparator implements Comparator<Employee> {
    public int compare( Employee e1, Employee e2){
      int flag = Integer.compare(e1.getAge(), e2.getAge());
      if(flag==0)
          flag = e1.getName().compareTo(e2.getName());
      return flag;
     //   return Integer.compare(e1.getAge(),e2.getAge())==0 ? e1.getName().compareTo(e2.getName()):
     //                                                       Integer.compare(e1.getAge(),e2.getAge());


    }
}
