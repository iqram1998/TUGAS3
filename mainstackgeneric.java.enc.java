package tugas3;

public class mainstackgeneric {

	public static void main(String[] args) {
		mainstackgeneric st = new mainstackgeneric();



        st.push(5);

        st.push(4);

        st.push(3);

        st.push(9);



        if (st.size() == 0) {

            System.out.println("Stack is empty.");

        } else {

            System.out.println("Stack contains " + st.size() + " items.");

        }



        while (!st.isEmpty()) {

            System.out.println(st.pop());

        }



        if (st.size() == 0) {

            System.out.println("Stack is empty.");

        } else {

            System.out.println("Stack contains " + st.size() + " items.");

        }

        st.push(7);



        System.out.println("Size: " + st.size());

        System.out.println(st.pop());

        

    }

	private char[] pop() {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	private int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	private void push(int i) {
		// TODO Auto-generated method stub
		
	}





	}


