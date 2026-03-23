/*

Inheritence
1. An acquaring properties of one class into other class is inheritence....


What is purpose
1. To avoid code duplication
2. to reuse code
3. To achieve run time polymorpshim (Method overriding)



*/

// parent
class Vehical{


    breakFeature(){
        console.log("Vehial .......break()")
    }

}


//car is child
class Car extends Vehical{

start(){

    console.log("Car .......start()")
}

stop(){
    console.log("Car .......stop()")
}

refuel(){
    console.log("Car .......refuel()")
}

price(){
    console.log("Car .......price()")
}


}


class BMW extends Car{

autoEngine(){
    console.log("BMW.........autoEngine")
};

price(){
    console.log("BMW .......70L")
}

}

class Audi{

    autoGear(){
        console.log("Audi.........autoGear")
    };
    
    price(){
        console.log("Audi .......50L")
    }
    
    }

    //Scenario:1 

    let c1 = new Car();
    c1.start(); //Individual function
    c1.refuel(); // Individual
    c1.stop(); //Individual
    c1.breakFeature() // parent
    c1.price(); //Individual
    c1.autoEngine(); // error


    //scenario:2

    let b1 = new BMW();
    b1.start(); // inherited data
    b1.refuel(); //inherited
    b1.price();// BMW