//Simple if statement for single true condition


let year = 2025;

if(year === 2026){
    console.log("Year Match ... current year is 2026!")
}



console.log("------------------")

// validate url address with protocol/url should not be null
let baseURL = "https://google.co.in";

if(baseURL.includes("https")){
    console.log("URL is as per standard")
}

//url should not be null
if(baseURL!=null){
    console.log("URL is not null");
}


if(baseURL!=null && baseURL.includes("https")){
    console.log("Valid url!")
}