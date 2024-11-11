package src.shared.domain.jsonManager.domain;

public interface JsonManager<Type> {
    public Type findById(String id);
}
