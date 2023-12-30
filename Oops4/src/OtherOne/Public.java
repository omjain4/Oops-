package OtherOne;

public class Public {
    public int num; //public let us access this thing anywhere whether it be a different package
    // or different class in another package which is not even in subclass.
    public String name;

    public Public(int num, String name) {
        this.num = num;
        this.name = name;
    }
}
