// for loop, for of loop, for in loop, while, do while, break, Continue
/* 
What is loop?
Loops can execute a block of code a number of times.
*/

for(let x=0;x<10;x++)
{
    console.log("Value is ", x);
}
 
for(let x=0;x<=10;x++)
{
    console.log("Value is ", x);
}
 
for(let x=0;x<=100;x=x+2)
{
    console.log("Value is ", x);
}

for(let x=0;x<=10;x++)
{
    console.log("Value is ", x)
}

let y=0
for(;y<=20;y++)
{
    console.log("Value is ", y);
}

// Decrement

for(let x=10; x>0;x--)
{
    console.log("Value is", x);
}

/* Loop with array */

let arr = [12,20,56,"Viren",true]

for(let x=0; x<arr.length;x++)
{
    console.log("Array values", arr[x]);
}

arr.forEach(element =>{
    console.log("Using for each", element);
})

for(let myarrValues of arr)
{
    console.log("Using for of ", myarrValues)
    console.log("Using for of ", arr[myarrValues]);
}

for(let myarrValues in arr)
{
    console.log("Using for of ", myarrValues);
}

/* 
What if i use for in with array?
In that case it will return you index but if you go with for off it will return you the valus
*/

let fname = "Selenium Webdriver"

for(x of fname)
{
    console.log(x );
}


let myObj={
    "Name": "Viren",
    "Marks":50,
    "Status": false
}

for (let x in myObj) 
    {
        console.log(x);
        console.log(myObj[x]);

    }


console.log(myObj);

/* While loop */

let sum = 5

while(sum<=15){
    console.log("Sum value", sum);
    sum++
}

while(sum<=15){
    console.log("Sum value", sum);
    if(sum===10)
    {
        break
    }
    sum++
}

while(sum<=15){
    console.log("Sum value", sum);
    if(sum===10)
    {
        continue
    }
    sum++
}

for(let x=0; x<10; x++)
{
    if(x===4)
    {
        continue
    }
    console.log(x);
}


/* Do while loop */

// let y =10
// do
// {
//     console.log("Value is ",y);
//     y++
// } while (y<15);


let x =100
do
{
    console.log("Value is ",x);
    x++
} while (x<15);