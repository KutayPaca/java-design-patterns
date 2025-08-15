package builder;


public final class Pizza {
    private final String dough;
    private final String sauce;
    private final String topping;
    private final String size;
    private final String crustType;
    private final boolean spicy;
    private final boolean extraCheese;
    private final int bakeTime;

    private Pizza (Builder builder) {
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.topping = builder.topping;
        this.size = builder.size;
        this.crustType = builder.crustType;
        this.spicy = builder.spicy;
        this.extraCheese = builder.extraCheese;
        this.bakeTime = builder.bakeTime;
    }

    public String getDough() {
        return dough;
    }
    public String getSauce() {
        return sauce;
    }
    public String getTopping() {
        return topping;
    }
    public String getSize() {
        return size;
    }
    public String getCrustType() {
        return crustType;
    }
    public boolean isSpicy() {
        return spicy;
    }
    public boolean isExtraCheese() {
        return extraCheese;
    }
    public int getBakeTime() {
        return bakeTime;
    }
    public static class Builder {
        private String dough;
        private String sauce;
        private String topping;
        private String size;
        private String crustType;
        private boolean spicy;
        private boolean extraCheese;
        private int bakeTime;

        public Builder dough(String dough) {
            this.dough = dough;
            return this;
        }
        public Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }
        public Builder topping(String topping) {
            this.topping = topping;
            return this;
        }
        public Builder size(String size) {
            this.size = size;
            return this;
        }
        public Builder crustType(String crustType) {
            this.crustType = crustType;
            return this;
        }
        public Builder spicy(boolean spicy) {
            this.spicy = spicy;
            return this;
        }
        public Builder extraCheese(boolean extraCheese) {
            this.extraCheese = extraCheese;
            return this;
        }
        public Builder bakeTime(int bakeTime) {
            this.bakeTime = bakeTime;
            return this;
        }
        public Pizza build() {
            return new Pizza(this);
        }
    }
}
