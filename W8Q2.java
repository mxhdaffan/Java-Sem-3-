class University {
    String name;
    int rank;

    public University(String uname, int rnk) {
        this.name = uname;
        this.rank = rnk;
    }

    public void Details() {
        System.out.println("University name: " + name);
        System.out.println("University ranking: " + rank);
    }
}

class Faculty extends University {
    String name;

    public Faculty(String uname, int rnk, String facname) {
        super(uname,rnk);
        this.name = facname;
    }

    public void Details() {
        super.Details();
        System.out.println("Faculty name: " + name);
    }
}

class Department extends Faculty {
    String name;
    String chairman;

    public Department(String uname, int rnk, String facname, String deptname, String chrmn) {
        super(uname,rnk,facname);
        this.name = deptname;
        this.chairman = chrmn;
    }

    public void Details() {
        System.out.println("Department name: " + name);
        System.out.println("Chairman: " + chairman);
    }

    public void Display() {
        super.Details();
        Details();
    }
}

public class W8Q2 {
    public static void main(String[] args) {
        Department dpt = new Department("AMU", 2, "F/o Science", "Department of Computer Science","ARF");
        dpt.Display();
    }   
}