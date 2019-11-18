package rocks.zipcode.io.quiz3.collections;

import java.util.*;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    //labname
    //labstatus null

    Map<Lab, LabStatus> labs = new HashMap();

    public Student() {
      //  this(Lab );

    }

    public Student(List<Lab> labs) {
    // = labs;
    }

    public Lab getLab(String labName) {

        for(Lab lab : labs.keySet()){
            if(lab.labName == labName ){
                return lab;
            }
        }
       return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        labs.put(new Lab(labName), labStatus);
    }

    public void forkLab(Lab lab) {
        //labs.put(lab, "PENDING");
    }

    public LabStatus getLabStatus(String labName) {

        for(Lab lab : labs.keySet()){
            if(lab.labName == labName ){
                return lab.getStatus();
            }
        }
        return null;
    }
}
