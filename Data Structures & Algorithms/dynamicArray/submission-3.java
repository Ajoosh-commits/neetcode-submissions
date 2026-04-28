class DynamicArray {
    int [] arr;
    int capacity;
    int size;

    public DynamicArray(int capacity) {
        this.arr = new int[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    public int get(int i) {
        return this.arr[i];
    }

    public void set(int i, int n) {
        if (i > this.size){
            this.size = i;
        }
        this.arr[i] = n;
    }

    public void pushback(int n) {
        if (this.size >= this.capacity){
            this.resize();
        }
        this.arr[this.size] = n;
        this.size++;
    }

    public int popback() {
        int elem = this.arr[this.size - 1];
        this.arr[this.size - 1] = 0;
        this.size--;
        return elem;
    }

    private void resize() {
        int [] newarr = new int[this.capacity * 2];
        for (int i = 0; i < this.size; i++){
            newarr[i] = this.arr[i];
        }
        this.capacity *= 2;
        this.arr = newarr;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
