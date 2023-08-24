/* 
What is Function?
-> Funcation is set of statement which will perform some task. 

Why we use function
-> Because we use function is reuse it. So whenever see something reused you can know wrap them within a function
and you can them whenever you need so Funcation is set of statement which will perform some task.

-> You can call the function you can get the values.

In the javascript function also are objects, So to be more precise every function that we will write in javascipt is function object

*/

// () Parenthess
// {} Curly braces
// [] Square brackets
// `` backtick

function sayHello() {
    console.log("Hello JS");
}

sayHello();

/* Accept some parameters and it will alose reture some values */

function showName(fname, lname) {
    return fname + " " + lname;
}

console.log(showName('Viren', 'Chauhan'));

console.log(typeof showName);


/* Function Expression */

let myFunc1 = function F1() {
    console.log("I'm in F1");
}

// Assigning one function into one variable call myFunc

myFunc1()

let myFunc2 = function F1() {
    console.log("I'm in F1");
    return 50
}
let result = myFunc2()
console.log(result);
// Store this 50 into a variable


let myFunc3 = function (n1, n2, n3) {
    console.log("I'm in func3");
    return n1 + n2 + n3
}

console.log(myFunc3(10, 20, 30))


// Add fumction into object

let myObj = {
    "Name": "Viren",
    f3: function () {
        console.log("I'm inside object");
    }
}

myObj.f3();

let arr = [
    3, "Viren", f1 = function () {
        console.log("I'm inside array");
    }
]

let y = arr[2]
y()

/* Arrow Fumction */

// let z = () =>
// {
//     console.log("This is arrow fumction");

// }
// z()

let z = (x1, x2) => {
    console.log("Test");
    return x1 + x2

}
console.log(z(30, 20))

/* Remove Curly braces  */

let address = () => console.log("Gujarat");
address()

let addressNew = (State, City) => console.log(`${State},${City} India`);
addressNew("Gujarat", "Gandhinagar")