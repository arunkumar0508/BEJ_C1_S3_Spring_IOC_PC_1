package org.niit;

import java.security.PublicKey;

public class Department {

    int deptId;
    String deptName;

    public Department(){}

    public Department(int deptId, String deptName){
        this.deptId=deptId;
        this.deptName=deptName;
    }

    public String getName(){
        return deptName;
    }
    public void setDeptId(int deptId){
        this.deptId=deptId;
    }
    public int getDeptId(){
        return deptId;
    }
    public void setDeptName(String deptName){
        this.deptName=deptName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
