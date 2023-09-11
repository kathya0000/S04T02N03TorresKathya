package cat.itacademy.barcelonactiva.torres.kathya.s04.t02.n03.S04T02N03TorresKathya.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString

@Document(collection = "fruta")
public class FrutaModel {
    @Id

    private ObjectId id;
    private String nombre;
    private int pesoKg;
}
