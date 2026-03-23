
/**
 * Hoisting is the behavior where you can able to access variable before even declaring it
 * it applicable for var and function declaration
 * 
 * var 
 * let and const
 * 
 * (let and const , function expression we cannot access before decalartion.)
 * 
 */


test1();
//test2(); //Cannot access 'test2' before initialization


function test1(){
    console.log("This is function declaration");
}

//test1();



let test2=function(){
    console.log("This is Anonymous function")
}

//test2();