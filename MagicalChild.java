/*this is a class for a child in a magical reality */
public class MagicalChild implements Contract{
    public String name;
    public Integer age;
    public Double height;

/**
 * This is the constructor for the Magical Child class.
 * @param name
 * @param age
 * @param height
 */
    public MagicalChild (String name, Integer age, Double height){
        this.name = name;
        this.age = age;
        if (this.age>18){
            throw new RuntimeException("Child cannot be more than 18 years old.");
        }
        this.height = height;

    }
/**
 * This method allows the child to grab items.
 * @param item
 */
    public void grab(String item){
      System.out.println(this.name + " has grabbed the " + item + ".");
    }

/**
 * This method causes the child to drop items.
 * @param item
 */
    public String drop(String item){
        System.out.println(this.name + " has dropped the " + item + "."); 
        return item;

    }

/**
 * This method allows the child to examine items.
 * @param item
 */
    public void examine(String item){
        System.out.println(this.name + " is examining the " + item + ".");  

    }

/**
 * This method allows the child to use items.
 * @param item
 */
    public void use(String item){
        System.out.println(this.name + " is using the " + item + ".");  

    }

/**
 * This method allows the child to walk in a given direction if they are old enough to walk.
 * @param direction
 * @return boolean
 */
    public boolean walk(String direction){
        if (this.age > 1){
            System.out.println(this.name + " is walking in this direction: "+ direction + ".");
            return true;
        }
        else{
            System.out.println(this.name + "is too young to walk.");
            return false;
        }



    }

/**
 * This method allows the child to fly to given coordinates if they are old enough.
 * @param x
 * @param y
 * @return boolean
 */
    public boolean fly(int x, int y){
        if(this.age > 10){
            System.out.println(this.name + " has used the Nimbus 2000 to fly to the coordinates: x:"+ x +", y:"+ y + "."); 
            return true; 
        }
        else{
            System.out.println(this.name + " is too young to fly.");
            return false;

        }
          

    }

/**
 * This method shrinks the child by dividing its height by 10.
 * @return Number
 */
    public Number shrink(){
        Double shrunkenSize = this.height/10;
        System.out.println(this.name +  " has swallowed the shrinking potion. They are now " + shrunkenSize + " cm.");
        return shrunkenSize;

    }

/**
 * This method grows the child by multiplying its height by 100.
 * @return Number
 */
    public Number grow(){
        Double superSize = this.height*100;
        System.out.println(this.name + " has swallowed the growing potion. They are now " + superSize + " cm.");
        return superSize;

    }

/**
 * This method allows the child to rest.
 */
    public void rest(){
        System.out.println("It's bedtime. "+ this.name +" is going to rest.");


    }
/**
 * This method undoes the child's mistakes.
 */
    public void undo(){
        System.out.println("Oops "+ this.name + " made a mistake, let's use the undo spell......");
        System.out.println("Action reversed!");
    }
/**
 * This method allows the child to cast a spell if they are old enough.
 * @param spell
 */
    public void spellcast(String spell){
        if (this.age > 5){
            System.out.println(this.name + " has cast the " + spell + " spell!");
        }
        else{
            System.out.println(this.name + " is too young to cast spells. :( " );
        }
    }
 
public static void main(String[] args) {
    MagicalChild mariaChild = new MagicalChild("Maria", 4, 101.6);
    mariaChild.grab("bottle");
    mariaChild. drop("bottle");
    mariaChild.examine("bottle");
    mariaChild.use("crayon");
    mariaChild.walk("right");
    mariaChild.fly(10, 20);
    mariaChild.shrink();
    mariaChild.grow();
    mariaChild.rest();
    mariaChild.undo();
    mariaChild.spellcast("Vanishing");

    MagicalChild penelopeChild = new MagicalChild("Penelope", 12, 160.0);
    penelopeChild.grab("apple");
    penelopeChild. drop("apple");
    penelopeChild.examine("apple");
    penelopeChild.use("phone");
    penelopeChild.walk("right");
    penelopeChild.fly(10, 20);
    penelopeChild.shrink();
    penelopeChild.grow();
    penelopeChild.rest();
    penelopeChild.undo();
    penelopeChild.spellcast("Vanishing");
    
    //MagicalChild peterChild = new MagicalChild("Peter", 20, 182.0);
    
    

    
}}