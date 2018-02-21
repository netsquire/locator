package grid.pointer.up;

import java.io.Serializable;

public class Contact implements Serializable{

    private String name;
    private String id;
    private int age;
    private String ip;
    private Boolean active = false;
    private Boolean connected;

    Contact(String id, String ip) {
        this.id = id;
        this.ip = ip;
    }

    public Contact(String name, String id, int age, String ip) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.ip = ip;
    }

    public Contact(String name, String id, int age, Boolean active) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.active = active;
    }

    public Contact(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Boolean getActive() {
        return active;
    }

    public Boolean getConnected() {
        return connected;
    }

    public void setConnected(Boolean connected) {
        this.connected = connected;
    }

}
