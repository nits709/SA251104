/*
marks >= 40 == pass
marks >=90 = A
marks >=70 = B
marks >=50 = c
else = fail
*/

let marks=55;

if(marks>=40)
{
        console.log("pass")

        if(marks>=90){
            console.log("A")
        }
        else if(marks>=70){
            console.log("B");
        }
        else if(marks>=50){

            console.log("C")
        }else {
            console.log("D")
        }

}
else{
    console.log("fail!")
}

