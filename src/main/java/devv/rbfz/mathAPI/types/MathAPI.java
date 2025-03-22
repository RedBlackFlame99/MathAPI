package devv.rbfz.mathAPI.types;

import devv.rbfz.mathAPI.MathPlugin;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MathAPI {
    private final MathPlugin plugin;
    private final double pi;

    public MathAPI(MathPlugin plugin) {
        this.plugin = plugin;
        this.pi = Math.PI;
    }

    public String formulaName(MathFormula formula) {
        return formula.getName();
    }
    public String formulaEquation(MathFormula formula) {
        return formula.getFormula();
    }

    public double add(double number1, double number2) {
        return number1 + number2;
    }
    public double subtract(double number1, double number2) {
        return number1 - number2;
    }
    public double multiply(double number1, double number2) {
        return number1 * number2;
    }
    public double divide(double number1, double number2) {
        return number1 / number2;
    }

    public double perimeter(double length, double width) {
        return 2 * (length + width);
    }
    public double perimeterCircle(double radius) {
        return 2 * pi * radius;
    }
    public double circumference(double radius) {
        return perimeterCircle(radius);
    }
    public double perimeterTriangle(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }

    public double area(double length, double width) {
        return length * width;
    }
    public double areaCircle(double radius) {
        return pi * exponent(radius, 2);
    }
    public double areaSemicircle(double radius) {
        return areaCircle(radius) / 2;
    }
    public double areaTriangle(double base, double height) {
        return 0.5 * base * height;
    }
    public double areaTrapezoid(double sideA, double sideB, double height) {
        return (1.0 / 2.0) * (sideA + sideB) * height;
    }
    public double areaEllipse(double minor, double major) {
        return pi * minor * major;
    }
    public double areaHexagon(double sideLength) {
        return (3 * Math.sqrt(3) * exponent(sideLength, 2)) / 2;
    }

    public double volume(double length, double width, double height) {
        return length * width * height;
    }
    public double volumeSphere(double radius) {
        return (4.0 / 3.0) * pi * exponent(radius, 3);
    }
    public double volumeHemisphere(double radius) {
        return volumeSphere(radius) / 2;
    }
    public double volumeCylinder(double radius, double height) {
        return areaCircle(radius) * height;
    }
    public double volumeCone(double radius, double height) {
        return (1.0 / 3.0) * areaCircle(radius) * height;
    }
    public double volumePyramid(double length, double width, double height) {
        return (length * width * height) / 3;
    }
    public double volumeTorus(double radius, double tubeRadius) {
        return 2 * pi * pi * radius * exponent(tubeRadius, 2);
    }

    public double round(double number, RoundMetric metric) {
        double a = metric.a();
        return Math.round(number * a) / a;
    }
    public enum RoundMetric {
        WHOLE(1),
        TENTHS(10),
        HUNDREDTHS(100),
        THOUSANDTHS(1000);
        private final double a;
        RoundMetric(double a) {
            this.a = a;
        }
        public double a() {
            return this.a;
        }
    }

    public double median(double... numbers) {
        Arrays.sort(numbers);
        int n = numbers.length;
        if (n % 2 == 0) {
            return (numbers[n / 2 - 1] + numbers[n / 2]) / 2.0;
        } else {
            return numbers[n / 2];
        }
    } // Picks the middle number; or adds the two middle numbers and divides by 2
    public double mean(double... values) {
        if (values.length == 0) {
            throw new IllegalArgumentException("Array must contain at least one value.");
        }
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.length;
    } // The average of all the values
    public double mode(double... values) {
        if (values.length == 0) {
            throw new IllegalArgumentException("Array must contain at least one value.");
        }
        Map<Double, Integer> frequencyMap = new HashMap<>();
        for (double value : values) {
            frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
        }
        double mode = values[0];
        int maxCount = 0;
        for (Map.Entry<Double, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }
        return mode;
    } // Picks the number that is counted the most.

    public double sqrt(double value) {
        return Math.sqrt(value);
    }
    public double nthRoot(double base, double n) {
        if (base < 0 && n % 2 == 0) {
            throw new IllegalArgumentException("Even root of a negative number is not a real number.");
        }
        return Math.pow(base, 1.0 / n);
    }

    public double pythagoreanTheorem(double sideA, double sideB) {
        return sqrt(exponent(sideA, 2) + exponent(sideB, 2));
    }

    public long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public double distance(double x1, double y1, double x2, double y2) {
        return sqrt(exponent(x2 - x1, 2) + exponent(y2 - y1, 2));
    }

    public double absoluteValue(double value) {
        return Math.abs(value);
    }

    public double exponent(double base, int exponent) {
        return Math.pow(base, exponent);
    }
}
