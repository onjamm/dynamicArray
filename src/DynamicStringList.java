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

        }
    }






    public String get(int index) {
        


        return words[index];
    }
}
