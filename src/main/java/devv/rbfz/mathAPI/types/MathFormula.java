package devv.rbfz.mathAPI.types;

public enum MathFormula {
    AREA("Area", "length * width"),
    AREA_CIRCLE("Area of Circle (Circumference)", "pi * radius^2"),
    AREA_TRIANGLE("Area of Triangle", "(length * width) / 2"),
    AREA_TRAPEZOID("Area of Trapezoid", "1/2 * (base₁ + base₂) * height"),
    AREA_ELLIPSE("Area of Ellipse", "pi * minor * major"),

    VOLUME("Volume", "length * width * height"),
    VOLUME_SPHERE("Volume of a Sphere", "4/3 * pi * radius^3"),
    VOLUME_HEMISPHERE("Volume of a Hemisphere", "(4/3 * pi * radius^3) / 2"),
    VOLUME_CYLINDER("Volume of a Cylinder", "(pi * radius^2) * height"),
    VOLUME_CONE("Volume of a Cone", "1/3 * (pi * radius^2) * height"),
    VOLUME_PYRAMID("Volume of a Pyramid", "(length * width * height) / 3"),

    PYTHAGOREAN_THEOREM("Pythagorean Theorem", "a^2 + b^2 = c^2")


            ;

    private final String name;
    private final String formula;

    MathFormula(String name, String formula) {
        this.name = name;
        this.formula = formula;
    }

    public String getName() {
        return this.name;
    }
    public String getFormula() {
        return this.formula;
    }
}
