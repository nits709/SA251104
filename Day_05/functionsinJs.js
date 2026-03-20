console.log("Function declarations")

// function without parameter

function test1(){
    console.log("function calling");
}

//calling the function
test1();



console.log("function with parameter")

function test2(name){ 

    console.log("Hello "+ name)

}

test2("Javascript");


console.log("-----function decalration with parameter with return type----")


function test3(num1,num2){

        return num1+num2;

}

//console.log(test3(10,12));
let result = test3(10,40);
console.log(result)



console.log("==========================Function expression========================")

let funName = function(id,name){

    console.log("Student id "+ id);
    console.log("student name "+ name)

}

funName(101,"sachin")


console.log("===========================function arrow==========================")


         let arrowFunciton =  (num1,num2)=>{
            return num1+num2;
            }


            console.log(arrowFunciton(40,90));
            let result1 = arrowFunciton(40,90);

            console.log(result1)



//call back function


print()


display()

//A function passed an argument to another function  and executed later


/*
 public static void main(String[] args){
 
 registeration();
 login();
 addtoCart();
 
 }

 public void login(){
 }

 public void registeration(){
 }


*/




















