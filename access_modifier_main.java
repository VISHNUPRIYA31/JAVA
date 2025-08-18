class access_modifier{

    void display(){// default access specifier
        System.out.println("Java Programming - Default AS");
    }
    public void display_p(){// public access specifier
        System.out.println("Java Programming - Public AS");
    }
    protected void display_pp(){// protected access specifier
        System.out.println("Java Programming - Protected AS");
    }
    private void display_pr(){// protected access specifier
        System.out.println("Java Programming - Protected AS");
    }
}

public class access_modifier_main{
    public static void main(String[] aa){
        access_modifier am = new access_modifier();
        am.display();
        am.display_p();
        am.display_pp();
        am.display_pr();
    }
}