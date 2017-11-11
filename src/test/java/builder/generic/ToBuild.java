package builder.generic;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Created by mtumilowicz on 2017-11-11.
 */
public class ToBuild {
    private String string;
    private Integer integer;
    private LocalDate localDate;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToBuild toBuild = (ToBuild) o;
        return Objects.equals(string, toBuild.string) &&
                Objects.equals(integer, toBuild.integer) &&
                Objects.equals(localDate, toBuild.localDate);
    }
}
