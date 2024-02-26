package Day8;

abstract class Marks {
    abstract public void getPercentage();
}

class A extends Marks {
    public int subject1, subject2, subject3;
    public A (int subject1, int subject2, int subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }
    @Override
    public void getPercentage() {
        System.out.println("Total Percentage of marks: " + (100 * (subject1 + subject2 + subject3) / 300) + "%");
    }
}

class B extends Marks {
    public int subject1, subject2, subject3, subject4;
    public B(int subject1, int subject2, int subject3, int subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    @Override
    public void getPercentage() {
        System.out.println("Total Percentage of marks: " + (100 * (subject1 + subject2 + subject3 + subject4) / 400) + "%");
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        A studentA = new A(80, 85, 95);
        studentA.getPercentage();

        B studentB = new B(90, 92, 96, 74);
        studentB.getPercentage();
    }
}
