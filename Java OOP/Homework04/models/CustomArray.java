package models;


public class CustomArray<T> {
    private T[] array;

    public CustomArray(T[] array) {
        this.array = array;
    }

    public CustomArray() {
        this.array = (T[]) new Object[0];
    }

    public T get(int index) {
        return this.array[index];
    }

    public void set(int index, T obj) throws CustomArrayException {
        if (array.length - 1 < index)
            throw new CustomArrayException("Данного элемента не существует");
        this.array[index] = obj;
        
    }

    public int size() {
        return array.length;
    }

    public T getMin() throws CustomArrayException {
        if (array.length == 0)
            throw new CustomArrayException("Массив пустой!");

        T min = array[0];
        for (int i = 0; i < this.array.length; i++) {
            if (((Comparable<T>) array[i]).compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }

    public T getMax() throws CustomArrayException {
        if (array.length == 0)
            throw new CustomArrayException("Массив пустой!");

        T max = array[0];
        for (int i = 0; i < this.array.length; i++) {
            if (((Comparable<T>) array[i]).compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public T getSum() throws CustomArrayException {
        if (array.length == 0)
            throw new CustomArrayException("Массив пустой!");

        if (this.array[0] instanceof Double) {
            Double sum = .0;
            for (T t : this.array) {
                sum += (Double) t;
            }
            return (T) sum;
        } else if (this.array[0] instanceof Integer) {
            Integer sum = 0;
            for (T t : this.array) {
                sum += (Integer) t;
            }
            return (T) sum;
        } else {
            return null;
        }
    }

    public T getProd() throws CustomArrayException {
        if (array.length == 0)
            throw new CustomArrayException("Массив пустой!");

        if (this.array[0] instanceof Double) {
            double sum = 1;
            for (T t : this.array) {
                sum *= (Double) (Object) t;
            }
            return (T) (Object) sum;
        } else if (this.array[0] instanceof Integer) {
            Integer sum = 1;
            for (T t : this.array) {
                sum *= (Integer) (Object) t;
            }
            return (T) (Object) sum;
        } else {
            return null;
        }
    }

    
    public void add(T obj) {
        T[] newArray = (T[]) new Object[array.length + 1];
        System.arraycopy(this.array, 0, newArray, 0, this.array.length);
        this.array = newArray;
        this.array[this.array.length - 1] = obj;
    }

    public void remove(int index) throws CustomArrayException {
        if (array.length - 1 < index)
            throw new CustomArrayException("Данного элемента не существует");
            
        T[] newArray = (T[]) new Object[array.length - 1];
        System.arraycopy(this.array, 0, newArray, 0, index);
        System.arraycopy(this.array, index + 1, newArray, index, this.array.length - index - 1);
        this.array = newArray;

    }

    public void removeAll(T obj) throws CustomArrayException {
        if (array.length == 0)
            throw new CustomArrayException("Массив пустой");

        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] == obj) {
                remove(i);
                i -= 1;
            }
        }
    }


    public int findPos(T obj) throws CustomArrayException {
        if (array.length == 0)
            throw new CustomArrayException("Массив пустой!");

        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] == obj)
                return i;
        }
        return -1;
    }

    public boolean find(T obj) throws CustomArrayException {
        if (array.length == 0)
            throw new CustomArrayException("Массив пустой!");

        for (T iterable_element : (T[]) this.array) {
            if (iterable_element == obj) {
                return true;
            }
        }
        return false;
    }

    public void bubbleSort() throws CustomArrayException {
        if (array.length == 0)
            throw new CustomArrayException("Массив пустой!");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (((Comparable<T>) array[i]).compareTo(array[j]) < 0) {
                    T bufer = array[i];
                    array[i] = array[j];
                    array[j] = bufer;
                }
            }
        }
    }

    public void insertSort() throws CustomArrayException {
        if (array.length == 0)
            throw new CustomArrayException("Массив пустой!");

        int j;
        for (int i = 1; i < this.array.length; i++) {
            T bufer = this.array[i];
            for (j = i; j > 0 && ((Comparable<T>) array[j - 1]).compareTo(bufer) > 0; j--) {
                this.array[j] = this.array[j - 1];
            }
            this.array[j] = bufer;
        }
    }

    public void selectSort() throws CustomArrayException {
        if (array.length == 0)
            throw new CustomArrayException("Массив пустой!");
            
        for (int i = 0; i < this.array.length; i++) {
            int pos = i;
            T min = this.array[i];
            for (int j = i + 1; j < this.array.length; j++) {
                if (((Comparable<T>) array[j ]).compareTo(min) < 0) {
                    pos = j;
                    min = this.array[j];
                }
            }
            this.array[pos] = this.array[i];
            this.array[i] = min;
        }
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i].toString());
            if (i < array.length - 1)
                System.out.print(", ");
        }
        System.out.print("]");
    }
}