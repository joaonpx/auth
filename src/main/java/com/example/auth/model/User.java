package com.example.auth.model;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Table(name = "tbl_users")
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class User {

  @Id
  @GeneratedValue(
          strategy = GenerationType.SEQUENCE,
          generator = "USERS_SEQ")
  @SequenceGenerator(
          name = "USERS_SEQ",
          sequenceName = "USERS_SEQ",
          allocationSize = 1
  )
  private Long id;
  private String name;
  private String email;
  private String password;
}