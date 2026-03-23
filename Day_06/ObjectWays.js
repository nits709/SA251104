/*
Ways to create an object

1. literal object
let user1 = {
 key :value

}

2. Class level object
    let/const/var obj = new className();

3. constructor function 


*/

function EmployeeData(empID,empName){

    this.id = empID;
    this.name = empName;


    this.print=()=>{
        console.log(this.id)
        console.log(this.name);
    }

}

let e1 = new EmployeeData("101","QTP")
e1.print();