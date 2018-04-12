package java_overriding;

class Bank{
    int rateOfInterest(){
        return 7;
    }
}

class SBI extends Bank{
    int rateOfInterest(){
        return 8;
    }
}

class HDFC extends Bank{
    int rateOfInterest(){
        return 9;
    }
}

class ICICI extends Bank{
    int rateOfInterest(){
        return 10;
    }
}

public class TestOverriding1 {
    public static void main(String[] args) {
        SBI s1 = new SBI();
        HDFC h1 = new HDFC();
        ICICI i1 = new ICICI();

        System.out.println("Rate of Interest of SBI: "+s1.rateOfInterest());
        System.out.println("Rate of Interest of HDFC: "+h1.rateOfInterest());
        System.out.println("Rate of Interest of ICICI: "+i1.rateOfInterest());
    }
}
