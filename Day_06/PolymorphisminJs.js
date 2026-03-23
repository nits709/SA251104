/*
Polymorphism
one thing in many forms we can access it by polymorphism


What is purpose
Method reusability


print(){
sddsadasd
}

print(add){
adasdadsads
}

Types
1.compile Time
2. Run time 
*/


// class Test{


// login(){
//     console.log("Login with default Data")
// }

// login(){
//     console.log("login1 with dafault Data")
// }

// }


// let t1 = new Test();

// t1.login();



console.log("--------------------Run Time Polymorphism-----------------")
class Parent{

color(){
    console.log("Red");
}

}


class Child extends Parent{


color(){
    console.log("Blue")
}

}

// let p1 = new Parent();
// p1.color();

let c1 = new Child();
c1.color(); // blue