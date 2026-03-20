
/*

Browser="chrome"

*/


let Browser="firefox"
switch (Browser) {
    case "chrome":
        console.log("launching chromeBrowser");
        break; // break the loop move control out from the case.

     case "firefox":
        console.log("Launching firefox");
        break;
    default:
        console.log("wrong browser option")
}