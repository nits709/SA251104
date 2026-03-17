/*Typecasting
//conversion of one data type into another data type

1. Implicit - Coersion (Implicit conversion only , which js taken care automatically)
2. Explicit conversion (through code)
    1. String
    2. Number
    3. Boolean
*/


// //String conversion | IMplicit
// let num1 = "10"+20; // 20 will coersed to string "20"
// console.log(num1)  // 1020
// console.log(typeof num1) // string


// let num2 = 5+7+"10"; //1210
// console.log(num2) // 

// let num3 = 10 + "15" + 3;
// console.log(num3) //10153 // string
// console.log(typeof num3)

// let num4 = "Hi"+true;
// console.log(num4) // Hitrue
// console.log(typeof num4)

// console.log("=====================Number (-,*,/,%)================")

// console.log("A"+"B"+"C"); // ABC
// console.log("10"+"20"+"30") //102030
// console.log(10+20+30) //60

// console.log("20"-10) //10  | 2010 | corsed 20 from string to number 20-10 = 10
// console.log(typeof ("20"-10)) // datatype

// console.log("100"*5) // 100 coersed to number then | 100*5 = 500
// console.log(typeof ("100"*5))

// console.log("hi"*10); //NAN - not a number


console.log("================Explicit conversion======================")
//number, string, boolean

let data = "200"; // String
console.log(typeof data)

console.log(data+200) //

let addition = Number(data)
console.log(addition)
console.log(typeof addition)
console.log(addition+200) // 400


console.log(Number("600")) //600
console.log(Number("Nitin")) //Nan
console.log(Number(true))  //1
console.log(Number(false)) //0
console.log(Number(null)) //0
console.log(Number(undefined)) //nan


console.log("==================================Number to String========================")

let num = 2000; //number
console.log(num-1000)  //1000
console.log(num+1000) //3000

let numToStringConvert = String(num);
console.log(typeof numToStringConvert);

console.log(numToStringConvert+1000) //20001000
console.log(numToStringConvert-1000) // 1000
console.log(Number(numToStringConvert)-1000)
console.log(Number(numToStringConvert)+1000) //3000



console.log("=======================Boolean conversion========================")
/*
for true - truthy | means any value in boolean context represents as true
for false - falsy |means any value in boolean context represents as false
//non-zero,1,2,123,"nitin"
//0,"",null,NAN,False,undefined.

*/

console.log(Boolean(90)) //true 
console.log(Boolean(-90)) // true
console.log(Boolean(0)) // false
console.log(Boolean(false))// false
console.log(Boolean(undefined)) //
console.log(Boolean("Selenium")) //true
console.log(Number("Selenium"))// NAN
console.log(Boolean(90.99)) // true


console.log(Number(null)) // 0
console.log(Boolean(null)) // false