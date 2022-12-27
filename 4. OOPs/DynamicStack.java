public class DynamicStack {

    public static class CustomStack {
        int[] data;
        int tos;

        public CustomStack(int cap) {
            data = new int[cap];
            tos = -1;
        }

        int size() {
            // write ur code here
            return tos + 1;
        }

        void display() {
            // write ur code here
            for (int i = tos; i >= 0; i--) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }

        void push(int val) {
            // write ur code here
            if (tos == data.length - 1) {
                int[] ndata = new int[2 * data.length];
                for (int i = 0; i < data.length; i++) {
                    ndata[i] = data[i];
                }
                data = ndata;
                
                tos++;
                data[tos] = val;
            } else {
                tos++;
                data[tos] = val;
            }
        }

        int pop() {
            // write ur code here
            if (tos == -1) {
                System.out.println("Stack underflow");
                return -1;
            } else {
                int val = data[tos];
                tos--;
                return val;
            }
        }

        int top() {
            // write ur code here
            if (tos == -1) {
                System.out.println("Stack underflow");
                return -1;
            } else {
                return data[tos];
            }
        }

    }

    public static void main(String[] args) {
        CustomStack cs = new CustomStack(5);
        cs.push(10);
        cs.display();
    }
}
