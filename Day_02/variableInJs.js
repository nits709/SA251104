// //global variable

// var fName = "Atul";
// let id = 709;
// const email = "asdada@gmail.com";

// // console.log('====================calling variable at global level=====================');
// // console.log("fName "+ fName);
// // console.log("id "+ id);
// // console.log("email "+ email);

// function show(){ // function decalaration.
// console.log("===============calling global variable inside function=====================");
// console.log("fName "+ fName);
// console.log("id "+ id);
// console.log("email "+ email);

// }

// //show(); // function call


// function display(){ // variable declaration inside function is called local variable and that variable will be accessible only inside that function. we cannot access local variable outside the function.
//     let UName = "Deepak"; // local variable
//     let rollNo = 708;
//     let Domain = "Networking";

//     console.log("===============calling local variable inside function=====================");
//     console.log("UName "+ UName);
//     console.log("rollNo "+ rollNo);
//     console.log("Domain "+ Domain);
    
// }

// display();
// console.log("===============calling local variable outside function=====================");
// console.log("UName "+ UName);
// console.log("rollNo "+ rollNo);
// console.log("Domain "+ Domain);


//block scope in javascript

// if(true){ // variable declared inside the block will be accessible only inside that block. 
//             // we cannot access that variable outside the block.

//      let AutomationTool = "Cypress";
//      var playwright = "Playwright";
//     const language = "JavaScript";
    
//     console.log("===============calling variable inside block=====================");
//     console.log("AutomationTool "+ AutomationTool); // undefined / error
//     console.log("playwright "+ playwright);
//     console.log("language "+ language);

// }

// console.log("===============calling variable outside block=====================");
// //console.log("AutomationTool "+ AutomationTool); // undeifined / error
// console.log(" 60 playwright "+ playwright); // catch in var type variable.
// //console.log("language "+ language);

// var data = "testing";  // declaration and initialization of variable in single line. we can also declare and initialize variable in two different lines.
// var data = "developement"; // re-declaration of variable and re-initialization of variable. we can re-declare and re-assign value to variable declared with var keyword but we cannot re-declare variable declared with let and const keyword. we can re-assign value to variable declared with let keyword but we cannot re-assign value to variable declared with const keyword.
// data = "HTML"; // initialization of variable. we can reassign value to variable in javascript. we can also reassign value to variable declared with var and let keyword but we cannot reassign value to variable declared with const keyword.

// console.log("data "+ data);  // output will be HTML because we have re-assigned value to variable data. if we have not re-assigned value to variable data then output will be developement because in that case value of variable data will be developement.

console.log("===============================================================");


let browserName = "chrome"; // declaration and initialization of variable in single line. we can also declare and initialize variable in two different lines.
//let browserName ; // re-declaration of variable and re-initialization of variable. we cannot re-declare variable declared with let keyword but we can re-assign value to variable declared with let keyword.
browserName = "firefox"; // initialization of variable. we can reassign value to variable in javascript. we can also reassign value to variable declared with var and let keyword but we cannot reassign value to variable declared with const keyword.
console.log("browserName "+ browserName); // output will be chrome



// const this is assignment for you .....
