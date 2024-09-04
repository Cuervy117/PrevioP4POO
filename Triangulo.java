public class Triangulo {
    float base, altura;

    public float area() {
        return (this.base * this.altura) / 2.0f;
    }

    public float area(float base, float altura) {
        return (base * altura) / 2.0f;
    }

    public float area(int base, int altura) {
        return (base * altura) / 2.0f;
    }
}
