package test1;

/**
 * Created by minah on 2016-10-04.
 */
public class User {
  private int id;
  private String name;
  private String role;
  private boolean isEmployee;

  public User(int id, String name, boolean isEmployee, String role) {
    this.id = id;
    this.name = name;
    this.role = role;
    this.isEmployee = isEmployee;
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

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public boolean isEmployee() {
    return isEmployee;
  }

  public void setEmployee(boolean employee) {
    isEmployee = employee;
  }
}
