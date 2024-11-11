package src.task.domain;

import java.security.InvalidParameterException;

public class Description {
    final protected String value;

    public Description(String value){
        this.value = value;
    }

    private void validateDescription(String name) throws InvalidParameterException {
        if(name.isEmpty() || name.equals(" ")) throw new InvalidParameterException("Can not be empty/blank description");
    }

    public String value(){
        return this.value;
    }
}
