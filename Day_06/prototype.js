class EmployeeData{

        constructor(id,name)
        {
            this.id=id;
            this.name=name;
        }

}


// //prototype
// EmployeeData.prototype.langugage="javascript";

// let e1 = new EmployeeData(101,'Amit')
// //e1.langugage = 'javascript';
// console.log("Employee id is: "+ e1.id + " name is "+e1.name + " langugage is :  "+ e1.langugage)


// console.log("-----------------")
// let e2 = new EmployeeData(102,'Kiran');
// console.log("Employee id is: "+ e2.id + " name is "+e2.name + " langugage is :  "+ e2.langugage)



let fname = "Sachin          ";
// console.log("Length of my string "+ fname.length)
 console.log("Actual length is : "+ fname.trim().length)


String.prototype.trueLength = function(){
    return this.trim().length;
}

let res = fname.trueLength();
console.log(res)
