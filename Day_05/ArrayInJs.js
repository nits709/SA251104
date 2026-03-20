// // let arr = [10,20,30,40,50]
// //           //0, 1, 2, 3, 4
          
          
// // console.log(arr)          
// // console.log(arr.length) //returns the total size of an array...

// // console.log("Element at index 3 "+ arr[3]) //40
// // console.log("Element at index 10 "+ arr[10]) //undefined


// // for(let i =0; i<arr.length;i++){
// //     console.log(arr[i])
// // }



// let users =["user1","user2","user3","user4"]

// for(let user of users){  // for of loops return the value of index's
//     console.log(user)
// }

// for(let e in users){ // for in loops return the index's
//     // console.log(e)
//     console.log(index,users[e])
// }


// let color = ["red", "black", "white", "pink"]
// console.log(color)

// //unshift() : add any element in exisiting array side at the first index
// //push() :add any element in exisiting array side at the end of index

// color.push("Blue")
// console.log(color)

// color.unshift("Yellow")

// console.log(color)



// what if want to delete any element from exisiting array...
//splice(): delete an element from exsiting array at any index


let nameList = ["Ravi","Kiran","Sach","Venki","John"]
                //0,    1,      2,     3,        4
console.log(nameList)
//nameList.splice(0,1) //[ 'Kiran', 'Sach', 'Venki', 'John' ]
//nameList.splice(1,0) //[ 'Ravi', 'Kiran', 'Sach', 'Venki', 'John' ]


//nameList.splice(0,1,"Kumar") //[ 'Kumar', 'Kiran', 'Sach', 'Venki', 'John' ]
//nameList.splice(0,2,"Kumar") //[ 'Kumar', 'Sach', 'Venki', 'John' ]
//nameList.splice(0,2,"Kumar","Nitin","Dinesh") //[ 'Kumar', 'Nitin', 'Dinesh', 'Sach', 'Venki', 'John' ]

nameList.splice(3,0,"Chid") // this expression doesnt remove any element from array
console.log(nameList) 



/*0, this starting point 
1,2 this will remove number of element in array

(0,1) = Ravi will be removed
(0,2) = Ravi and Kiran will be removed
(2,0) = nothing happend
(3,1) = Venki will be removed.
(3,2) = Venki  + John will be removed.
(2,3) = Sach + Venki  + John will be removed.
*/
