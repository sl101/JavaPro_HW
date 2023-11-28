package de.telran.module2.lesson_2023_11_27_arrays.hw;

public class DynamicIntArray {

    private int DEFAULT_CAPACITY = 4;
    private double PROCENT_CHANGE = 1.5;
    private int length = 0;
    private int capacity;
    private int[] arr;

    public DynamicIntArray() {
        this.capacity = DEFAULT_CAPACITY;
        this.arr = new int [capacity];
    }
    public DynamicIntArray(int capacity) {
        this.capacity = capacity;
        this.arr = new int [capacity];
    }

    public int[] getArr() {
        return this.arr;
    }

    private void createNewArrayLength(int tempLength){
            this.capacity = (int) (tempLength*PROCENT_CHANGE);
            int[] arrClone = new int [capacity];
            for (int i = 0; i < length; i++) {
                arrClone[i] = this.arr[i];
            }
            this.arr = new int [this.capacity];
            for (int i = 0; i < capacity; i++) {
                this.arr[i] = arrClone[i];
            }
    }

    // добавление элемента в конец (не забывайте про ограничения размера массива).
    public void add(int element){
        int tempLength = length;
        if(tempLength  == capacity){
            createNewArrayLength(tempLength);
        }
        this.arr[length] = element;
        this.length++;
    }

    // добавление массива элементов в конец нашего массива(не забывайте про ограничения размера массива).
    public void  add(int[] elements){
        int tempLength = length + elements.length;
        if(tempLength  >= capacity){
            createNewArrayLength(tempLength);
        }
            for (int i = length; i < (length+ elements.length); i++) {
                this.arr[i] = elements[i-length];
            }
            this.length =  this.length + elements.length;
    }

    // вставка элемента в место с нужным индексом (не забывайте про ограничения размера массива
    // и смещение элементов вправо)
    public void  insert (int index, int element) {
        if(index <= length){
            int [] tempArray = new int[length-index+1];
            tempArray[0] = element;
            for (int i = index; i < length; i++) {
                tempArray[i-index+1] = this.arr[i];
            }
            this.length = index;
            add(tempArray);
        } else {
            System.out.println("Index more than arr length");
        }

    }

    // удаление элемента (не забывайте про смещение элементов влево при операции).
    public void delete (int index) {
        int newLength = length-index;
        int [] tempArray = new int[newLength];
        for (int i = index+1; i < length; i++) {
            tempArray[i-(index+1)] = this.arr[i];
        }
        this.length = index;
        add(tempArray);
    }

    //  вернуть значение элемента по index
    public int get(int index) {
        if (index < length) {
            return this.arr[index];
        } else {
            System.out.println("The index is out of bounds of the array!");
            return -1;
        }
    }
}
