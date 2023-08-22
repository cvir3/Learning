let obje1 = {}
// console.log(typeof obje1);

/* Create one separate object */

let obj2 = {
    "Name": "Viren",
    "Address": "Vadodara",
    "Number": 9898098980,
    status: false
}

/* Accress Individually Properties */

// console.log(typeof obj2);
console.log(obj2);
console.log(obj2.Name);
console.log(obj2.Number);
console.log(obj2.status);
console.log("============================")
console.log(obj2["Name"]);
console.log(obj2["Number"]);
console.log(obj2["status"]);

/* Add Object */
obj2.Salary = 100
console.log(obj2);

/* Delete Object */
delete obj2.Salary
console.log(obj2);

console.log("============================")

/* Create new object| One object can also have another object
    This is called Nested Object
*/

let obj3 = {
    "State": "Gujarat",
    "Country": "India"
}
s
obj2.fulladdress = obj3
console.log(obj2);

/* Object with Array */

obj2.myFamily = ["M1", "M2"]
console.log(obj2);
console.log(obj2.fulladdress.Country);
console.log(obj2.myFamily[1]);

/* Java script object address by reference not by the values, Because we will see the same behavior with array and objects */