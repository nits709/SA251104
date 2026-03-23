class Student{

            //global
    // id  = 1;
    // fname = "selenium";


    id;
    fname;

    // //SyntaxError: A class may only have one constructor
    // constructor(){
    //     console.log(sid + " : "+ sfname);

    // }

    constructor(sid,sfname){
        //console.log(sid + " : "+ sfname);
        this.id = sid;
        this.fname = sfname;
}


    print(){   //method not funciton becuase function create in js by using function keyword
        console.log("student id is: "+ this.id)
        console.log("student fname is: "+ this.fname)
    }

}


// java classname obj = new className();
//object
let s1 = new Student("1","Selenium");
s1.print();
//let s1 = new Student();
// console.log(s1.id) // undefined
// console.log(s1.fname) // undefined


// let s2 = new Student(2,"Playwirght")



