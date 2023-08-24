//This is Coercion

console.log(10/2);
console.log(10/2.5);
console.log(10/0);
console.log(10/0.0);
console.log("Viren"/0);
console.log(10/null);
console.log(10/undefined);

let result=10+50+"viren" // when i add string it's called appending
console.log(result);

let result1="Viren"+10+50
console.log(result1);

let marks = "10"+10
console.log(marks);
//The out put is 20

let marks1 = "10"-10 // It is converting sting in the number | It is doing the concatenation
console.log(marks1);
//The out put is 0

/* Coercion- automatic or implicit conversion of values from one data type to another data type. 
or 
What exactly it does it'll automatically try to conver one data type to another data type */

console.log(10/true);
console.log(10/false);

/*--*/

let num1 = "50"
console.log(typeof num1);
let num2 = 50
console.log(typeof num2);
if(num1==num2)
{
    console.log("Matched");
}
else{
    console.log("Not Matched") ;
}

console.log("------------------");

//'==' operator will do the necessary type conversions before doing the equality comparison.
if(num1===num2)
{
    console.log("Matched");
}
else{
    console.log("Not Matched") ;
}
// '==='it will not do the type conversion so if the two values are not of the same it will return true

//Graterthan 
console.log(16>10);
//lessthan
console.log(16<10);

console.log(16>=10);

console.log(10>8 && 10>5);

console.log(10>8 && 10<5);

console.log(10>8 || 10<5);

console.log(!true); //out is false
console.log(!false); //out is ture. Basically, it will reverse the output.


let str1 = "This is JS"
let str2 = "JS"
let str3 = "this is JS "

if(str1.includes(str2)){
    console.log("Pass");
}else{
    console.log("Fail");
}

if(str1==str3){
    console.log("Pass");
}else{
    console.log("Fail");
}
console.log("------------------------");
if(str1.toLocaleUpperCase()==str3.toLocaleUpperCase())
{
    console.log("Pass");
}else
{
    console.log("Fail");
}

console.log("------------------------");

let num3=10
num3=num3+5
console.log(num3);
num3+=5 // basically it is num3=num3+5 Exactly same
console.log(num3);
num3*=5
console.log(num3);
num3/=5
console.log(num3);
