package creational.builder.immutable;

import java.time.LocalDate;

/**
 * Created by mtumilowicz on 2017-11-11.
 */
public class ImmutableWithBuilder {
    private final String string;
    private final Integer integer;
    private final LocalDate localDate;

    private ImmutableWithBuilder(Builder builder) {
        string = builder.string;
        integer = builder.integer;
        localDate = builder.localDate;
    }

    public String getString() {
        return string;
    }

    public Integer getInteger() {
        return integer;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }
    
    public static class Builder {
        private String string;
        private Integer integer;
        private LocalDate localDate;

        public Builder string(String string) {
            this.string = string;
            
            return this;
        }

        public Builder integer(Integer integer) {
            this.integer = integer;
            
            return this;
        }

        public Builder localDate(LocalDate localDate) {
            this.localDate = localDate;
            
            return this;
        }
        
        public ImmutableWithBuilder build() {
            return new ImmutableWithBuilder(this);
        }
    }
}
