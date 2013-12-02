package com.daricili.model.mongodb;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import lombok.Data;
import org.bson.types.ObjectId;

@Entity("users")
@Data
public class User
{
    @Id
    ObjectId id;
    String firstName;
    String lastName;
    String phone;
}
