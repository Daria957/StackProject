import java.util.Scanner;
public class GeneralStack {
    public static void main(String[] args) {
        System.out.print("Введите число - колличество элементов в стеке:");
        Scanner sc = new Scanner(System.in);
        int l;
        l=Integer.parseInt(sc.nextLine());

        Stack mStack = new Stack(l);
        System.out.print("Стек: ");

        for(int i=0;i<l;i++){

            mStack.addElement(i);
        }

        System.out.println("");
        System.out.println(mStack.readTop());

        System.out.println("Удаляем тор элемент");
        mStack.deleteElement();

        while (!mStack.isEmpty()) {
            int value = mStack.deleteElement();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");



    }

}
