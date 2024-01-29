//Homan Aghajani, 2024-01-29
package JoJoJavaProject.src;

public class JoJos {
    private String name;
    public JoJos(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "JoJos{" +
                "name='" + name + '\'' +
                '}';
    }
}
