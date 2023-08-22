let fname = "My name is Viren Chauhan"

console.log(fname.length);

console.log(fname[1]);

console.log(fname.includes("Chauhan"));

console.log(fname.includes("chauhan"));

console.log(fname.startsWith("My"));

console.log(fname.endsWith("Chauhan"));

console.log(fname.split(" "));

let arr = fname.split(" ");

console.log(arr[3]);
// Note:- arr is arr object

console.log(fname.toLowerCase());
console.log(fname.toUpperCase());
console.log((fname.trim()));

console.log(fname.replace("Viren", "Vir"));

console.log(fname);
let finalMsg="Total price is 200 USD"
let value = finalMsg.split(" ")[3]

console.log(typeof value);

let price = parseInt(value)
console.log(typeof price);
console.log(price);


if (price==200) {
    console.log('pass');
}
else{
    console.log('fail');
}

let msg='Final Amount is \'300\' USD'
console.log(msg);

let msg1='Final \tAmount is \'300\' USD'
console.log(msg1);
// Note:- I have to use tab then i'll user t

let msg2='Final Amount is \'300\' \nUSD'
console.log(msg2);
// Note:- I have to use new line then i'll user n

let newMsg=`Final 
amount is '300' USD`
console.log(newMsg);

// Note:-Useing Backtick ` ` This is not single quote sysmbol, If you are not use t or n,then you can use Backtick


let x=90

let newMsg1=`Final amount is ${x} USD`
console.log(newMsg1);

// let lname=new String("Chauhan")
// console.log(typeof lname);

// https://www.youtube.com/watch?v=J65D347sk2M&list=PL6flErFppaj2TYXXee5Zt_rR_RpOTBfm1&index=4

