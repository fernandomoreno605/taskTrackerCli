package src.shared.domain;

import java.util.Date;

public class UpdatedAt {
    final protected Date value;

    public UpdatedAt(Date value){
        this.value = value;
    }

    public Date value() {
        return  this.value;
    }
}