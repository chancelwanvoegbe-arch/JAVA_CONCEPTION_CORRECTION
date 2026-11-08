class C extends B {
    C() { this(7); System.out.println("C()"); }
    C(int n) { super(n * 2); System.out.println("C(" + n + ")"); }
}