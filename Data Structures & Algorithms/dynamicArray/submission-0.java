class DynamicArray {
    private int[] arr;
    private int cap;
    private int length;

    public DynamicArray(int capacity) {
        this.cap = capacity;
        this.length = 0;
        this.arr = new int[capacity];
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        this.arr[i] = n;
    }

    public void pushback(int n) {
        if (length == cap) {
            resize();
        }
        this.arr[this.length] = n;
        this.length++;
    }

    public int popback() {
        this.length--;
        return this.arr[this.length];
    }

    private void resize() {
        this.arr = Arrays.copyOf(this.arr, this.arr.length * 2);
        cap *= 2;
    }

    public int getSize() {
        return this.length;
    }

    public int getCapacity() {
        return this.cap;
    }
}