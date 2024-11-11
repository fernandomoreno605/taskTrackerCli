package src.shared.domain.repository;

import java.util.Map;

public interface Repository<Type> {
    public Type save();
    public Type update();
    public void delete();
    public Map<Number, Type> list();
}