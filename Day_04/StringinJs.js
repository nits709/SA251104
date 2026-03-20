
//String
//string is collection of characters


// methods
// toUpperCase() -- turn anystring from lower case to upper
// toLowercase -- 
// trim(); - "remove the spaces from both sides of the string starting and trailing"
// includes();
//chatAt(index)
// indexof()
// replace 
// replaceALL
// */


let info = "Selenium webdriver is functional automation tool";
console.log(info)


//total length of my entire string.
console.log(info.length); 

let h1= "Hello ALL"; //9 and total character is 9
console.log(h1.length)
console.log(h1.toUpperCase());
console.log(h1.toLowerCase());

console.log(h1.charAt(4)) // index starts from 0

let sString = "  Software testing, having manual and automation testing     ";
console.log(sString.trim())


//replace some part of string
console.log(sString.replace("testing","qwerqwerw")); // replace will be done at first occuranceonly.
console.log(sString.replaceAll("testing","&^%$#@#$%^"));


let statement = "your total amount bill is 500"; 
let bill = statement.split(" ")[5]
console.log(bill);







