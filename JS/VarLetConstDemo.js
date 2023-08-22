/* Var can be re-declared and updated */

var fname = "Viren"
var fname = "Chauhan"
console.log(fname);

/* Let can be updated but not re-declared */

let lname = "Selenium"
lname = "WebDriver"
console.log(lname);

/* Const can be updated but not re-declared */

const driver = "Appium"
driver = "WebDriver"
console.log(driver);

for (var i=0;i<5;i++)
{
    console.log(i);
}
console.log("Outside Value is",i);

for (let x=0;x<5;x++)
{
    console.log(x);
}
console.log("Outside Value is",x);

for (const y=0;y<5;y++)
{
    console.log(y);
}
console.log("Outside Value is",y);


var a
let b 
const c = 10

console.log(a);
console.log(b);
console.log(c);

var greeting = "Hello Test"

if(true)
{
    var greeting = "Hello Testing"
    console.log(greeting);
}

console.log("Outside if condition",greeting);


let greeting = "Hello Test"

if(true)
{
    let greeting = "Hello Testing"
    console.log(greeting);
}

console.log("Outside if condition",greeting);

const greeting = "Hello Test"

if(true)
{
    const greeting = "Hello Testing"
    console.log(greeting);
}

console.log("Outside if condition",greeting);

// Note:- Let & Const these are the two keywords provide block scop in the javascript 