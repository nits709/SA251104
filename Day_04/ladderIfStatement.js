/*
Ladder if statement help to validate multiple statements


*/

// greater number out of 3 number

let num1=100, num2=200, num3 = 300;

if(num1>num2 && num1>num3){
    console.log(num1 + "greater than "+ num2 +" &  "+ num3)
}else if(num2>num1 && num2>num3){
    console.log(num2+ "greater then "+ num1 + " & "+ num3)
}else{
    console.log(num3+"greater then "+ num1 + "  & "+ num2)
}