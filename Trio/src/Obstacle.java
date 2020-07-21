public abstract class Obstacle {
    public boolean[] actions;
    private final String name;

        public Obstacle(String name) {
            this.name = name;
        }

        protected abstract boolean moving(Human human);

        protected abstract boolean moving(Robot robot);

        protected abstract boolean moving(Cat cat);

        public String getName() {
            return name;
        }
    }



