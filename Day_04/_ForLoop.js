/*

1. for Loop
- Number of iterators are fixed..

scenario:
 -dropdown -- number of options
 - calender---number of days are fixed.

2. While loop
    - Number of iterations are not fixed
    Scenario:
    Pagination :
 3. do while
 one time execution without matter condition is true or false.
 
 4.  for... of loop
        - Iterates over values
        - It is applicable for array and string

 5. for....in loop
    Iterates over key and indexing
    - it is applicable for objects only......       

*/

//print hello statement for 5 times..



for(let i=1;i<=5;i++){
    console.log("Hello");
}


//factorial of 5 = 5*4*3*2*1=120

let fact=1;
for(let i=5;i>=1;i--){

    fact = fact *i;   /*
                            1* 5 
                            5*4
                            20*3
                            60*2
                            120*1
    */
}

console.log("factorial of 5 "+ fact)