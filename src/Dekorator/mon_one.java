package Dekorator;

public class mon_one extends KomputerDecorator {
        public mon_one(Komputer komp) {
                super(komp);
        }
        @Override
        public double Cost(){
                return super.Cost() + 711;
        }

        @Override
        public String Name() {
                return super.Name()+ " Monitor - 15' .";
        }
}
