package isp.lab3.exercise1;

public class Tree {

        public int height;
        public Tree() {
            this.height=15;
        }

        public void grow(int metri) {
            if(metri>=1)
                height+=metri;
            else System.out.println("valoarea introdusa trebuie sa fie >=1");
        }

        public String toString()
        {
            return "height: " + this.height;
        }

}
