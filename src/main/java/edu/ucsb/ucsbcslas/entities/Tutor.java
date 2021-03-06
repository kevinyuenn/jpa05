package edu.ucsb.ucsbcslas.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;

@Entity
public class Tutor {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @Column(nullable = false)
  private String firstName;
  @Column(nullable = false)
  private String lastName;
  @Column(nullable = false)
  private String email;

  public Tutor() {
  }

  public Tutor(Long id, String firstName, String lastName, String email) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Tutor)) {
      return false;
    }
    Tutor tutor = (Tutor) o;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(id, tutor.getId()).append(email, tutor.getEmail()).append(firstName, tutor.getFirstName())
        .append(lastName, tutor.getLastName());
    return builder.build();
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, email);
  }

  @Override
  public String toString() {
    return "{" + " id='" + getId() + "'" + ", firstName='" + getFirstName() + "'" + ", lastName='" + getLastName() + "'"
        + ", email='" + getEmail() + "'" + "}";
  }

}
