public interface ListInt{
    void add(int newVal);//Adds value to end of meaningful values
    void add(int index, int newVal);//Adds value at given index
    void remove(int index);//Removes value at given index
    int size();//Returns amount of meaningful values
    int get(int index);//Returns the value at the given index
    int set(int index,int newVal);//Sets given index to new value and returns old value
}
