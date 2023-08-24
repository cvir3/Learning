/* This is inbuild module */
const os=require("os")
const viren = require("assert")
console.log(os.platform());
console.log(os.type());
console.log(os.hostname());

viren(50>60,"value mismatched")