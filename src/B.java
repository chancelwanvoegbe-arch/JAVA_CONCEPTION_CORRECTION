class B extends A {
    B() {
        super("Par défaut");
        System.out.println("B()");
    }
    B(int n) {
        super("B" + n);
        System.out.println("B(" + n + ")");
    }
}