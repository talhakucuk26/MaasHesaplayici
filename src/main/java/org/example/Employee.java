package org.example;

public class Employee {
    String name ;
    int salary;
    int hireyear;
    int workhours;

    public Employee(String name, int salary, int workhours, int startingdate){
        this.name=name;
        this.salary=salary;
        this.workhours=workhours;
        this.hireyear=startingdate;
    }
    void tax(){
        int tax=0;
        if (this.salary<1000) {
            System.out.println("Vergi " + tax  );
        } else if (this.salary>1000) {
            tax=(this.salary*3)/100;
            System.out.println("Vergi :" + tax);

        }


    }
    void prim(){
        int prim = 0;
        if (this.workhours>40){
            prim+=30;
            System.out.println("Prim : " + prim);
        }
        else {
            System.out.println("Prim yok");
        }

    }
    void raiseSalary(){
        int maasartisi =0;
        if (2021-this.hireyear <10){
            maasartisi=(this.salary*5)/100;
            System.out.println("Maas artisi : " + maasartisi);
        } else if (2021-this.hireyear >9 && 2021-this.hireyear <20) {
            maasartisi=(this.salary*10)/100;
            System.out.println("Maas artisi : " + maasartisi);
        } else if (2021-this.hireyear >10) {
            maasartisi=(this.salary*15)/100;
            System.out.println("Maas artisi : " + maasartisi);
        }
    }
    void tostring (){
        System.out.println("İsim soyisim : " + this.name);
        System.out.println("Maaş : " + this.salary);
        System.out.println("Haftalık çalışma saati : " + this.workhours);
        System.out.println("İşe başlangıç tarihi : "  + this.hireyear);
        tax();
        prim();
        raiseSalary();
    }
}