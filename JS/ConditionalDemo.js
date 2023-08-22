/* 
 The conditional statement execut the piece of code only if the condition is true
*/

if (true) {
    console.log("I'm inside if block");
}

if (false) {
    console.log("I'm inside if block");
}

if (10 > 20) {
    console.log("I'm inside if block");
} else {
    console.log("I'm inside else block");
}

let browserName = "brave"
if (browserName.includes("chrome")) {
    console.log("Chrome Started");
} else if (browserName.includes("Firefox")) {
    console.log("FireFox started"); // This line will not execute because it
} else if (browserName.includes("Edge")) {
    console.log("Edge started"); // This line will not execute because it
} else {
    console.log("This tool only support FF, Chrome and Edge Browser");
}


/* This hard code */
// let date=new Date().getDay()
// console.log(date);

// switch (1) {
//     case 0:
//         console.log("Sunday");
//         break;
//     case 1:
//         console.log("Monday");
//         break;
//     case 2:
//         console.log("Tuseday");
//         break;
//     default:
//         console.log("Sorry");
//         break;
// }

/* This is dynamic */
let day=new Date().getDay()
console.log(day);

switch (day) {
    case 0:
        console.log("Sunday");
        break;
    case 1:
        console.log("Monday");
        break;
    case 2:
        console.log("Tuseday");
        break;
    default:
        console.log("Sorry");
        break;
}

// Note:- Break and Default is not mandatory but it's good to have 