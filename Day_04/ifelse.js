/*

For validating true and false condition we generally use if else statment...


*/

//check given number is positive or negative
// logic succesfully -- redirects on homepage else fail take screenshot

let num = -20;

if(num>0){
    console.log("number is positive")
}
else {
    console.log("number is negative")
}


console.log("-----------------------")
//200 - get infromation from API as response
//201 - created resources in database - Post
//300 - 399 - redirection
// 400-499 = client , 500-599 = server

let statusCode= 301;
if(statusCode>=200 && statusCode<=299){

    console.log("API response is successfull!");

}else{
    console.log("API response is negative!");
}