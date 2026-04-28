public class DynamicStringList implements StringList{
    private String[] words;
    private int size;

    public DynamicStringList (){
        words = new String[10];
        size = 0;
    }
    private void resizeAsNeeded(){
        if (size == words.length){
            String [] resizedArray = new String[words.length*2];
            for (int i = 0; i < words.length; i++) {
                resizedArray[i] = words[i];
            }
            words = resizedArray;
        }
    }

    public String get(int index) {
    return words[index];
    }

    public void set(int index, String value) {
        words[index] = value;
    }

    public void add(String value){
        words[size++] = value;
    }

    public String remove(int index) {
        
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        String removed = words[index];
        for (int i = index; i < size - 1; i++) {
            
            words[i] = words[i+1];
        }
        words[size-1] = null; //our garbage collector to rid "removed value"
        size--;
        return removed;
    }

    public int size(){
        return size;
    }

    public int capacity(){
        return words.length;
    }


     
}
