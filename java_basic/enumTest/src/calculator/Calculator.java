package calculator;

public interface Calculator {
    int calculator(int a, int b);
}

class Plus implements Calculator{

    @Override
    public int calculator(int a, int b) {
        // TODO Auto-generated method stub
        return a+b;
    }
}

class Minus implements Calculator{
    
    @Override
    public int calculator(int a, int b) {
        // TODO Auto-generated method stub
        return a-b;
    }
}

class Multiply implements Calculator{

    @Override
    public int calculator(int a, int b) {
        // TODO Auto-generated method stub
        return a * b;
    }
}

class Divide implements Calculator{

    @Override
    public int calculator(int a, int b) {
        // TODO Auto-generated method stub
        if(b == 0)
            throw new ArithmeticException();
        return a / b;
    }
