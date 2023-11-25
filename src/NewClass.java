/**
 * {
 * "id": "332e6edc-f6f2-4c58-8aa9-8987b82a21ed",
 * "line": "H🟡",
 * "name": "Facultad de Derecho"
 * }
 **/

public class NewClass {
    @Override
    public String toString() {
        return "{\n" +
                "\"id\": " + id + '\'' +
                ", \"line\": " + line + '\'' +
                ", \"name\": " + name + '\'' +
                '}';
    }

    private String id;
    private String line;
    private String name;

    public NewClass() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
