/*
Encapsulation
1. Wrapping of data and functions together in single unit is called Encapsulation.

What is purpose
Data Hidding

Real Time Example
capsule,ATM machine... etc.

How to implement in js
Data should be private and method in public
 to access/modfiy private data....
 public method: getter and setter

 getters: get the Data
 setter : set the data


*/

class Emp{


    constructor(){  //private | local variable
        let id;
        let name;
    }


    //getter and setter
    setId(id){  //public 
        this.id=id;
    }

    getId(){
        return this.id;
    }

    setName(name){  //public 
        this.name=name;
    }

    getName(){
        return this.name;
    }
}

let e1 = new Emp();
e1.setId(101);
e1.setName("Cypress")

console.log(e1.getId() + ":"+ e1.getName())