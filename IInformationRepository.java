import fr.efrei.domain.Information;
import java.util.List;

public interface IInformationRepository extends IRepository<Information, String>{
    public List<Information> getAll();
}