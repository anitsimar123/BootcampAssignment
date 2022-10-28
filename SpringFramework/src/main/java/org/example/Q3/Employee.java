package org.example.Q3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("e1")
public class Employee {
    @Value("1")
    int id;

    @Value("Amrit Singh")
    String name;

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
