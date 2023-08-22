let arr = [10,20,30,"Viren", "Chauhan", true]
console.log(arr);
console.log(typeof arr);
console.log(arr[1]);
console.log(typeof arr[4]);
console.log(arr[4]);
console.log(arr.length);
console.log(arr[arr.length-3]);

console.log(arr.push(3)) // add new line in from the last array 
console.log(arr);

arr.unshift("QAOPS")
console.log(arr);

arr.pop() //Removes the last element from an array and returns it. If the array is empty, undefined is returned and the array is not modified.
console.log(arr);

arr.shift() // Remove the first element from an array and return it.
console.log(arr);

arr.splice(1,2) 
console.log(arr);

arr.splice(0,2)
console.log(arr);

console.log("--------------------------");

let arr1 = [10,20,30,"Viren", "Chauhan", true]
let arr2 = ["JS", "JAVA"]

arr1.push(arr2)
console.log(arr1);

console.log(arr1[6][1]); 


let obj1={
    "Name": "Viren Chauhan",
    "Language":"JS"
    }

arr1.push(obj1)
console.log(arr1);

console.log(arr1[7].Name);
console.log(arr1[7]["Name"]);


let arr4 = [10,20,30,"Viren", true]

for(let i=0;i<arr4.length;i++)
{
    console.log(arr4[i]);
}

for(let i=0;i<arr1.length;i++)
{
    console.log(arr1[i]);
}
