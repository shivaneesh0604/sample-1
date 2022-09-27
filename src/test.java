class box {
    int l,h,w;
    box()
    {

    }
    box(int l,int h,int w){

        this.l=l;
        this.h=h;
        this.w=w;
    }
    box(box old)
    {
        l=old.l;
        h=old.h;
        w=old.w;
        
    }
}

public class test extends box {

    public static void main(String[] args) {

        box b1 = new box();
        box b2=new box(1,2,3);
        box b3 = new box(b2);
        System.out.println(b3.h+" "+b3.l+" "+b3.w);
    }
}
