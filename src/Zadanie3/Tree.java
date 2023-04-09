package Zadanie3;

public class Tree {
    String type;
    int height;
    int coutOfsticks;
    String colour;
    public Tree(String type, int height){
        this.type=type;
        this.height=height;
        this.coutOfsticks=13;
        this.colour="зеленый";
        System.out.println("Colour = " + colour + ". CoutOfsticks = " + coutOfsticks + ". Type = " + this.type + ". Height= " + this.height);
    }
    public Tree(int height, int coutOfsticks, String colour){
        this.height=height;
        this.coutOfsticks=coutOfsticks;
        this.colour=colour;
        this.type="пихта";
        System.out.println("Type = " +type+ ". Height = " + this.height + ". CoutOfsticks = " + this.coutOfsticks + ". Colour = " + this.colour);
    }

    public Tree(){
        this.height=350;
        this.coutOfsticks=29;
        this.colour="желтый";
        System.out.println("Height = " + height + ". CoutOfsticks = " + coutOfsticks + ". Clour = " + colour);
    }

    public Tree (String type){

        this();
        this.type=type;
        System.out.println("Type = " + this.type);
    }


}
