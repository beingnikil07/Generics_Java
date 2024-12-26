//enum Operation {
//    ADD, SUBTRACT, MULTIPLY, DIVIDE;
//
//    public <T extends Number> double apply(T a, T b) {
//        switch (this) {   //this refers to the enum ordinal
//            case ADD:
//                return a.doubleValue() + b.doubleValue();
//            case SUBTRACT:
//                return a.doubleValue() - b.doubleValue();
//            case MULTIPLY:
//                return a.doubleValue() * b.doubleValue();
//            case DIVIDE:
//                return a.doubleValue() / b.doubleValue();
//            default:
//                throw new AssertionError("Unknown operation: " + this);
//        }
//    }
//}
//
//public class GeniricsInEnums {
//    public static void main(String[] args) {
//        double result1 = Operation.ADD.apply(10, 20);
//        double result2 = Operation.MULTIPLY.apply(5.5, 4);
//        System.out.println(result1);  // Output: 30.0
//        System.out.println(result2);  // Output: 22.0
//    }
//}


interface Calculator<T> {
    T calculate(T a, T b);
}

enum ArithmeticOperation implements Calculator<Integer> {
    ADD {
        @Override
        public Integer calculate(Integer a, Integer b) {
            return a + b;
        }
    },
    SUBTRACT {
        @Override
        public Integer calculate(Integer a, Integer b) {
            return a - b;
        }
    };

    // Additional operations can be added in the same way.
}

public class GeniricsInEnums {
    public static void main(String[] args) {
        int result1 = ArithmeticOperation.ADD.calculate(10, 5);
        int result2 = ArithmeticOperation.SUBTRACT.calculate(10, 5);
        System.out.println(result1);  // Output: 15
        System.out.println(result2);  // Output: 5
    }
}