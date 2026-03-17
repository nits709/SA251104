//Operators

//Arithmetic operator

// let a= 5 , b=10;

// let c = a+b;

// console.log("Addition is "+ a+b) // 510 
// console.log(a+b) // 510 
// console.log("Addition is "+ (a+b)) // 510 
// console.log("Addition is "+ c) // 15
// console.log("Multiple is "+ (a*b));
// console.log(`Substraction is  ${a-b}`);
// console.log(`Division is  ${a/b}`);
// console.log(`Modulos is  ${a%b}`);


// console.log(90/0); //Infnity
// console.log(-90/0); //-Infinity


// console.log("hi"/0); //NAN - not a number
// console.log(0/0); //NAN - not a number
// console.log(1/0); // Inifinity

// console.log(0/1) //0


// //String + concatination with some other
// console.log("10"+10) // 1010

// /*
// increment and decrement
// a=10 | a++ ; post increment | ++a pre-increment
// b=20 | b-- post decrement | --b pre-dcrement
// */

// let a1 =100;

// console.log(a1)    //100
// console.log(a1++)  //100
// console.log(a1)    //101


// let b1=200;

//  console.log(b1) // 200
//  console.log(++b1) // 201
//  console.log(b1) //201


//  let x =90
//  let y = x++; // value will assign first then incrmeent happened

//  console.log(x) // 91
//  console.log(y) // 90


//  let c = 189;
//  let d = c++;

//  console.log(c) //190
//  console.log(d) // 189

// //post incrmenet

let m = 188;
let n = m--;

console.log(m); //187
console.log(n) //188

// /*
// 1. (variable++) | post increment | first value assigned then increment happened
//     variable = variable++ | value assifgned to variable then incrment
// 2. ++variable = variable got updated with latest value (pre-incrmeent then value prints)
//     variable = ++variable | value got incrment first then assigned.
// */

let p = 145;
console.log(p) // 145
let q = ++p;

console.log(p) // 146
console.log(q) // 146


// let u = 567;
// console.log(u) // 567
// let v = ++u;

// console.log(u) //568
// console.log(v) //568


//pre- decrement

 let i = 689
 console.log(i) // 689
 let j = --i;

 console.log(i)  //688
 console.log(j) //688


/*
relational Operator

<
>
<=
>=
!=

p = 145
i = 688
q = 146
m = 187
*/

console.log(p>i) // false
console.log(p>=q) //true
console.log(i>=m) //true

/*
logical operator


a                        b                 a&&b       a||b           a!
true                    true               true       true           false
true                    false              false      true           false
false                   true               false      true           true
false                   false              false      false          true


 */

//Equality
/*
1. strict  === | values of variable along with it checks the datatype also
2. soft/loose == | check values only....ignore datatype of values
 */



// console.log("10"==10)  //true   | values only
// console.log("10" === 10) // false || value + datatype

// //false - 0 | true = 1
// console.log(null == undefined); //true
// console.log(null === undefined); //false
// console.log(false + true) //1  | implicit
// console.log(""+10)//10
// console.log(false==null) // false
// console.log(false===null) //false
// console.log(undefined+100); //NAN



