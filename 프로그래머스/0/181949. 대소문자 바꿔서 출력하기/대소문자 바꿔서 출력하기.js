const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = [line];
}).on('close',function(){
    str = input[0];
    const splited = str.split('');
    let answer = '';
    for(let i = 0; i < splited.length; i++){
        if('a' <= splited[i] && 'z' >= splited[i]) {
            answer += splited[i].toUpperCase();
        } else {
            answer += splited[i].toLowerCase();
        }
    }
    console.log(answer);
});