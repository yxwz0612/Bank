package app;

public class text4 {
    public static void main(String[] args) {

        try {
            fuck("asdff");
        }catch (FuckYou a){
            System.out.println("阿斯顿发斯蒂芬阿斯蒂芬");
        }



    }


    public static void fuck(String a) throws FuckYou{

        if(a.equals("asdff")){
            throw new FuckYou();
        }

    }

    public static class FuckYou extends Exception{
        FuckYou() {
       // System.out.println("阿萨法");
        }

    }

}

