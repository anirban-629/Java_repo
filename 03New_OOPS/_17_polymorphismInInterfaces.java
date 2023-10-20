interface gps {
    void gps1();

    void gps2();
}

interface camera {
    void camera1();

    void camera2();
}

interface wifi {
    void wifi1();

    void wifi2();
}

interface call {
    void call1();

    void call2();
}

class smartPhone implements gps, camera, wifi, call {
    public void gps1() {
        System.out.println("gps method1");
    }

    public void gps2() {
        System.out.println("gps method2");
    }

    public void camera1() {
        System.out.println("camera method1");
    }

    public void camera2() {
        System.out.println("camera method2");
    }

    public void wifi1() {
        System.out.println("wifi method1");
    }

    public void wifi2() {
        System.out.println("wifi method2");
    }

    public void call1() {
        System.out.println("call method1");
    }

    public void call2() {
        System.out.println("call method2");
    }
}

public class _17_polymorphismInInterfaces {
    public static void main(String[] args) {
        gps func1 = new smartPhone();
        func1.gps1(); // --> allowed as reference is gps
        func1.gps2(); // --> allowed as reference is gps
        // func1.camera1() // --> not allowed as reference is gps
        camera func2 = new smartPhone();
        func2.camera1();
        func2.camera2();
        // func2.wifi1() // --> not allowed as reference is camera
    }
}
