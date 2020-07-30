package stack;
public class Stack {
  private char s[];
  private int size;
  private int indx;


  private Stack(int size) {
  s = new char [size];
  indx=0;
  this.size= size;
  }

    public char[] viewstack() {
        return s;
    }

  
public char pop() throws EmptyStackException {
char rez;
    if (indx ==0) throw new EmptyStackException();
rez = s[indx-1];
s[indx-1]=0;
indx--;
return rez;
}  

public void push(char symb) throws FullStackException {
if (indx>=size) throw new FullStackException(size);
else {
    s[indx] = symb;
    indx++;
}
}
    
    public static void main(String[] args) {
        Stack st = new Stack(10);
        int i;
        char ch;
        try {
        for (i = 0; i<11;i++ ) {
        //переполнили стэк
            System.out.print("Попытка сохранения: " + (char) ('A'+i));
            st.push((char) ('A' + i));
            System.out.println(" - OK");
        }
        System.out.println();
        }
        catch (FullStackException exc) {System.out.println(exc);}        
        
        
        try {
            for (i = 0; i < 11; i++) {
                //извлекаем из пустого стэка
                System.out.print("Извлекли: ");
                ch = st.pop();
                System.out.println(ch+" - OK");
            }
        
        }
        catch (EmptyStackException exc) {System.out.println(exc);}
        
//    Stack st = new Stack(4); //создаем стек
//    st.push('A');
//    st.push('B');
//
//    System.out.println(st.pop());
//    System.out.println(st.pop());
//    for (char sy:st.viewstack()) System.out.print(sy+" ");
//        System.out.println();
//        
//    st.push('C');
//    st.push('D');
//    
//    
//        for (char sy:st.viewstack()) System.out.print(sy+" ");
//        System.out.println();
//    
    
    
//    for (int i=0;i<26;i++) st.push((char)('A'+i)); //заполняем стэк символами
//    for(int i=0;i<26;i++) System.out.print(st.pop()+" ");//посмотрим результат
    }
    
}