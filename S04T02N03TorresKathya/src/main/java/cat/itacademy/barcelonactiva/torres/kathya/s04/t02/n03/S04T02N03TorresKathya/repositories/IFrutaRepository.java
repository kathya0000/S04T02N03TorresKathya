package cat.itacademy.barcelonactiva.torres.kathya.s04.t02.n03.S04T02N03TorresKathya.repositories;

import cat.itacademy.barcelonactiva.torres.kathya.s04.t02.n03.S04T02N03TorresKathya.models.FrutaModel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IFrutaRepository extends MongoRepository<FrutaModel, ObjectId> {

}
